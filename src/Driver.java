import java.util.Scanner;

public class Driver {

    Node head = null,runner=null ;
    Scanner sc =new Scanner(System.in);
    void  create ()
    {
        int num1 =0;
        String str1=null;
        System.out.println("Enter number : ");
        num1=sc.nextInt();
        System.out.println("Enter name : ");
        str1=sc.next();
        Node temp = new Node (num1,str1);
        if ( head==null){
            head=temp;
            runner=temp;
        }
        else {
            runner.next=temp;
        }
        temp=null;
    }

   void displayAll()
   {
       runner=head;
       if (runner == null){
           System.out.println("List is empty");
       }
       else {
           while (runner.next != null) {
               runner.print();
               runner = runner.next;
           }
           runner.print();
       }
   }

}
