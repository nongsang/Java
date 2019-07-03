package Java;

import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class Properties_Collection
{
    public static void main(String[] args)
    {
        Properties map = new Properties();  // Map<> 계열 컬렉션 중 하나인 Properties다.
                                            // 키와 밸류를 String으로 강제한 컬렉션이다.
                                            // 문자열을 저장할 때 ISO 8859-1 문자셋으로 저장해야 한다.
                                            // 한글은 유니코드로 자동으로 변환되어 저장된다.

        map.put("홍길동", "대한민국");
        map.put("James", "Amarica");

        System.out.println(map);
    }
}