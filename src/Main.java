import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Driver driver =new Driver();
        int choice = 1;
        while (choice !=0)
        {
            System.out.println("Enter your choice : ");
            System.out.println("Case 1 : Create LL");
            System.out.println("Case 2 : Display LL");
            System.out.println("Case 3 : Reverse a Linked List ");
            System.out.println("Case 0 : Exit");
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
                case 0 -> System.out.println("Thank you !!");
            }
            }

        }
    }
