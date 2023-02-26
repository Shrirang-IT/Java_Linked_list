public class Node {

    public int variableInt ;
    public String name ;

    public Node next ;

    Node (int variableInt,String name)
    {
        this.name=name;
        this.variableInt=variableInt;
        this.next=null;
    }

    void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Number : " + this.variableInt);
    }
}
