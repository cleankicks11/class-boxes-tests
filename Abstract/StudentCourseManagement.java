import java.util.*;

interface StudentCourse {
    void addCourse() throws Exception;
    void viewCourse() throws Exception;
    void addFee() throws Exception;
}

class Course {
    String courseName;
    double courseFee;

    public Course(String courseName, double courseFee) {
        this.courseName = courseName;
        this.courseFee = courseFee;
    }
}

class Student implements StudentCourse {
    ArrayList<Course> courses = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addCourse() throws Exception {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter course fee: ");
        double courseFee = scanner.nextDouble();
        scanner.nextLine(); // consume newline character

        if (courseFee > 2000) {
            throw new Exception("The Course Fees cannot be applicable");
        }
        courses.add(new Course(courseName, courseFee));
    }

    @Override
    public void viewCourse() throws Exception {
        if (courses.isEmpty()) {
            throw new Exception("No courses available");
        }
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course.courseName + ": $" + course.courseFee);
        }
    }

    @Override
    public void addFee() throws Exception {
        //System.out.print("Enter fee: ");
        //double fee = scanner.nextDouble();

        if (courses.courseFee < 500 || courses.courseFee > 2000) {
            throw new Exception("Fee must be between $500 and $2000");
        }

        for (Course course : courses) {
            if (course.courseFee > 1000) {
                System.out.println("Course: " + course.courseName + ", Fee: $" + course.courseFee +
                        ", Fee with 10% discount: $" + (course.courseFee * 0.9));
            } else {
                System.out.println("Course: " + course.courseName + ", Fee: $" + course.courseFee);
            }
        }
    }
}

public class StudentCourseManagement {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter course details:");
            student.addCourse();

            //System.out.println("Enter fee details:");
            //student.addFee();

            student.viewCourse();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

