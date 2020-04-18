import java.awt.*;

public class FrameExample extends Frame
{
    FrameExample()
    {
        Button b=new Button("Button!!");

        b.setBounds(50,50,50,50);

        add(b);

        setSize(500,300);
        setTitle("This is my First AWT example");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String args[])
    {
         FrameExample fr=new FrameExample();
    }
}