package Java;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.*; // 컬렉션을 사용하려면 java.util을 임포트 해야한다.

public class Properties_Path
{
    public static void main(String[] args)
    {
        Properties map1 = new Properties();  // Map<> 계열 컬렉션 중 하나인 Properties다.
                                            // 키와 밸류를 String으로 강제한 컬렉션이다.
                                            // 문자열을 저장할 때 ISO 8859-1 문자셋으로 저장해야 한다.
                                            // 한글은 유니코드로 자동으로 변환되어 저장된다.

        map1.put("홍길동", "대한민국");
        map1.put("James", "Amarica");

        System.out.println(map1);


        Properties map2 = new Properties();
        // ~.properties라는 파일을 읽어들일 때 사용할 수 있다.
        // 데이터베이스와 연결해주는 정보가 있는 파일이라고 보면 된다.
        String path = PropertiesExample.class.getResource("database.properties").getPath(); // 경로를 구한다.

        path = URLDecoder.decode(path,"utf-8"); // 경로 문자열을 UFT-8 포멧에 맞춰서 변환후 다시 저장
        map2.load(new FileReader(path));    // 경로에 있는 파일을 읽어서 Properties에 저장

        String driver = map2.getProperty("driver");   // properties 파일에 있는 driver 변수에 있는 문자열을 가져온다.
    }
}