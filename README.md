# Java beginner org.exercises
- Exercises for java beginners. There are several org.exercises in this repository. Going from basics such as
classes, naming, visibility, etc...
  
## Basics package

### Naming 
https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html

### Visibility
There are 4 types of visibility in Java. public, protected, default package and private.

The order of more exposed is in the order defined. Public can be accessed from everywhere. Protected can be accessed from its children.

Default package from the classes in the same package and private can only be accessed from its class container. 

### Block executions 
There are 3 kind of execution block
    
- Statics, they are executed the first of everything and sequentially.
- Class blocks, are executed before the constructor
- Method blocks, are executed in a method, and it's just to group code. Doesn't imply anything especial.

### Loops
Kind of loops to tackle:

- Classic for-> for(int i=0;i<lenght;i++)
- While-> while(predicate)
- Foreach-> for(int number: numberList)
- Do while-> do{ code... }while(predicate)
