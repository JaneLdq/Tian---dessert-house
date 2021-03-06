
package edu.nju.dessert.service;

import java.util.List;

import edu.nju.dessert.dao.DessertDao;
import edu.nju.dessert.model.Dessert;

public class DessertServiceImpl implements DessertService {

	private DessertDao dessertDao;
	
	public void setDessertDao(DessertDao dessertDao) {
		this.dessertDao = dessertDao;
	}
	
	@Override
	public List<Dessert> getDessertList(int page, int num) {
		return dessertDao.getDessertList(page, num);
	}

	@Override
	public Dessert getDessert(int id) {
		return dessertDao.getDessert(id);
	}

	@Override
	public int getDessertQuantity(int id, int storeId, String date) {
		Integer quantity = dessertDao.getDessertQuantity(id, storeId, date);
		if(quantity != null)
			return quantity;
		return 0;
	}

	@Override
	public int getTotalPage() {
		return dessertDao.getTotalPages(12);
	}

    @Override
    public Dessert checkDessert(int id, int storeId) {
        return dessertDao.checkDessert(id, storeId);
    }

	@Override
	public List<Dessert> getDessertByType(int type, int page, int num, int order, int store) {
		return dessertDao.getDessertByType(type, page, num, order, store);
	}

	@Override
	public List<Dessert> search(String key, int type) {
		return dessertDao.search(key, type);
	}

	@Override
	public List<Dessert> getHotDessert(int num) {
		return dessertDao.getHotDessert(num);
	}

	@Override
	public List<Dessert> getNewDessert(int num) {
		return dessertDao.getNewDessert(num);
	}

	@Override
	public Long getTotalDessertNum() {
		return dessertDao.getTotalDessertNum();
	}


	
}
