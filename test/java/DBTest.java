
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class DBTest
{
    static Connection a = null;

    @Test
    public void givenUpdatedData_shouldRetrieve_correctRecords() {
        try {
            DataBase db = new DataBase();
            a = DataBase.connected();
            String expected = DataBase.reteriveData(a);
            Assert.assertEquals("30000", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    void givenData_shouldRetrieveData_byName() {
        try {
            a = DataBase.connected();
            String expected = DataBase.reteriveDataByName(a);
            Assert.assertEquals("30000", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenParticularDateRange_shouldReturn_correctRecords() {
        try {
            a = DataBase.connected();
            String expected = DataBase.particularDateRange(a);
            Assert.assertEquals("Rohit", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenGender_shouldReturn_SumSalary() {
        try {
            a = DataBase.connected();
            String expected = DataBase.sumByGroup(a);
            Assert.assertEquals("110000.0", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}