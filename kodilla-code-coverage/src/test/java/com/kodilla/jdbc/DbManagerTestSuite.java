package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class DbManagerTestSuite {

    @Before
    public void beforeEach() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        String query = "DELETE FROM POSTS WHERE 1=1";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(query);

        query = "DELETE FROM ISSUES WHERE 1=1";
        statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(query);

        query = "DELETE FROM USERS WHERE 1=1";
        statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(query);
    }

    @Test
    public void testConnect() throws SQLException {
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();

        String sql = "INSERT INTO USERS(ID, FIRSTNAME, LASTNAME) VALUES (1, 'Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(ID, FIRSTNAME, LASTNAME) VALUES (2, 'Mark', 'Boq')";
        statement.executeUpdate(sql);

        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (1, 'Hi!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (2, 'Hello!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (2, 'How are you today?')";

        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) >= 2";
        statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME") + ", " +
                    resultSet.getString("LASTNAME"));
            counter++;
        }

        assertEquals(1, counter);

        resultSet.close();
        statement.close();
    }
}
