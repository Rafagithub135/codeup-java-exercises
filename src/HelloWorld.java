public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myFavoriteNumber = 314;
        System.out.println(myFavoriteNumber);
        String myString = "This is an example of a string.";
        // When you try to assign a character to a string, you get an error stating they are incompatible types.
        // When you try to assign a value to a string that is not a string, you get an error stating they are incompatible types.
        System.out.println(myString);
        long myNumber = 123;
        // When I assigned 3.14 to myNumber, I got an error stating that the value is incompatible with the type long.
        // When you assign 123L to the variable myNumber, I didn't get an error but the command line printed just 123.
        // Long is used to denote long integers, not decimal numbers.
        /* When I declared myNumber, I was given an error of incompatible types.  To fix this, I can either change the declaration of myNumber to a double or change the value to an integer. */
        System.out.println(myNumber);
        // When you try to print a variable without a value, you get an error stating that the variable may not have been initialized.
        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        // The first block prints the value of x and then increments it by 1.  The second block increments x by 1 and then prints the value of x.
        // int class;
        // When you try to declare a variable with a name that is a reserved word, you get an error stating that the name is not a valid identifier.
        // I think the first line will work, the second line will assign the string to "o", but the third line will give an error.
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // I was correct because the third line is an int, and you can't assign a string to an int.
        // int three = (int) "three";
        // The first block is converting a string to an object and then an object to an int.  The second block is trying to convert a string to an int directly.
        // int x = 4;
        // x += 5;
        // int x = 3;
        // int y = 4;
        // y *= x;
        // int x = 10;
        // int y = 2;
        // x /= y;
        // y -= x;
        int a = 0;
        a += 2000000000;
        a += 2000000000;
        System.out.println(a);
        // When you go outside of the parameters of the variable designation, it cycles back to the minimum or maximum value of the variable.
    }
}
