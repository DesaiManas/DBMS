import java.util.*; 
public class Studinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;
        String branch;
        
        System.out.println("Enter student name: ");
        name = sc.nextLine();
 
        System.out.println("Enter roll number: ");
        rollno= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter branch: ");
        branch= sc.nextLine();

        System.out.println("------Student Info------");
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Branch: "+branch);
        
        sc.close();
    }
}

