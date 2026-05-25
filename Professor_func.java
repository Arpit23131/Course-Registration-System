import java.util.*;
public class Professor_func {
    void menu(){
        System.out.println();
        System.out.println("Professor Menu");
        System.out.println();
        System.out.println("'1' for Managing Courses");
        System.out.println("'2' to view list of enrolled students");
        System.out.println("'3' Logout");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int in = sc.nextInt();
        switch (in){
            case 1:
                System.out.println();
                System.out.println("This is Your course -");
                System.out.println();
                view_courses view = new view_courses("Advanced Programming","CSE201","CH - 12, 13, 14",4,"Introduction to programming",200);
                view.display();
                System.out.println();

                System.out.print("Do you want to manage the course? Y - Yes ; N - No : ");
                String input = sc.next();
                if (input.equals("Y")){
                    System.out.println("Select what you want to change -");
                    System.out.println("1. Course Name");
                    System.out.println("2. Course Code");
                    System.out.println("3. Syllabus");
                    System.out.println("4. Credits");
                    System.out.println("5. Prerequisite");
                    System.out.println("6. Enrollment Limit");

                    System.out.print("Enter : ");
                    int n = sc.nextInt();
                    switch (n){
                        case 1:
                            System.out.print("Enter new name for your course : ");
                            String name = sc.next();
                            String new_name = view.setCourse_name(name);
                            view_courses change = new view_courses(new_name,"CSE201", "CH - 12, 13, 14", 4, "Introduction to programming", 200);
                            System.out.println();
                            System.out.println("Your updated course :");
                            change.display();
                            System.out.println();

                            menu();
                            break;
                        case 2:
                            System.out.print("Enter new code for the course : ");
                            String code = sc.next();
                            String new_code = view.setCourse_code((code));
                            view_courses c = new view_courses("Advanced Programming", new_code, "CH - 12, 13, 14", 4, "Introduction to programming", 200);
                            System.out.println();
                            System.out.println("Your updated course :");
                            c.display();
                            System.out.println();

                            menu();

                            break;
                        case 3:
                            System.out.print("Enter new Syllabus for the course : ");
                            String syllabus = sc.next();
                            String new_syllabus = view.setSyllabus((syllabus));
                            view_courses ch = new view_courses("Advanced Programming", "CSE201", new_syllabus, 4, "Introduction to programming", 200);
                            System.out.println();
                            System.out.println("Your updated course :");
                            ch.display();
                            System.out.println();

                            menu();
                            break;
                        case 4:
                            System.out.print("Enter new Credits for the course : ");
                            int credit = sc.nextInt();
                            int new_credit = view.setCredits(credit);
                            view_courses cha = new view_courses("Advanced Programming", "CSE201", "CH - 12, 13, 14", new_credit, "Introduction to programming", 200);
                            System.out.println();
                            System.out.println("Your updated course :");
                            cha.display();
                            System.out.println();

                            menu();
                            break;
                        case 5:
                            System.out.print("Enter new Prerequisite for the course : ");
                            String prerequisite = sc.next();
                            String new_prerequisite = view.setPrerequisite(prerequisite);
                            view_courses chan = new view_courses("Advanced Programming", "CSE201", "CH - 12, 13, 14", 4, new_prerequisite, 200);
                            System.out.println();
                            System.out.println("Your updated course :");
                            chan.display();
                            System.out.println();

                            menu();
                            break;
                        case 6:
                            System.out.print("Enter new enrollment limit for the course : ");
                            int enrollment_limit = sc.nextInt();
                            int new_enrollment_limit = view.setEnrollment_limit(enrollment_limit);
                            view_courses chang = new view_courses("Advanced Programming", "CSE201", "CH - 12, 13, 14", 4, "Introduction to programming", new_enrollment_limit);
                            System.out.println();
                            System.out.println("Your updated course :");
                            chang.display();
                            System.out.println();

                            menu();
                            break;
                    }
                }
                else if (input.equals("N")){
                    menu();
                }

                break;
            case 2:
                enrolled_students();
                break;
            case 3:
                System.out.println("Logging Out...");
                User_roles u = new User_roles();
                u.after_registration();
                break;
        }
    }
    void Returning(){
        System.out.println("Press '1' to return to Professor menu");
        System.out.println("Press '0' to log out");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = s.nextInt();
        if (n == 0){
            User users = new User();
            User_roles user = new User_roles(users);
            user.after_registration();
        }
        else if(n == 1){
            menu();
        }
        else{
            System.out.println("Invalid input. Try again...");
            Returning();
        }
    }
    void enrolled_students(){
        System.out.println("Enrolled Students in your Course are:");
        System.out.println();
        System.out.println("S.No.     Name                Roll No.     Email ID                   Department");
        System.out.println(" 1        Arpit Dabas         2023131      arpit23131@iiitd.ac.in     CSE");
        System.out.println(" 2        Sujal Choudhary     2023535      sujal23535@iiitd.ac.in     CSE");
        System.out.println(" 3        Satvik Arya         2023493      satvik23493@iiitd.ac.in    CSAM");
        System.out.println(" 4        Tanishq             2023548      tanishq23548@iiitd.ac.in   CSSS");
        System.out.println(" 5        Rishab Raghuvanshi  2023433      rishab23433@iiitd.ac.in    EVE");
        System.out.println(" 6        Lakshay Verma       2023300      Lakshay23300@iiitd.ac.in   CSAM");
        System.out.println(" 7        Sanjeev             2023483      sanjeev23483@iiitd.ac.in   CSE");
        System.out.println(" 8        Jaideep Dahiya      2023254      jaideep23254@iiitd.ac.in   CSD");
        System.out.println(" 9        Harsh Tushid        2023234      harsh23234@iiitd.ac.in     CSE");
        System.out.println(" 10       Dhanuj Malik        2023194      dhanuj23194@iiitd.ac.in    CSSS");

        System.out.println();
        Returning();
    }
}
class view_courses {
    String Course_name;
    String Course_code;
    String Syllabus;
    int Credits;
    String Prerequisite;
    int enrollment_limit;

    view_courses(String Course_name, String Course_code, String Syllabus, int Credits, String Prerequisite, int enrollment_limit){
        this.Course_name = Course_name;
        this.Course_code = Course_code;
        this.Syllabus = Syllabus;
        this.Credits = Credits;
        this.Prerequisite = Prerequisite;
        this.enrollment_limit = enrollment_limit;
    }
    void display(){
        System.out.println("Course Name      : "+Course_name);
        System.out.println("Course Code      : "+Course_code);
        System.out.println("Syllabus is      : "+Syllabus);
        System.out.println("Credits are      : "+Credits);
        System.out.println("Prerequisite     : "+Prerequisite);
        System.out.println("Enrollment Limit : "+enrollment_limit);
    }
    String setCourse_name(String name){
        Course_name = name;
        return name;
    }
    String setCourse_code(String code){
        Course_code = code;
        return code;
    }
    String setSyllabus(String syllabus){
        Syllabus = syllabus;
        return syllabus;
    }
    int setCredits(int credits){
        Credits = credits;
        return credits;
    }
    String setPrerequisite(String prerequisite){
        Prerequisite = prerequisite;
        return prerequisite;
    }
    int setEnrollment_limit(int enrollmentLimit){
        enrollment_limit = enrollmentLimit;
        return enrollmentLimit;
    }
}