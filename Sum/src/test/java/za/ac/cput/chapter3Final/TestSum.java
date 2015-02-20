package za.ac.cput.chapter3Final;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.chapter3Final.Config.AppCongfig;

/**
 * Created by student on 2015/02/20.
 */
public class TestSum {
    private ApplicationContext ctx;
    private  SumInterface cal;


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppCongfig.class);
        cal = (SumInterface) ctx.getBean("Sbu");

    }

    @Test

    public void addNumbers() throws Exception {
        Assert.assertEquals(32, cal.sumOfValue(10, 22));

    }




    @After
    public void tearDown() throws Exception {


    }
}
