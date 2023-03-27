package classes_and_object;

public class student {
    public String name;
    private int rollno;

    public void setrollnumber(int rn)
    {
        if (rn<=0)
        {
            return;
        }
        rollno = rn;
    }
    public void getrollnumber()
    {
        System.out.println(rollno);
    }



}
