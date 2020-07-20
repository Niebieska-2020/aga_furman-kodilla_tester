import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTestSuite {

    @Test
    public void returnTrueWhenTheYearIsLeapYear() {
        // given
        LeapYear leapYear = new LeapYear();

        // then
        assertTrue(leapYear.isLeapYear1(2020));
        assertTrue(leapYear.isLeapYear2(2020));
    }

    @Test
    public void returnFalseWhenTheYearIsNotLeapYear() {
        // given
        LeapYear leapYear = new LeapYear();

        // then
        assertFalse(leapYear.isLeapYear1(2018));
        assertFalse(leapYear.isLeapYear2(2018));
    }
}
