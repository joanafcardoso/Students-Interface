package students;

/**
 * Created by Cardoso on 26-Jan-16.
 */
public class SortUtils {
    public static void sortStudents(Student[] students, StudentComparable compare) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < students.length - 1; i++) {
                int swap = compare.compareTo(students[i], students[i + 1]);
                if (swap == 0) {//// if elements are the same no swap needed
                    continue;
                } else if (swap == -1) {//if scores of student s1 < student s2
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;
                    sorted = false;
                }//if swap==1, students are already ordered
            }
        }
    }
}
