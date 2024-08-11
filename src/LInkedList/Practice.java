package LInkedList;

public class Practice {

        Node  head1,head2;
        class Node{
            Node next;
            int data;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

    public Node addEnding(int data,Node head){
        Node newNode = new Node(data);
        Node temp=head;

        if(head==null)
            head=newNode;
        else{
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
        return head;
//        public Node sum(Node head1,Node head2){
//
//        }
    }

    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
            Practice p = new Practice();
            Practice list1 = new Practice();
            list1.addEnding(1,p.head1);
            list1.addEnding(7,p.head1);

            Practice list2 = new Practice();
            list2.addEnding(3,p.head2);
            list2.addEnding(3,p.head2);
            list2.addEnding(9,p.head2);

            list1.display(p.head1);
            list1.display(p.head2);
    }
}
