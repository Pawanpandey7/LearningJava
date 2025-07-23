// this is the life cycle of the applet
import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet{
   
       public void init()
      {
        System.out.print("applet initialization");
      }
      public void start()
      {
        System.out.print("applet started");

      }
      public void stop()
      {
        System.out.print("applet stopped");
      }
      public void paint(Graphics g)
      {
        System.out.print("painting");

      }
      public void destroy()
      {
        System.out.print("applet destroyed");
      }
  
}