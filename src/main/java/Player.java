import java.util.Scanner;

public class Player {
    int flag;
    public Player(){}
    Pokemon pokemon = new Pokemon();
    Scanner scanner = new Scanner(System.in);

    public void selectplayer(){
        pokemon.getpokemon();
        while(true) {
            System.out.println("1. 이동");
            System.out.println("2. 포켓몬");
            System.out.println("3. 저장");
            System.out.println("4. 종료");

            int flag = scanner.nextInt();
            if (flag == 1) move();
            if (flag == 2) pokemon();
            if (flag == 3) setting();
            if (flag == 4) pantyrun();
        }
    }
    public void move(){
        System.out.println("미구현: 이동");
    }
    public void pokemon(){ pokemon.status(); }
    public void setting(){
        System.out.println("미구현: 저장");
    }
    public void pantyrun(){
        System.exit(0);
    }

}
