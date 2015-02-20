package za.ac.cput.chapter3Final;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestApp {

    private NameList list;
    private NameMap map;
    private NameSet set;

    @Before
    public void setUp() throws Exception {
        list = new NameList();
        map  = new NameMap();
        set  = new NameSet();
    }

    @Test
    public void addValue() throws Exception
    {
        list.addName("Maziya");
        Assert.assertEquals("Maziya", list.lista.get(0));
    }

    @Test
    public void removeValue() throws Exception {
        list.addName("mnisi");
        list.addName("Jeff");

        list.removeName(1);
        Assert.assertEquals("mnisi", list.lista.get(0));
    }


    @Test
    public void addName() throws Exception
    {
        set.addName("gogo");
        set.addName("hotdog");
        Assert.assertTrue(set.nameSet.contains("gogo"));

    }

    @Test
    public void removeName() throws Exception
    {
        set.addName("vic");
        set.addName("Opelx");

        Assert.assertTrue(set.nameSet.remove("vic"));

    }

    @Test
    public void addMap() throws Exception
    {
        map.addName("mall", "calan");
        map.addName("nyc", "nike");

        String a = (String) map.nameMap.get("mall");

    }

    @Test
    public void removeMap() throws Exception
    {
        map.addName("Lebese", "Ephriam");
        map.addName("Mvuyisi", "Dodo");

        map.removeName("Mubi");

        String sbu  = (String) map.nameMap.get("Mubi");

    }




    @After
    public void tearDown() throws Exception {


    }
}
