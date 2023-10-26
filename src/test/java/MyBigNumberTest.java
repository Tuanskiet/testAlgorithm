import com.edu.poly.service.MyBigNumber;
import junit.framework.Assert;
import org.junit.Test;

public class MyBigNumberTest {

    // length string1 > length string 2
    @Test
    public void testCaseSum1() {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("792384", "39");
        String expected = "792423";
        Assert.assertEquals(expected, result);
    }

    // length string1 < length string 2
    @Test
    public void testCaseSum2() {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("39", "792384");
        String expected = "792423";
        Assert.assertEquals(expected, result);
    }

    // case of one string empty
    @Test
    public void testCaseSum3() {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("", "9999");
        String expected = "9999";
        Assert.assertEquals(expected, result);
    }

    //case of overflow quantity
    @Test
    public void testCaseSum4() {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("9999", "1");
        String expected = "10000";
        Assert.assertEquals(expected, result);
    }

    //case with 1 string = "0"
    @Test
    public void testCaseSum5() {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("0", "1");
        String expected = "1";
        Assert.assertEquals(expected, result);
    }

    //case of overflow number in type data
    @Test
    public void testCaseSum6() {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum(String.valueOf(Integer.MAX_VALUE), "1");
        String expected = String.valueOf(Integer.MAX_VALUE + 1);
        Assert.assertEquals(expected, result);
    }
}
