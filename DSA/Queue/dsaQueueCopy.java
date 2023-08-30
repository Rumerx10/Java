package Queue;
public class dsaQueueCopy {
    //_____________________________________using array______________________________
//     public class dsaQueue {
//     static class Queue{
//         static int[] array;
//         static int size;
//         static int rare = -1;
//         Queue(int n){
//             array = new int[n];
//             size = n;
//         }

//         public static boolean isEmpty(){
//             return rare == -1;
//         }

//         public static void add(int data){
//             if(rare == size-1){
//                 System.out.println("Queue is full.");
//                 return;
//             }
//             rare++;
//             array[rare] = data;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int front = array[0];
//             for(int i=0; i<rare; i++){
//                 array[i] = array[i+1];
//             }
//             rare--;
//             return front;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return array[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);       
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }_________________________________________________using array________________________


// using circular array______________________________________

//     static class Queue{
//         static int[] array;
//         static int size;
//         static int rare = -1;
//         static int front = -1;
//         Queue(int n){
//             array = new int[n];
//             size = n;
//         }

//         public static boolean isEmpty(){
//             return rare == -1 && front == -1;
//         }
//         public static boolean isFull(){
//             return (rare+1)%size == front; 
//         }

//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("Queue is full.");
//                 return;
//             }
//             if(front == -1){
//                 front = 0;
//             }
//             rare = (rare+1) % size; 
//             array[rare] = data;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int result = array[front];
//             if(rare == front){
//                 rare = front = -1;
//             }else{
//                 front = (front+1)%size;
//             }
                        
//             return result;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return array[front];
//         }
//     }




//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);       
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }

//         q.remove();
//         q.remove();

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }

//         q.add(8);
//         q.add(9);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// _____________________________________________________________circular array...............


//_______________________________using linked list _________________________________

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }


    // static class Queue{
    //    static Node head = null;
    //    static Node tail = null;       

    //     public static boolean isEmpty(){
    //        return head == null && tail == null;
    //     }
        

    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(tail == null){
    //             head = tail = newNode;
    //         }
    //         tail.next = newNode;    
    //         tail = newNode;        
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty.");  
    //             return -1;              
    //         }
    //         int sendHead = head.data;
    //         if(head == tail){
    //             tail = null;
    //         }
    //         head = head.next;   
    //         return sendHead;         
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }




    // public static void main(String[] args) {
    //     Queue q = new Queue();
    //     q.add(1);       
    //     q.add(2);
    //     q.add(3);
    //     q.add(4);
    //     q.add(5);

    //     while(!q.isEmpty()){
    //         System.out.println(q.peek());
    //         q.remove();
    //     }

    // }



    // _______________________using collections framework____________________
