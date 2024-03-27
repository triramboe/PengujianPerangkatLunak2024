import org.example.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {
    @Test
    public void testLeapYear(){
        DateUtils dateutils = new DateUtils();
        Assertions.assertFalse(dateutils.isLeapYear(2018));
        Assertions.assertTrue(dateutils.isLeapYear(2020));
    }

    @Test
    public void testDaysInMonth(){
        DateUtils dateutils = new DateUtils();
        Assertions.assertEquals(29, dateutils.getDaysInMonth(2020,2));
        Assertions.assertEquals(28, dateutils.getDaysInMonth(2018,2));
        Assertions.assertEquals(28, dateutils.getDaysInMonth(2019,2));
        Assertions.assertEquals(31, dateutils.getDaysInMonth(2020,12));
        Assertions.assertEquals(30, dateutils.getDaysInMonth(2020,11));
    }


}
