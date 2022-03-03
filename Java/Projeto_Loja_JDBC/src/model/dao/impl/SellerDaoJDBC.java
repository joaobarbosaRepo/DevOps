package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DbConection;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{
	

    public SellerDaoJDBC() {
	
     }
    
    private Seller instantiateSeller(ResultSet rs,Department dp ) throws SQLException {
    	 Seller seller= new Seller();
		 seller.setId(rs.getInt("Id"));
		 seller.setName(rs.getString("Name"));
		 seller.setEmail(rs.getString("Email"));
		 seller.setBaseSalary(rs.getDouble("BaseSalary"));
		 seller.setBirthDate(rs.getDate("BirthDate"));
		 seller.setDepartment(dp);
		 return seller;
    }
    private Department instantiateDepartment(ResultSet rs) throws SQLException {
    	 Department dp = new Department();
    	 dp.setId(rs.getInt("DepartmentId"));
		 dp.setName(rs.getString("DepName"));
		 return dp;
		 
		 
    }


	@Override
	public void insert(Seller obj) {
          try(Connection conn= DbConection.conectar();) {
			
			 PreparedStatement st =null;
		     ResultSet rs=null;
		     st=conn.prepareStatement("INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
		     if(findByEmail(obj)==null) {
		     st.setString(1, obj.getName());
			 st.setString(2, obj.getEmail());
			 st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			 st.setDouble(4, obj.getBaseSalary());
			 st.setInt(5, obj.getDepartment().getId());
			 int rowsAffected = st.executeUpdate();
				if (rowsAffected > 0) {
				   rs = st.getGeneratedKeys();
					if (rs.next()) {
						int id = rs.getInt(1);
						obj.setId(id);
					}
                } 
             } 
		     else {System.out.println("Cadastro j� existe");}
          }
				catch(SQLException e) {
    		     throw new DbException(e.getMessage());
    	}
		
		
	}

	@Override
	public void update(Seller obj) {
		 try(Connection conn= DbConection.conectar();) {
				
			 PreparedStatement st =null;
		     st=conn.prepareStatement("UPDATE seller "
						+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
						+ "WHERE Id = ?");
	
		     st.setString(1, obj.getName());
			 st.setString(2, obj.getEmail());
			 st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			 st.setDouble(4, obj.getBaseSalary());
			 st.setInt(5, obj.getDepartment().getId());
			 st.setInt(6, obj.getId());	
			 
			 st.executeUpdate();
	
				
                
              } 
				 catch(SQLException e) {
    		     throw new DbException(e.getMessage());
    	}
		
	}

	@Override
	public void deleteByid(Integer id) {
		try(Connection conn= DbConection.conectar();) {
			
			 PreparedStatement st =null;
		     st=conn.prepareStatement("DELETE FROM seller WHERE Id = ?");
		     st.setInt(1, id);
		     int rows = st.executeUpdate();
		     if(rows==0) {
		    	System.out.println("O id n�o existe!!!");
		     }
		     
		
	    }catch(SQLException e) {
		   throw new DbException(e.getMessage());
	      }
	}
	@Override
	public Seller findByID(Integer id) {
		
		try(Connection conn= DbConection.conectar();) {
			
			PreparedStatement st =null;
		    ResultSet rs=null;
		    st=conn.prepareStatement("SELECT seller.*,department.Name as DepName "
				+ "FROM seller INNER JOIN department "
				+ "ON seller.DepartmentId = department.Id "
				+ "WHERE seller.Id = ?");
		    st.setInt(1, id);
		    rs= st.executeQuery();
		    if(rs.next()) {
		      Department dep= instantiateDepartment(rs);
		      Seller seller= instantiateSeller(rs,dep);
		
		       return seller;
		       }
		  return null;
		
	  }catch(SQLException e) {
		  throw new DbException(e.getMessage());
	  }
		 
   
		
	}

	@Override
	public List<Seller> findall() {

		try(Connection conn= DbConection.conectar();) {
			
			PreparedStatement st =null;
		    ResultSet rs=null;
		    st=conn.prepareStatement("SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "ORDER BY Id");
		    rs= st.executeQuery();
		    List<Seller> list= new ArrayList<>();
		    Map<Integer,Department> map= new HashMap<>();
		    while(rs.next()) {
		      Department dep = map.get(rs.getInt("DepartmentId"));
		      if(dep==null) {
		    	  dep= instantiateDepartment(rs);
		    	  map.put(rs.getInt("DepartmentId"),dep);
		      }
		      Seller seller= instantiateSeller(rs,dep);
		
		       list.add(seller);
		       }
		  return list;
		
	  }catch(SQLException e) {
		  throw new DbException(e.getMessage());
	  }
		
	}
	@Override
	public List<Seller> findByDepartment(Department department) {
    
try(Connection conn= DbConection.conectar();) {
			
			PreparedStatement st =null;
		    ResultSet rs=null;
		    st=conn.prepareStatement("SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE DepartmentId = ? "
					+ "ORDER BY Name");
		    st.setInt(1,department.getId());
		    rs= st.executeQuery();
		    List<Seller> list= new ArrayList<>();
		    Map<Integer,Department> map= new HashMap<>();
		    while(rs.next()) {
		      Department dep = map.get(rs.getInt("DepartmentId"));
		      if(dep==null) {
		    	  dep= instantiateDepartment(rs);
		    	  map.put(rs.getInt("DepartmentId"),dep);
		      }
		      Seller seller= instantiateSeller(rs,dep);
		
		       list.add(seller);
		       }
		  return list;
		
	  }catch(SQLException e) {
		  throw new DbException(e.getMessage());
	  }
		
	}

	@Override
	public Seller findByEmail(Seller seller) {
		 try(Connection conn= DbConection.conectar();) {
				PreparedStatement st =null;
			    ResultSet rs=null;
			    st=conn.prepareStatement("SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Email = ?");
			    st.setString(1, seller.getEmail());
			    rs= st.executeQuery();
			    if(rs.next()) {
			      Department dep= instantiateDepartment(rs);
			      Seller sell= instantiateSeller(rs,dep);
			
			       return sell;
			       }
			
			    return null;
	       }catch(SQLException e) {
			     throw new DbException(e.getMessage());
		}
	
	}

}
