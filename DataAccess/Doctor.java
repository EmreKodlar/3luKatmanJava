package DataAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

 

public class Doctor extends User {
	 
	 
	public Doctor(int id, int bolum, String name, String password, String tc, String type) {
		super(id, bolum, name, password, tc, type);
		// TODO Auto-generated constructor stub
	}
	
	 
	public Doctor( ) {
		 
	}


	Database conn= new Database();
	Statement st=null;
	ResultSet rs=null;
	Connection con=conn.connDb();
	PreparedStatement preparedStatement= null;
	public List<Doctor> list;
	Doctor doctor;
	
	
	public List<Doctor> getAllDoctor(){
	 
		list = new ArrayList<Doctor>();
		
	try {
		 
		st =(Statement) con.createStatement();
		rs=st.executeQuery("SELECT c_id,c_tc,c_isim,c_sifre,c_bilgi,c_ist_id FROM calisan WHERE c_bilgi='Doktor'");
		while(rs.next()) {
			
	
		doctor=new Doctor(rs.getInt("c_id"),rs.getInt("c_ist_id"),rs.getString("c_isim"),rs.getString("c_sifre"),rs.getString("c_tc"),rs.getString("c_bilgi"));
		list.add(doctor); } 
		
		 
	 
	} 
	catch (SQLException e) {e.printStackTrace();
	} 
 
	return list;
			}
	

}
