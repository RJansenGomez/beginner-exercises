package org.exercises.execution;

/**
 * Here you will find an example of code blocks execution.
 * Statics are used to initialize stuff.
 * Static is the first code executed.
 * Static variables/objects will be loaded in memory always, so its space occupied by default.
 * Remember Java is executed sequentially from top to bottom.
 */
public class BlockExecutionAdvanced {

    //So the first thing java executes are static variables and blocks

    //You can't use some previous its definition
    static {
        //Remove or comment the code
        System.out.println(runTimeModification);
    }

    public BlockExecutionAdvanced(){
        System.out.println("This is the constructor");
    }

    {
        System.out.println("This is not static and will be executed before the constructor");
    }

    public static int counter = 0;
    public static String first = "This is the first " + counter + " variable to be executed in this piece of code";
    public static String second;
    public static String third = "This will be executed in second place";
    public static String runTimeModification = "This is the static value";
    public static String modifyValue;
    public static String mindBlowing;
    public static String separator = "----------------------------------------------------";

    private static void printSeparator() {
        System.out.println(separator);
    }

    private static void modifyValue() {
        System.out.println("Modifying value...");
        modifyValue = "MODIFIED";
    }

    private void mindBlowing() {
        System.out.println("This is executed in the static blocks initializing point...");
        mindBlowing = "Mind BLOW!!!!";
    }

    static {
        //you can use static methods
        System.out.println("*********************************************************************************");
        printSeparator();
        System.out.println("First block");
        System.out.println(runTimeModification);
        printSeparator();
    }

    static {
        String runTimeModificationLocal = "You can define temporal variables to the static block";
    }

    static {
        //But you can't use the local variables between blocks
        //Remove or comment the code
        System.out.println(runTimeModificationLocal);
    }

    //This is a static block of code, it can exists also as non-static. Its just to help the programmer to group code.
    //Also its useful to operate with static variables
    static {
        printSeparator();
        System.out.println("Second block");
        counter++;
        second = "This is the second " + counter + " variable to be executed in this piece of code";
        printSeparator();
    }

    public void runTimeModifier() {
        //In runtime we are going to modify static variables
        runTimeModification  = "This is the new static value modified in runtime";
        System.out.println(runTimeModification);
    }

    //Execute the main to check the result in console
    public static void main(String[] args) {
        //We can use the static code from above
        //this will be executed after everything
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println("Modifying value at runtime...");
        new BlockExecutionAdvanced().runTimeModifier();
        System.out.println("New static value : " + runTimeModification);
    }

    static {
        printSeparator();
        System.out.println("Third block");
        counter++;
        third = "But it changes here " + counter + " , in third place";
        printSeparator();
    }

    static {
        printSeparator();
        System.out.println("Fourth block");
        System.out.println(runTimeModification);
        printSeparator();
    }

    static {
        printSeparator();
        System.out.println("Fifth block");
        //This prints null, don't be scared
        System.out.println(modifyValue);
        modifyValue();
        System.out.println(modifyValue);
        printSeparator();
    }

    static {
        printSeparator();
        System.out.println("Mind blow block");
        //This prints null, don't be scared
        System.out.println(mindBlowing);
        new BlockExecutionAdvanced().mindBlowing();
        System.out.println(mindBlowing);
        printSeparator();
    }

    static {
        System.out.println("*********************Code executed before main execution**********************");
    }
}
