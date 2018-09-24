import java.util.Scanner;

import com.dao.SharesDAO;
import com.dao.impl.SharesDAOImpl;

public class TestDeleteShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharesDAO dao = new SharesDAOImpl();
		System.out.println("Give me the ISIN number of the share that you want to delete : ");
		Scanner sc = new Scanner(System.in);
		String ISIN = sc.nextLine();
		int delete = dao.deleteShare(ISIN);
		if(delete>0) {
			System.out.println("Data succesfully deleted");
		}else {
			System.out.println("Sorry data has not been deleted");
		}
	}

}
