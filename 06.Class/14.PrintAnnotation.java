package Java;

/*import java.lang.annotation.ElementType;    // 어노테이션의 형식을 사용하려면 임포트
                                            // 필드, 메서드, 클래스 등등이 정의되어 있다.
import java.lang.annotation.Retention;      // 어노테이션을 적용할 때 유지 시간을 설정하기 위해 임포트
import java.lang.annotation.RetentionPolicy;// 어노테이션을 얼만큼 긴 시간동안 유지할 것인지 지정하기 위해 임포트
import java.lang.annotation.Target;         // 어노테이션이 적용되 타겟을 지정을 사용하려면 임포트
*/

import java.lang.annotation.*;  // 그냥 편하게 어노테이션 전부를 임포트해도 된다.

@Target(ElementType.METHOD) // 어노테이션 타겟은 어노테이션을 적용할 대상을 제한하는 기능이다.
                            // ElementType 중 메서드에만 적용하겐다는 의미다.
@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 유지되게끔 설정하는데, 실행하는 동안만 유지한다는 의미
public @interface PrintAnnotation   // @interface도 어노테이션이며, 있어도 그만, 없어도 그만인 인터페이스로 쓰겠다고 선언
{
    String value() default "-";
    int Num() default 10;
}
