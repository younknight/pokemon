public class Menu {
    Menu1 menu1 = new Menu1();
    Menu2 menu2 = new Menu2();
    Menu3 menu3 = new Menu3();
    public Menu() {
    }

    public void selectMenu() {
        System.out.println("##포켓몬스터##");
        System.out.println("1. 모험을 계속하다");
        System.out.println("2. 새로운 모험을 시작하다 ");
        System.out.println("3. 설정을 바꾸다");
    }

    public void call1() {
        menu1.nodata();
    }

    public void call2() {
        menu2.MrOak();
    }

    public void call3() {
        menu3.nodata();
    }

}
