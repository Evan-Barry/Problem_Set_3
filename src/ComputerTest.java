import javax.swing.*;

public class ComputerTest {
    public static void main(String[] args) {

        Computer[] computerArray = new Computer[2];

        Computer c = new Computer();

        for(int i = 0; i < computerArray.length; i++)
        {
            char compType = JOptionPane.showInputDialog("Do you want a desktop or laptop (d or l)").charAt(0);

            if(compType == 'd' || compType == 'D')
            {
                String make = JOptionPane.showInputDialog("Enter make of desktop");
                String type = JOptionPane.showInputDialog("Enter type of memory");
                int size = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of memory"));

                c = new Computer(make, type, size);
            }

            else if(compType == 'l' || compType == 'L')
            {
                String make = JOptionPane.showInputDialog("Enter make of laptop");
                String type = JOptionPane.showInputDialog("Enter type of memory");
                int size = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of memory)"));
                boolean touchScreen = Boolean.parseBoolean(JOptionPane.showInputDialog("Do you want a touch screen (true or false)"));

                c = new Laptop(make, type, size, touchScreen);
            }

            else
            {
                //invalid input
            }

            computerArray[i] = c;
        }

        for(Computer c1 : computerArray)
        {
            JOptionPane.showMessageDialog(null, c1.toString());
        }

    }
}
