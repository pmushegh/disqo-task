package tests;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {

    @BeforeSuite
    public void warmUp() throws FileNotFoundException {
        RestAssured.baseURI = "https://gorest.co.in/public-api";
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        PrintStream fileOutPutStream = new PrintStream(new File( timeStamp + ".log"));

        RestAssured.filters(new AllureRestAssured(), new RequestLoggingFilter(LogDetail.ALL, fileOutPutStream),
                new ResponseLoggingFilter(LogDetail.ALL, fileOutPutStream), new ErrorLoggingFilter(fileOutPutStream));
    }
}
