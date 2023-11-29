
# Learning Core Java Concepts

This repository contains the code, implementation & some theory of core Java topics.

Please feel free to go through the repository to revise core Java concepts (as I'll also be doing the same) whenever there's a need of brushing them up.




## Initial Setup
- [Getting Started with Java in VS Code.](https://code.visualstudio.com/docs/java/java-tutorial)
- [Setting up Java JDK.](https://docs.oracle.com/en/java/javase/21/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)

## Contents
  - __JVM__ (Java Virtual Machine) - This helps make Java a system independent language. It converts the byte code in .class file to the machine code for the respective system.
  - __JRE__ (Java Runtime Environment) - It is install through the JDK & this is where the JVM is included.
  - __Naming Conventions in Java__ 
    - __Class/Interface Names__:
      - First letter of class should be uppercase.
      - Each inner word should be uppercase too.
    - __Variable Names__:
      - First letter of a variable should be lowercase.
      - Each inner word should be uppercase.
    - __Constant Names__:
      - Every letter should be uppercase.
      - If it contains multiple words then it should contain an underscore between the words.
    - __Java Identifiers__:
      - The only allowed characters for identifiers are all alphanumeric characters: A-Z(a-z), 0-9, '$', '_'
      - First character in an identifier should not be a digit.
      - Not recommended to take more than 15 char length.
      - Java Identifiers case sensitive.
      - We should not use keywords as an identifiers.
  - __Reserved Words__:
    - Reserved Literals (3) - true, false, null.
    - Keywords (50)
      - Unused keywords (2) - const, goto.
      - Used Keywords (48) - Data Types, Flow Control, Exception Handling, Modifiers, Class related keywords, Object related keywords.
  - __Java Comments__:
    - Single Line - "//" is used to declare single line comment.
    - Multi Line - "/* multi line comment*/" is used to declare multi line comment.
    - Java Doc - "/** documentation */" is used to generate a html doc from source code.

  - __Main Method Syntax Explanation__:
    
                    public static void main(String[] args)
    - Public - used so that JVM can execute main method anywhere in the system. 
    - Static - used so that JVM can call the main method without creating an object. This helps save space.
    - Void - used as main method doesn’t return anything to JVM.
    - Main - Method name configured in the JVM.
    - String[] args - the main method accepts a single argument, i.e., an array of elements of type String (command line arguments).

  - __Operators__:
    - Arithmetic : '+, -, *, /, %'
    - String Concatenation : '+' (if at least 1 operator is string type)
    - Increment/Decrement : '++x' (pre), 'x++' (post)
    - Relational : '<, <=,>,>=' (can’t compare boolean/string values & nesting isn’t allowed)
    - Equality : '==, !=' (can be used to compare boolean/string values)
    - Bitwise : '&, |, ^'
    - Short-circuit/logical : &&, ||
    - Assignment : '=, +=, -=, *=, /=, %='
    - Conditional : 'Expression1 ? Expression2: Expression3'
    - Instanceof - instanceof is a keyword used for checking if a reference variable contains a given type of object reference or not.

  - __Static Block__
    - It is used to execute any block of code that is required to be executed before main method execution.

  - __Flow Control (Control Statements)__:
    - Selective Statements - if-else, switch
    - Iterative Statements - for, while, do-while, for-each
    - Transfer Statements - break, continue

  - __Inheritance__
    - The "extends" keyword is used for inheritance in Java.
    - Super Class/Parent Class: The class whose features are inherited is known as a superclass(or a base class or a parent class).
    - Sub Class/Child Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). 
      - The subclass can add its own fields and methods in addition to the superclass fields and methods.
    - Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

  - __Overloading__
    - Two methods are said to be overloaded if they have the same method name but different argument list.
    - If for a particular input there is no argument list of its type then it is converted to the data type of the next level, this is repeated until an argument list of the same type is found. This is called __Overloading Conversion__.
    - If no same argument list is found even after converting to double, only then the program gives Compile-time Error.

  - __Overriding__
    - It is a process in which a function call to the overridden method is resolved at Runtime. 
    - Method overriding occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.
    - Only methods can be overridden. Variables can’t be overridden.

  - __this/super Keywords__
    - “this” keyword - It is used to represent present class variables, methods, constructors
    - “super” keyword - It is used to represent parent/super class variables, methods, constructors
  - __Arrays__
    - Arrays initialization - Whenever an array is initialised, the default values based on the data type are stored inside it.
    - If we try to access an array index that doesn’t exist then the program will return an Array Index Out of Bounds exception (AIOBE).
    - For-each loop can be used to convert an array into its individual values.
    - We can declare, construct, & initialise an array in a single line: 
      
                               Int [ ] x={10,20,30};
    - __Anonymous Array__ - It's an array that is declared without a name. The main objective of this array is just for instance use.

  - __Abstract Class__
    - It contains abstract methods. These methods have no body.
  - __Interfaces__
    - These are 100% pure abstract classes.
    - They contain only abstract methods.
    - “implements” keyword is used incase of interfaces.
    - By default the methods in an interface are public and abstract.
    - By default the variables are public static final. Their values can’t be changed by child class.
    - A class can implement multiple interfaces but it can’t extend more than 1.

  - __String Immutability__
    - In Java, strings are immutable, which means they can’t be changed or modified once they’re declared. 
    - But we can change the string’s reference variable, so whenever we try to modify a string the VM creates a new string object and then the reference is changed to refer to the new object.
  - __String Constant Pool (SCP)__
    - A string constant pool is a separate place in the heap memory where the values of all the strings which are defined in the program are stored.
    - Whenever a new variable is created with the same content as one of the objects already present in the SCP then a new object isn’t created for it, rather the already present object is reused.
  - __StringBuilder/Buffer__
    - If the content is going to change frequently then using StringBuilder/Buffer is preferred as StringBuilder/Buffer are mutable objects.
    - The StringBuilder/Buffer class has the same methods as the String class.
    - Chaining multiple methods is allowed with StringBuilder/Buffer.

  - __Constructors__
    - Constructor is a block of codes similar to the method. It is called when an instance of the class is created. 
    - At the time of calling the constructor, memory for the object is allocated in the memory.  
    - Every time an object is created using the new() keyword, at least one constructor is called.
    - There are two types of Constructors: 
      - No arg constructor - It is a constructor that has no parameters.
      - Param constructor - it is a constructor that has no parameters.

  - __Types of Variables__
    - __Instance__ - The value of such variables varies from object to object. A separate copy of instance variables is created for every object. These are created at the time of object creation and destroyed at the time of object destruction.
    - __Static__ - This is used when the value of variable is common for all the objects. Only one copy is created here which is shared by all the objects. These are created at the time of class loading and destroyed at the time of class unloading.
    - __Local__ - The variables that are declared inside a method are called local variables. These are also known as automatic/stack/temp variables. These are created as part of method execution and destroyed once the method completes. JVM doesn’t provide default values here unlike for the other types.

  - __Types of Methods__
    - __Instance__ - These methods require creation of objects.
    - __Static__ - These methods can be called directly without creation of objects.



  - __Exception Handling__
    - An unwanted & unexpected event that disturbs the normal flow of the program.
  - __Throwable__
    
    It is the super class for Exception Handling. It has the following child classes:
    - Exception
      - RuntimeException
        - ArithmeticException
        - IndexOutOfBoundsException (IOBE)
          - AIOBE - Arrays
          - SIOBE - Strings
        - NullPointerException
        - IllegalArgumentException
          - NumberFormatException
        - ClassCastException
        - IllegalStateException
      - IOException
        - EOFException - End of file
        - FNFException - File not found
        - InterruptedIOException
      - SQLException


    - Error
      - VirtualMachineError
        - StackOverFlowError
        - OutofMemoryError
      - LinkageError
        - VerifyError
        - AssertionError

  - __Exception vs Error__
    - Exceptions occur due to our programming logic and are recoverable.
    - Errors occur due to lack of system resources(memory) and are non recoverable.

  - __Checked Exceptions vs Unchecked Exceptions__
    - Checked Exceptions are the exceptions that are checked at compilation time. Ex- IOExceptions, SQLExceptions.
    - Unchecked Exceptions are the exceptions that are not checked at compilation time. Ex- RuntimeExceptions & Errors.
  - __Methods to print exception info__:
    - printStackTrace() - prints the entire info about the exception including the line index. 
    - toString() - just provides the exception name & message.
    - getMessage() - just provides the exception message.

  - __Handling the Exceptions__:
    - __try__ - The try block contains a set of statements where an exception can occur.
    - __catch__ - The catch block is used to handle the uncertain condition of a try block. A try block is always followed by a catch block, which handles the exception that occurs in the associated try block.
      - A single try block can have multiple catch blocks.
    - __finally__ - It is executed after the catch block. “finally” block is used to execute important code such as closing the connection. It is always executed whether an exception is handled or not.
    - __throws__ - It is used to delegate the responsibility of exception handling to the caller.
  - __User Defined Exception__
    - “throw” keyword is used to handover user created exception object to JVM explicitly.
    - To create a user defined exception, we first have to extend the RuntimeException class and then create a param constructor in the exception class body.


  - __Wrapper Classes__
    - They are used to wrap primitive data types into obj form so that we can handle primitives just like objects. Here’s the method wrapper class contain:
      - valueOf() - This is used to convert primitive data type & String into wrapper obj.
      - xxValue() - This is used to convert wrapper obj into primitive data type.
      - parsexx() - This is used to convert String into primitive data types.
      - toString() - This is used to convert primitive data types or wrapper classes into String.
  - __Object Class__ 
    - It is a super class which contains the following child classes:
      - String
      - StringBuffer
      - StringBuilder
      - Number
      - Byte
      - Short
      - Integer
      - Long
      - Float
      - Double
      - Boolean
      - Character
    - Object Class also contains the most common methods which can be applied on any java obj, such as:
      - toString() - It is used to get the string representation of an obj.
      - hashCode() - It is used to get the random number generated by JVM based on an obj’s memory location.
      - clone() - It can be used to clone an object & its properties. But the class needs to implements Cloneable interface.
      - equals() - It is used to check if the memory location of two objects is the same or not.
      - getClass()
      - finalize() - Just before destroying any object, the garbage collector always calls the finalize() method to perform clean-up activities on that object. This process is known as Finalization in Java.


  - __Collection__ 
    - A group of individual objects that represent a single entity is known as a collection.
    - These are growable in nature. 
    - These can contain heterogeneous objs.
    - These have automatic method support such as sort, search, etc.
    - Every collection object is built on some data structure.
  - __Collection Framework__:
    - Collection(I)
      - List(I)
        - ArrayList(c)
        - LinkedList(c)
        - Vector(c)
          - Stack(c)
      - Set(I)
        - HashSet(c)
          - LinkedHashSet(c)
      - SortedSet(I)
        - NavigableSet(I)
          - TreeSet(c)
  - __Map Interface__:
    - HashMap(c)
      - LinkedHashMap(c)
    - Hashtable(c)
    - SortedMap(I)
      - NavigableMap(I)
        - TreeMap(c)



  - __ArrayList__
    - The underlying data structure here is Resizable/Growable Array.
    - Duplicate objects are allowed.
    - Insertion order is preserved.
    - Heterogeneous objects are allowed.
    - Null insertion is also possible.
    - We chose ArrayList when the frequent operation is retrieval.
  - __LinkedList__
    - The underlying data structure is Doubly Linked List here.
    - We chose LinkedList when the frequent operation is insertion/deletion in the middle of the list.
  - __Vector/Stack__
    - Vectors are similar to ArrayList but all the methods are synchronised here.
    - These are thread safe but their performance is low compared to ArrayList.
    - These are considered legacy classes.

  - __Cursors__ 
    
    These are used to retrieve the objects one by one from the collections.
    - __Enumeration__ - It is used for legacy classes only. It only has read access, removal & replacement isn’t possible.
    - __Iterator__ - It can be applied for any collection implemented class object. It has read & removal access but replacement/adding a new element isn’t possible.
    - __List Iterator__ - It can be applied to only List implemented classes. It has access to read, add, remove, & replace. It is a bidirectional cursor. It can move forward as well as backwards.


  - __HashSet__
    - No duplicate objects are allowed.
    - Insertion order is not preserved.
  - __LinkedHashSet__
    - It is the same as HashSet but insertion order is preserved here.

  - __TreeSet__
    - The ordering of the elements is maintained by a set using their natural ordering.
    - The insertion of null values into a TreeSet throws NullPointerException because while insertion of null, it gets compared to the existing elements, and null cannot be compared to any value.
  - __Comparable__
    - It is used by TreeSet to compare String objs & Wrapper Classes as they already implements Comparable interface.
    - It is available in java.lang package
    - Whenever object 1 comes before object 2, the compareTo() method returns a negative number.
    - And, whenever object 1 comes after object 2, the compareTo() method returns a positive number.
    - If object 1 is the same as object 2, the method returns 0.
  - __Comparator__
    - It is used to define/apply a custom sorting order in a TreeSet.
    - It is available in the java.util package.
    - It has two methods - compare(obj1, obj2) & equals()

  - __HashMap__
    - It is used to store elements as key-value pairs.


  - __Collections Class__
    - It can be used to perform - sort, search, reverse operations on a list.
  - __Arrays Class__
    - It can be used to perform sorting & searching of primitive arrays.


  - __Multi-Threading__
    - The process of executing several tasks simultaneously where each task is a separate independent part of the same program.
  - __Creating Thread__
    - By extending Thread class.
    - By Implementing Runnable Interface.
  - __Thread Scheduler__ 
    - If multiple threads are present in the program then the Thread Scheduler decides which thread gets executed first.
    - start() - It first registers the thread with the Thread Scheduler.
    - Then it calls the run() method to execute the thread.
  - __Thread Priorities__
    - Every thread in a program has a priority, the threads with the highest priority are executed first. Here are the 3 kinds of priorities:
      - MAX_PRIORITY=10
      - NORM_PRIORITY=5
      - MIN_PRIORITY=1
