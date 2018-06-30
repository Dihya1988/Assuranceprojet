package com.esprit.services;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.entities.Folders;


@Remote
public interface FolderManageRemote {

	public Boolean add(Folders f);
	public Boolean update(Folders f);
	public Folders findById(int idFolder);
	public Boolean delete(Folders f);
	public List<Folders> findAllFolders();
}
