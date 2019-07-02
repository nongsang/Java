package Java;

class Product<T, K> // 2개 이상의 제너릭을 사용할 수 있다.
{
    private T kind;
    private K model;

    public T getKind()
    {
        return kind;
    }
    public K getModel()
    {
        return model;
    }

    public void setKind(T kind)
    {
        this.kind = kind;
    }
    public void setModel(K model)
    {
        this.model = model;
    }
}

interface inter1<T>{}       // 인터페이스도 제너릭 사용가능
interface inter2<T, K>{}    // 제너릭을 여러개 사용할 수 있다.

public class Multi_Type_Parameter
{
    public static void main(String[] args)
    {
        Product<Integer, String> product1 = new Product<Integer, String>();

        Product<Integer, String> product2 = new Product<>();    // 자바 7 부터 뒤에 자료형을 알려주지 않아도 자동으로 할당이 된다.
    }
}