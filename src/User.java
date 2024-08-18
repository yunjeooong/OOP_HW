public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void buyPhone(Phone phone) {
        System.out.println(userName + "님이 " + phone.getPhoneName()+ "을 샀습니다.");
        phone.turnON();
        phone.loading();
    }
    }
