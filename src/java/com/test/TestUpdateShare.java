package com.test;

import java.util.Scanner;

import com.pojo.Shares;
import com.dao.SharesDAO;
import com.dao.impl.SharesDAOImpl;

public class TestUpdateShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharesDAO dao = new SharesDAOImpl();
		Shares share = new Shares();
		System.out.println("Give me the ISIN number of the share that you want to update : ");
		Scanner sc = new Scanner(System.in);
		String ISIN = sc.nextLine();
		System.out.println("What is the new value for number of shares : ");
		share.setNumber_of_Shares(sc.nextInt());
		if(dao.updateShare(ISIN, share)) {
			System.out.println("updated succesfully");
		}else {
			System.out.println("sorry");
		}
		
	}

}
