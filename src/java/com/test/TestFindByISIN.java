package com.test;

import java.util.Scanner;

import com.pojo.Shares;
import com.dao.SharesDAO;
import com.dao.impl.SharesDAOImpl;



public class TestFindByISIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharesDAO dao = new SharesDAOImpl();
		System.out.println("Give me the ISIN number : ");
		Scanner sc = new Scanner(System.in);
		String ISIN = sc.nextLine();
		Shares share = dao.findShareByISIN(ISIN);
		if(share==null) {
			System.out.println("No share found with the following ISIN number");
		}else {
			System.out.println(share.toString());
		}
	}

}
