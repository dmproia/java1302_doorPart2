
/**
 * Write a description of class DoorControls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoorControls extends JPanel
{
    private DoorPanel door;
    private JButton onButton, offButton;
    public DoorControls (DoorPanel doorPanel)
       {
          door = doorPanel;
    
          onButton = new JButton ("open");
          onButton.setEnabled (false);
          onButton.setMnemonic ('n');
          onButton.setToolTipText ("Open the Door!");
          onButton.addActionListener (new OnListener());
    
          offButton = new JButton ("closed");
          offButton.setEnabled (true);
          offButton.setMnemonic ('f');
          offButton.setToolTipText ("Shut the door!");
          offButton.addActionListener (new OffListener());
    
          setBackground (Color.black);
          add (onButton);
          add (offButton);
       }
       
    private class OnListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Turns the bulb on and repaints the bulb panel.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         door.setOn (true);
         onButton.setEnabled (false);
         offButton.setEnabled (true);
         door.repaint();
      }
   }

   //*****************************************************************
   //  Represents the listener for the Off button.
   //*****************************************************************
   private class OffListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Turns the bulb off and repaints the bulb panel.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         door.setOn (false);
         onButton.setEnabled (true);
         offButton.setEnabled (false);
         door.repaint();
      }
   }   
}