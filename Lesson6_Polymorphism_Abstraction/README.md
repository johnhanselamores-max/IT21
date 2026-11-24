POLYMORPHISM

The PolymorphismDemo program demonstrates polymorphism using a student section scenario. It has one parent class named Student and two child classes named BSIT and ITE. Each child class provides its own implementation of the studentSection() method.


HOW POLIMORPHISM WORKS

Polymorphism allows one parent-class reference to represent different child-class objects.

-Parent Class: Student

-Child Classes: BSIT and ITE

-Overridden Method: studentSection()

The BSIT and ITE classes extend the Student class and override the studentSection() method using @Override.

In the main method, parent-class references are used to create objects of the two child classes:

Student student1 = new BSIT(); 

Student student2 = new ITE();

When the studentSection() method is called, Java executes the version belonging to the actual object. This demonstrates runtime polymorphism.


ABSTRACTION

Program Description

The AbstractionDemo program demonstrates abstraction using a college course scenario. It has an abstract parent class named Course and two child classes named BSITCourse and BSATCourse.

How Abstraction Works

Abstraction focuses on hiding implementation details and showing only the important features of a program.

-Abstract Class: Course

-Abstract Method: displayCourse()

-Concrete Method: showInformation()

-Child Classes: BSITCourse and BSATCourse

The Course class contains an abstract method named displayCourse() that does not have a method body. Each child class extends Course and provides its own implementation of that method.

The child classes implement the abstract method by displaying their respective college courses.


DIFFERENCE BETWEEN POLYMORPHISM AND ABSTRACTION

Polymorphism and abstraction are both important concepts in Object-Oriented Programming, but they have different purposes.

Polymorphism allows one parent-class reference to perform different behaviors depending on the actual child object. In this program, the Student reference can call the overridden studentSection() method of either BSIT or ITE.

Abstraction hides unnecessary implementation details and focuses on essential features. In this program, the abstract class Course defines the displayCourse() method, while its child classes provide the actual implementation.

In simple terms, polymorphism focuses on different behaviors using one common reference, while abstraction focuses on hiding implementation details and defining essential methods.

CONCLUSION

These two Java programs demonstrate important Object-Oriented Programming concepts. Polymorphism shows how different child classes can provide different behaviors through an overridden method. Abstraction shows how an abstract class can define methods that child classes must implement. Both concepts help make Java programs organized, reusable, and easier to understand.


Answer the following questions:

1\. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Method overriding is important because it allows each child class to have its own behavior even if they inherit the same method from the parent class. For example, in my program, BSIT and ITE both inherit from Student, but they display different sections when the studentSection() method is called. If a child class does not override the parent's method, it will simply use the inherited method from the parent class. This means it will perform the same behavior as the parent instead of having its own version.

2\. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

We cannot create an object directly from an abstract class because it may contain abstract methods that do not have a complete implementation. The purpose of this restriction is to make sure that child classes provide the missing methods before they can be used. For example, in my program, Course is an abstract class, so I cannot create a direct object from it. Instead, I create objects from BSITCourse and BSATCourse, which provide their own implementations of the displayCourse() method.

3\. If you need to add another child class to your polymorphism program, how would your existing code handle it?

If I need to add another child class, I can simply create a new class that extends the parent class Student. I can then override the studentSection() method and give it a different output. I don't need to change the existing BSIT and ITE classes. I only need to create an object of the new child class and use a Student reference to call its method. This makes the program easier to expand and maintain.

4\. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, polymorphism and abstraction can work together in one program because both are useful in organizing code and making it more flexible. Abstraction allows us to create an abstract parent class with methods that child classes must implement, while polymorphism allows us to use a parent-class reference to access different child-class objects. For example, in my abstraction program, Course is the abstract parent class, while BSITCourse and BSATCourse are its child classes. I can use Course references to create objects of both child classes, and each object will display its own course information.

Example:

Course course1 = new BSITCourse(); 

Course course2 = new BSATCourse();


course1.displayCourse(); 

course2.displayCourse();

5\. As a future programmer, when would you use polymorphism, and when would you use abstraction?

As a future programmer, I would use polymorphism when I want different classes to perform different actions using the same method name. It would be useful when creating programs with different types of users, vehicles, or employees. On the other hand, I would use abstraction when I want to hide unnecessary details and provide a common structure that other classes can follow. I believe both concepts are important because they help make programs more organized, reusable, flexible, and easier to understand.

