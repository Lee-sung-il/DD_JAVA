package day08.src.day08;

public class SwitchEx {
    public static void main(String[] args) {
//        일 년 동안 읽은 책 수에 따라 멘트 출력
        int book = 2;

        switch (book/10){
            case 0://10권 미만
                System.out.println("조금 더 노력하세요!");
                break;
            case 1: //10<=book<20
                System.out.println("책 읽는 것을 즐기시는 분이시네요!");
                break;
            case 2: //20<=book<30
                System.out.println("책을 사랑하는 분이시네요!");
                break;
            default: //30<= book
                System.out.println("당신은 다독왕입니다.");
                break; //break 생략시 모든 구문 실행
        }
    }
}
