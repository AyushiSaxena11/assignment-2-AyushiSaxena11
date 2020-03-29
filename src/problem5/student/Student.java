package problem5.student;
// to store student information and properties
public class Student
{
    private int rollNo;
    private String name;
    private int backLogCounter;
    private int appearingCount;

    public Student(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
    }

    public Student(int rollNo,String name,int backLogCounter,int appearingCount)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.backLogCounter=backLogCounter;
        this.appearingCount=appearingCount;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name+ " #" + rollNo;
    }

    public int getBackLogCounter()
    {
        return backLogCounter;
    }

    public void setBackLogCounter(int backLogCounter)
    {
        this.backLogCounter = backLogCounter;
    }

    public int getAppearingCount()
    {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount)
    {
        this.appearingCount = appearingCount;
    }
}
