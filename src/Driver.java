import java.util.Scanner;

public class Driver  {

      Node head = null,runner=null ;
    Scanner sc =new Scanner(System.in);

    void  create ()
    {
        int num1;
        String str1;
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
            runner=runner.next;
        }

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

   void reverseLinkedList_I ()
   {
       if(head == null || head.next == null){
           return;
       }
        Node prev = head;
        Node current = head.next;
        while(current !=null){
            Node nextNode = current.next;
            current.next=prev;
            prev = current;
            current=nextNode;
        }
        head.next=null;          //head is still pointing to next node
        head=prev;

   }

   Node reverseRecurrsion(Node head){
        if (head == null || head.next == null){
            return head ;
        }
        Node newnode = reverseRecurrsion(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
   }

   void execute(){
        head = reverseRecurrsion(head);
        displayAll();
        head=reverseRecurrsion(head);
        displayAll();
   }

   void deleteNode() {                          //deleting nodes
       int delNum;
       runner=head;
       System.out.print("Enter the number to be deleted :  ");
       delNum = sc.nextInt();
       if (runner == null) {
           System.out.println("No list");
       } else if (runner.variableInt == delNum) {
           head = null;
           System.out.println("Node Deleted");

       } else {
           while (runner.next != null) {
               if (runner.next.variableInt==delNum  ) {
                   System.out.println(runner.next.variableInt);
                   runner.next = runner.next.next;
                   System.out.println(delNum + " deleted");
                    return;
               }
           }

       }
   }

}
