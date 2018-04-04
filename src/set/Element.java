package set;

public class Element {
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
