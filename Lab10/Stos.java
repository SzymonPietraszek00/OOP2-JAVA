import java.util.ArrayList;

public class Stos<T>{

    private Node head = null;


  class Node{
    T value;
    Node next;
  }


  public void pop(){

    head = head.next;
  }
  
  public void push(T x){
    Node temp = head;
    head = new Node();

    head.value = x;
    head.next = temp;

  }


  @Override
  public String toString(){
  
    String s = "";
    Node temp = head;

    while(temp != null){
      s += "{" + temp.value + "} ";

      temp = temp.next;
    }

    return s;
  }

}