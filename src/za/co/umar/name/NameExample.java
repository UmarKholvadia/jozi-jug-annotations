package za.co.umar.name;

import java.lang.reflect.Field;

public class NameExample {

    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("za.co.umar.MyClass");
        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(Boolean.TRUE);
        Name nameAnnotation = (Name) nameField.getAnnotation(Name.class);
        String value = nameAnnotation.value();
        System.out.println(value);
    }
}
