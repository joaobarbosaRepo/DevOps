package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DbConection;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{

	@Override
	public void insert(Department obj) {
		
		try(Connection conn= DbConection.conectar();) {
			PreparedStatement st = null;
			st = conn.prepareStatement(
				"INSERT INTO department " +
				"(Name) " +
				"VALUES " +
				"(?)", 
				Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getName());

			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
			}
			
		}catch(SQLException e) {
			   throw new DbException(e.getMessage());
		 }
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByid(Integer id) {
		 try(Connection conn= DbConection.conectar();) {
				PreparedStatement st =null;
			 	st=conn.prepareStatement(	"DELETE FROM department WHERE Id = ?");
			    st.setInt(1, id);
			    st.executeQuery();	
		 }catch(SQLException e) {
			   throw new DbException(e.getMessage());
		 }
		 
		 
	}

	@Override
	public Department findByID(Integer id) {
         try(Connection conn= DbConection.conectar();) {
			
			PreparedStatement st =null;
		    ResultSet rs=null;
		    st=conn.prepareStatement(	"SELECT * FROM department WHERE Id = ?");
		    st.setInt(1, id);
		    rs= st.executeQuery();
		    if(rs.next()) {
		        Department dp= new Department();
		        dp.setId(rs.getInt("Id"));
		        dp.setName(rs.getString("Name"));
		
		        return dp;
		       }
		  return null;
	 	
	   }catch(SQLException e) {
		   throw new DbException(e.getMessage());
	   }
		 
		
	}

	@Override
	public List<Department> findall() {
         try(Connection conn= DbConection.conectar();) {
			PreparedStatement st =null;
		    ResultSet rs=null;
		    st=conn.prepareStatement(	"SELECT * FROM department ORDER BY Name");
		    rs=st.executeQuery();
			List<Department> list = new ArrayList<>();
			while(rs.next()) {
				Department obj = new Department();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				list.add(obj);
			}
		return list;
	    }  catch(SQLException e) {
		    throw new DbException(e.getMessage());
	  }
   }      

}
