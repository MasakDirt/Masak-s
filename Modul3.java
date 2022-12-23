import java.util.Scanner;

public class Modul3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int numberFive = 0, numberOne = 0, numberTwo = 0, numberThree = 0, numberFour = 0, numberSix = 0;
        String numbers;
        System.out.println("Input 5 numbers :");
        for (int i = 0; i < 5; i++) {
            numbers = scan.nextLine();
            if (Integer.parseInt(numbers) == 5) {
                numberFive += 1;
            }
            if (Integer.parseInt(numbers) == 1) {
                numberOne += 1;
            }
            if (Integer.parseInt(numbers) == 2) {
                numberTwo += 1;
            }
            if (Integer.parseInt(numbers) == 3) {
                numberThree += 1;
            }
            if (Integer.parseInt(numbers) == 4) {
                numberFour += 1;
            }
            if (Integer.parseInt(numbers) == 6) {
                numberSix += 1;
            }
            String[] num = numbers.split(" ");
            for (String n : num) {
                switch (n) {
                    case "5":
                        if (numberFive == 3) {
                            sum += 400;
                            break;
                        } else {
                            sum += 50;
                        }
                        break;
                    case "1":
                        if (numberOne == 3) {
                            sum += 800;
                            break;
                        } else {
                            sum += 100;
                        }
                        break;
                    case "2":
                        if (numberTwo == 3) {
                            sum += 200;
                            break;
                        }
                        break;
                    case "3":
                        if (numberThree == 3) {
                            sum += 300;
                            break;
                        }
                        break;
                    case "4":
                        if (numberFour == 3) {
                            sum += 400;
                            break;
                        }
                        break;
                    case "6":
                        if (numberSix == 3) {
                            sum += 600;
                            break;
                        }
                        break;
                }
            }
            if (numbers.matches("1") || numbers.matches("2") || numbers.matches("3") || numbers.matches("4") || numbers.matches("5") || numbers.matches("6")) {

            } else {
                System.out.println("Something wrong!");
                break;
            }

        }
        System.out.println("Sum = " + sum);
    }
}
