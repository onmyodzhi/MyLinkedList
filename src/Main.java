/*
Самый дешевый автомобиль
*/

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        list.print();

        list.reverse();
        list.print();
    }
}
