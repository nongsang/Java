package Java;   // Java 패키지 내부에 있는 코드라는 의미
                // 다른 패키지에서 이 코드를 실행하려고 하면 컴파일 오류
                // C++, C#의 namespace와 같은 의미지만 자바에서는 실제 폴더로 구분

import JavaTest.Test;   // JavaTest 패키지에 있는 Test 클래스를 사용
                        // 실제 JavaTest 패키지와 Test라는 자바 코드가 존재해야한다.
import JavaTest.*;      // JavaTest 패키지에 있는 특정 클래스가 아니라 모든 클래스를 사용한다는 의미

public class Package
{
    public static void main(String[] args)
    {
        Test test = new Test(); // 자바 코드 자체를 클래스처럼 사용
    }
}