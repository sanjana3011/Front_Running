package com.dao;
import com.pojo.Shares;
import java.util.List;



public interface SharesDAO {
	
	int addShare(Shares Share);
	boolean updateShare(String ISIN, Shares Share);
	int deleteShare(String ISIN);
	Shares findShareByISIN(String ISIN);
	List<Shares> findAllShares();
	
}
