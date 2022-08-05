
public class Node {
     ListNode head;

     public void add(int value) {
          ListNode newNode = new ListNode(value);
          if (head == null) {
               head = newNode;
               return;
          }

          ListNode temp = head;
          while (temp.next != null) {
               temp = temp.next;
          }
          temp.next = newNode;
          return;
     }

     public void delete(int k){
          if (head == null) {
               return;
          }
          ListNode temp = head;
          int count = 0;
          while (temp != null) {
               temp = temp.next;
               count++;
          }

          if (k >= count){
               System.out.println("invalid input");
               return;
          }

          k = count - k - 1;
          temp = head;
          while (k-- > 0){
               temp = temp.next;
          }

          temp.next = temp.next.next;
          return;
     }

     public void print() {

          if (head == null) {
               System.out.println("No Element");
               return;
          }

          ListNode temp = head;
          while (temp != null) {
               System.out.print(temp.val + " -> ");
               temp = temp.next;
          }
          System.out.println("null");
          return;
     }


}