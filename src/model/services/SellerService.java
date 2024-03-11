package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	//Recuperar os departamentos pelo SellerDao injentando os dados pelo DaoFactory
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return dao.findAll();
	}
	
	//Verificar se tem que se inserir um novo departamento ou atualizar
	public void saveOrUpdate (Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	//Remover um departamento
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}
