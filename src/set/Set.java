package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set {
    List<Element> set = new ArrayList<>();
    public Set(Element[] elements) {
        Collections.addAll(set, elements);
    }
    public void add(Element element){
        if (set.indexOf(element)!=-1)
            set.add(element);
    }
    public void remove(Element element){
        set.remove(element);
    }
}
