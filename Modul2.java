import java.util.Scanner;

public class Modul2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a name: ");
        String name = scan.nextLine();
        System.out.print("Input a city: ");
        String city = scan.nextLine();
        System.out.print("Input a hobby: ");
        String hobby = scan.nextLine();
        System.out.print("Input an age: ");
        int age = scan.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("1 Variant");
        System.out.println("Name:  " + name);
        System.out.println("City:  " + city);
        System.out.println("Age:  " + age);
        System.out.println("Hobby:  " + hobby);
        System.out.println();
        System.out.println();
        System.out.println("2 Variant");
        System.out.println("Man with a name " + name + " live in the " + city + ".");
        System.out.println("He is " + age + " and he`s hobby is " + hobby);
        System.out.println();
        System.out.println();
        System.out.println("3 Variant");
        System.out.println(name + " :name");
        System.out.println(city + " :city");
        System.out.println(age + " :age");
        System.out.println(hobby + " : hobby");
    }
}
