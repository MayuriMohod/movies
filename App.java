package jdbc1.jdbc1;

import java.sql.SQLException;

import com.dao.MoviesDao;
import com.model.movies;

public class App 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		MoviesDao md= new MoviesDao();
		movies m = new movies();
		m.setMname("Sultan");
		m.setMactor("Salman Khan");
		m.setMactress("Anushka Sharma");
		m.setMdirector("Ali Abbas Zafar");
		m.setYearofrelease(2016);
		if(md.insertMovies(m)>0)
		{
			System.out.println("Record Inserted...");
		}
	}
    
}
