package org.exercises.visibility.hidden;

public class PackageVisibilityFriend {

    void iAmAFriendSoICanAccessFriendStuff() {
        PackageVisibility packageVisibility = new PackageVisibility();
        packageVisibility.executingCodeShouldRemainWithPackageVisibility();
        //This will also work here
        packageVisibility.executingCode("Friend");
    }


    //TODO PackageVisibility - Understanding
    //Bonus
    //As you can see everything can be used here from the other class because both classes are in the same package.
    //Try to move PackageVisibilityFriend outside the package hidden to play a little bit and see what is required to still make this work.
    //You can move it to visibility package level or even create a package inside hidden, you will face the same problems in both cases.
    public static void main(String[] args) {
        new PackageVisibilityFriend().iAmAFriendSoICanAccessFriendStuff();
        new ICantBeUsedFromOtherPackage().execute("Friend");
        new PackageVisibility().executeICantBeUsedFromOtherPackage();
    }
}


