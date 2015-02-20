package za.ac.cput.chapter3Final;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class NameSet {

    public HashSet nameSet;

    public NameSet()
    {
        nameSet = new HashSet();
    }

    public void addName(String name)
    {
        nameSet.add(name);
        nameSet.add("Sbu");
        nameSet.add("Mnisi");
    }

    public void nameRemove(String name)
    {
        nameSet.remove(name);
    }


}
