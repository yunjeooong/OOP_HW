

public class Samsung implements Phone{

    private String userName;
    private final String phoneName= "삼송폰";

    public Samsung(String userName) {
        this.userName = userName;
    }


    @Override
    public void turnON() {
        System.out.println(userName + "님이 " + phoneName + "을 켰습니다.");
    }

    @Override
    public void loading(){
        System.out.println("★★★ 폰 켜지는 중 ★★★\n");

    }
    @Override
    public String getPhoneName() {
        return phoneName;
    }
}
