package day04.src.day04;

public class Equality_sing_Operator {
    public static void main(String[] args) {
        double a = 3.14; //실수형 변수 a에 3.14저장
        double b = 5.14; //실수형 변수 b에 5.14저장
        System.out.println(a==b); //a와b가 같은가?
        System.out.println(a!=b);//a와b가 다른가?

        String c1 = "Hello JAVA!"; //c1 문자열 변수에 "Hello JAVA!" 값 저장
        System.out.println(c1 == "Hello JAVA!"); //true
        System.out.println(c1.equals("Hello JAVA!"));//true
        System.out.println(c1.equals("hello java!"));//false
        /*
        문자열 비교시
        == 등가비교연산자를 사용하지 않는다.

        String 문자열클래스
        안에있는 메서드(기능) : equals()
        문자열.equals(비교문자열)
        문자열을 대소문자 구분한다!
         */


    }
}
