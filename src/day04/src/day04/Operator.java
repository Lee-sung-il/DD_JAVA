package day04.src.day04;

public class Operator {
    public static void main(String[] args) {
        int a = 10; //a 변수에 10값 저장
        int b = 3; //b 변수에 3 값 저장
        double doubleB = 3; //자동형 변환
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println(a/doubleB); //정수/실수 = 실수
        System.out.println(a%doubleB);//정수/실수 = 실수
        System.out.println(doubleB%b); //실수/정수 = 실수

    }
}
/*
컴퓨터가 실수를 표현할때
정확하게 표현할 수 가 없다
-> 실수의 오류
왜 ?
무한한 실수의 갯수를 유한한 표현하기에는
한계가 있기 때문에!
 */
