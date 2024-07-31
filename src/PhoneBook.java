import java.util.*;
public class PhoneBook {
    static int count=0;

    String person_name;
    String phone_number;

    PhoneBook(String person_name,String phone_number){
        this.person_name=person_name;
        this.phone_number=phone_number;
    }

    public static void addContacts(TreeMap<Integer,PhoneBook> phone_book,Scanner input,int count){
        String person_name,phone_number;
        input.nextLine();
        System.out.println("Enter person name: ");
        person_name=input.nextLine();
        System.out.println("Enter phone number: ");
        phone_number=input.nextLine();
        //count++;
        phone_book.put(count,new PhoneBook(person_name,phone_number));
        //return count;
    }

    public static void removeContact(TreeMap<Integer,PhoneBook> phone_book,Scanner input){
        System.out.println("Enter person name to remove: ");
        input.nextLine();
        String remove_person=input.nextLine();

        for(Map.Entry<Integer,PhoneBook> m : phone_book.entrySet()){
            int key = m.getKey();
            PhoneBook b = m.getValue();
            if(b.person_name.equals(remove_person)) {
                phone_book.remove(key);
                break;
            }
        }
    }

    public static void searchContact(TreeMap<Integer,PhoneBook> phone_book,Scanner input){
        System.out.println("Enter person name to search: ");
        input.nextLine();
        String search_person=input.nextLine();

        for(Map.Entry<Integer,PhoneBook> m : phone_book.entrySet()){
            int key = m.getKey();
            PhoneBook b = m.getValue();
            if(b.person_name.equals(search_person)) {
                System.out.println(search_person+"'s contact number is: "+b.phone_number);
            }
        }
    }

    public static void displayContacts(TreeMap<Integer,PhoneBook> phone_book){
        for(Map.Entry<Integer,PhoneBook> m: phone_book.entrySet()){
            int key=m.getKey();
            PhoneBook b=m.getValue();
            System.out.println("Person " +key+" Details:");
            System.out.println(b.person_name+" "+b.phone_number);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer,PhoneBook> phone_book = new TreeMap<>();
        char ch;
        //int i=0;
        do{
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display Contacts");

            System.out.println("Enter your choice: ");
            int choice=input.nextInt();

            switch(choice){
                case 1:
                        count++;
                        addContacts(phone_book,input,count);
                        break;

                case 2:
                        removeContact(phone_book,input);
                        break;

                case 3:
                        searchContact(phone_book,input);
                        break;

                case 4:
                        displayContacts(phone_book);
                        break;
            }
            System.out.println("Do you want to continue? If yes then enter y else n");
            ch=input.next().charAt(0);
        }while(ch=='y');
    }
}
