
package abstractiondemo;


public class AbstractionDemo {

    public static void main(String[] args) {
        
        Course course1 = new BSITCourse();
        Course course2 = new BSITCourse();
        
        course1.showInformation();
        course1.displayCourse();
        
        course2.showInformation();
        course2.displayCourse();

    }
    
}
