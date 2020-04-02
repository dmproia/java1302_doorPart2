/**
 * Write a description of class Door here.
 * 
 * @author (David Proia) 
 * @version (6-13-2013)
 */

import javax.swing.JFrame;

public class Door 
{
    private String state;
    
    public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Door");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      DoorPanel panel = new DoorPanel();

      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
    //method for using Door()
    public Door ()
    {
        state = "closed";                      
    }
    //method for using door calling 2 variable's
    public Door(String s)
    {        
        if (s.equals("open"))
        {
            state = s;
        }
        else
        {
            state = "closed";
        }
        
                           
    }

    public void setState(String s)
    {
        if (s.equals("open"))
        {
            state = s;
        }
        
        else
        {
            state = "closed";
        }        
    }
    
    public String getState()
    {
        return state;
    }
        
    //Mutator for visit
    public void visit()
    {
        if (state.equals("closed"))
        {
            state = "open";
        }
        else if(state.equals("open"))
        {
            state = "closed";
        }
        
       
    }
    
    public String toString()
    {
        return  state ;
    }

}