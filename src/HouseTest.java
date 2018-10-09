public class HouseTest {
    public static void main(String[] args) {

        House h = new House();

        System.out.println(h.toString());

        h = new House("7, Yellow Street", "Bungalow", 250000.00, "Evan Barry", 26, 'M');

        System.out.println(h.toString());

    }
}
