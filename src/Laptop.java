public class Laptop extends Computer {

    private boolean touchScreen;

    public boolean hasTouchScreen()
    {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen)
    {
        this.touchScreen = touchScreen;
    }

    public Laptop(String make, String type, int size, boolean touchScreen)
    {
        setID(Integer.toString(numOfComps));
        setMake(make);
        setMemory(new Memory(type, size));
        setTouchScreen(touchScreen);
    }

    public String toString()
    {
        return "ID:\t" + getId() +
                "\nMake:\t" + getMake() +
                "\nMemory Type:\t" + getMemory().getType() +
                "\nMemory Size:\t" + getMemory().getSize() +
                "\nTouch Screen:\t" + hasTouchScreen();
    }
}
