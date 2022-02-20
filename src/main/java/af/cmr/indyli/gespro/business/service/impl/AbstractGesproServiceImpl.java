package af.cmr.indyli.gespro.business.service.impl;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

import af.cmr.indyli.gespro.business.dto.IDTO;
import af.cmr.indyli.gespro.business.entity.IEntity;
import af.cmr.indyli.gespro.business.exception.GesproBusinessException;
import af.cmr.indyli.gespro.business.service.IAbstractGesproService;

public abstract class AbstractGesproServiceImpl<Entity extends IEntity, BasicDTO extends IDTO, FullDTO extends BasicDTO, IEntityDAO extends JpaRepository<Entity, Integer>>
		implements IAbstractGesproService<Entity, BasicDTO, FullDTO, IEntityDAO> {
	/*
	 * private ModelMapper mapper; public abstract IEntityDAO getDAO();
	 * 
	 * public ModelMapper getModelMapper() { return this.mapper; }
	 */
	private Class<Entity> entityClass;
	private Class<BasicDTO> viewClass;
	private Class<FullDTO> fullDTOClass;
	// Resource destinée à la copie DTO <--> Entity

	@Resource(name = "gespro-modelmapper")
	private ModelMapper mapper;

	public AbstractGesproServiceImpl(Class<Entity> myEntityClass, Class<BasicDTO> viewClass,
			Class<FullDTO> fullViewClass) {
		this.entityClass = myEntityClass;
		this.viewClass = viewClass;
		this.fullDTOClass = fullViewClass;
	}

	/**
	 * Create an new entity
	 * 
	 * @param ent : POJO to create
	 * @return
	 * @throws GesproBusinessException
	 */
	public FullDTO create(FullDTO view) throws GesproBusinessException {
		Entity entity = this.getModelMapper().map(view, this.entityClass);
		this.getDAO().save(entity);
		view.setId(entity.getId());
		return view;
	}

	/**
	 * Update an entity
	 * 
	 * @param entToUpdate
	 * @throws GesproBusinessException,AccessDeniedException
	 */
	public FullDTO update(FullDTO viewToUpdate) throws GesproBusinessException, AccessDeniedException {
		// On va chercher l'entité pour l'attacher au contexte de persistence
		Entity entity = this.getDAO().findById(viewToUpdate.getId()).orElse(null);
		if (entity != null) {
			BeanUtils.copyProperties(viewToUpdate, entity);
			entity = this.getDAO().saveAndFlush(entity);
		} else {
			throw new GesproBusinessException("L'objet A modifier N'existe pas en Base...");
		}
		return viewToUpdate;
	}

	/**
	 * Delete an entity
	 * 
	 * @param id : Entity'Id to delete
	 * @throws GesproBusinessException
	 * @throws AccessDeniedException
	 */
	public void deleteById(int id) throws GesproBusinessException, AccessDeniedException {
		this.getDAO().deleteById(id);
	}

	/**
	 * Find All Entity
	 * 
	 * @return
	 */
	public List<BasicDTO> findAll() {
		List<Entity> list = this.getDAO().findAll();
		List<BasicDTO> viewList = new ArrayList<BasicDTO>();
		for (Entity ent : list) {
			BasicDTO view = this.getModelMapper().map(ent, this.viewClass);
			viewList.add(view);
		}
		return viewList;
	}

	/**
	 * Found Entity By Id
	 * 
	 * @param id : Entity's Id to found
	 * @return
	 * @throws GesproBusinessException
	 */
	public FullDTO findById(int id) throws GesproBusinessException {

		Entity entity = this.getDAO().findById(id).orElse(null);
		if (entity != null) {

			FullDTO view = this.getModelMapper().map(entity, this.fullDTOClass);
			return view;
		} else {
			return null;
		}
	}
	
	

	/**
	 * Teste l'existence d'une Entité par son id
	 * 
	 * @param id
	 * @return
	 * @throws GesproBusinessException
	 */
	public boolean ifEntityExistById(int id) throws GesproBusinessException {
		return this.getDAO().existsById(id);
	}

	/**
	 * Recupere un DTO par son id
	 */
	public <T extends BasicDTO> T findById(int id, Class<T> type) {
		Entity ent = this.getDAO().getById(id);
		T view = this.getModelMapper().map(ent, type);
		return view;
	}

	/**
	 * Retourne la reference du DAO en cours
	 * 
	 * @return
	 */
	public abstract IEntityDAO getDAO();

	public ModelMapper getModelMapper() {
		return this.mapper;
	}

	/*
	 * public Boolean createInventoryNew(InventoryDTONEW inventoryDTONew,
	 * List<RoomDTONEW> listRoomsFull) throws GesproBusinessException { // TODO
	 * Auto-generated method stub return null; }
	 */

	public boolean deleteInventory(long idIventory) throws GesproBusinessException {
		// TODO Auto-generated method stub
		return false;
	}

}
