import java.util.Iterator;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class University implements Iterable<Student> {

    private final Student[] students;

    public University(final Student[] students) {
        this.students = students;
    }

    public Iterator<Student> iterator() {
        return new StudentsIterator();
    }

    private class StudentsIterator implements Iterator<Student> {
        // BEGIN (write your solution here)
        private int index = 0;

        @Override
        public boolean hasNext(){
            return University.this.students.length > index;
        }

        @Override
        public Student next(){
            if(this.hasNext() == false){
                throw new NoSuchElementException();
            }
            return University.this.students[index++];
        }
        // END
    }
}