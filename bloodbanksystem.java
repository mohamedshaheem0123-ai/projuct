import java.util.ArrayList;
import java.util.Scanner;

class Donor {
    int id;
    String name;
    int age;
    String bloodGroup;
    String phone;

    Donor(int id, String name, int age, String bloodGroup, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Donor ID     : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Blood Group  : " + bloodGroup);
        System.out.println("Phone        : " + phone);
    }
}

public class bloodbanksystem {

    static ArrayList<Donor> donors = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    
    static void addDonor() {
        System.out.print("Enter Donor ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Blood Group: ");
        String bloodGroup = sc.nextLine().toUpperCase();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        donors.add(new Donor(id, name, age, bloodGroup, phone));

        System.out.println("\nDonor added successfully!");
    }

    
    static void displayDonors() {

        if (donors.isEmpty()) {
            System.out.println("\nNo donors available.");
            return;
        }

        System.out.println("\n===== ALL DONORS =====");

        for (Donor donor : donors) {
            donor.display();
        }
    }

    
    static void searchBlood() {

        sc.nextLine();

        System.out.print("Enter Blood Group to Search: ");
        String group = sc.nextLine().toUpperCase();

        boolean found = false;

        System.out.println("\n===== SEARCH RESULT =====");

        for (Donor donor : donors) {

            if (donor.bloodGroup.equals(group)) {
                donor.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donor found for blood group " + group);
        }
    }

    
    static void removeDonor() {

        System.out.print("Enter Donor ID to Remove: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < donors.size(); i++) {

            if (donors.get(i).id == id) {

                donors.remove(i);

                System.out.println("Donor removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Donor not found!");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("   BLOOD BANK MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Donor");
            System.out.println("2. Display All Donors");
            System.out.println("3. Search Blood Group");
            System.out.println("4. Remove Donor");
            System.out.println("5. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addDonor();
                    break;

                case 2:
                    displayDonors();
                    break;

                case 3:
                    searchBlood();
                    break;

                case 4:
                    removeDonor();
                    break;

                case 5:
                    System.out.println("\nThank you for using Blood Bank Management System!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}