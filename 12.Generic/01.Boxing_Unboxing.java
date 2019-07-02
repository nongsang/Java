package Java;

class Box
{
    private Object object;      // 어떤 값이든 받을 수 있는 자료형인 Object형
    public Object getObject()   // 반환형이 Object다.
    {
        return this.object;
    }
    public void setObject(Object o) // 매개변수도 Object로 사용해서 어떤 자료형이든 받을 수 있다.
    {
        this.object = o;
    }
}

public class Boxing_Unboxing
{
    public static void main(String[] args)
    {
        Box box1 = new Box();
        box1.setObject("바보");   // "바보"라는 문자열을 저장한다.
        String string1 = (String)box1.getObject();      // getObject()는 Object형을 반환하므로 사용할 수 있는 자료형으로 강제형변환을 해야한다.
        String string2 = box1.getObject().toString();   // 문자열로 바꿔서 쓰려면 쉽게 toString()을 사용하면 된다.

        Box box2 = new Box();
        box2.setObject(123);    // 123이라는 정수를 저장한다.
                                // 123은 값형식이며, Object형은 참조형식이다.
                                // 모든 자료형은 Object형을 상속받아서 구현되어 있으므로 저장할 수는 있다.
                                // 하지만 값형식과 참조형식의 데이터 처리 방식에는 차이가 있으므로 값형식 데이터를 참조형식 데이터로 바꾸는 오버헤드가 발생한다.
                                // 이를 박싱(Boxing)이라고 한다.
                                // 반대로 참조형식 데이터를 값형식 데이터로 바꾸는 작업을 언박싱(Unboxing)이라고 한다.
        String string3 = (String)box2.getObject();      // 123은 정수이므로 String으로 강제형변환하면 예외가 발생한다.
        String string4 = box2.getObject().toString();   // 정수를 문자열로 사용하려면 toString()으로 변환해줘야 한다.
    }
}