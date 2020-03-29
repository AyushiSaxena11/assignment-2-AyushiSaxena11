
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue
{
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        boolean response = false;
        if (size == 0)
        {
            response = true;
        }
        return response;
    }

    public void enqueue(Student element)
    {
        Node node = new Node(element);
        Node temp=front;
        Node previous=temp;
        if (isEmpty())
        {
            rear = node;
            front = node;
            size++;
        }
        else
            {
            while(temp.getStudent().getRollNo()<element.getRollNo()&&temp!=null)
            {
                previous=temp;
                temp=temp.getNext();
            }
            if(previous==front&&temp==front)
            {
                node.setNext(front);
                front=node;
            }
            else
                {
                previous.setNext(node);
                node.setNext(temp);
            }
            if(temp==null)
            {
                rear=node;
            }
            size++;
        }
    }

    public Node poll()
    {
        Node res = null;
        if(!isEmpty())
        {
            if(front.getNext()!=null)
            {
                res = front;
                front = front.getNext();
                res.setNext(null);
                size--;
            }
            else
                {
                res=front;
                front=null;
                rear=null;
                size--;
            }
        }
        else
            {
            System.out.println("Queue UnderFlow");
        }
        return res;
    }

    public Node peek()
    {
        Node response = null;
        if (!isEmpty())
        {
            response = new Node(front.getStudent());
        }
        return response;
    }

    public void display()
    {
        System.out.print("Display : ");
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.getStudent());
            if(temp.getNext()!=null)
            {
                System.out.print("<---");
            }
            temp=temp.getNext();
        }
        System.out.println();
    }

    public int getSize()
    {
        return size;
    }

    public Node rear()
    {
        return rear;
    }
}
