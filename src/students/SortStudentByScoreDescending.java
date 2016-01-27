package students;

/**
 * Created by Cardoso on 26-Jan-16.
 */
public class SortStudentByScoreDescending implements StudentComparable {
    @Override
    public int compareTo(Student student1, Student student2) {
        if ( student1.getScore() == student2.getScore()) {
            return 0;
        }
        if ( student1.getScore() < student2.getScore() ) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
