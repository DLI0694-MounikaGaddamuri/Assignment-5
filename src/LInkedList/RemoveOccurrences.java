package LInkedList;

import java.util.*;
public class RemoveOccurrences {

    Node head;
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addEnding(int data){
        Node newNode = new Node(data);
        Node temp=head;

        if(head==null)
            head=newNode;
        else{
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void removeOccurrences(int required_occurrence){
        Node temp = head;
        while(temp.next.next!=null){
            if(temp==head && temp.data==required_occurrence){
                head=temp.next;
                temp=head;
            }
            else if(temp.next.data==required_occurrence){
                temp.next=temp.next.next;
                //temp=temp.next;
            }
            else
                temp=temp.next;

        }
        temp.next.data=required_occurrence;
        temp.next=null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RemoveOccurrences list = new RemoveOccurrences();
        list.addEnding(2);
        list.addEnding(4);
        list.addEnding(6);
        list.addEnding(2);
        list.addEnding(2);

        list.display();
        System.out.println("Enter number: ");
        int required_occurrence=input.nextInt();
        list.removeOccurrences(required_occurrence);
        list.display();
    }
}
