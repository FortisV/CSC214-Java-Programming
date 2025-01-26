



import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to ounce and pound converting program!");
        System.out.println();

        boolean repeat = true;
        String input;
        int ounces = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter number of ounces to convert to pounds: ");
            input = scanner.nextLine();
            if(input.isBlank()) {
                System.out.println("Blank values are invalid");
            } else if(!IO.isInt(input)) {
                System.out.println("Non-integers and extraneous blank spaces are invalid");
            } else {
                ounces = Integer.parseInt(input);
                if(ounces < 0) {
                    System.out.println("Negative values are invalid");
                } else {
                    System.out.println("Converting value");
                    repeat = false;
                }
            }
            System.out.println();
        } while(repeat);
        scanner.close();

        Converter converter = new Converter();

        System.out.println(ounces + " is equivalent to " + converter.toPounds(ounces));
        System.out.println(ounces + " is equivelent to " + converter.toPoundsAndOunces(ounces));

        System.out.println();
        System.out.println("Exiting...");
    }
}
