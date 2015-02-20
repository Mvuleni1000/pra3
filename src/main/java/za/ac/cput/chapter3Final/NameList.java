package za.ac.cput.chapter3Final;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class NameList {

    public List lista;

    public NameList()
    {
        lista = new ArrayList();
    }

    public void addName(String namesStr)
    {
        lista.add(namesStr);
        lista.add(1, "Sbu");
        lista.add(2, "Ephriam");

    }

    public void removeName(int i)
    {
        lista.remove(i);
    }
}
