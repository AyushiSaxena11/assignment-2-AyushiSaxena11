package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain
{
    public static void main(String[] args)
    {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(7,"Spyder"));queue.display();
        queue.enqueue(new Student(2,"Peter Maximoff"));queue.display();
        queue.enqueue(new Student(3,"Matt Murdock"));queue.display();
        queue.enqueue(new Student(5,"Sam Fisher"));queue.display();
        queue.enqueue(new Student(1,"Solid Snake"));queue.display();
        queue.enqueue(new Student(6,"Erik Lehnsherr"));queue.display();
        queue.enqueue(new Student(4,"Bruce Banner"));queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        System.out.println("The Size Queue is = " + queue.getSize());
    }
}
