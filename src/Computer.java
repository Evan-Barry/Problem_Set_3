import javax.swing.*;

public class Computer implements IDable {

    private String id;
    private String make;
    protected Memory memory;

    public String getId()
    {
        return id;
    }

    public String getMake()
    {
        return make;
    }

    public Memory getMemory()
    {
        return memory;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setMemory(Memory memory)
    {
        this.memory = memory;
    }

    @Override
    public void setID(String id)
    {
        this.id = id;
    }

    public Computer()
    {
        setMake("No make set");
        setMemory(new Memory("No Type Set", 0));
    }

    public Computer(String make, String memType, int memSize)
    {
        setMake(make);
        setMemory(new Memory(memType, memSize));
    }

    public String toString()
    {
        return "ID:\t" + getId()+
                "\nMake:\t" + getMake() +
                "\nMemory Type:\t" + getMemory().getType() +
                "\nMemory Size:\t" + getMemory().getSize();
    }

    public Laptop makeLaptop()
    {
        String make = JOptionPane.showInputDialog("Enter make of laptop");
        String type = JOptionPane.showInputDialog("Enter type of memory");
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of memory"));
        boolean touchScreen = Boolean.parseBoolean(JOptionPane.showInputDialog("Do you want a touch screen (true or false)"));

        Laptop l = new Laptop(make, type, size, touchScreen);

        return l;
    }

}
