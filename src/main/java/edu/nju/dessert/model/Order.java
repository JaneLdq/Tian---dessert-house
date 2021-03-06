package edu.nju.dessert.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.nju.dessert.util.DateTranslator;

@Entity
@Table(name="sorder")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int uid;
	
	private int type;
	
	private Date send_date;
	
	private double total;
	
	private double discount;
	
	private Date created_at;
	
	private int store_id;
	
	private int send_type;
	
	private int address_id;
	
	private int state;
	
	private int saleman_id;
	
	private String remark;

	public Order(){}
	
	public Order(int uid, int type, Date sendDate, double total, double discount, Date created_at, int storeId, 
			int sendType, String remark, int addressId){
		this.uid = uid;
		this.type = type;
		this.send_date = sendDate;
		this.total = total;
		this.discount = discount;
		this.created_at = created_at;
		this.store_id = storeId;
		this.send_type = sendType;
		this.remark = remark;
		this.address_id = addressId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getSend_date() {
		return send_date;
	}

	public void setSend_date(Date send_date) {
		this.send_date = send_date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	
	public String getCreatedAtStr(){
	    return DateTranslator.datetimeToStr(created_at);
	}
	
	public String getSendDateStr(){
	    return DateTranslator.dateToStr(send_date);
	}

	public int getSend_type() {
		return send_type;
	}

	public void setSend_type(int send_type) {
		this.send_type = send_type;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getSaleman_id() {
		return saleman_id;
	}

	public void setSaleman_id(int saleman_id) {
		this.saleman_id = saleman_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
