package students;

/**
 * Created by Cardoso on 26-Jan-16.
 */
public class TestMySortScores {
    public static void main (String[]args){
        Student student1 = new Student ("John",17.5);
        Student student2 = new Student ("Karl",15.5);
        Student student3 = new Student ("Sue",14.3);
        Student student4 = new Student ("Albert",10.4);
        Student student5 = new Student ("Peter",18.6);
        Student student6 = new Student ("Zoe",11.8);
        Student[]students = new Student[]{student1,student2,student3,student4,student5,student6};

        StudentComparable sortByScoreDescending = new SortStudentByScoreDescending();
        SortUtils.sortStudents (students,sortByScoreDescending);

        System.out.println("Descending order");
        System.out.println("Name      " + "Score");
        System.out.println("------    " + "-----");

        for (Student student : students){
            System.out.format("%-10s%-4s%n" ,student.getName(),student.getScore());
        }

        StudentComparable sortByScoreAscending = new SortStudentByScoreAscending();
        SortUtils.sortStudents (students,sortByScoreAscending);

        System.out.println("\nAscending order");
        System.out.println("Name      " + "Score");
        System.out.println("------    " + "-----");

        for (Student student : students){
            System.out.format("%-10s%-4s%n" ,student.getName(),student.getScore());
        }
    }
}
