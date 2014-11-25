package za.co.umar;

public class OverideExample {

    @Override
    public String toString() {
        return "In overridden method";
    }

    public static void main(String[] args) {
        Object object = new OverideExample();
        System.out.println(object.toString());
    }
}
