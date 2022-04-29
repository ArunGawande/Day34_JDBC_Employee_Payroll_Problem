
import junit.framework.TestCase;
//import org.testng.Assert;
import org.junit.Assert;
import java.sql.Connection;
import java.sql.SQLException;

public class DBTest  extends TestCase
{
    static Connection a = null;

    public void testReteriveData() {
        try {
            DataBase db = new DataBase();
            a = DataBase.connected();
            String actual = DataBase.reteriveData(a);
            Assert.assertEquals("actual ", actual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
