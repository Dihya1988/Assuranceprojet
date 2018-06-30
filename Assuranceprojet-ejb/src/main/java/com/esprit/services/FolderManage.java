package com.esprit.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.entities.Folders;

@Stateless
public class FolderManage implements FolderManageLocal, FolderManageRemote{

	@PersistenceContext
    EntityManager em;
	
	public FolderManage() {
		// TODO Auto-generated constructor stub
	}

	public Boolean add(Folders f) {
		// TODO Auto-generated method stub
		try{
			em.persist(f);
			return true;
		}catch(Exception e){
			
		}
		return false;
	}

	public Boolean update(Folders f) {
		// TODO Auto-generated method stub
		try{
			em.merge(f);
			return true;
		}catch(Exception e){
			
		}
		return false;
	}

	public Folders findById(int idFolder) {
		// TODO Auto-generated method stub
		return em.find(Folders.class, idFolder);
	}

	public Boolean delete(Folders f) {
		// TODO Auto-generated method stub
		try{
			em.remove(em.merge(f));
			return true;
		}catch(Exception e){
			
		}
		return false;
	}

	public List<Folders> findAllFolders() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select f from Folders f");
		return query.getResultList();
	}

}
