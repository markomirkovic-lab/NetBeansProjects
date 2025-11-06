package person2;

import java.util.Arrays;

/**
 *
 * @author Neil Otupacca
 * @version 16 September 2022
 */
public class PersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Paolo", "Bonolis", 25, 2, 1952);
        System.out.println(p);

        Student st = new Student("Gig", "Buffon", 10, 9, 1963, "cx52697");
        System.out.println(st);
        
        Person[] arr = new Person[4];
        arr[0] = new Person("Paolo", "Fenci", 0, 0, 0);
        arr[1] = new Student("Frank", "Sinatra", 0, 0, 0, "cx52697");
        arr[2] = new Teacher("Paolo", "Fenci", 0, 0, 0, 100000);
        arr[3] = new Person("Paolo", "Fenci", 0, 0, 0);

        //Teacher t1 = (Teacher) arr[1];  // Genera un'exception.
        Teacher t2 = (Teacher) arr[2];

        if (arr[1] instanceof Student) {
            Student stx = (Student) arr[1];
            System.out.println("Id: " + stx.getStudentId());
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
}
