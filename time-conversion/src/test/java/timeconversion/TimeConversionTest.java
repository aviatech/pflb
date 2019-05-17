package timeconversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeConversionTest {
    @Test
    public void to24format() {
        assertEquals("19:05:45", TimeConversion.to24format("07:05:45PM"));
        assertEquals("13:05:45", TimeConversion.to24format("01:05:45PM"));
        assertEquals("12:05:45", TimeConversion.to24format("12:05:45PM"));
        assertEquals("00:05:45", TimeConversion.to24format("12:05:45AM"));
    }

}