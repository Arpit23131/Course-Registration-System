import java.util.*;
public class Administrator_func {
    List<course_catalogue> catalogues = new ArrayList<>();
    List<String> assigned = new ArrayList<>();
    List<Course_> courses = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    void menu(){
        System.out.println();
        System.out.println("Administrator Menu");
        System.out.println();
        System.out.println("'1' for Managing Course Catalogue");
        System.out.println("'2' to Manage Student Record");
        System.out.println("'3' to Assign Professors to Courses");
        System.out.println("'4' to Handle Complaints");
        System.out.println("'5' Logout");
        System.out.println();
        System.out.print("Enter here : ");
        int n = s.nextInt();
        switch (n){
            case 1:

                System.out.println();
                System.out.println("This is your Course Catalogue -");
                System.out.println();
                System.out.println("Display Structure : Course ID  ->  Course Name  ->  Course Code  ->  Instructor  ->  Credits");
                System.out.println();
                course_catalogue co1 = new course_catalogue(1,"Advanced Programming", "CSE201", "Arun Balaji", 4);
                course_catalogue co2 = new course_catalogue(2,"Data Structures", "CSE501", "Ojaswa Sharma", 2);
                course_catalogue co3 = new course_catalogue(3,"Probability & Statistics", "MTH341", "Subhajit", 4);
                course_catalogue co4 = new course_catalogue(4,"Political Anthropology", "SSH543", "Deepak Prince", 2);

                catalogues.add(co1);
                catalogues.add(co2);
                catalogues.add(co3);
                catalogues.add(co4);

                Display(catalogues);
                System.out.println();

                manage_catalogue();

                break;
            case 2:
                System.out.println("For which student you want to manage records?");
                System.out.println("'1' for Student-1");
                System.out.println("'2' for Student-2");
                System.out.println("'3' for Student-3");
                System.out.print("Your input : ");
                int num = s.nextInt();
                switch (num){
                    case 1:
                        System.out.println();
                        System.out.println("Managing records of student-1 :");
                        System.out.println();
                        System.out.println("'1' for managing personal information.");
                        System.out.println("'2' for managing academic record.");
                        System.out.print("Your input : ");
                        int nu = s.nextInt();
                        switch (nu){
                            case 1:
                                System.out.println("display structure : Name  ->  Roll No.  -> Email ID  ->  program  ->  Department  -> phone Number");
                                Student_Record stu = new Student_Record("Arpit", 2023131, "arpit23131@iiitd.ac.in", "BTech", "CSE", 9898989898L);
                                stu.dis_p_info();
                                System.out.println();
                                System.out.print("Do you want to update the student information? Y - Yes | N - No : ");
                                String in = s.next();
                                if(in.equals("Y")){
                                    change_per_info();
                                }
                                else{
                                    menu();
                                }
                                break;
                            case 2:
                                System.out.println("Display structure : Course Name  -> Course Code  ->  Instructor  ->  Credits  ->  Grades");
                                Student_Record stu1 = new Student_Record("Advanced Programming", "CSE101", "Arun Balaji", 4, "A");
                                stu1.dis_a_info();
                                System.out.print("Do you want to change the Student's Academic information? Y -Yes | N - No : ");
                                String inp = s.next();
                                if (inp.equals("Y")){
                                    change_acad_info();
                                }
                                else{
                                    menu();
                                }
                                break;
                        }

                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Managing records of student-2 :");
                        System.out.println();
                        System.out.println("'1' for managing personal information.");
                        System.out.println("'2' for managing academic record.");
                        System.out.print("Your input : ");
                        int numb = s.nextInt();
                        switch (numb){
                            case 1:
                                System.out.println("display structure : Name  ->  Roll No.  -> Email ID  ->  program  ->  Department  -> phone Number");
                                Student_Record stu = new Student_Record("Arpit", 2023131, "arpit23131@iiitd.ac.in", "BTech", "CSE", 9898989898L);
                                stu.dis_p_info();
                                System.out.println();
                                System.out.print("Do you want to update the student information? Y - Yes | N - No : ");
                                String in = s.next();
                                if(in.equals("Y")){
                                    change_per_info();
                                }
                                else{
                                    menu();
                                }
                                break;
                            case 2:
                                System.out.println("Display structure : Course Name  -> Course Code  ->  Instructor  ->  Credits  ->  Grades");
                                Student_Record stu1 = new Student_Record("Advanced Programming", "CSE101", "Arun Balaji", 4, "A");
                                stu1.dis_a_info();
                                System.out.print("Do you want to change the Student's Academic information? Y -Yes | N - No : ");
                                String inp = s.next();
                                if (inp.equals("Y")){
                                    change_acad_info();
                                }
                                else{
                                    menu();
                                }
                                break;
                        }

                        break;
                    case 3:
                        System.out.println();
                        System.out.println("Managing records of student-3 :");
                        System.out.println();
                        System.out.println("'1' for managing personal information.");
                        System.out.println("'2' for managing academic record.");
                        System.out.print("Your input : ");
                        int number = s.nextInt();
                        switch (number){
                            case 1:
                                System.out.println("display structure : Name  ->  Roll No.  -> Email ID  ->  program  ->  Department  -> phone Number");
                                Student_Record stu = new Student_Record("Arpit", 2023131, "arpit23131@iiitd.ac.in", "BTech", "CSE", 9898989898L);
                                stu.dis_p_info();
                                System.out.println();
                                System.out.print("Do you want to update the student information? Y - Yes | N - No : ");
                                String in = s.next();
                                if(in.equals("Y")){
                                    change_per_info();
                                }
                                else{
                                    menu();
                                }
                                break;
                            case 2:
                                System.out.println("Display structure : Course Name  -> Course Code  ->  Instructor  ->  Credits  ->  Grades");
                                Student_Record stu1 = new Student_Record("Advanced Programming", "CSE101", "Arun Balaji", 4, "A");
                                stu1.dis_a_info();
                                System.out.print("Do you want to change the Student's Academic information? Y -Yes | N - No : ");
                                String inp = s.next();
                                if (inp.equals("Y")){
                                    change_acad_info();
                                }
                                else{
                                    menu();
                                }
                                break;
                        }
                }
                break;
            case 3:
                List<professors> professors = new ArrayList<>();

                professors p1 = new professors(1, "Sanjit Kaul");
                professors p2 = new professors(2, "Satish Pandey");
                professors p3 = new professors(3, "Ojaswa Sharma");
                professors p4 = new professors(4, "Arun Balaji");

                professors.add(p1);
                professors.add(p2);
                professors.add(p3);
                professors.add(p4);

                System.out.println();
                System.out.println("List of courses to assign professors -");
                System.out.println();
                System.out.println("Display Structure : Course ID  ->  Course Name");
                Course_ c1 = new Course_(1,"Linear Algebra");
                Course_ c2 = new Course_(2,"Math 3");
                Course_ c3 = new Course_(3,"data structures");
                Course_ c4 = new Course_(4,"advanced programming");

                courses.add(c1);
                courses.add(c2);
                courses.add(c3);
                courses.add(c4);

                for (Course_ cou : courses){
                    System.out.println(cou.getId()+"     "+cou.getName());
                }
                System.out.println();
                System.out.println("List of available professors :");
                System.out.println();
                System.out.println("Display Structure : Id  ->  Name");
                for (professors pro : professors){
                    System.out.println(pro.getId()+"     "+pro.get_Name());
                }
                System.out.println();
                assign_prof();
                break;
            case 4:
                Student_Func fun = new Student_Func();
                List<Student_Func.Submit_Complaint.Sub_Complaints> complaints = fun.getComplaints();
                for (Student_Func.Submit_Complaint.Sub_Complaints co : complaints){
                    System.out.println();
                    System.out.println("Your Complaint : "+co.description);
                    System.out.println("Status : "+co.status);
                }
                String com = "I am not able to log into ERP.";
                Sub_Complaints sub = new Sub_Complaints(com, "Pending");
                sub.display();
                System.out.println("Press 'R' to Resolve the complaint.");
                String in = s.next();
                if (in.equals("R")){
                    String new_ = "Resolved";
                    Sub_Complaints subs = new Sub_Complaints(com, new_);
                    subs.display();
                }
                else{
                    sub.display();
                }
//                System.out.println();

                menu();
                break;
            case 5:
                System.out.println("Logging Out...");
                User_roles u = new User_roles();
                u.after_registration();
                break;
        }
    }
    static class Sub_Complaints{
        String description;
        String status;

        Sub_Complaints(String description, String status){
            this.description = description;
            this.status = status;
        }
        void display(){
            System.out.println("Complaint got from student : "+description);
            System.out.println("Status : "+status);
        }
        String getDescription(){
            return description;
        }
        String getStatus(){
            return status;
        }
    }
    void re_update(){
        System.out.println();
        System.out.print("Do you want to update again? Y - Yes | N - No : ");
        String inp = s.next();
        if (inp.equals("Y")){
            change_acad_info();
        }
        else if(inp.equals("N")){
            menu();
        }
        else {
            System.out.println("Invalid Input. Try Again....");
            re_update();
        }
    }
    void re_update1(){
        System.out.println();
        System.out.print("Do you want to update again? Y - Yes | N - No : ");
        String inp = s.next();
        if (inp.equals("Y")){
            change_per_info();
        }
        else if(inp.equals("N")){
            menu();
        }
        else {
            System.out.println("Invalid Input. Try Again....");
            re_update();
        }
    }
    void change_per_info(){
        System.out.println();
        System.out.println("What do you want to change?");
        System.out.println("1. Name");
        System.out.println("2. roll number");
        System.out.println("3. email Id");
        System.out.println("4. program");
        System.out.println("5. department");
        System.out.println("6. phone number");
        System.out.println();
        System.out.print("Your input : ");
        int numb = s.nextInt();
        System.out.println();
        switch (numb){
            case 1:
                System.out.print("Enter New Name : ");
                String new_name = s.next();
                Student_Record updated = new Student_Record(new_name, 2023131, "arpit23131@iiitd.ac.in", "BTech", "CSE", 9898989898L);
                System.out.println("Updated");
                updated.dis_p_info();
                re_update1();
                break;
            case 2:
                System.out.print("Enter New Roll number : ");
                int new_roll = s.nextInt();
                Student_Record updated1 = new Student_Record("Arpit", new_roll, "arpit23131@iiitd.ac.in", "BTech", "CSE", 9898989898L);
                System.out.println("Updated");
                updated1.dis_p_info();
                re_update1();
                break;
            case 3:
                System.out.print("Enter New Email ID : ");
                String new_email = s.next();
                Student_Record updated2 = new Student_Record("Arpit", 2023131, new_email, "BTech", "CSE", 9898989898L);
                System.out.println("Updated");
                updated2.dis_p_info();
                re_update1();
                break;
            case 4:
                System.out.print("Enter New Program : ");
                String new_program = s.next();
                Student_Record updated3 = new Student_Record("Arpit", 2023131, "arpit23131@iiitd.ac.in", new_program, "CSE", 9898989898L);
                System.out.println("Updated");
                updated3.dis_p_info();
                re_update1();
                break;
            case 5:
                System.out.print("Enter New department : ");
                String new_department = s.next();
                Student_Record updated4 = new Student_Record("Arpit", 2023131, "arpit23131@iiitd.ac.in", "BTech", new_department, 9898989898L);
                System.out.println("Updated");
                updated4.dis_p_info();
                re_update1();
                break;
            case 6:
                System.out.print("Enter New phone number : ");
                long new_number = s.nextLong();
                Student_Record updated5 = new Student_Record("Arpit", 2023131, "arpit23131@iiitd.ac.in", "BTech", "CSE", new_number);
                System.out.println("Updated");
                updated5.dis_p_info();
                re_update1();
                break;
        }
    }
    void change_acad_info(){
        System.out.println();
        System.out.println("What do you want to change?");
        System.out.println("1. Course Name");
        System.out.println("2. Course code");
        System.out.println("3. Instructor");
        System.out.println("4. Credits");
        System.out.println("5. Grades");
        System.out.println();
        System.out.print("Your Input : ");
        int input = s.nextInt();
        switch (input){
            case 1:
                System.out.println("Enter new Course Name : ");
                String new_name = s.next();
                Student_Record u1 = new Student_Record(new_name, "CSE101", "Arun Balaji", 4, "A");
                System.out.println("Updated");
                u1.dis_a_info();
                re_update();
                break;
            case 2:
                System.out.println("Enter new Course code : ");
                String new_code = s.next();
                Student_Record u2 = new Student_Record("Advanced Programming", new_code, "Arun Balaji", 4, "A");
                System.out.println("Updated");
                u2.dis_a_info();
                re_update();
                break;
            case 3:
                System.out.println("Enter new instructor : ");
                String new_instructor = s.next();
                Student_Record u3 = new Student_Record("Advanced Programming", "CSE101", new_instructor, 4, "A");
                System.out.println("Updated");
                u3.dis_a_info();
                re_update();
                break;
            case 4:
                System.out.println("Enter new Credits : ");
                int new_Credits = s.nextInt();
                Student_Record u4 = new Student_Record("Advanced Programming", "CSE101", "Arun Balaji", new_Credits, "A");
                System.out.println("Updated");
                u4.dis_a_info();
                re_update();
                break;
            case 5:
                System.out.println("Enter new Grade : ");
                String new_Grade = s.next();
                Student_Record u5 = new Student_Record("Advanced Programming", "CSE101", "Arun Balaji", 4, new_Grade);
                System.out.println("Updated");
                u5.dis_a_info();
                re_update();
                break;
        }
    }
    void assign_prof(){
        Scanner search = new Scanner(System.in);
        System.out.print("Enter the Course ID for which you are searching for Professor : ");
        int c_id = search.nextInt();
        System.out.println();
        System.out.print("Enter the Professor ID which you want to assign to selected course : ");
        int p_id = search.nextInt();
        System.out.println();

        if (c_id == 1 && p_id == 1){
            String c_name = "";
            for (Course_ cou : courses){
                if (cou.getId() == 1){
                    c_name = cou.getName();
                }
            }
            String assignment = "Sanjit Kaul is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 1 && p_id == 2){
            String c_name = "";
            for (Course_ cou : courses){
                if (cou.getId() == 1){
                    c_name = cou.getName();
                }
            }
            String assignment = "Satish Pandey is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 1 && p_id == 3){
            String c_name = "";
            for (Course_ cou : courses){
                if (cou.getId() == 1){
                    c_name = cou.getName();
                }
            }
            String assignment = "Ojaswa Sharma is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 1 && p_id == 4){
            String c_name = "";
            for (Course_ cou : courses){
                if (cou.getId() == 1){
                    c_name = cou.getName();
                }
            }
            String assignment = "Arun Balaji is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 2 && p_id == 1){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 2){
                    c_name = cou.getName();
                }
            }
            String assignment = "Sanjit Kaul is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 2 && p_id == 2){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 2){
                    c_name = cou.getName();
                }
            }
            String assignment = "Satish Pandey is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 2 && p_id == 3){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 2){
                    c_name = cou.getName();
                }
            }
            String assignment = "ojaswa Sharma is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 2 && p_id == 4){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 2){
                    c_name = cou.getName();
                }
            }
            String assignment = "Arun Balaji is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 3 && p_id == 1){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 3){
                    c_name = cou.getName();
                }
            }
            String assignment = "Sanjit Kaul is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 3 && p_id == 2){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 3){
                    c_name = cou.getName();
                }
            }
            String assignment = "Satish Pandey is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 3 && p_id == 3){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 3){
                    c_name = cou.getName();
                }
            }
            String assignment = "Ojaswa Sharma is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 3 && p_id == 4){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 3){
                    c_name = cou.getName();
                }
            }
            String assignment = "Arun Balaji is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 4 && p_id == 1){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 4){
                    c_name = cou.getName();
                }
            }
            String assignment = "Sanjit Kaul is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 4 && p_id == 2){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 4){
                    c_name = cou.getName();
                }
            }
            String assignment = "Satish Pandey is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 4 && p_id == 3){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 4){
                    c_name = cou.getName();
                }
            }
            String assignment = "Ojaswa Sharma is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else if (c_id == 4 && p_id == 4){
            String c_name = "";

            for (Course_ cou : courses){
                if (cou.getId() == 4){
                    c_name = cou.getName();
                }
            }
            String assignment = "Arun Balaji is assigned to "+c_name+" course";
            assigned.add(assignment);
            for (String list : assigned){
                System.out.println(list);
            }
        }
        else {
            System.out.println("Invalid input. Try Again...");
            assign_prof();
        }
        going_back();
    }
    void going_back(){
        System.out.println();
        System.out.print("Do you want to assign more? Y - Yes | N - No : ");
        String in = s.next();
        if (in.equals("Y")){
            assign_prof();
        }
        else if (in.equals("N")){
            menu();
        }
        else{
            System.out.println("Invalid input. Try again...");
            going_back();
        }
    }
    void Display(List<course_catalogue> catalogues){
        for (course_catalogue list_catalogue : catalogues){
            System.out.println(list_catalogue.getId()+"     "+list_catalogue.getCourse_name()+"     "+list_catalogue.getCourse_code()+"     "+list_catalogue.getProfessor()+"     "+list_catalogue.getCredits());
        }
    }
    void manage_catalogue(){

        System.out.println("Press (1) if you want to add courses to course catalogue");
        System.out.println("Press (2) if you want to delete courses from course catalogue");
        System.out.println();
        System.out.print("Your input : ");
        int input = s.nextInt();

        switch (input){
            case 1:
                int Course_ID;
                String Course_name;
                String Course_code;
                String professor;
                int credits;

                System.out.print("Enter Course ID : ");
                Course_ID = s.nextInt();
                System.out.print("Enter Course Name : ");
                Course_name = s.next();
                System.out.print("Enter Course Code : ");
                Course_code = s.next();
                System.out.print("Enter Instructor  : ");
                professor = s.next();
                System.out.print("Enter Credits     : ");
                credits = s.nextInt();

                course_catalogue new_course = new course_catalogue(Course_ID, Course_name, Course_code, professor, credits);
                catalogues.add(new_course);
                System.out.println();
                System.out.println("Updated Course Catalogue -");
                System.out.println();
                Display(catalogues);
                now_return();
                break;
            case 2:
                System.out.println();
                Scanner delete = new Scanner(System.in);
                System.out.print("Select the course ID which you want to delete : ");
                String in = delete.nextLine();
                String[] s = in.split(" ");
                System.out.println();

                for (String inp : s){
                    if (!inp.isEmpty()){
                        int n = Integer.parseInt(inp);
                        for (int i=0;i<catalogues.size();i++){
                            if (catalogues.get(i).Id == n){
                                catalogues.remove(i);
                                break;
                            }
                        }
                    }
                }
                System.out.println("Updated Course Catalogue -");
                Display(catalogues);
                System.out.println();
                now_return();
        }
    }
    void now_return(){
        System.out.print("Do you want to update course catalogue again? Y - Yes | N - No : ");
        String input = s.next();
        if (input.equals("Y")){
            manage_catalogue();
        }
        else if(input.equals("N")){
            menu();
        }
        else{
            System.out.println("Invalid input...Try Again...");
            now_return();
        }
    }
}

class course_catalogue{
    int Id;
    String Course_name;
    String Course_code;
    String Professor;
    int Credits;

    course_catalogue(int Id, String Course_name, String Course_code, String Professor, int Credits){
        this.Course_name = Course_name;
        this.Course_code = Course_code;
        this.Professor = Professor;
        this.Credits = Credits;
        this.Id = Id;
    }
    int getId(){
        return Id;
    }
    String getCourse_name(){
        return Course_name;
    }
    String getCourse_code(){
        return Course_code;
    }
    String getProfessor(){
        return Professor;
    }
    int getCredits(){
        return Credits;
    }
}
class professors{
    int id;
    String name;

    professors(int id, String name){
        this.id = id;
        this.name = name;
    }
    int getId(){
        return id;
    }
    String get_Name(){
        return name;
    }
}
class Course_{
    int id;
    String name;

    Course_(int id, String name){
        this.id = id;
        this.name = name;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
class Student_Record{
    //personal information
    String name;
    int roll_no;
    String email_id;
    String program;
    String department;
    long phone_no;

    //courses
    String course_name;
    String course_code;
    String instructor;
    int credits;
    String grades;

    Student_Record(String name, int roll_no, String email_id, String program, String department, long phone_no){
        this.name = name;
        this.roll_no = roll_no;
        this.email_id = email_id;
        this.program = program;
        this.department = department;
        this.phone_no = phone_no;
    }
    Student_Record(String course_name, String course_code, String instructor, int credits, String grades){
        this.course_name = course_name;
        this.course_code = course_code;
        this.instructor = instructor;
        this.credits = credits;
        this.grades = grades;
    }
    void dis_p_info(){
        System.out.println(name+"     "+roll_no+"     "+email_id+"     "+program+"     "+department+"     "+phone_no);
    }
    void dis_a_info(){
        System.out.println(course_name+"     "+course_code+"     "+instructor+"     "+credits+"     "+grades);
    }
}