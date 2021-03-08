package day02.src.day02;  //클래스가 소속된 패키지 지정

public class Day02Ex { //클래스 영역
    public static void main(String[] args) {//메서드 영역
//        안녕하세요
       /*
       다음줄 주석처리 안됨
       여러줄주석 */

//       System.out.println("문자열값");//문자열값
//       System.out.println('A'); //문자형값
//       System.out.println(100);//정수형값
//       System.out.println(3.14);//실수형값

        //format: 형식지정 -> %알파벳
//        System.out.printf("형식지정자","츨력값");
        System.out.printf("%s","문자열값");//문자열: String
        System.out.printf("%c",65); //문자형: Character
        System.out.printf("%d",100);//정수값: Decimal
        System.out.printf("%f",3.14);//실수값: Float

/*
아스키코드값
컴퓨터는 문자를 저장할 수 없다.
컴퓨터는 기계어를 이해할 수 있는 기계기 때문에
01 이진수만이해
문자에 숫자를 부여함으로써, 각 문자를 숫자로 저장할 수 있다.
문자에 해당하는 숫자값을 아스키코드값
A: 65
a: 97
 */

    }
}
