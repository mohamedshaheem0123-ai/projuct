import java.util.Scanner;

public class booking{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Your Name:");
        String name=scan.nextLine();

        System.out.print("Enter Your Age:");
        int age=scan.nextInt();

        System.out.print("Enter Your Mobile Number:");
        double number=scan.nextDouble();

        System.out.print("Enter Your Seat Number:");
        int seat=scan.nextInt();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Mobile No:"+number);
        System.out.println("Seat No:"+seat);
        System.out.println("Your Ticket is Booked Successfully! At "+seat+" NO");
        System.out.println("Thank You");
    }
}