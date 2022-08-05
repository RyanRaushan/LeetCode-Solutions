package ryan.com;


public class use {
     public static void main(String[] args) {
        
          Node list = new Node();

          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.print();
          list.rotate(2);
          list.print();

     }
}
