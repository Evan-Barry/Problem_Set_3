public class Memory {

    private String type;
    private int size;

    public String getType()
    {
        return type;
    }

    public int getSize()
    {
        return size;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public Memory(String type, int size)
    {
        setType(type);
        setSize(size);
    }

    public String toString()
    {
        return "Size:\t" + getSize() +
                "\nType:\t" + getType();
    }

}
