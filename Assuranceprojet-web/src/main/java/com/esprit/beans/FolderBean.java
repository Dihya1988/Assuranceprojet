package com.esprit.beans;

import java.util.List;

import javax.annotation.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.esprit.entities.Folders;
import com.esprit.services.FolderManageLocal;



@ManagedBean
@SessionScoped
public class FolderBean {

	@EJB
	FolderManageLocal fml;
	private boolean state = false;

	private Folders f;
	private List<Folders> fds;

	public List<Folders> getFds() {
		return fds;
	}

	public void setFds(List<Folders> fds) {
		this.fds = fds;
	}

	public Folders getF() {
		return f;
	}

	public void setF(Folders f) {
		this.f = f;
	}

	@PostConstruct
	public void init() {
		fds = fml.findAllFolders();
		f = new Folders();
	}

	public String add() {

		fml.add(f);
		fds.add(f);
		f = new Folders();
		return "welcome?faces-redirect=true";
	}

	public void preUpdate(Folders f1) {
		state = true;
		f = fml.findById(f1.getIdFolder());
		f.setFolderTitle(f1.getFolderTitle());
		f.setModificationDate(f1.getModificationDate());
		f.setBonusMalus(f1.getBonusMalus());
		f.setRenewable(f1.isRenewable());
		f.setRefundedAmount(f1.getRefundedAmount());
		f.setComment(f1.getComment());
		f.setVehicles(f1.getVehicles());
		
	}

	public void update() {
		fml.update(f);
		fds = fml.findAllFolders();
		state = false;
	}

	public void delete(int id) {
		fml.delete(f);
		for (Folders f : fds) {
			if (f.getIdFolder() == id) {
				fds.remove(f);
				break;
			}
		}

	}

}
