// public class LL {
//     Node head;
//     private int size;

//     LL(){
//         this.size = 0;
//     }
    
//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add First
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     // add Last
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currentNode = head;
//         while(currentNode.next != null){
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;
//     }

//     // Delete First
//     public void deleteFirst(){
//         size--;
//         head = head.next;
//     }

//     // Delete Last 
//     public void deleteLast(){
//         if(head == null){
//             System.out.println("List is Empty.");
//             return;
//         }
//         size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }
//         Node currentNode = head;
//         while(currentNode.next.next != null){
//             currentNode = currentNode.next;
//         }
//         currentNode.next = null;
//     }

//     public int getSize(){
//         return size;
//     }

//     public void printList(){
//         if(head == null){
//             System.out.println("List is empty.");
//             return;
//         }

//         Node currentNode = head;
//         while(currentNode != null){
//             System.out.print(currentNode.data + "-->");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }


//     public static void main(String[] args) {
//         LL list = new LL();
//         list.addFirst("a");       
//         list.addFirst("is");
//         list.addLast("List");
//         list.addFirst("This");
//         list.printList();
//         list.deleteFirst();
//         list.printList();
//         list.deleteLast();
//         list.printList();
//         System.out.println(list.getSize());
//         list.addFirst("hello");
//         System.out.println(list.getSize());

//     }

// }


//  public void reverseIterate(){
//         if(head == null || head.next == null){
//             return;
//         }
//         Node prevNode = head;
//         Node currentNode = head.next;
//         while(currentNode != null){
//             Node nextNode = currentNode.next;
//             currentNode.next = prevNode;
//             // Update
//             prevNode = currentNode;
//             currentNode = nextNode;
//         }
//         head.next = null;
//         head  = prevNode;

//     }