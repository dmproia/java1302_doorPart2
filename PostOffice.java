
/**
 * Write a description of class PostOffice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostOffice
{
    private Door[] d;
    private final int NODOORS = 101;
    
    public PostOffice()
    {
        d = new Door[NODOORS];    
        for(int i = 1; i < NODOORS; i++)
        {
            d[i]= new Door();
        }
    } 
    public void visitDoorMultilpes(int n)
    {
        for(int i = n; i< NODOORS; i+=n)
        {
            d[i].visit();
        }
    }
    public void visitAllDoors()
    {
        for(int i = 1; i < NODOORS; i++)
        {
            visitDoorMultilpes(i);
        }
    }
    public String toString()
    {
        String temp = "";
        for(int i = 1; i < NODOORS; i++)
        {
            temp = temp + "Door " + i + " is " + d[i] + '\n';
        }
        return temp;
    }
}