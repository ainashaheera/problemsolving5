import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class CheckboxesExample extends Panel
{
  public CheckboxesExample()
  {
    setLayout(new GridLayout(2, 3));

    Font f18 = new Font("SansSerif", Font.PLAIN, 18);
    Font f14 = new Font("SansSerif", Font.PLAIN, 14);

    Checkbox c1 = new Checkbox("Checkbox 1");
    Checkbox c2 = new Checkbox();

    c2.setLabel("Checkbox 2");
    c2.setEnabled(false);

    Checkbox c3 = new Checkbox("Checkbox 3");

    CheckboxGroup group = new CheckboxGroup();
    Checkbox c4 = new Checkbox("Checkbox 4", group, true);
    Checkbox c5 = new Checkbox("Checkbox 5", group, true);
    Checkbox c6 = new Checkbox("Checkbox 6", group, true);

    c1.setFont(f18);
    c2.setFont(f18);
    c3.setFont(f18);
    c4.setFont(f18);
    c5.setFont(f18);
    c6.setFont(f18);

    add(c1);
    add(c2);
    add(c3);
    add(c4);
    add(c5);
    add(c6);
  }

  public static void main(String [] args)
  {
    CheckboxesExample app = new CheckboxesExample();

    Frame f = new Frame("Checkboxes");

    f.add(app);
    f.pack();
    f.setVisible(true);
  }
}