import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1: ");
////        sc.nextwtf is this
        Arithmeticy arithmeticz = new Arithmeticy(69,4.20);

        System.out.println(arithmeticz.add());

        System.out.println(arithmeticz.subtract());

        System.out.println(arithmeticz.multiply());

        System.out.println(arithmeticz.divide());

        System.out.println(arithmeticz.getMax());

        System.out.println(arithmeticz.getMin());


        Mapy<Integer, String> mapz = new Mapy<>();
        mapz.put(2, "ginger");
        mapz.put(1, "wonderwoman");
        mapz.put(3, "robin");
        mapz.put(4,"batman");

        System.out.println(mapz.get(2));
        System.out.println(mapz.get(5)); //null output ani

        System.out.println(mapz.remove(3));

        mapz.put(3,"handsomer");
        System.out.println(mapz.get(3));
        System.out.println(mapz.get(1));
        System.out.println(mapz.get(3));


    }
}