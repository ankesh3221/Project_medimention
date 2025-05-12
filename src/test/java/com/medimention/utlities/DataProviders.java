package com.medimention.utlities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="RegData")
	public String[][] getData() throws IOException
	{
		String path= ".\\TestData\\MOCK_DATA (1).xlsx";
		
		ExcelUtility xlutils= new ExcelUtility(path);
		
		int rows= xlutils.getRowCount("data");
		int cols= xlutils.getCellCount("data", 1);
		System.out.println(rows+"   "+cols);
		String registerData[][]= new String[rows][cols];
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				registerData[i-1][j]=xlutils.getCellData("data", i, j); 
			}
		}
		System.out.println(1);
		return registerData;
	}
}
