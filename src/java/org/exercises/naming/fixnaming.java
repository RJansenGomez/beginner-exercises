package org.exercises.naming;

/**
 * https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
 *
 * Here you need to fix all the wrong naming, don't bother about visibility(public, default, private, static)
 * Hints:
 * All Java class must start with a capital letter.
 * All words must be differentiated through camelCase nomenclature
 * Constants are final variables. Constants are UPPER CASE split by _
 */
public class fixnaming {

    public static final String iAmConstant = "constant value";
    public static String iAmAStaticVariable = "static value";
    String otherstuff;
    private String morethingsToFix;
    private String moreThingstofix;
    private String MoreThingsToFix3;
    //Careful variables can't be duplicated. Hint: change something to avoid duplicity. Respect camelCase convention
    private String youHavetoDetectThewrongvariables = "";
    private String tmpStuff = "Strongly advised to avoid this kind of variable definition. Try to avoid tmp, temp, other relatives";
    private String tempstuff = "Strongly advised to avoid this kind of variable definition. Try to avoid tmp, temp, other relatives";

    public static void letsgowithmethods() {
        // This can be empty
    }

    public void letsgowithMethods() {
        // Careful methods can't be duplicated. Hint: change something to avoid duplicity. Respect camelCase convention
    }

    /**
     * Let's stick with the standards, here we are allowing access to a private variable
     */
    public String getmorethingsToFix() {
        return this.morethingsToFix;
    }

    /**
     * Let's stick with the standards, here we are allowing change the private variable value
     */
    public void setmorethingsToFix(String newvalue) {
        //We can do this, but there is a better way to use class variables. Hint on line 34
        morethingsToFix = newvalue;
    }
}
