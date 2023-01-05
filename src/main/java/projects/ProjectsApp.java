package projects;

import projects.dao.DbConnection;
import projects.exception.DbException;

public class ProjectsApp {

	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}
