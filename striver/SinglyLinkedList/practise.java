class Node {
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }

     Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

class LinkedList {

    public static void main(String[] args){

        Node head = new Node(15);

         System.out.println(head);
         System.out.println(head.data);

         System.out.println("----------");

         int arr[] = {11,23,14,15};

         Node y = new Node(arr[0]);

         System.out.println(y);
         System.out.println(y.data);

    }
}