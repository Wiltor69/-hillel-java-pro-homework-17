package hillel.fruit;

import java.util.Objects;

public class Apple extends Fruit{
    private String name;
    public Apple(String name) {
        super(name);
        this.name=name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Objects.equals(name, apple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

   /* @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }*/
}
