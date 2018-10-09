public class House {

    private String address;
    private String type;
    private double price;
    private Person owner;

    public String getAddress()
    {
        return address;
    }

    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setOwner(Person owner)
    {
//        this.owner.setName(owner.getName());
//        this.owner.setAge(owner.getAge());
//        this.owner.setGender(owner.getGender());

        this.owner = owner;
    }

    public String toString()
    {
        return "Address :\t" + getAddress() +
                "\nType \t:\t" + getType() +
                "\nPrice \t:\t" + String.format("%.2f",getPrice()) +
                "\n" + getOwner().toString();
    }

    public House()
    {
        setAddress("No Address Specified");
        setType("No Type Specified");
        setPrice(0.0);
        setOwner(new Person());
    }

    public House(String address, String type, double price, String name, int age, char gender)
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(new Person(name, age, gender));
    }
}
