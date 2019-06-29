package Java;

class Hard_Disk_Drive   // 하드디스크 클래스
{
    static class Platter       // 정적 멤버 클래스로 플래터 정의
    {
        Platter() {}

        private int saveData;

        static int page;        // static 필드 정의 가능

        void Spin()
        {
            System.out.println("돈다");
        }

        static void Save()      // static 메서드 정의 가능
        {
            System.out.println("저장한다.");
        }
    }
}

public class Static_Member_Class
{
    public static void main(String[] args)
    {
        Hard_Disk_Drive HDD = new Hard_Disk_Drive();    // 하드디스크 생성할 수 있지만

        Hard_Disk_Drive.Platter platter = new Hard_Disk_Drive.Platter();    // 바로 멤버 클래스를 생성해도 된다.

        platter.Spin();     // 인스턴스화를 했으므로 호출 가능
        platter.Save();
        platter.saveData = 30;  // 인스턴스화를 했으므로 호출 가능하지만 private라 접근 불가
        platter.page = 3;

        Hard_Disk_Drive.Platter.Save();     // static 메서드이므로 인스턴스화 안해도 호출 가능
        Hard_Disk_Drive.Platter.page = 4;   // static 필드이므로 인스턴스화 안해도 호출 가능
    }
}