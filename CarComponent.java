import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws two car shapes.
*/
public class CarComponent extends JComponent
{  
   Car car1;
   Car car2;
   
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      car1 = new Car(0, 0);
      
      // getWidth() is a method of JComponent. It returns the width of the frame
      //int x = getWidth()  - Car.WIDTH;
      //int y = getHeight() - Car.HEIGHT;

      car2 = new Car(100, 200);
   
      // Draw the 2 car objects by executing the draw() method of class Car
      // We need to pass in the reference g2 so that the draw method in class Car
      // can call g2.draw()
      car1.draw(g2);
      car2.draw(g2);
      
      // Move car 1 and redraw 
      car1.move(100, 50);
      car1.draw(g2);
   }
}
