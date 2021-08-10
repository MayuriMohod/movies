package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.movies;

public class MoviesDao {
	public int insertMovies(movies m) throws ClassNotFoundException, SQLException
	{
		int check=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/movies","root","");
		String sql="insert into movies(mname,mactor,mactress,mdirector,yearofrelease)values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, m.getMname());
		pst.setString(2, m.getMactor());
		pst.setString(3, m.getMactress());
		pst.setString(4, m.getMdirector());
		pst.setInt(5, m.getYearofrelease());
		check=pst.executeUpdate();
		pst.close();
		con.close();
		return check;
	}

}
