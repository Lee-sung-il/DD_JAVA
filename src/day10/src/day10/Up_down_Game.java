package day10.src.day10;

import java.util.*; //util 패키지에 있는 모든 클래스 가져와


public class Up_down_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int user = -1;
        while (user != num) {
            System.out.print("숫자입력 : ");
            user=sc.nextInt();
            //user == num
            if (user == num){
                System.out.println("정답입니다!");
            }
            //user>num down
            else if (user > num) {
                System.out.println("Down!");
            }
            //user<num up
            else {
                System.out.println("Up!");
            }
        }
    }
}
