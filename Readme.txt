To Run Code -
Just simply click on run button and the code will start executing. It is a complete menu-driven program so just give input accordingly and
with this you can simply perform all functionalities.

About all files -

My class for student functionality is in the file Course.java (It is a separate file, it is in the Course.java just because implementation
of interface).
All files - User_roles.java , User.java , Course.java (Student_func) , Professor_func.java , Administrator_func.java , main_class.java and
README.txt(this file).

For Administrator, as mentioned in the assignment document that the password is fixed (we may choose anything), so the password for
administrator registration and login is - Admin

1. User_roles.java
This class is mainly responsible for selecting the role of the user, whether the user is a Student, a Professor, an administrator or a
Teaching Assistant.
And it also contains a method named after_registration which is responsible for directing the execution of code to the next step (log in).

2. User.java
This class consists of several methods like -
it includes some classes for Student, professor and administrator which are responsible for registration process.
Log_in - As name suggests, used to log in the user by asking their credentials.
Functionality - It directs the execution of code towards the functionality according to the User role.
ReturnBack - A method which directs to execution to the specific menu according to the flow.

3. Course.java - It's an Interface
it consists of an abstract method which is implemented in all functionalities according to their own task.
The class for Student Functionality is in this file, and it handles all the functionalities performed by the student.

4. Professor_func
This is the class for all professor functionalities including manage courses and view list of enrolled students.

5. Administrator_func
This class handles all the functionalities which needs to be performed by the administrator including manage course catalogue, manage student
records, assigning professors, handling complaints and there are several methods which are supporting the handling of each functionality.

6. TA_func
In this class (Teaching Assistant) some functionality in addition to Student functionality is created. Because it inherits the student class
So, It performs all the functionality which a student can perform and also some additional functionality like manage grades.

7. main_class.java
Code starts executing from this file, the user just need to click the run button and the code starts executing accordingly in the terminal.
It is a complete menu-driven program, so just give input whatever needed according to which functionality the user wants to perform.

Exception Handling -
1. In login method of User class.
2. Course registration failure in Student functionality class.

Generic programming -
It is used in the additional functionality implemented in Student functionality class which is a student can give feedback for the course.

OOP Concepts -
Classes are used in every file, there are many subclasses which are used for the smooth execution of program.

Inheritance is applied in User.java file as -
There is a parent class User and the child classes such as Student, Professor and Administrator extends the user class.
this file is responsible for register and login Functionality for each role.

Interface is applied in Course.java interface file where the classes of each functionality of Student implements that interface.

Abstraction is applied as an abstract method naming "Do_this" which is defined in every Student functionality class independently.

Polymorphism is used in User.java class where the registration process is handled. As polymorphism means 'many-forms', in this file register()
method is polymorphic because it is implemented differently for every role (student, professor, administrator).

Polymorphism is also applied in Course.java file where course interface is implemented by several classes like register courses, available
courses and other classes responsible for student functionality.

Used Constructor Overloading in Register for courses functionality which is in Course interface file, or we can say Student functionality class
because sometimes we have different types and different number of courses in semesters.

Method overriding is implemented in User.java class, The Student, Professor, and Administrator classes override the Register() method.
with the help of method overriding the method register() can be implemented independently.

Encapsulation is used in Professor_func class -
the view_courses class encapsulates the properties of a course, such as Course_name, Course_code, Syllabus, Credits, Prerequisite,
and enrollment_limit, and provides public methods to access and modify these properties.

Encapsulation is also used in Administrator_func class -
the classes course_catalogue, professors, Course_, and Student_Record encapsulate their respective properties and provide public
methods to access and modify these properties.

Constructors are used very frequently in most of the classes and also performed constructor overloading wherever needed.
