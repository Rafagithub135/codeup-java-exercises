import java.util.Arrays;

public class ArraysExercises {

//Person[] people = new Person[3];
//people[0] = new Person("John");
//people[1] = new Person("Jane");
//people[2] = new Person("Joe");
//
//for (Person person : people) {
//    System.out.println(person.getName());
//}

public static void addPerson(Person[] people , Person person){
    Person[] newPeople = Arrays.copyOf(people, people.length + 1);
    newPeople[newPeople.length - 1] = person;
    System.out.println(Arrays.toString(newPeople));
}














    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        // Arrays.toString is necessary to print the values instead of the location of the object.
    }
}
