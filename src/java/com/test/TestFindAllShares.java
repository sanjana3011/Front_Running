package com.test;

import java.util.List;

import com.pojo.Shares;
import com.dao.SharesDAO;
import com.dao.impl.SharesDAOImpl;

public class TestFindAllShares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SharesDAO dao = new SharesDAOImpl();
		List<Shares> shares = dao.findAllShares();
		if(shares.size()>0) {
			for(Shares share:shares) {
				System.out.println(share);
				}
			}else {
				System.out.println("No data related to shares is found");
		}
	}

}
