package com.slk.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.slk.model.c_Customer;
import com.slk.model.c_Employee;
import com.slk.model.c_Transaction;
@Repository
public interface c_EmployeeDAO {
	public List listLogin();
	public List list(String id);
	public String delete(String id);
	public c_Customer  update(Long id, c_Customer c);
	public List<c_Customer> getAllCustomer(String id) throws SQLException;
	public List<c_Transaction> getAllTransaction(String id) throws SQLException;
	public c_Employee updateAgent(Long id, c_Employee e);
	public List<c_Customer> getAllCustomer1(String id,String id1) throws SQLException ;
	public List listloan(String id);
}
