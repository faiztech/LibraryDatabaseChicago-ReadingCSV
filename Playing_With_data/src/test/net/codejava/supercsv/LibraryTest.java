package test.net.codejava.supercsv;

import net.codejava.supercsv.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//This is a test class for testing all our getters and setters of our created POJO


class LibraryTest {

    Library testLibrary = new Library("test library", "Monday through Friday", "123 Wacker Drive", "60000", "8700000000", "www.google.com");

    @Test
    void getName() {
        assertEquals("test library", testLibrary.getName());

    }

    @Test
    void setName() {
        testLibrary.setName("test 2");
        assertEquals("test 2", testLibrary.getName());
    }

    @Test
    void getHoursOfOp() {
        assertEquals("Monday through Friday", testLibrary.getHoursOfOp());
    }

    @Test
    void setHoursOfOp() {
        testLibrary.setHoursOfOp("updated hours");
        assertFalse(testLibrary.getHoursOfOp().equals("Monday through Friday"));
    }

    @Test
    void getAddress() {
        assertEquals("123 Wacker Drive", testLibrary.getAddress());
    }

    @Test
    void setAddress() {
        testLibrary.setAddress("Changed Address");
        assertTrue(testLibrary.getAddress().equals("Changed Address"));
    }

    @Test
    void getWebsite() {
        assertTrue(testLibrary.getWebsite().equals("www.google.com"));

    }

    @Test
    void setWebsite() {
        testLibrary.setWebsite("Changed Website");
        assertEquals("Changed Website",testLibrary.getWebsite());
    }

    @Test
    void getPhone() {
        assertEquals("8700000000", testLibrary.getPhone());

    }

    @Test
    void setPhone() {
        testLibrary.setPhone("Changed Phone");
        assertTrue(testLibrary.getPhone().equals("Changed Phone"));
    }



    @Test
    void getZip() {
        assertEquals("60000", testLibrary.getZip());

    }

    @Test
    void setZip() {

        testLibrary.setZip("60090");
        assertTrue(testLibrary.getZip().equals("60090"));
    }



    @Test
    @Override
    public String toString() {
        return null;
    }

}