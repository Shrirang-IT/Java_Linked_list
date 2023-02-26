import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Driver driver =new Driver();
        int choice = 1;
        while (choice !=0)
        {

            System.out.println("Case 1 : Create LL");
            System.out.println("Case 2 : Display LL");
            System.out.println("Case 3 : Reverse a Linked List ");
            System.out.println("Case 4 : Recurssive Reverse");
            System.out.println("Case 5 : Delete ");
            System.out.println("Case 0 : Exit");
            System.out.print("Enter your choice : ");
            Scanner sc =new Scanner(System.in);
            choice =sc.nextInt();

            // Enhanced Switch in Java

            switch (choice) {
                case 1 -> driver.create();
                case 2 -> driver.displayAll();
                case 3 ->{ driver.reverseLinkedList_I();
                          driver.displayAll();
                          driver.reverseLinkedList_I();
                    }
                case 4 -> driver.execute();
                case 5 -> driver.deleteNode();
                case 0 -> System.out.println("Thank you !!");
            }
            }

        }
    }
