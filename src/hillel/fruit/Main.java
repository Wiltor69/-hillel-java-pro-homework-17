package hillel.fruit;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Apple ap = new Apple("Apple");
        Apple ap1 = new Apple("Apple1");
        Apple ap2= new Apple("Apple2");
        Apple ap3 = new Apple("Apple3");
        Apple ap4 = new Apple("Apple4");

        Orange or = new Orange("Orange");
        Orange or1 = new Orange("Orange1");
        Orange or2 = new Orange("Orange2");
        Orange or3 = new Orange("Orange3");
        Orange or4 = new Orange("Orange4");

        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3= new Box();

        box.addOne(ap);
        box1.addOne(or);

        Apple [] apples = {ap,ap1,ap2,ap3,ap4};
        Orange [] oranges = {or,or1,or2,or3,or4};

        System.out.println();

        List <Apple> appleList = box2.addMore(apples);
        List <Orange> orangeList = box3.addMore(oranges);
        System.out.println(appleList);

        System.out.println();

        System.out.println(orangeList);

        System.out.println();

        System.out.println("Total weight of apples = " + box2.getWeight(apples));

        System.out.println();

        System.out.println("Total weight of oranges = " + box3.getWeight(oranges));

        System.out.println();

        System.out.println(box2.compare(box3.getOne()));

        System.out.println();

        System.out.println(box.merge(appleList));
        System.out.println(box1.merge(orangeList));

    }
}
