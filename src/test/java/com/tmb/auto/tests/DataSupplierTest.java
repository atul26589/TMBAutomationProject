package com.tmb.auto.tests;

import java.util.List;

import org.testng.annotations.Test;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import testData.TestData;

public class DataSupplierTest {

	@Test(dataProvider="getData")
	public void dataSupplierTest(String username) {
		System.out.println(username);
	}
	
	@DataSupplier
	public StreamEx<TestData> getData(){
		return TestDataReader.use(XlsxReader.class)
	          .withTarget(TestData.class)
	            .withSource("testdata.xlsx")
	            .read()
	            .filter(testdata -> testdata.testCasename.equalsIgnoreCase("titleValidationTest"));
	}
	
}
