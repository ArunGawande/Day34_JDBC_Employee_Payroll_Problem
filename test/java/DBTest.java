
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
}
