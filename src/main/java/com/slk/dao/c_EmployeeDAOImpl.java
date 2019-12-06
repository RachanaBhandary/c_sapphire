package com.slk.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.slk.model.c_Customer;
import com.slk.model.c_Employee;
import com.slk.model.c_Transaction;
import com.slk.util.c_SDBUtil;

@Repository
	public class c_EmployeeDAOImpl implements c_EmployeeDAO {

		// Dummy database. Initialize with some dummy values.
	 Connection con;
		private static List<c_Employee> employees;
		
	
         {
			
			try {
				con=c_SDBUtil.getConnection();
				System.out.println("connection object "+con);
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
			
			
			
		}
		
		public List<c_Customer> getAllCustomer() throws SQLException {
			// TODO Auto-generated method stub
			String query1="select * from c_customer";
			Statement st1=con.createStatement();
			ResultSet rs=st1.executeQuery(query1);
			List<c_Customer> l=new ArrayList<c_Customer>();
			while(rs.next())
			{
				c_Customer c=new c_Customer();
		         c.setAccno(rs.getLong(1));
		         c.setName(rs.getString(2));
		         c.setDob(rs.getString(3));
		         c.setContact(rs.getLong(4));
		         c.setUsername(rs.getString(5));
		         c.setPassword(rs.getString(6));
		         c.setAmount(rs.getFloat(7));
		         c.setBranch(rs.getInt(8));
		         c.setLoan_type(rs.getString(9));
		         c.setAcc_type(rs.getString(10));
		         c.setAadhar_card(rs.getLong(11));
		         c.setPan_card(rs.getString(12));
		         c.setAction(rs.getString(13));
		         l.add(c);
		         
		    }
		return l;
	}
		public List<c_Transaction> getAllTransaction() throws SQLException {
			// TODO Auto-generated method stub
			
			String query1="select * from c_transaction";
			Statement st1=con.createStatement();
			ResultSet rs=st1.executeQuery(query1);
			List<c_Transaction> tt=new ArrayList<c_Transaction>();
			while(rs.next())
			{
				c_Transaction t=new c_Transaction();
				t.setTrans_id(rs.getInt(1));
				t.setTrans_date(rs.getString(2));
				t.setTrans_credit(rs.getFloat(3));
				t.setTrans_debit(rs.getFloat(4));
				t.setTrans_acc_no(rs.getLong(5));
		         
		         tt.add(t);
		         
		    }
		return tt;
	}
		

		/**
		 * Returns list of customers from dummy database.
		 * 
		 * @return list of customers
		 */
		public List list() {
			employees = new ArrayList();
			String query1="select * from c_agent";
			Statement st1;
			try {
				st1 = con.createStatement();
				ResultSet rs=st1.executeQuery(query1);
				while(rs.next())
				{
					c_Employee e=new c_Employee();
					 e.setEmpid(rs.getString(1));
			         e.setEmpname(rs.getString(2));
			         e.setAddress(rs.getString(3));
			         e.setEmpdob(rs.getString(4));
			        
			         e.setEmpcontact(rs.getLong(5));
			         e.setUsername(rs.getString(6));
			         e.setPassword(rs.getString(7));
			         e.setEmpmail(rs.getString(8));
			         e.setEmpbranch_id(rs.getInt(9));
				     employees.add(e);
			} 
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return employees;
		}
		
	/*	public Employee update(Long id, Employee employee) {

			for (Employee e : employees) {
				if (e.getEmpid()==(id)) {
					employee.setEmpid(e.getEmpid());
					employees.remove(e);
					employees.add(employee);
					return employee;
				}
			}

			return null;
		}*/


		/**
		 * Return customer object for given id from dummy database. If customer is
		 * not found for id, returns null.
		 * 
		 * @param id
		 *            customer id
		 * @return customer object for given id
		 */
		/*public Employee get(long id) {

			for (Employee c : employees) {
				if (c.getEmpid().equals(id)) {
					return c;
				}
			}
		
		}

		/**
		 * Create new customer in dummy database. Updates the id and insert new
		 * customer in list.
		 * 
		 * @param customer
		 *            Customer object
		 * @return customer object with updated id
		 
		public Employee create(Employee employee) {
			employee.setEmpid(System.currentTimeMillis());
			employees.add(employee);
			return employee;
		}

		/**
		 * Delete the customer object from dummy database. If customer not found for
		 * given id, returns null.
		 * 
		 * @param id
		 *            the customer id
		 * @return id of deleted customer object*/
		 
		public String delete(String id) {

			String query1="Delete from c_agent where agentid=?";
			PreparedStatement st1;
			try {
				System.out.println(id);
				st1 = con.prepareStatement(query1);
				st1.setString(1,id);
				int rs=st1.executeUpdate();
				System.out.println(rs+"Rows Deleted");
				return id; 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			return null;
		}

		/**
		 * Update the customer object for given id in dummy database. If customer
		 * not exists, returns null
		 * 
		 * @param id
		 * @param customer
		 * @return customer object with id*/
		 
		public c_Customer update(Long id, c_Customer c) {

			String query1="Update c_customer set action=? where account_no=?";
			PreparedStatement st1;
			
			try {
				st1 = con.prepareStatement(query1);
			    System.out.println(c.getAction());
				st1.setString(1,c.getAction());
				st1.setLong(2,id);
				int rs=st1.executeUpdate();
				System.out.println(rs+"Rows Updated");
				
				return c;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		public c_Employee updateAgent(Long id, c_Employee e)  {
			// TODO Auto-generated method stub
			try {
			String sql="update c_agent set name=?,address=?,dob=?,contact=?,mail=?,branch_id=? where agentid=?";
			PreparedStatement pst=con.prepareStatement(sql);
		    pst.setString(1, e.getEmpname());
		    pst.setString(2, e.getAddress());
		    pst.setString(3, e.getEmpdob());
		    pst.setLong(4, e.getEmpcontact());
		    pst.setString(5, e.getEmpmail());
		    pst.setInt(6, e.getEmpbranch());
		    pst.setLong(7,id);

			int res=pst.executeUpdate();
			if(res > 0){
				System.out.println("Agent Updated");
			}
			}catch(SQLException e1){
				e1.printStackTrace();
			}
			return e;
			
			
		}
		

	}


