package hillel.fruit;

import java.util.Objects;

public class Orange extends Fruit{
    private String name;
    public Orange(String name) {
        super(name);
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
        Orange orange = (Orange) o;
        return Objects.equals(name, orange.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    /*@Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }*/
}
