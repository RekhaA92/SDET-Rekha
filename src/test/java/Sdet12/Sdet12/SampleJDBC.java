package Sdet12.Sdet12;

import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBC {
	
	public static void main(String[] args)
	Connection con;
	Driver driverref=new Driver();
	
	//step1: register to the database
	DriverManager.registerDriver(driverref);
	
	//Step2:get connection into database
	DriverManager.getConnection(jdbc:mysql://localhost:3306/, user, password)
	
	
	
	

}
