package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public List<String> readRowsFromFile(String FILE_NAME) {
		List<String> readRows = new ArrayList<String>();
		
		try {
			InputStream inputStream = new FileInputStream(FILE_NAME);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String readRow;
			while((readRow=bufferedReader.readLine())!=null) {
				readRows.add(readRow.trim());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return readRows;
	}
}
