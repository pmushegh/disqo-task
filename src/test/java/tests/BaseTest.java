package tests;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DBLog;

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
        File logFile = new File(  "logs\\restassured\\".replace('\\', File.separatorChar) +timeStamp + ".log");
        PrintStream fileOutPutStream = new PrintStream(logFile);

        RestAssured.filters(new AllureRestAssured(), new RequestLoggingFilter(LogDetail.ALL, fileOutPutStream),
                new ResponseLoggingFilter(LogDetail.ALL, fileOutPutStream), new ErrorLoggingFilter(fileOutPutStream));
        RestAssured.useRelaxedHTTPSValidation();

        try {
            DBLog.initDBConnection();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void tearDown() throws Exception {
        DBLog.stopDBConnection();
    }
}
