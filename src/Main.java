public class Main {
    public static void main(String[] args) {
        Phone samsungPhone = new Samsung("재용");
        User user1 = new User("재용");
        user1.buyPhone(samsungPhone);

        // apple phone
        Phone applePhone = new Apple("잡스");
        User user2 = new User("잡스");
        user2.buyPhone(applePhone);



    }
}
