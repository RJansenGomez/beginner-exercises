package org.exercises.visibility;

import org.exercises.visibility.hidden.PackageVisibility;
import org.exercises.visibility.hidden.PackageVisibilityFriend;

public class Visibility {
    public static void main(String[] args) {

        new Visibility().partOneOfVisibility();

        //Modify the method in order to be able to run the code.
        PartTwoOfVisibility.execute();

        //Adjust the way its accessed. Hint: Full qualified access.
        //TODO Visibility - Fix class access
        MoreClasses.execute();
    }

    void partOneOfVisibility() {
        PackageVisibility packageVisibility = new PackageVisibility();
        //TODO PackageVisibility - Fix attribute access
        System.out.println(packageVisibility.fixHiddenVariableToBeAbleToBeAccessedFromOutside);
        //TODO PackageVisibility - Fix method access
        packageVisibility.executingCode("Visibility");

        new PackageVisibilityFriend().iAmAFriendSoICanAccessFriendStuff();
    }

    private class PartTwoOfVisibility {
        static void execute() {
            System.out.println(new OnlyOneIsAllowed().iWantToBeUsed);
        }

        class MoreClasses {
            static void execute() {
                System.out.println("More classes" + new OnlyOneIsAllowed().iWantToBeUsed);
            }
        }
    }


}

/**
 * Fix this class in order to make the code above work without moving the class to another file.
 */
//TODO OnlyOneIsAllowed - Fix class visibility
public class OnlyOneIsAllowed {
    //TODO OnlyOneIsAllowed - Fix attribute access
    //This visibility can't change, should remain private, Hint: maybe you can use a method
    private String iWantToBeUsed = "Yeah I'm used";
}



