package org.exercises.visibility.hidden;

public class PackageVisibility {
    String fixHiddenVariableToBeAbleToBeAccessedFromOutside="Great I'm accessed from outside the package!!!";

    void executingCode(String who){
        System.out.println("Great I'm executed from " + who + " class !!!");
    }

    String iShouldRemainWithPackageVisibility="I can only be used at package level";

    void executingCodeShouldRemainWithPackageVisibility(){
        System.out.println("Great I'm executed from other class of the package!!!");
    }

    void executeICantBeUsedFromOtherPackage(){
        new ICantBeUsedFromOtherPackage().execute("PackageVisibility");
    }
}


//TODO PackageVisibility - Understanding - Continues on PackageVisibilityFriend
//Bonus
// The visibility of a class depends of the parent, here the class can only be used at package level
class ICantBeUsedFromOtherPackage {
    void execute(String who){
        System.out.println("Im executed by " + who);
    }
}

// You can't declare a private class outside of a class. Comment or remove the code
private class PrivateCantBeUsed{

}
