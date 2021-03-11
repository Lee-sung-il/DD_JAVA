package day17.src.day17;

/*
    메서드
    정의 : 여러 명령들을 나열한 묶음
    사용이유? 이름 호출하는 것으로 여러개의 명령을 한번에 실행
    구조
    <구현부> 메서드가 어떤 명령들로 구성이 되어있는지 구현하는 부분
    리턴타입 메소드명(매개변수1,매개변수2) {
        명령1;
        명령2;
        명령3;
        return 리턴값;
    }

    리턴타입: void -> 리턴값이 존재 하지 않음

    <호출부> 메서드에 구현된 명령들이 실행될 수 있도록 호출하는 부분
    메서드명(값1,값2);
 */
public class Method1 {
    public static void main(String[] args) {
//        open();
        f1(200);
    }
    static void open() {
        System.out.println("물을 열기");
        System.out.println("바닥청소");
        System.out.println("포스기켜");
        System.out.println("빵을 진열");
    }
    static void f1(int x) { //함수 호출 시 100을 전달받아서, 전달받은 100을 출력하자!
        System.out.println("x: " +x);
    }
}
