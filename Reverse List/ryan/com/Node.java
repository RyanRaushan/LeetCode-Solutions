package ryan.com;

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

     public void rotate(int k) {

          if (head == null) {
               return;
          }
          ListNode temp = head;
          ListNode temp2 = head;
          int count = 0;
          while (temp != null) {
               temp = temp.next;
               count++;
          }
          k = k % count;

          temp = head;
          int x = count - k - 1;
          while (x-- > 0) {
               temp = temp.next;
               temp2 = temp2.next;
          }

          while (temp2.next != null) {
               temp2 = temp2.next;
          }
          temp2.next = head;

          head = temp.next;

          temp.next = null;
     }
}