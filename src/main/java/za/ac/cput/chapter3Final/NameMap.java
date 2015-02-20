package za.ac.cput.chapter3Final;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class NameMap {
    public Map nameMap;

    public NameMap()
    {
        nameMap = new HashMap();
    }

    public void addName(String a, String b)
    {
        nameMap.put(a , b);
        nameMap.put("Mnisi", " Sbu");
    }

    public void removeName(String a)
    {
        nameMap.remove(a);
    }


}
