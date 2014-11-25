package za.co.umar.complex;

import java.lang.management.MemoryType;

@Complex(name = "qwerty", count = 10, memory = MemoryType.HEAP)
public class ComplexExample {

    @Complex(count = 1, memory = MemoryType.NON_HEAP)
    private Object myComplexObject;

    @Complex(memory = MemoryType.NON_HEAP)
    public void someComplexMethod() {

    }
}
