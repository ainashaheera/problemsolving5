import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class ButtonsExample extends Panel
{
  public ButtonsExample()
  {
    Font f18 = new Font("SansSerif", Font.PLAIN, 18);

    Button b1 = new Button("Enabled button");
    Button b2 = new Button("Disabled button");
    Button b3 = new Button();

    b1.setFont(f18);

    b2.setFont(f18);
    b2.setEnabled(false);

    b3.setFont(f18);
    b3.setLabel("Depressed button");

    add(b1);
    add(b2);
    add(b3);
  }

  public static void main(String [] args)
  {
    ButtonsExample app = new ButtonsExample();

    Frame f = new Frame("Buttons");

    f.add(app);
    f.pack();
    f.setVisible(true);
  }
}