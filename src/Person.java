public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello from %s.%n", name);
    }

    public static void main(String[] args) {
//        Person john = new Person("John Smith");
//        john.sayHello();
//        john.setName("John Miller");
//        System.out.println(john.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Line 27 returns true because person1 getName is equal to person2. Line 28 returns false because person2 created another person on line 26.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Line 33 returns true because we are setting person2 to person1 on line 32.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//      On line 38, it is getting the name of person1, which is John.  On line 39, because line 37 makes person1 and person2 the same object, it also gets the name John.  On line 40, we are changing the name to Jane for person2 but since they are the same object, person1 and person2 are both named Jane, so that is the returned name.


    }
}
