package af.cmr.indyli.gespro.business.service;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import af.cmr.indyli.gespro.business.exception.GesproBusinessException;

public interface IAbstractGesproService<Entity, BasicDTO, FullDTO extends BasicDTO, IEntityDAO extends JpaRepository<Entity, Integer>> {

	/**
	 * Create an new entity
	 * 
	 * @param ent : POJO to create
	 * @return
	 * @throws GesprocBusinessException
	 */
	public FullDTO create(FullDTO ent) throws GesproBusinessException;

	/**
	 * Update an entity
	 * 
	 * @param entToUpdate
	 * @throws GesprocBusinessException,AccessDeniedException
	 */
	public FullDTO update(FullDTO eOntToUpdate) throws GesproBusinessException, AccessDeniedException;

	/**
	 * Delete an entity
	 * 
	 * @param id : Entity'Id to delete
	 * @throws GesprocBusinessException
	 * @throws AccessDeniedException
	 * 
	 */
	public void deleteById(int id) throws GesproBusinessException, AccessDeniedException;

	/**
	 * Find All Entity
	 * 
	 * @return
	 */
	public List<BasicDTO> findAll();

	/**
	 * Found Entity By Id
	 * 
	 * @param id : Entity's Id to found
	 * @return
	 * @throws GimmoBusinessException
	 */

	public FullDTO findById(int id) throws GesproBusinessException;

	/**
	 * Teste l'existence d'une EntitÃ© par son id
	 * 
	 * @param id
	 * @return
	 * @throws IndyliBusinessException
	 */
	public boolean ifEntityExistById(int id) throws GesproBusinessException;

	/**
	 * Recupere un DTO par son id
	 */
	public <T extends BasicDTO> T findById(int id, Class<T> type) throws GesproBusinessException;

	/**
	 * Retourne la reference du DAO en cours
	 * 
	 * @return
	 */
	public IEntityDAO getDAO();
	
	/*
	 * Boolean createInventoryNew(InventoryDTONEW inventoryDTONew, List<RoomDTONEW>
	 * listRoomsFull) throws GesprocBusinessException;
	 */

}
