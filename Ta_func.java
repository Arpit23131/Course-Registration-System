import java.util.*;

public class Ta_func extends Student_Func{
    public void menu(){
        System.out.println();
        System.out.println("Teaching Assistant Menu");
        System.out.println();
        System.out.println("Press '1' to view Available Courses of students");
        System.out.println("Press '2' to Register for Courses");
        System.out.println("Press '3' to View Schedule");
        System.out.println("Press '4' to Track Your Academic Progress");
        System.out.println("Press '5' to Drop Courses");
        System.out.println("Press '6' to Submit Complaints");
        System.out.println("Press '7' to Manage Student Grades");
        System.out.println("Press '8' to Log Out");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Select why are you here : ");
        int in = input.nextInt();
        switch (in){
            case 1:
                Course Available_Courses = new Available_Courses();
                Available_Courses.Do_this();
                break;
            case 2:
                Course Register_courses = new Register_courses();
                Register_courses.Do_this();
                break;
            case 3:
                Course View_Schedule = new View_Schedule();
                View_Schedule.Do_this();
                break;
            case 4:
                Course Your_Academic_Progress = new Your_Academic_Progress();
                Your_Academic_Progress.Do_this();
                break;
            case 5:
                //Register_courses reg = new Register_courses();
                Course Drop_Courses = new Drop_Courses();
                Drop_Courses.Do_this();
                break;
            case 6:
                Course Submit_Complaint = new Submit_Complaint();
                Submit_Complaint.Do_this();
                break;
            case 7:
                manage_grades();
                break;
            case 8:
                Course Log_Out = new Log_Out();
                Log_Out.Do_this();
        }
    }
    void manage_grades(){
        Scanner s = new Scanner(System.in);
        List<marks> m_courses = new ArrayList<>();
        System.out.println("managing the grades of students");
        System.out.println();
        marks m1 = new marks("LA", "Subhajit", "B-", 7);
        marks m2 = new marks("IP", "B.N.jain", "C-", 5);
        marks m3 = new marks("IHCI", "kalpana", "A", 10);
        marks m4 = new marks("DC", "pravesh", "B", 8);
        marks m5 = new marks("COM", "payal", "B-", 7);

        m_courses.add(m1);
        m_courses.add(m2);
        m_courses.add(m3);
        m_courses.add(m4);
        m_courses.add(m5);

        for(marks mark : m_courses){
            mark.display();
        }
        System.out.println();
        System.out.print("Enter the course acronym for which you want to change the grade : ");
        String input = s.next();
        if (input.equals("LA")){
            System.out.print("Enter grade : ");
            String _grade = s.next();
            String new_grade = m1.set_grade(_grade);
            System.out.println();
            System.out.println("Updated List");
            for(marks mark : m_courses){
                mark.display();
            }
            return_();
        }
        else if (input.equals("IP")){
            System.out.print("Enter grade : ");
            String _grade = s.next();
            String new_grade = m2.set_grade(_grade);
            System.out.println();
            System.out.println("Updated List");
            for(marks mark : m_courses){
                mark.display();
            }
            return_();
        }
        else if (input.equals("IHCI")){
            System.out.print("Enter grade : ");
            String _grade = s.next();
            String new_grade = m3.set_grade(_grade);
            System.out.println();
            System.out.println("Updated List");
            for(marks mark : m_courses){
                mark.display();
            }
            return_();
        }
        else if (input.equals("DC")){
            System.out.print("Enter grade : ");
            String _grade = s.next();
            String new_grade = m4.set_grade(_grade);
            System.out.println();
            System.out.println("Updated List");
            for(marks mark : m_courses){
                mark.display();
            }
            return_();
        }
        else if (input.equals("COM")){
            System.out.print("Enter grade : ");
            String _grade = s.next();
            String new_grade = m5.set_grade(_grade);
            System.out.println();
            System.out.println("Updated List");
            for(marks mark : m_courses){
                mark.display();
            }
            return_();
        }
    }
    void return_(){
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Press '1' for menu");
        System.out.println("Press '2' for log out");
        System.out.print("Enter Your Choice : ");
        int input = s.nextInt();
        switch (input){
            case 1:
                menu();
                break;
            case 2:
                User_roles us = new User_roles();
                us.after_registration();
                break;
        }
    }
}
