package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Shares;
import com.connections.MyConnection;
import com.dao.SharesDAO;

public class SharesDAOImpl implements SharesDAO{

	@Override
	public int addShare(Shares Share) {
		// TODO Auto-generated method stub
		
	int rowsAdded = 0;
		String AddShare = "inset into Shares values(?,?,?)";
		Connection con = MyConnection.openConnection();
		try {
			PreparedStatement ps = con.prepareStatement(AddShare);
			ps.setString(1, Share.getISIN());
			ps.setString(2, Share.getCompany_Name());
			ps.setInt(3, Share.getNumber_of_Shares());
			rowsAdded = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowsAdded;
	}

	@Override
	public boolean updateShare(String ISIN, Shares Share) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;
		String updateShare = "update Shares set number_of_share = ? where isin = ?";
		try(Connection con = MyConnection.openConnection();)
		{
			PreparedStatement ps = con.prepareStatement(updateShare);
			ps.setInt(1, Share.getNumber_of_Shares());
			ps.setString(2, ISIN);
			int rows = ps.executeUpdate();
			isUpdated = rows>0?true:false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return isUpdated;
	}

	@Override
	public int deleteShare(String ISIN) {
		// TODO Auto-generated method stub
		
		int rowsDeleted = 0;
		String deleteShare = "delete from Shares where ISIN = ?";
		try(Connection con = MyConnection.openConnection();)
		{
			PreparedStatement ps = con.prepareStatement(deleteShare);
			ps.setString(1, ISIN);
			rowsDeleted = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowsDeleted;
	}

	@Override
	public Shares findShareByISIN(String ISIN) {
		// TODO Auto-generated method stub
		Shares share = null;
		String findByISIN = "select * from Shares where ISIN = ?";
		Connection con = MyConnection.openConnection();
		try {
			PreparedStatement ps = con.prepareStatement(findByISIN);
			ps.setString(1, ISIN);
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				String isin = set.getString(1);
				String compName = set.getString(2);
				int sharesCount = set.getInt(3);
				share = new Shares(isin,compName,sharesCount);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return share;
	}

	@Override
	public List<Shares> findAllShares() {
		// TODO Auto-generated method stub
List<Shares> shares = new ArrayList<>();
		
		String findAllShares = "select * from Shares";
		try(Connection con = MyConnection.openConnection();)
		{
			PreparedStatement ps = con.prepareStatement(findAllShares);
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				String isin = set.getString(1);
				String compName = set.getString(2);
				int sharesCount = set.getInt(3);
				Shares share = new Shares(isin,compName,sharesCount);
				shares.add(share);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return shares;
	}

}
