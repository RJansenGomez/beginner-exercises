package org.exercises.execution;

/**
 * Here you will find an example of code blocks execution.
 * Remember Java is executed sequentially from top to bottom.
 */
public class BlockExecution {

    //So the first thing java executes are static variables and blocks

    public static int counter = 0;
    public static String first = "This is the first " + counter + " variable to be executed in this piece of code";
    public static String second;
    public static String third = "This will be executed in second place";

    //This is a static block of code, it can exists also as non-static. Its just to help the programmer to group code.
    //Also its useful to operate with static variables
    static {
        counter++;
        second = "This is the second " + counter + " variable to be executed in this piece of code";
    }

    public static void main(String[] args) {
        //We can use the static code from above
        //this will be executed after everything
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    static {
        counter++;
        third = "But it changes here " + counter + " , in third place";
    }
}
