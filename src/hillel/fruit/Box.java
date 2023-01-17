package hillel.fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box <T>{
    public static final float WEIGHT_APPLE = 1.0F;
    public static final float WEIGHT_ORANGE = 1.5F;
    private T one;
    public Box (){

    }
    public Box(T one) {
        this.one = one;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(one, box.one);
    }

    @Override
    public int hashCode() {
        return Objects.hash(one);
    }

  /*  @Override
    public String toString() {
        return "Box{" +
                "one=" + one +
                '}';
    }*/

    public void addOne (T one){
        if (one instanceof Apple) {
            System.out.println("In box put one " + one);
        }
        else if (one instanceof Orange) {
           System.out.println("In box put one " + one);
        }
        else
            System.out.println("Box is empty");

    }

    public <T> List addMore(T[]arr){
        List <T> boxList = new ArrayList<>();
        for(T i : arr){
            boxList.add(i);
        }return boxList;
    }
    public float getWeight(T[]arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Apple) {
                sum = arr.length * WEIGHT_APPLE;
            }
            if (arr[i] instanceof Orange) {
                sum = arr.length * WEIGHT_ORANGE;
            }

        }  return sum;
    }

    public boolean compare (T box){
        Box boxCompare = new Box();
        if (boxCompare == box)
            return true;
        else return false;
    }

    public <T> List merge (List<T> box){
        List<T> listing = new ArrayList<>();
        for (T i: box) {
            listing.add(i);
        }
        return listing;
    }


}
