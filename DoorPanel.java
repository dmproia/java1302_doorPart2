
/**
 * Write a description of class DoorPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class DoorPanel extends JPanel
{
    private boolean on;
    private ImageIcon doorOpen, doorClosed;
    private JLabel imageLabel;
   public DoorPanel ()
   {
      doorOpen = new ImageIcon ("doorOpen.jpeg");
      doorClosed = new ImageIcon ("doorClosed.jpeg");
      
      on = true;
      imageLabel = new JLabel (doorClosed);
      add (imageLabel);
      
      setBackground (Color.white);
      setPreferredSize (new Dimension(320, 200));
      setFont (new Font("Arial", Font.BOLD, 16));
   }
   public void paintComponent (Graphics rect)
   {
       super.paintComponent (rect);
       
       if(on)
        imageLabel.setIcon (doorOpen);
        else
        imageLabel.setIcon (doorClosed);
        
    }
    public void setOn (boolean doorOpen)
    {
        on = doorOpen;
    }
}