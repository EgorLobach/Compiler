package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set {

    List<Element> set = new ArrayList<>();

    public Set(Element[] elements) {
        Collections.addAll(set, elements);
    }

    public Set(List<Element> set) {
        this.set = set;
    }

    public Set() {

    }

    public void add(Element element) {
        if (set.indexOf(element) != -1)
            set.add(element);
    }

    public void remove(Element element) {
        if (set.indexOf(element) != -1)
            set.remove(element);
    }

    public List<Element> getSet() {
        return set;
    }

    public boolean indexOf(Element element) {
        return set.indexOf(element) != -1;
    }

    public void add(Set set) {
        this.set.addAll(set.getSet());
    }

    @Override
    public String toString() {
        String buffer = "";
        for(Element element: getSet())
            buffer+=element.toString();
        return buffer;
    }
}
