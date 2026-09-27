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

    // delete Tail of LL :-
    static Node deleteTail(Node head1){

        // cases :-
        if(head1 == null || head1.next == null){
             return null;
        }
    
       Node temp = head1;

       while(temp.next.next != null){
         temp = temp.next;
       }

       temp.next = null;

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

      int arr[] = {2,4,10,9,20};

     //int arr[] = {0};

      Node head = convertArr2LL(arr);

       // Traversal :-
        Traversal(head);

        System.out.println("----------");

        // delete head 0f LL :-
        Node head1 = deleteTail(head);

         Traversal(head1);
  }

}