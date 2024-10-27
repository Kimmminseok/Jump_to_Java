package house;

public class HousePark {
    protected String lastname = "Park";
    public String info = "this is public message.";

    public static void main(String[] args) {
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
        // Housekim 사용을 위해서 import가 필요없다.
    }
}
