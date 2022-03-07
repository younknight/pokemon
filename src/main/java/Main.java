import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.selectMenu();

        int flag = scanner.nextInt();
        if(flag==1){
            menu.call1();
        }else if(flag==2){
            menu.call2();
        }else if(flag==3){
            menu.call3();
        }
    }
}