package Java;

class Car
{
    final static int PRODUCT_CODE = 1;  // final static은 상수를 의미한다.
                                        // 객체가 서로 공유하고 변하지 않는 값
                                        // 제품 분류코드 등을 나타낼 때 사용하면 된다.
                                        // 단어 모두 대문자로 사용하며, 단어가 2개 이상이면 _로 구분

    final static String PRODUCT_NAME = "람보르기니"; // 제품 이름도 바뀌지 않으며,
                                                    // 공유하는 이름이기 때문에 final static선언
    final int serialNum = 123;  // 시리얼 넘버는 제품마다 가지는 고유값이다.
                                // 변해서는 안되는 값이고,
                                // 공유하는 성질의 요소가 아니기 때문에 final로만 선언한다.

    String color = "검정";    // 차체 색은 도색으로 얼마든지 바뀔 수 있다.
    int maxSpeed = 300;      // 최대로 낼 수 있는 속도는 제품마다 차이가 있을 수 있다.
}

public class Constant
{
    public static void main(String[] args)
    {

    }
}