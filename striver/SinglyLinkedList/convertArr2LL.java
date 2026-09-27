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

    // serach ele in LL :-
    static int Search(Node head , int val){

        Node temp = head;

        while(temp != null) {
            if(temp.data == val){
                return 1;
            } 

            temp = temp.next;
        }
      return 0; 
    }

    // length :-
    static int LengthOfLL(Node head){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
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

        // Length :-
       System.out.println(LengthOfLL(head));

       System.out.println("----------");

       // search ele in LL ;
       int val = 9;
       System.out.println(Search(head , val));
  }

}