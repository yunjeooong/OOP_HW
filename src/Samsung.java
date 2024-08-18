

public class Samsung implements Phone{

    private String userName;
    @Override
    public void buyPhone(String userName){
        this.userName=userName;
        System.out.println(userName+"님이 삼송폰을 샀습니다.");

    }

    @Override
    public void turnON(){
        System.out.println(userName+ "님이 삼송폰을 켰습니다.");

    }

    @Override
    public void loading(){
        System.out.println("★★★ 폰 켜지는 중 ★★★\n");

    }
}
