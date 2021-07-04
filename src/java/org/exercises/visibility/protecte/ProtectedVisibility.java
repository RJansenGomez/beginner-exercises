package org.exercises.visibility.protecte;

public class ProtectedVisibility {
    protected String iAmUsedByMyChildren = "I'm the parent value";
    protected String overrideAttribute = "Keep and use both parent";
    private String iAmModifiedByMyChildren = "I'm the parent value, MUST BE MODIFIED";
    private String understandingWhyThisHappens = "This the parent value, can only be modified through the parent logic";

    protected void modifyUnderstandingWhyThisHappens(String newValue) {
        this.understandingWhyThisHappens = newValue;
    }

    protected void printUnderstandingWhyThisHappens() {
        System.out.println(understandingWhyThisHappens);
    }

    protected void printOverrideAttribute() {
        System.out.println(overrideAttribute);
    }

    protected void overrideLogic() {
        System.out.println("Parent logic");
    }
}

class Child extends ProtectedVisibility {

    //TODO ProtectedVisibility - Understanding
    //You can define the same attribute as the parent but won't be used by the parent method
    private String understandingWhyThisHappens;

    //TODO ProtectedVisibility - Understanding - Override
    protected String overrideAttribute = "Keep and use both children";

    public void useMyParentValues() {
        System.out.println(this.iAmUsedByMyChildren);
    }

    //TODO ProtectedVisibility - Fix
    public void modifyMyParentValues() {
        this.iAmModifiedByMyChildren = "I'm the children value";
        System.out.println(this.iAmModifiedByMyChildren);
    }

    //TODO ProtectedVisibility - Understanding
    //Bonus
    // Understanding the usage of parent methods and the attributes change
    public void understandingWhyThisHappens() {
        this.understandingWhyThisHappens = "Has zero impact on the parent attribute";
        System.out.println("Before modifying parent values");
        printUnderstandingWhyThisHappens();

        System.out.println("Modifying parent values");
        modifyUnderstandingWhyThisHappens("Parent value modified by the children");

        System.out.println("After modifying parent values parent values");
        printUnderstandingWhyThisHappens();
    }

    //TODO ProtectedVisibility - Understanding - Override
    @Override
    protected void printOverrideAttribute() {
        System.out.println("Parent value");
        System.out.println(super.overrideAttribute);
        System.out.println("Child value");
        System.out.println(overrideAttribute);
    }

    //TODO ProtectedVisibility - Understanding - Override
    @Override
    protected void overrideLogic() {
        super.overrideLogic();
        System.out.println("Children logic");
    }

    // Advise, execute the method 1 by 1 and take a look of the code
    public static void main(String[] args) {
        //TODO ProtectedVisibility - Understanding - execution
        //Test
        Child child = new Child();
        //Remove comments to execute
//        child.useMyParentValues();
//        child.modifyMyParentValues();
//        child.understandingWhyThisHappens();
//        child.printOverrideAttribute();
//        child.overrideLogic();
    }
}
