import javax.swing.JFrame;

public class CarViewer
{
   public static void main(String[] args)
   {
      // Like the picture frame or easel
	   JFrame frame = new JFrame();

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 400;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Two cars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create drawing area (like a piece of paper) and add to frame
      CarComponent component = new CarComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
