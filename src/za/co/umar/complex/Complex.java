package za.co.umar.complex;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.management.MemoryType;

@Retention(RetentionPolicy.RUNTIME)
public @interface Complex {

    String name() default "abcde";
    int count() default 5;
    MemoryType memory() default MemoryType.HEAP;

}
