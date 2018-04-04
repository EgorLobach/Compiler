import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        try {
            new Program().start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    private void start() throws Exception
{
	System.out.println("prog5");
Element l = new Element("9");
Element ty = new Element("ty");
Set h = new Set(new Element[]{l,ty});
	System.out.println(h.toString());
Set var = new Set(new Element[]{l,ty});
	System.out.println(var.toString());
if(equal(h,var)){
	System.out.println("equal");
}
else{
	System.out.println("non equal");
}

if(nonEqual(h,var)){
	System.out.println("non equal");
}
else{
	System.out.println("equal");
}

}
private void qwerty(Set f, Element a)throws Exception{
Set b = plus(f, a);
	System.out.println(b.toString());
return;
}
private Set plus(Set a, Set b) {
        Set c = new Set(a.getSet());
        for (Element element : b.getSet())
            c.add(element);
        return c;
    }

    private Set plus(Set a, Element b) {
        Set c = new Set(a.getSet());
        c.add(b);
        return c;
    }

    private Set plus(Element b, Set a) {
        Set c = new Set(a.getSet());
        c.add(b);
        return c;
    }

    private Set minus(Set a, Set b) {
        Set c = new Set(a.getSet());
        for (Element element : b.getSet())
            c.remove(element);
        return c;
    }

    private Set minus(Set a, Element b) {
        Set c = new Set(a.getSet());
        c.remove(b);
        return c;
    }

    private Set multiply(Set a, Set b) {
        Set c = new Set();
        for (Element element : a.getSet())
            if (b.indexOf(element))
                c.add(element);
        return c;
    }

    private Set multiply(Set a, Element b) {
        Set c = new Set();
        if (a.indexOf(b))
            c.add(b);
        return c;
    }

    private Set multiply(Element a, Set b) {
        Set c = new Set();
        if (b.indexOf(a))
            c.add(a);
        return c;
    }

    private Set divide(Set a, Set b) {
        Set c = new Set();
        c.add(minus(a, b));
        c.add(minus(b, a));
        return c;
    }

    private boolean nonEqual(Set a, Set b) {
        for (Element element : a.getSet())
            if (b.indexOf(element))
                return false;
        return true;
    }

    private boolean nonEqual(Element a, Element b) {
        return !a.getElement().equals(b.getElement());
    }

    private boolean equal(Set a, Set b) {
        for (Element element : a.getSet())
            if (!b.indexOf(element))
                return false;
        return true;
    }

    private boolean equal(Element a, Element b) {
        return a.getElement().equals(b.getElement());
    }public class Set {

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
        if (set.indexOf(element) == -1)
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
            buffer+=element.toString() + " ";
        return buffer;
    }

    public int size() {
        return set.size();
    }

    public Element get(int i) {
        return set.get(i);
    }
}public class Element {
    String element;

    public Element(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element;
    }
}
}