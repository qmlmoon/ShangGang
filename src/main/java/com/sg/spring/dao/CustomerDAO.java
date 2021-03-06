package com.sg.spring.dao;

import com.sg.sql.model.Customer;


/**
 * Created by qml_moon on 11/11/15.
 */
public interface CustomerDAO {
	public int insert(Customer customer);

	public int delete(String userId);

	public int changeInfo(Customer customer, String newPassword);

	public int changePrivilege(Customer customer, String privilege);

	public int login(Customer customer);

	public double[] getDepthLevel(Customer customer, int harborId);

	public int setDepthLevel(Customer customer, int harborId, String depthLevel);

	public Customer[] getAllUser();

	public int getWarning(Customer customer, int harborId);

	public int setWarning(Customer customer, int harborId);

	public int setWarningStatus(Customer customer, String status);

}