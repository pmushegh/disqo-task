package utils;

import utils.aws_rds.AwsRdsUtils;

import java.sql.*;

public class DBLog {

    private static Connection connection;

    public static void initDBConnection() {
        try {
            connection = AwsRdsUtils.getDBConnectionUsingIam();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopDBConnection() throws Exception {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        AwsRdsUtils.clearSslProperties();
    }

    public static void pass(String suite,String testName) {
        writeLog(suite, testName, TestStatus.PASS);
    }

    public static void fail(String suite,String testName) {
        writeLog(suite, testName, TestStatus.FAIL);
    }

    public static void skip(String suite,String testName) {
        writeLog(suite, testName, TestStatus.SKIP);
    }

    private static void writeLog(String suite, String testName, TestStatus status) {
        try {
            Statement stmt = null;
            stmt = connection.createStatement();
            stmt.addBatch("USE disqo");
            stmt.addBatch("INSERT INTO `disqo`.`test_results`\n" +
                    "(`suite_name`,\n" +
                    "`test_name`,\n" +
                    "`run_result`,\n" +
                    "`date`)" +
                    "VALUES\n" +
                    "('" + suite + "',\n" +
                    "'" + testName + "',\n" +
                    "'" + status.toString() + "',\n" +
                    "'" +  new Timestamp(System.currentTimeMillis()) + "');");
            stmt.executeBatch();
            stmt.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
}
