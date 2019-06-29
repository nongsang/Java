package Java;

class Hard_Disk_Drive   // 하드디스크 클래스
{
    class Platter       // 인스턴스 멤버 클래스로 플래터 정의
    {
        Platter() {}    // 생성자 정의 가능

        private int saveData;   // 필드 정의 가능
                                // 접근제어자 선언 가능

        static int page;    // static 필드 불가능

        void Spin()     // 메서드 정의 가능
        {
            System.out.println("돈다");
        }

        static void Save()  // static 메서드 정의 불가능
        {
            System.out.println("저장한다.");
        }
    }
}

public class Instance_Member_Class
{
    public static void main(String[] args)
    {
        Hard_Disk_Drive HDD = new Hard_Disk_Drive();    // 하드디스크 생성

        Hard_Disk_Drive.Platter platter = HDD.new Platter();    // 플래터는 하드디스크안에 있는 부품이다.
                                                                // 따라서 이미 생성된 하드디스크에서 플래터를 생성한다.

        platter.Spin();         // 플래터가 돌면서
        platter.saveData = 30;  // 플래터에 데이터가 저장된다.
                                // 하지만 private이므로 직접접근 불가능
    }
}