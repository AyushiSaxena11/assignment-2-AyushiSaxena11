
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node
{
    private int data;
    private Node next;
    private Student student;

    public Node(Student student)
    {
        this.student = student;
        next = null;
    }

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
