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

    // insert At Kth :-
    static Node insertKth(Node head1 , int k , Node ttemp){

        Node temp = head1;
        Node prev = null;
        int count = 0;

        while(temp != null){
            count++;

            if(count == k){
               prev.next = ttemp;
               ttemp.next = temp;
               break;
            }

            prev = temp;
            temp = temp.next;
        }

       return head1;
    }

    // Traversal :-
     static void Traversal(Node head1){

        Node temp = head1;

        while(temp != null){
            System.out.println(temp.data);
             temp = temp.next;
        }
     }
       
       // convert Arr to LL :-
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
        int arr[] = {1,6,9,4,5};

       Node head = convertArr2LL(arr);

        Traversal(head);

        System.out.println("@@@@@@@@@@@");

        int k = 3;
        Node ttemp = new Node(31);
      Node head1 = insertKth(head , k , ttemp);
      Traversal(head1);
    }
}