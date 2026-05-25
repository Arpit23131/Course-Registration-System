import java.util.*;
public interface Course {
    void Do_this();
}
class Student_Func {
    List<Submit_Complaint.Sub_Complaints> getComplaints() {
        //List<String> complaints = new ArrayList<>();
        return complaints;
    }

    List<Submit_Complaint.Sub_Complaints> complaints = new ArrayList<>();

    public void menu() {
        System.out.println();
        System.out.println("Student Menu");
        System.out.println();
        System.out.println("Press '1' to view Available Courses");
        System.out.println("Press '2' to Register for Courses");
        System.out.println("Press '3' to View Schedule");
        System.out.println("Press '4' to Track Your Academic Progress");
        System.out.println("Press '5' to Drop Courses");
        System.out.println("Press '6' to Submit Complaints");
        System.out.println("Press '7' to Give Feedback");
        System.out.println("Press '8' to Log Out");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Select why are you here : ");
        int in = input.nextInt();
        switch (in) {
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
                Course give_feedback = new give_feedback();
                give_feedback.Do_this();
                break;
            case 8:
                Course Log_Out = new Log_Out();
                Log_Out.Do_this();
        }

    }

    static class Available_Courses implements Course {
        public void Do_this() {
            List<course> courses = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Which Semester You are in : ");
            int sem = sc.nextInt();
            switch (sem) {
                case 1:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_11 = new course(1, "Introduction to Programming", "IP", "B.N.Jain", 4, "none", "3 - 4:30 Mon & Wed");
                    course Course_12 = new course(2, "Digital Circuits", "DC", "Pravesh Biyani", 4, "none", "3 - 4:30 Tue & Thur");
                    course Course_13 = new course(3, "Linear Algebra", "LA", "Subhajit", 4, "none", "4:30 - 6 Tue & Thur");
                    course Course_14 = new course(4, "Introduction to HCI", "IHCI", "Sonal Keshwani", 4, "none", "9:30 - 11 Mon & Wed");
                    course Course_15 = new course(5, "Communication Skills", "COM", "Payal C Mukherjee", 4, "none", "9:30 - 11 Tue & Thur");

                    courses.add(Course_11);
                    courses.add(Course_12);
                    courses.add(Course_13);
                    courses.add(Course_14);
                    courses.add(Course_15);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 2:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_21 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_22 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_23 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_24 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_25 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_26 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_21);
                    courses.add(Course_22);
                    courses.add(Course_23);
                    courses.add(Course_24);
                    courses.add(Course_25);
                    courses.add(Course_26);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 3:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_31 = new course(1, "State, Subject and power", "SSP", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_32 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_33 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_34 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_35 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_36 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_31);
                    courses.add(Course_32);
                    courses.add(Course_33);
                    courses.add(Course_34);
                    courses.add(Course_35);
                    courses.add(Course_36);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 4:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_41 = new course(1, "Critical Thinking", "CT", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_42 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_43 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_44 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_45 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_46 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_41);
                    courses.add(Course_42);
                    courses.add(Course_43);
                    courses.add(Course_44);
                    courses.add(Course_45);
                    courses.add(Course_46);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 5:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_51 = new course(1, "Social Anthropology", "SA", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_52 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_53 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_54 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_55 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_56 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_51);
                    courses.add(Course_52);
                    courses.add(Course_53);
                    courses.add(Course_54);
                    courses.add(Course_55);
                    courses.add(Course_56);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 6:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_61 = new course(1, "Political Anthropology", "PA", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_62 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_63 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_64 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_65 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_66 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_61);
                    courses.add(Course_62);
                    courses.add(Course_63);
                    courses.add(Course_64);
                    courses.add(Course_65);
                    courses.add(Course_66);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 7:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_71 = new course(1, "Embedded Logical Design", "ELD", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_72 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_73 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_74 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_75 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_76 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_71);
                    courses.add(Course_72);
                    courses.add(Course_73);
                    courses.add(Course_74);
                    courses.add(Course_75);
                    courses.add(Course_76);

                    display_courses(courses);
                    System.out.println();

                    break;
                case 8:
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite  ->  Timings");
                    System.out.println();
                    course Course_81 = new course(1, "Data structures", "DSA", "Ojaswa", 4, "Introduction to programming", "8 - 9 Mon & fri");
                    course Course_82 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none", "11 - 12:30 Mon & Fri");
                    course Course_83 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none", "9 - 11 Mon & Thur");
                    course Course_84 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none", "9 - 10 Tue & Wed");
                    course Course_85 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none", "1 - 2:30 Tue & Wed");
                    course Course_86 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none", "3 - 4 Tue & Wed");

                    courses.add(Course_81);
                    courses.add(Course_82);
                    courses.add(Course_83);
                    courses.add(Course_84);
                    courses.add(Course_85);
                    courses.add(Course_86);

                    display_courses(courses);
                    System.out.println();

                    break;
            }

            User u = new User();
            u.ReturnBack();
        }

        void display_courses(List<course> courses) {
            for (course course_ : courses) {
                System.out.println(course_.Id() + "     " + course_.Course() + "     " + course_.Acronym() + "     " + course_.Instructor() + "     " + course_.Credits() + "     " + course_.Prerequisite() + "     " + course_.Timings());
            }
        }
    }

    static class course {
        int Id;
        String Course;
        String Acronym;
        String Instructor;
        int Credits;
        String Prerequisite;
        String Timings;

        course(int Id, String Course, String Acronym, String Instructor, int Credits, String Prerequisite) {
            this.Id = Id;
            this.Course = Course;
            this.Acronym = Acronym;
            this.Instructor = Instructor;
            this.Credits = Credits;
            this.Prerequisite = Prerequisite;
        }

        course(int Id, String Course, String Acronym, String Instructor, int Credits, String Prerequisite, String Timings) {
            this.Id = Id;
            this.Course = Course;
            this.Acronym = Acronym;
            this.Instructor = Instructor;
            this.Credits = Credits;
            this.Prerequisite = Prerequisite;
            this.Timings = Timings;
        }

        int Id() {
            return Id;
        }

        String Course() {
            return Course;
        }

        String Acronym() {
            return Acronym;
        }

        String Instructor() {
            return Instructor;
        }

        int Credits() {
            return Credits;
        }

        String Prerequisite() {
            return Prerequisite;
        }

        String Timings() {
            return Timings;
        }
    }

    static class Register_courses implements Course {
        List<course> courses = new ArrayList<>();
        List<course> RegisteredCourses = new ArrayList<>();

        public void Do_this() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Here you can register your courses");
            System.out.print("Enter Which Semester You are in : ");
            int sem = sc.nextInt();
            switch (sem) {
                case 1:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_11 = new course(1, "Introduction to Programming", "IP", "B.N.Jain", 4, "none");
                    course Course_12 = new course(2, "Digital Circuits", "DC", "Pravesh Biyani", 4, "none");
                    course Course_13 = new course(3, "Linear Algebra", "LA", "Subhajit", 4, "none");
                    course Course_14 = new course(4, "Introduction to HCI", "IHCI", "Sonal Keshwani", 4, "none");
                    course Course_15 = new course(5, "Communication Skills", "COM", "Payal C Mukherjee", 4, "none");

                    courses.add(Course_11);
                    courses.add(Course_12);
                    courses.add(Course_13);
                    courses.add(Course_14);
                    courses.add(Course_15);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register : ");
                    Scanner s1 = new Scanner(System.in);
                    String id1 = s1.nextLine();
                    System.out.println();
                    String[] nums1 = id1.split(" ");
                    for (String numbs : nums1) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_11);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_12);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_13);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_14);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_15);
                            }
                        }
                    }
                    display_RegisteredCourses(RegisteredCourses);
                    System.out.println();

                    break;
                case 2:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_21 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_22 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_23 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_24 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_25 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_26 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_21);
                    courses.add(Course_22);
                    courses.add(Course_23);
                    courses.add(Course_24);
                    courses.add(Course_25);
                    courses.add(Course_26);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s2 = new Scanner(System.in);
                    String id2 = s2.nextLine();
                    String[] nums2 = id2.split(" ");
                    System.out.println();
                    for (String numbs : nums2) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_21);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_22);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_23);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_24);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_25);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_26);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_31 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_32 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_33 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_34 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_35 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_36 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_31);
                    courses.add(Course_32);
                    courses.add(Course_33);
                    courses.add(Course_34);
                    courses.add(Course_35);
                    courses.add(Course_36);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s3 = new Scanner(System.in);
                    String id3 = s3.nextLine();
                    String[] nums3 = id3.split(" ");
                    System.out.println();
                    for (String numbs : nums3) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_31);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_32);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_33);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_34);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_35);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_36);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_41 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_42 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_43 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_44 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_45 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_46 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_41);
                    courses.add(Course_42);
                    courses.add(Course_43);
                    courses.add(Course_44);
                    courses.add(Course_45);
                    courses.add(Course_46);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s4 = new Scanner(System.in);
                    String id4 = s4.nextLine();
                    String[] nums4 = id4.split(" ");
                    System.out.println();
                    for (String numbs : nums4) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_41);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_42);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_43);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_44);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_45);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_46);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_51 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_52 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_53 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_54 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_55 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_56 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_51);
                    courses.add(Course_52);
                    courses.add(Course_53);
                    courses.add(Course_54);
                    courses.add(Course_55);
                    courses.add(Course_56);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s5 = new Scanner(System.in);
                    String id5 = s5.nextLine();
                    String[] nums5 = id5.split(" ");
                    System.out.println();
                    for (String numbs : nums5) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_51);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_52);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_53);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_54);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_55);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_56);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_61 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_62 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_63 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_64 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_65 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_66 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_61);
                    courses.add(Course_62);
                    courses.add(Course_63);
                    courses.add(Course_64);
                    courses.add(Course_65);
                    courses.add(Course_66);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s6 = new Scanner(System.in);
                    String id6 = s6.nextLine();
                    String[] nums6 = id6.split(" ");
                    System.out.println();
                    for (String numbs : nums6) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_61);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_62);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_63);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_64);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_65);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_66);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_71 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_72 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_73 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_74 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_75 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_76 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_71);
                    courses.add(Course_72);
                    courses.add(Course_73);
                    courses.add(Course_74);
                    courses.add(Course_75);
                    courses.add(Course_76);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s7 = new Scanner(System.in);
                    String id7 = s7.nextLine();
                    String[] nums7 = id7.split(" ");
                    System.out.println();
                    for (String numbs : nums7) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_71);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_72);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_73);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_74);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_75);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_76);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Courses which you can register :");
                    System.out.println();
                    System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
                    System.out.println();
                    course Course_81 = new course(1, "Data structures and algorithm", "DSA", "Ojaswa", 4, "Introduction to programming");
                    course Course_82 = new course(2, "Computer Organisation", "CO", "Sujay Deb", 4, "none");
                    course Course_83 = new course(3, "Probability And Statistics", "P&S", "Subhajit", 4, "none");
                    course Course_84 = new course(4, "Basic Electronics", "BE", "Tammam Tillo", 4, "none");
                    course Course_85 = new course(5, "Introduction to Sociology and Anthropology", "ISA", "Deepak Prince", 4, "none");
                    course Course_86 = new course(6, "Money and Banking", "MB", "Kiriti Kanjilal ", 4, "none");

                    courses.add(Course_81);
                    courses.add(Course_82);
                    courses.add(Course_83);
                    courses.add(Course_84);
                    courses.add(Course_85);
                    courses.add(Course_86);

                    display_courses(courses);
                    System.out.println();

                    System.out.print("Enter the course ID of the Courses which you want to register (Enter Space Separated Input): ");
                    Scanner s8 = new Scanner(System.in);
                    String id8 = s8.nextLine();
                    String[] nums8 = id8.split(" ");
                    System.out.println();
                    for (String numbs : nums8) {
                        if (!numbs.isEmpty()) {
                            int n = Integer.parseInt(numbs);
                            if (n == 1) {
                                RegisteredCourses.add(Course_81);
                            } else if (n == 2) {
                                RegisteredCourses.add(Course_82);
                            } else if (n == 3) {
                                RegisteredCourses.add(Course_83);
                            } else if (n == 4) {
                                RegisteredCourses.add(Course_84);
                            } else if (n == 5) {
                                RegisteredCourses.add(Course_85);
                            } else if (n == 6) {
                                RegisteredCourses.add(Course_86);
                            }
                        }
                    }
                    Check_credits(RegisteredCourses);
                    break;
            }
            User u = new User();
            u.ReturnBack();
        }

        void display_courses(List<course> courses) {
            for (course course_ : courses) {
                System.out.println(course_.Id() + "     " + course_.Course() + "     " + course_.Acronym() + "     " + course_.Instructor() + "     " + course_.Credits() + "     " + course_.Prerequisite());
            }
        }

        void display_RegisteredCourses(List<course> RegisteredCourses) {
            System.out.println("Registration Successful.....");
            System.out.println("Registered Courses :-");
            for (course registered : RegisteredCourses) {
                System.out.println(registered.Id() + "     " + registered.Course() + "     " + registered.Acronym() + "     " + registered.Instructor() + "     " + registered.Credits() + "     " + registered.Prerequisite());
            }
        }
        int sum = 0;
        void Check_credits(List<course> RegisteredCourses) {
            for (course credit : RegisteredCourses) {
                int credits = credit.Credits();
                sum += credits;
            }
            register_course();
        }
        void register_course(){
            try {
                if (sum <= 20) {
                    display_RegisteredCourses(RegisteredCourses);
                    System.out.println();
                }
                else {
                    throw new CourseFullException("Your Credit limit exceeded.\nYou can only register for at most 20 credits\nPlease Register your courses again....");
                }
            }
            catch (CourseFullException c){
                System.out.println("Error : "+c.getMessage());
                System.out.println();
            }
        }
    }

    static class View_Schedule implements Course {
        public void Do_this() {
            System.out.println();
            System.out.println("Viewing schedule....");
            System.out.println("                9:00 - 10:30       10:30 - 12:00       12:00 - 1:00       1:00 - 2:30       2:30 - 4:00");
            System.out.println("Monday                               AP     C101                                             OS    C102");
            System.out.println("                                     Arun Balaji                                             Vivek Kumar");

            System.out.println("Tuesday         M3       C01                                               DM    B003");
            System.out.println("                Satish Pandey                                              Bapi Chatterjee");

            System.out.println("Wednesday                           RA 1    B007                          Lab AP B317       Tut RA 1 C01");
            System.out.println("                                    Nabanita Ray");

            System.out.println("Thursday         AP     C101         DM     B003                          Tut AP C101");
            System.out.println("                 Arun Balaji         Bapi Chatterjee");

            System.out.println("Friday          Tut RA 1 C03                                               OS    C102        RA 1  B007");
            System.out.println("                                                                           Vivek Kumar       Nabanita Ray");
            System.out.println("Saturday                             NO    Class");
            System.out.println();

            User u = new User();
            u.ReturnBack();
        }
    }

    static class marks {
        String course;
        String professor;
        String grade;
        int grade_points;

        marks(String course, String professor, String grade, int grade_points) {
            this.course = course;
            this.professor = professor;
            this.grade = grade;
            this.grade_points = grade_points;
        }

        void display() {
            System.out.println(course + "     " + professor + "     " + grade + "     " + grade_points);
        }

        int get_grade_points() {
            return grade_points;
        }

        String set_grade(String grade) {
            this.grade = grade;
            return grade;
        }
    }

    static class Your_Academic_Progress implements Course {
        List<marks> marksOfCourses = new ArrayList<>();

        public void Do_this() {
            System.out.println("Tracking your academic progress...");
            System.out.println();
            int semester = 1;
            System.out.println("Your completed courses of First semester are :");
            marks m1 = new marks("LA", "Subhajit", "B-", 7);
            marks m2 = new marks("IP", "B.N.jain", "C-", 5);
            marks m3 = new marks("IHCI", "kalpana", "A", 10);
            marks m4 = new marks("DC", "pravesh", "B", 8);
            marks m5 = new marks("COM", "payal", "B-", 7);

            marksOfCourses.add(m1);
            marksOfCourses.add(m2);
            marksOfCourses.add(m3);
            marksOfCourses.add(m4);
            marksOfCourses.add(m5);

            int totalGradePoints = 0;
            for (marks mark : marksOfCourses) {
                mark.display();
                totalGradePoints += mark.get_grade_points();
            }
            System.out.println();
            double SGPA1 = (double) totalGradePoints / marksOfCourses.size();
            System.out.println("Your SGPA : " + SGPA1);

            double total_sgpa = SGPA1;
            double CGPA = calculate_Cgpa(total_sgpa, semester);
            System.out.println("Your CGPA : " + CGPA);

            User u = new User();
            u.ReturnBack();
        }

        double calculate_Cgpa(double sgpa_sum, int semester) {
            double cgpa = (double) sgpa_sum / semester;
            return cgpa;
        }
    }

    static class Drop_Courses implements Course {
        public void Do_this() {
            List<course> courses = new ArrayList<>();
            System.out.println("Your Registered Courses are :");
            System.out.println();
            System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
            System.out.println();
            course Course_11 = new course(1, "Introduction to Programming", "IP", "B.N.Jain", 4, "none");
            course Course_12 = new course(2, "Digital Circuits", "DC", "Pravesh Biyani", 4, "none");
            course Course_13 = new course(3, "Linear Algebra", "LA", "Subhajit", 4, "none");
            course Course_14 = new course(4, "Introduction to HCI", "IHCI", "Sonal Keshwani", 4, "none");
            course Course_15 = new course(5, "Communication Skills", "COM", "Payal C Mukherjee", 4, "none");

            courses.add(Course_11);
            courses.add(Course_12);
            courses.add(Course_13);
            courses.add(Course_14);
            courses.add(Course_15);

            display_courses(courses);
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Course ID for the courses you want to Drop (Space Separated Input in Case of more than 1 courses): ");
            String scc = sc.nextLine();
            String[] c = scc.split(" ");
            System.out.println();

            for (String numbs : c) {
                if (!numbs.isEmpty()) {
                    int n = Integer.parseInt(numbs);
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).Id == n) {
                            courses.remove(i);
                            break;
                        }
                    }
                }
            }
            display_courses(courses);
            System.out.println();
            User u = new User();
            u.ReturnBack();
        }

        void display_courses(List<course> courses) {
            for (course course_ : courses) {
                System.out.println(course_.Id() + "     " + course_.Course() + "     " + course_.Acronym() + "     " + course_.Instructor() + "     " + course_.Credits() + "     " + course_.Prerequisite());
            }
        }
    }

    static class Submit_Complaint implements Course {
        public void Do_this() {
            System.out.println();
            System.out.print("Enter Your Complaint : ");
            Scanner c = new Scanner(System.in);
            String com = c.nextLine();
            Sub_Complaints sub = new Sub_Complaints(com, "Pending");
            Student_Func stu = new Student_Func();
            List<Sub_Complaints> complaints = stu.getComplaints();
            complaints.add(sub);
            System.out.println();
            System.out.println("Complaint Submitted.");

            for (Sub_Complaints co : complaints) {
                System.out.println();
                System.out.println("Your Complaint : " + co.description);
                System.out.println("Status : " + co.status);
                System.out.println();
            }
            User u = new User();
            u.ReturnBack();
        }

        static class Sub_Complaints {
            String description;
            String status;

            Sub_Complaints(String description, String status) {
                this.description = description;
                this.status = status;
            }

            String getDescription() {
                return description;
            }

            String getStatus() {
                return status;
            }
        }
    }

    static class give_feedback <T> implements Course{
        List<T> feedbacks = new ArrayList<>();
        void s_feed (T feed, int id){
            feedbacks.add(feed);
            for (T print : feedbacks){
                System.out.println();
                System.out.println("Your submitted feedback for the course ID "+id+" is : "+print);
            }
        }
        public void Do_this() {
            Scanner s = new Scanner(System.in);
            List<course> courses = new ArrayList<>();
            System.out.println("Your Registered Courses are :");
            System.out.println();
            System.out.println("Display Structure : Course ID  ->  Course Name  ->  Acronym  ->  Instructor  ->  Credits  ->  prerequisite");
            System.out.println();
            course Course_11 = new course(1, "Introduction to Programming", "IP", "B.N.Jain", 4, "none");
            course Course_12 = new course(2, "Digital Circuits", "DC", "Pravesh Biyani", 4, "none");
            course Course_13 = new course(3, "Linear Algebra", "LA", "Subhajit", 4, "none");
            course Course_14 = new course(4, "Introduction to HCI", "IHCI", "Sonal Keshwani", 4, "none");
            course Course_15 = new course(5, "Communication Skills", "COM", "Payal C Mukherjee", 4, "none");

            courses.add(Course_11);
            courses.add(Course_12);
            courses.add(Course_13);
            courses.add(Course_14);
            courses.add(Course_15);

            display_courses(courses);

            System.out.print("Enter course id for which you want to give the feedback : ");
            int id = s.nextInt();
            System.out.println();
            if (id == 1){
                System.out.println("Enter your feedback for the course "+Course_11.Course+ ":");
            }
            if (id == 2){
                System.out.println("Enter your feedback for the course "+Course_12.Course+ ":");
            }
            if (id == 3){
                System.out.println("Enter your feedback for the course "+Course_13.Course+ ":");
            }
            if (id == 4){
                System.out.println("Enter your feedback for the course "+Course_14.Course+ ":");
            }
            if (id == 5){
                System.out.println("Enter your feedback for the course "+Course_15.Course+ ":");
            }

            System.out.print("Enter ratings - (bad) 1 2 3 4 5 (good) Press '0' | OR | you can enter textual feedback ! (e.g. Great Course) press '1' : ");
            int input = s.nextInt();
            give_feedback<Integer> feedback = new give_feedback<>();
            give_feedback<String> feedback_ = new give_feedback<>();
            if (input == 0){
                System.out.println();
                System.out.print("Enter your rating : ");
                int f = s.nextInt();
                feedback.s_feed(f,id);
            }
            else if (input == 1){
                System.out.println();
                System.out.print("Enter your textual feedback : ");
                String a = s.next();
                feedback_.s_feed(a,id);
            }

            System.out.println();
            System.out.println("Submitting......\tSubmitted.");

            User u = new User();
            u.ReturnBack();
        }
        void display_courses(List<course> courses) {
            for (course course_ : courses) {
                System.out.println(course_.Id() + "     " + course_.Course() + "     " + course_.Acronym() + "     " + course_.Instructor() + "     " + course_.Credits() + "     " + course_.Prerequisite());
            }
        }
    }

    static class Log_Out implements Course {
        public void Do_this() {
            System.out.println("Logging Out...");
            User user = new User();
            User_roles u = new User_roles(user);
            u.after_registration();
        }
    }
}
class CourseFullException extends RuntimeException{
    CourseFullException(String error){
        super(error);
    }
}