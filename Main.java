
public class Main {
    public static void main(String[] args) {

        Seat num1 = new Seat("19", true);
        Seat num2 = new Seat("12", false);
        Seat num3 = new Seat("35", true);
        Seat num4 = new Seat("41", false);
        Seat num5 = new Seat("9", true);

        System.out.println("Места в наличие : ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        System.out.println("-------------------------------------------");

        System.out.println("Актуальные места на текущий момент :");

        System.out.println(num1.booking());
        System.out.println(num2.booking());
        System.out.println(num3.booking());
        System.out.println(num4.booking());
        System.out.println(num5.booking());


        System.out.println("-------------------------------------------");




    }
}