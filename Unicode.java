import javax.swing.JFrame;

public class Unicode
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Convert");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      UnicodePanel panel = new UnicodePanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}
