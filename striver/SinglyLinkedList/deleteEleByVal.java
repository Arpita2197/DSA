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
 
    // delete Value Ele :-
    static Node deleteValEle(Node head1 , int val){

     Node temp = head1;
     Node prev = null;
       
       while(temp.data != val) {
         prev = temp;
         temp = temp.next;
       }

       prev.next = prev.next.next;

       return head1;

    }
 

       // Traversal :-
    static void Traversal(Node head){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


       // convert Array 2 LL :-
   static Node convertArr2LL(int arr[]){

      Node head = new Node(arr[0]);
      Node mover = head;

      for(int i = 1 ; i < arr.length ; i++){

         Node temp = new Node(arr[i]);
         mover.next = temp;

         mover = temp;
      }

      return head;

    }

     public static void main(String[] args){

      int arr[] = {1,5,8,9,0};

      Node head = convertArr2LL(arr);

       // Traversal :-
        Traversal(head);

        System.out.println("----------");

        int val = 9;
       Node head1 = deleteValEle(head ,val );

        Traversal(head1);

  }

}