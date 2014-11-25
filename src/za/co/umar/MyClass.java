package za.co.umar;

import za.co.umar.inject.Inject;
import za.co.umar.name.Name;

public class MyClass {

    @Name("Umar")
    private String name;

    @Inject
    public MyClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
