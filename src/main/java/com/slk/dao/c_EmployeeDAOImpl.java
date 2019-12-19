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
		
		public List<c_Customer> getAllCustomer(String id) throws SQLException {
			// TODO Auto-generated method stub
			String query1="select  customer_Acc_no,c.name, c.dob, c.contact,address,aadhar_number, pan_number,branch_name,a.acc_type,ca.open_date,ca.balance,ca.approval from  customer c,employee_branch eb,branch b,customer_account ca,account a,employee e where eb.branch_id =c.branch_id and b.branch_id=c.branch_id and ca.cust_id=c.cust_id and a.account_id=ca.account_id and e.username='"+id+"'";
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
		         c.setAddress(rs.getString(5));
		         c.setAadhar_card(rs.getLong(6));
		         c.setPan_card(rs.getString(7));
		         c.setBranch(rs.getString(8));
		         c.setAcc_type(rs.getString(9));
		         
		         c.setOpen_date(rs.getString(10));
		         c.setAmount(rs.getFloat(11));
		         
		      
		        
		    
		        
		         c.setAction(rs.getString(12));
		         l.add(c);
		         
		    }
		return l;
	}
		public List<c_Transaction> getAllTransaction(String id) throws SQLException {
			// TODO Auto-generated method stub
			
			
			String query1="select account_no,c.name,date,time,debit,credit,t.balance,b.branch_name from transaction t,customer c,customer_account ca,employee e,employee_branch eb,branch b where t.account_no=ca.customer_Acc_no and ca.cust_id=c.cust_id and e.employee_id=eb.employee_id and eb.branch_id=b.branch_id and c.branch_id=b.branch_id and e.username='"+id+"'";
			Statement st1=con.createStatement();
			ResultSet rs=st1.executeQuery(query1);
			List<c_Transaction> tt=new ArrayList<c_Transaction>();
			while(rs.next())
			{
				c_Transaction t=new c_Transaction();
				t.setTrans_acc_no(rs.getLong(1));
				t.setTrans_name(rs.getString(2));
				t.setTrans_date(rs.getString(3));
				t.setTime(rs.getString(4));
				t.setTrans_debit(rs.getFloat(5));
				t.setTrans_credit(rs.getFloat(6));
				t.setBalance(rs.getFloat(7));
				t.setBranch_name(rs.getString(8));		         
		         tt.add(t);
		         
		    }
		return tt;
	}
		
		public List<c_Customer> getAllCustomer1(String id,String id1) throws SQLException {
			// TODO Auto-generated method stub
			long id2=Long.parseLong(id1);
			String query1="select  customer_Acc_no,c.name, c.dob, c.contact,address,aadhar_number, pan_number,branch_name,a.acc_type,ca.open_date,ca.balance,ca.approval from  customer c,employee_branch eb,branch b,customer_account ca,account a,employee e where eb.branch_id =c.branch_id and b.branch_id=c.branch_id and ca.cust_id=c.cust_id and a.account_id=ca.account_id and e.username='"+id+"' and ca.customer_Acc_no="+id2+"";
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
			         c.setAddress(rs.getString(5));
			         c.setAadhar_card(rs.getLong(6));
			         c.setPan_card(rs.getString(7));
			         c.setBranch(rs.getString(8));
			         c.setAcc_type(rs.getString(9));
			         
			         c.setOpen_date(rs.getString(10));
			         c.setAmount(rs.getFloat(11));
			         
			      
			        
			    
			        
			         c.setAction(rs.getString(12));
		         l.add(c);
		         
		    }
		return l;
	}
		
		
		
		public List listLogin() {
			employees = new ArrayList();
			String query1="select username,password from employee where employee_role='branch manager'";
			Statement st1;
			try {
				st1 = con.createStatement();
				ResultSet rs=st1.executeQuery(query1);
				while(rs.next())
				{
					c_Employee e=new c_Employee();
		
			    
			        
			    
			         e.setUsername(rs.getString(1));
			         e.setPassword(rs.getString(2));
			    
				     employees.add(e);
			} 
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return employees;
		}
		

		/**
		 * Returns list of customers from dummy database.
		 * 
		 * @return list of customers
		 */
		public List list(String id) {
			employees = new ArrayList();
			String query1="select employee.employee_id,employee_name,dob,contact,mail,username,password,branch_name from employee,employee_branch,branch where employee.employee_id=employee_branch.employee_id and branch.branch_id=employee_branch.branch_id  and employee.username='"+id+"'";
			Statement st1;
			try {
				st1 = con.createStatement();
				ResultSet rs=st1.executeQuery(query1);
				while(rs.next())
				{
					c_Employee e=new c_Employee();
					 e.setEmpid(rs.getString(1));
			         e.setEmpname(rs.getString(2));
			      
			         e.setEmpdob(rs.getString(3));
			        
			         e.setEmpcontact(rs.getLong(4));
			         e.setEmpmail(rs.getString(5));
			         e.setUsername(rs.getString(6));
			         e.setPassword(rs.getString(7));
			         
			         e.setEmpbranch(rs.getString(8));
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

			String query1="Update customer_account set approval=? where  customer_Acc_no=?";
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
			return c;
		}
		
		public c_Employee updateAgent(Long id, c_Employee e)  {
			// TODO Auto-generated method stub
		
			try {
				String sql="update c_employee set employee_name=?,dob=?,contact=?,mail=? where employee_id=?";
				PreparedStatement pst=con.prepareStatement(sql);
			    pst.setString(1, e.getEmpname());
			    pst.setString(2, e.getEmpdob());
			    pst.setLong(3, e.getEmpcontact());
			    pst.setString(4, e.getEmpmail());
			    
			    pst.setLong(5,id);

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


