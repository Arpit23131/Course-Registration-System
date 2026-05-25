import java.util.*;
class User{

    static ArrayList<String> credentials = new ArrayList<>();
    Scanner login = new Scanner(System.in);

    void Register(){}

    void log_in(String User_Role){
        System.out.print("Enter Your Email ID : ");
        String Email = login.next();
        System.out.print("Enter Password : ");
        String Password = login.next();
        try {
            if (Email.equals(credentials.get(0)) && Password.equals(credentials.get(1))){
                System.out.println("Your are Logged In Successfully");
                functionality(User_Role);
            }
            else{
                throw new InvalidLoginException("Incorrect Email ID or Password...");
            }
        }
        catch (InvalidLoginException i){
            System.out.println("Error : "+i.getMessage());
            System.out.println();
        }
        try_again(User_Role);
    }
    void try_again(String User_Role){
        System.out.println("Try Again....");
        System.out.print("Enter Your Email ID (You have to enter ID with which you have registered): ");
        String Email_again = login.next();
        System.out.print("Enter Password (You have to enter Password with which you have registered): ");
        String Password_again = login.next();

        if (Email_again.equals(credentials.get(0)) && Password_again.equals(credentials.get(1))) {
            System.out.println("Your are Logged In Successfully");
            functionality(User_Role);
        }
        else{
            System.out.println("Incorrect Email ID or Password");
            System.out.println("Try Again by Re-registering (Restart the Application)");
            System.exit(0);
        }
    }
    void functionality(String User_Role){
        if (User_Role.equals("Student")){
            Student_Func student = new Student_Func();
            student.menu();
        }
        else if (User_Role.equals("Professor")){
            Professor_func professor = new Professor_func();
            professor.menu();
        }
        else if (User_Role.equals("Administrator")){
            Administrator_func admin = new Administrator_func();
            admin.menu();
        }
        else if (User_Role.equals("TA")){
            Ta_func ta = new Ta_func();
            ta.menu();
        }
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
    }

    void ReturnBack(){
        System.out.println("Press '0' to return to Student menu");
        System.out.println("Press '1' to log out");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = s.nextInt();
        if (n == 1){
            User users = new User();
            User_roles user = new User_roles(users);
            user.after_registration();
        }
        else if(n == 0){
            Student_Func st = new Student_Func();
            st.menu();
        }
        else{
            System.out.println("Invalid input. Try again...");
            ReturnBack();
        }
    }
}

class Student extends User{
    void Register(){
        System.out.println("\t\t\t\t\t\t\t\t\tYou are a Student");
        Scanner details = new Scanner(System.in);
        System.out.print("Enter your Email id : ");
        String your_id = details.next();
        System.out.print("Create Password : ");
        String your_password = details.next();
        System.out.print("Confirm password : ");
        String re_enter = details.next();
        credentials.add(your_id);
        if (your_password.equals(re_enter)) {
            credentials.add(your_password);
            System.out.println();
            System.out.println("You are Registered Successfully");
            System.out.println();
        }
        else {
            System.out.println("Unable to register you because Your Password Doesn't match");
            System.out.println("Try again by restarting the Application");
            System.exit(0);
        }
    }
}

class Professor extends User{
    void Register(){
        System.out.println("\t\t\t\t\t\t\t\t\tYou are a Professor");
        Scanner details_p = new Scanner(System.in);
        System.out.print("Enter your Email id : ");
        String your_id_p = details_p.next();
        System.out.print("Create Password : ");
        String your_password_p = details_p.next();
        System.out.print("Confirm password : ");
        String re_enter_p = details_p.next();
        credentials.add(your_id_p);
        if (your_password_p.equals(re_enter_p)) {
            credentials.add(your_password_p);
            System.out.println();
            System.out.println("You are Registered Successfully");
            System.out.println();
        }
        else {
            System.out.println("Unable to register you because Your Password Doesn't match");
            System.out.println("Try again by restarting the Application");
            System.exit(0);
        }
    }
}

class Administrator extends User{
    void Register(){
        System.out.println("\t\t\t\t\t\t\t\t\tYou are an Administrator");
        Scanner details_a = new Scanner(System.in);
        System.out.print("Enter your Email id : ");
        String your_id_a = details_a.next();
        credentials.add(your_id_a);
        System.out.print("Enter your Password (Pass - Admin) : ");
        String your_password_a = details_a.next();
        if (your_password_a.equals("Admin")) {
            credentials.add("Admin");
            System.out.println();
            System.out.println("You are Registered Successfully");
            System.out.println();
        }
        else{
            System.out.println("Incorrect Admin Password. Registration failed.");
            System.exit(0);
        }
    }
}
class Teaching_Assistant extends User{
    void Register(){
        System.out.println("\t\t\t\t\t\t\t\t\tYou are a Professor");
        Scanner details_p = new Scanner(System.in);
        System.out.print("Enter your Email id : ");
        String your_id_p = details_p.next();
        System.out.print("Create Password : ");
        String your_password_p = details_p.next();
        System.out.print("Confirm password : ");
        String re_enter_p = details_p.next();
        credentials.add(your_id_p);
        if (your_password_p.equals(re_enter_p)) {
            credentials.add(your_password_p);
            System.out.println();
            System.out.println("You are Registered Successfully");
            System.out.println();
        }
        else {
            System.out.println("Unable to register you because Your Password Doesn't match");
            System.out.println("Try again by restarting the Application");
            System.exit(0);
        }
    }
}

class InvalidLoginException extends RuntimeException {
    InvalidLoginException(String error) {
        super(error);
    }
}