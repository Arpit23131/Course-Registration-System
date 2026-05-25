import java.util.*;
public class User_roles {

    User_roles() {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tNew Course Registration System");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIIIT Delhi");
        System.out.println();
    }

    private User This_User;
    public User_roles(User ThisUser){
        This_User = ThisUser;
    }

    String User_Role;
    void select_role() {
        System.out.println("You have to Register first for using the application.");
        System.out.println();
        System.out.println("Press (1) If you are a Student.");
        System.out.println("Press (2) If you are a Professor.");
        System.out.println("Press (3) If you are an administrator.");
        System.out.println("Press (4) If you are a Teaching Assistant");
        System.out.println();
        Scanner role = new Scanner(System.in);
        System.out.print("Select Your Role : ");
        int Your_role = role.nextInt();

        switch (Your_role) {
            case 1:
                This_User = new Student();
                This_User.Register();
                User_Role = "Student";
                break;
            case 2:
                This_User = new Professor();
                This_User.Register();
                User_Role = "Professor";
                break;
            case 3:
                This_User = new Administrator();
                This_User.Register();
                User_Role = "Administrator";
                break;
            case 4:
                This_User = new Teaching_Assistant();
                This_User.Register();
                User_Role = "TA";
                break;

            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }
    }

    void after_registration() {
        System.out.println("\t\t\t\t\t\t\t\t\tHome Page");
        System.out.println("To Login             - Press '1'");
        System.out.println("To close application - Press '0'");
        System.out.println("Register with another role - Press '2'");
        System.out.println();
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int input = num.nextInt();
        if (input == 0){
            System.exit(0);
        }
        else if (input == 1){
            This_User.log_in(User_Role);
        }
        else if (input == 2){
            select_role();
        }
        else{
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}