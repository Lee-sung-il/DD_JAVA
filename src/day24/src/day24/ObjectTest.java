package day24.src.day24;

public class ObjectTest {
    public static void main(String[] args) {
        Aclass a1 = new Aclass();
        Aclass a2 = new Aclass();

        //toString() : 객체정보를 문자열 출력
        System.out.println(a1.toString());
        System.out.println(a1);
        // equals() : 두 객체가 동일한가 비교
        System.out.println(a1.equals(a1));
        //getClass() : 객체의 클래스정보를 가져옴
        System.out.println(a1.getClass());

    }
}

class Aclass {

}
