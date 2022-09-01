package ch08.book.excersice.p4;

public class DaoExam {
	public static void dbWolk(DataAccessObject dao) { 
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	/**
	 * DataAccessObject > OracleDao
	 * DataAccessObject > MysqlDao
	 * */
	public static void main(String[] args) {
		/** DataAccessObject dao = new OracleDao(); */
		dbWolk(new OracleDao()); 
		
		/** DataAccessObject dao = new MysqlDao(); */
		dbWolk(new MysqlDao());  
	}
}
