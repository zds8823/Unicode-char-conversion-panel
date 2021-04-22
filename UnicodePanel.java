   //**************************************************************************
   //**************************************************************************
   //      UnicodePanel.java                           Author: Eric Lavoie
   //                                                       100122593
   //**************************************************************************
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;

   public class UnicodePanel extends JPanel
  {
   //sets global variables and needed buttons lables and text fields 
   private JLabel outp;
   private JRadioButton uToc, cTou;
   private JTextField value;
   private String output;
   
   public UnicodePanel()
   {  
    //creates all the need buttons and lables
    value = new JTextField(7);
    outp = new JLabel (output);
    uToc = new JRadioButton ("Unicode to char",true);
    uToc.setBackground (Color.green);
    cTou = new JRadioButton ("char to Unicode");
    cTou.setBackground (Color.green);
      
    //creates a button group
    ButtonGroup group = new ButtonGroup();
    group.add (uToc);
    group.add (cTou);
    
    //creates an action listener for the textfield
    textListener enter = new textListener();
    value.addActionListener (enter);
      
      
    //creates a ation listener for the radio buttons
    UniListener listener = new UniListener();
    uToc.addActionListener (listener);
    cTou.addActionListener (listener);
      
    //creates the layout of panel
    JPanel buttonPanel = new JPanel();
    add(value);
    add(outp);
    //glues the radio buttons to the y axis
    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
    add(uToc);
    add(cTou);
       
    //sets the panel dimensions
    setBackground (Color.green);
    setPreferredSize (new Dimension(200, 100));
    }
   
   //implements action listener for the radio buttons
   private class UniListener implements ActionListener
   {
    public void actionPerformed (ActionEvent event)
    {        
     Object source = event.getSource();
     //if a radio button  is selected resets the text field
     if (source == uToc)
     {        
     //resets textfield and label
     outp.setText("");
     value.setText("");
     }
     if (source ==cTou)
     {
     //resets textfield and label
     outp.setText("");
     value.setText("");
     }
    }
   }
     //implements the action listener for the jtextfield
     private class textListener implements ActionListener
     {
      public void actionPerformed (ActionEvent event)
      { 
       // creates a string for the value of the inputed text file
       String textv = value.getText();
       //if unicode to char is selected
       if (uToc.isSelected())
       //then converts the inputed int to the char value
       textv = Character.toString((char) Integer.parseInt(textv));
       //if unicode to char is not slected it must be char to unicode
       else
       // reads the inputed char and converts it to an integer value
       textv = Integer.toString((int) textv.charAt(0));
       //sets the label to the converted char or unicode
       outp.setText(textv);
      }
     }
   }
   