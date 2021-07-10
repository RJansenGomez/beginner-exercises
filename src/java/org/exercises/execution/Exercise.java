package org.exercises.execution;

/**
 * Move the blocks to match the order defined
 */
public class Exercise {

    private static int executionOrder;

    static {
        checkOrder(executionOrder, 4);
    }

    static {
        executionOrder++;
    }

    static {
        checkOrder(executionOrder, 5);
    }

    static {
        executionOrder++;
    }

    static {
        checkOrder(executionOrder, 8);
    }

    static {
        executionOrder++;
    }

    static {
        executionOrder++;
    }

    static {
        executionOrder++;
    }

    static {
        executionOrder++;
    }

    static {
        executionOrder++;
    }

    static {
        executionOrder++;
    }

    static {
        checkOrder(executionOrder, 0);
    }

    public static void main(String[] args) {
        System.out.println("ORDER STATIC BLOCKS");
        //Bonus remove the comment and execute if you know how this is achieved
        checkOrder(executionOrder, 10);
    }

    private static void checkOrder(int executionOrder, int expectedPlace) {
        if (executionOrder != expectedPlace) {
            throw new RuntimeException("Wrong order defined, expected " + expectedPlace + ", actual " + executionOrder);
        }
    }

    static {
        checkOrder(executionOrder, 3);
    }

    static {
        checkOrder(executionOrder, 1);
    }

    static {
        checkOrder(executionOrder, 2);
    }

    {
        //Bonus
        executionOrder += 2;
    }

}
