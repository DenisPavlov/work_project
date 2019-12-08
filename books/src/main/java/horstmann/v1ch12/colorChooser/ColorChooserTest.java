package horstmann.v1ch12.colorChooser;

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.04 2015-06-12
 * @author Cay Horstmann
 */
public class ColorChooserTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ColorChooserFrame();
         frame.setTitle("ColorChooserTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
