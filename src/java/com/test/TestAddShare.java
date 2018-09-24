package com.test;

import com.pojo.Shares;
import com.dao.SharesDAO;
import com.dao.impl.SharesDAOImpl;


public class TestAddShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharesDAO dao = new SharesDAOImpl();
		Shares share = new Shares();
		int rowsAdded = dao.addShare(share);
		
		if(rowsAdded>0)
		{
			System.out.println("Share has been added to the data");
		}
		else
		{
			System.out.println("Sorry there is something wrong with the values entered");
		}
	}

}
