package day10.src.day10;

public class While2 {
    public static void main(String[] args) {
        /*
        while 문은 조건식의 결과값이 거짓이라면
        단 한번도 실행되지 않고 종료하나
        do - while 문은 조건식의 결과값이 거짓이라면
        한번은 실행되고 종료한다.
         */
        int i = 100;
        while (i<10)
        {
            System.out.println("적어도 한번은 출력되는 문장");
        }
        System.out.println("프로그램 종료");
    }
}
