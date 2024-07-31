import java.util.*;
public class Employee {

    String employee_name;
    int employee_id;
    String employee_department;

    static int count=0;

    Employee(int employee_id,String employee_name,String employee_department){
        this.employee_id=employee_id;
        this.employee_name=employee_name;
        this.employee_department=employee_department;
    }

    public static void searchEmployee(HashMap<Integer,Employee> map,Scanner input){
        System.out.println("Enter employee ID: ");
        int searchEmployee_id = input.nextInt();

        for(Map.Entry<Integer,Employee> m : map.entrySet()){
            //int key = m.getKey();
            Employee e = m.getValue();
            if(e.employee_id==searchEmployee_id)
                System.out.println(e.employee_name+" "+e.employee_department);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,Employee> map = new HashMap<>();
        char choice;
        do{
            System.out.println("Enter Employee ID: ");
            int employee_id=input.nextInt();
            input.nextLine();
            System.out.println("Enter Employee Name: ");
            String employee_name= input.nextLine();
            System.out.println("Enter Employee Department: ");
            String employee_department= input.nextLine();
            count++;
            map.put(count,new Employee(employee_id,employee_name,employee_department));

            System.out.println("Do you want to add another employee details? If yes then enter y else n.");
            choice = input.next().charAt(0);
        }while(choice=='y');

        searchEmployee( map,input);

    }
}
