import java.util.Scanner;
import java.util.*;
public class Pokemon {
    private String name;
    List<String> monster = new ArrayList<String>();


    Scanner scanner = new Scanner(System.in);

    public Pokemon() {
    }

    public void getpokemon() {
        System.out.println("포켓몬을 골라주세요: 1.꼬부기 2.파이리 3.이상해씨");
        if (monster.size() > 6) {
            System.out.println("pc로 보냅니다");
        }
        int flag = scanner.nextInt();
        System.out.println("이름을 바꾸시겠습니까?:");
        System.out.println("yes: 1");
        System.out.println("no: 2");
        int YN = scanner.nextInt();
        if(YN==1){
            String setname = scanner.next();
            monster.add(setname);
        }
        else {
            if (flag == 1) {

                monster.add("꼬부기");

            }
            if (flag == 2) {
                monster.add("파이리");
            }
            if (flag == 3) {
                monster.add("이상해씨");
            }
        }
    }
        public void status(){
            for (String name : monster) {
                System.out.println(name);
            }
        }
    }

