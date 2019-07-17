package Java;

import java.lang.*; // 자바 프로그램의 기본적인 클래스를 담은 패키지
                    // 포함된 클래스와 인터페이스는 import 없이 사용할 수 있다.
                    // 명시적으로 임포트할 수 있음을 보여주는 것일 뿐

public class Lang
{
    public static void main(String[] args)
    {
        // 자주 쓰이는 java.lang에 포함된 클래스

        Object object = null;   // 자바 클래스의 최상위 클래스
                                // 모든 객체는 Object형을 상속받는다.

        System system = null;   // 입력, 출력, JVM 종료, GC 호출 등 시스템을 사용할 때 사용
                                // 인스턴스화하여 사용할 수 없고, static으로 기능이 구현되어 있다.

        Class cla = null;   // 클래스와 인터페이스의 메타 데이터 관리

        String string = null;   // byte[] 배열을 문자열로 변환하는 생성자
                                // String 자체만으로 문자열을 저장하고 사용할 수 있다.
                                // 네트워크 등에서는 byte[]을 사용하므로 String을 사용하여 출력할 수 있다.

        StringBuffer stringBuffer = null;   // String은 내부적으로 문자열 수정 불가
                                            // 새로운 문자열을 저장하려면 새로운 메모리를 생성하고 교체하는 방식으로 동작, 오버헤드
                                            // 문자열을 수정하면 문자열 수정이 가능하고, 메모리의 크기를 늘리는 등의 동작으로 오버헤드 감소
                                            // 멀티스레드 환경에서 사용

        StringBuilder stringBuilder = null; // 단일스레드 환경에서 사용

        Math math = null;   // 수학 계산에 사용할 수 있는 정적 메소드 제공

        Integer integer = null; // int형의 래퍼클래스
                                // 값 뿐만 아니라 null도 저장할 수 있는 객체

        Double dou = null;      // double형의 래퍼클래스
    }
}