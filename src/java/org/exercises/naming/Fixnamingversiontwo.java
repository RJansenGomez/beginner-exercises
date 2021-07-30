package org.exercises.naming;

/**
 * https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
 *
 * Here you need to fix all the wrong naming, don't bother about visibility(public, default, private, static)
 * Hints:
 * All Java class must start with a capital letter.
 * All words must be differentiated through camelCase nomenclature
 * Constants are final variables. Constants are UPPER CASE split by _
 * Variables always starts in lower case
 */
public class Fixnamingversiontwo {

    public static final String MORe_constants = "constant value";
    public static String troublehere = "static value";
    private String MoreThingsToFix3;
    //Respect camelCase convention. This is snake_case
    private String this_is_snake_case_you_may_find_somewhere_else_this = "";
    String otherstuff;
    private String morethingsToFix;
    private String __thisIsNotAllowedEither;
    private String $$$$$$nopethisIsNotAllowedEither;
    private String this$can$happen;
    private String weird$touseit;
    private String IhaveNeverSeenThis$invaribles;

    //Respect camelCase convention. This is snake_case
    public static void methods_can_be_also_snake_case() {
        // This can be empty
    }

    //As you can see this is forbidden, Comment or remove it
    public void this-is-wrong() {

    }

    /**
     * Let's stick with the standards, here we are allowing access to a private variable
     */
    public String __fix_me_please() {
        return this.morethingsToFix;
    }

    /**
     * Let's stick with the standards, here we are allowing change the private variable value
     */
    public void set_more_things_To_Fix(String anewvalue) {
        //We can do this, but there is a better way to use class variables. Hint on line 34
        morethingsToFix = anewvalue;
    }
}
