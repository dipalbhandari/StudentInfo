package com.vastika.smd.util;

public class QueryUtil {
	
	public static final String INSERT_SQL = "insert into  user_tbl (name , password , email , mobileNo , dob ,verificationType , gender , hobbies , city , country)  VALUES (? , ? , ? ,?,?,?,?,?,?,?)";
	public static final String LIST_SQL = "select * from user_tbl";
	public static final String DELETE_SQL = "delete  from user_tbl where id = ?";
}
