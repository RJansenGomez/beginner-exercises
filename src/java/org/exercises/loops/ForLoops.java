package org.exercises.loops;

public class ForLoops {

    public static void main(String[] args) {
        //Working example
        workingExample();
        //Working example2
        workingExample2();
        //Working example3
        workingExample3();
        //Working example4
        workingExample4();
        new ForExercise().execute();
    }

    private static void workingExample() {
        System.out.print("Normal Iterating ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    private static void workingExample2() {
        System.out.println("Iterating with return");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("");
                System.out.println("Stooping on index 5");
                System.out.println("");
                return;
            }
            System.out.print(i + ", ");
        }
    }

    private static void workingExample3() {
        System.out.println("Iterating with break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("");
                System.out.println("Stooping on index 5");
                System.out.println("");
                break;
            }
            System.out.print(i + ", ");
        }
    }

    private static void workingExample4() {
        System.out.println("Iterating with jump");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("");
                System.out.println("Stooping on index 5, 5 won't be printed");
                //This line is the same as return, but it imply the loop will continue ignoring the code below this line on this iteration
                // the next iteration will execute the code below if the condition is not matched
                continue;
            }

            System.out.print(i + ", ");
        }
    }
}

class ForExercise {
    //TODO Fix the logic of the loops
    public void execute() {
//        fixLoop1();
//        fixLoop2();
//        fixLoop3();
//        fixLoop4();
//        fixLoop5();
    }

    private void fixLoop1() {
        int expectedIterations = 2;
        //Hint loop conditions can be changed. i.e the increase iteration can be any logic desired
        int numberOfIterations = 0;
        int loopIterations = 0;
        for (; loopIterations < 10; loopIterations += 20) {
            numberOfIterations++;
        }
        customAssertEquals("fixLoop1", numberOfIterations, expectedIterations);
    }

    private void fixLoop2() {
        int expectedIterations = 10;
        int donotChange = 10;
        int numberOfIterations = 0;
        int donotChange2 = 1;
        //Hint: Change the predicate, can be anything as well
        //     < this condition is the predicate>
        //                  |
        //     (            v           )
        for (; donotChange2 < donotChange; donotChange2++) {
            numberOfIterations++;
        }
        customAssertEquals("fixLoop2", numberOfIterations, expectedIterations);
    }

    private void fixLoop3() {
        int expectedIterations = 1;

        int numberOfIterations = 0;
        //Hint: Change the initial value tot match the condition on the first iteration
        for (int loopIterations = 2; loopIterations % 5 > 0; loopIterations += 4) {
            numberOfIterations++;
        }
        customAssertEquals("fixLoop3", numberOfIterations, expectedIterations);
    }

    private void fixLoop4() {
        int expectedIterations = 400;

        int numberOfIterations = 0;
        //Hint: Avoid to do all the loop count, **use return/break?**
        for (int loopIterations = 0; loopIterations <= (Integer.MAX_VALUE - 5); loopIterations++) {
            numberOfIterations++;
        }
        customAssertEquals("fixLoop4", numberOfIterations, expectedIterations);
    }

    private void fixLoop5() {
        int expectedPairNumber = 10;

        int pairNumberAmount = 0;
        //Hint: You have to use continue
        for (int loopIterations = 1; loopIterations <= 20; loopIterations++) {
            //magic code to avoid the failure
            //Hint: maybe a if module of some number with a continue will make it
            //Module of a number => numberA%divisor will give the rest of the division. i.e: 8%3 will give 2
            System.out.println("Remove this, its just to learn how module works: " + 8 % 3);
            pairNumberAmount++;
            failOnPairNumbers(loopIterations);
        }
        customAssertEquals("fixLoop5", pairNumberAmount, expectedPairNumber);
    }

    private void failOnPairNumbers(int loopIterations) {
        if (loopIterations % 2 == 0) {
            throw new RuntimeException("This code should not be run if its a pair number");
        }
    }

    private static void customAssertEquals(String methodOrigin, int currentValue, int expectedValue) {
        if (currentValue != expectedValue) {
            throw new RuntimeException(String.format("Origin: %s,   Expected %d is not equals to %d", methodOrigin, expectedValue, currentValue));
        }
    }
}
