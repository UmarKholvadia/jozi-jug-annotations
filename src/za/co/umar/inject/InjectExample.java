package za.co.umar.inject;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class InjectExample {

    public static void main(String[] args) throws Exception {
        Object object = null;
        object = inject("za.co.umar.MyClass");
        System.out.println(object.toString());
    }

    private static Object inject(String className) throws Exception {
        Class cls = Class.forName(className);
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            Annotation annotation = constructor.getAnnotation(Inject.class);
            if (annotation != null) {
                return cls.newInstance();
            }
        }
        return null;
    }
}
