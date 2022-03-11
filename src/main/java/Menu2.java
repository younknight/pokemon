import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Menu2{

    public Menu2() {
    }

    public static void MrOak(){
        Scanner scanner = new Scanner(System.in);
            try{
                //파일 객체 생성
                File file = new File("src/main/java/oak");
                //입력 스트림 생성
                FileReader filereader = new FileReader(file);
                //입력 버퍼 생성
                BufferedReader bufReader = new BufferedReader(filereader);
                String line = "";
                while((line = bufReader.readLine()) != null){
                    System.out.println(line);
                    if(line.equals("이름을 입력하세요:")) {
                        String name = scanner.next();
                        System.out.println("이름은 " + name + "입니다.");
                    }
                    char a1 = (char)System.in.read();

                }
                //.readLine()은 끝에 개행문자를 읽지 않는다.
                bufReader.close();
            }catch (FileNotFoundException e) {
                // TODO: handle exception
            }catch(IOException e){
                System.out.println(e);
            }
        }


}
