package edu.nju.dessert.service;

import java.util.List;
import java.util.Map;

import edu.nju.dessert.model.Payment;
import edu.nju.dessert.model.Point;
import edu.nju.dessert.model.Store;
import edu.nju.dessert.model.User;

public interface UserService {
	
	public boolean updateUser(User user);
	
	public void addUser(User user);
	
	public void updateUserInfo(int id, String name, String address);

	public User getUser(int uid);
	
	public List<Payment> getAllPayments(int id);
	
	public List<Payment> getPayments(int id, int page);

	public int getTotalPaymentPages(int uid);
	
	public int getTotalPointPages(int uid);

	public List<Point> getPoints(int uid, int page);

	public int updatePassword(int uid, String password, String newpwd);

	public boolean updateAvatar(int uid, String url);
    
	public Map<String, Long> getAgeStat(String beginYear);

    public boolean cancel(int uid);
    
    public boolean setDefaultStore(int uid, int storeId);
    
    public Store getDefaultStore(int uid);
	
}
