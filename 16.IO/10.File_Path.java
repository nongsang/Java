package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공
import java.util.*; // Date 클래스를 사용하기 위해 임포트
import java.text.*; // 텍스트 포멧을 사용하기 위해 임포트

public class File_Path
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        //File dir = new File("C:\\Users\\nongsang\\Documents\\JavaProject\\src\\Java");    // 디렉토리 경로를 설정
                                                                                            // '\\'로 디렉토리를 구분해줄 수 있다.
        File dir = new File("C:/Users/nongsang/Documents/JavaProject/src/Java");    // '/'로 디렉토리를 구분해줄 수 있다.

        if(dir.exists() == false)   // 디렉토리가 존재하지 않는다면
        {
            dir.mkdirs();   // 디렉토리들을 생성한다.
        }

        File file = new File("C:/Users/nongsang/Documents/JavaProject/src/Java/Test.txt");  // 디렉토리 뿐만 아니라 파일이 있는 경로를 설정할 수 있다.

        if(dir.exists() == false)   // 파일이 존재하지 않는다면
        {
            file.createNewFile();   // 파일을 생성한다.
        }

        File temp = new File("C:/Users/nongsang/Documents/JavaProject");
        File[] contents = temp.listFiles(); // 경로에 있는 파일들을 반환한다
        System.out.println("   날짜          시간        형태     크기     이름");
        System.out.println("----------------------------------------------------");
        /*for(var elem : contents)
        {
            System.out.println(new Date(elem.lastModified()));  // 파일의 마지막 수정 날짜를 출력
        }*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd    a HH:MM");  // 포멧을 설정
        for(var elem : contents)
        {
            System.out.print(simpleDateFormat.format(new Date(elem.lastModified())));  // 포멧에 맞추어 마지막 수정 날짜를 출력
            if(elem.isDirectory())  // 디렉토리라면
            {
                System.out.print("\t<DIR>\t\t\t" + elem.getName()); // 파일 이름만 출력
            }
            else    // 일반 파일이라면
            {
                System.out.print("\t\t\t  " + file.length() + "\t\t" + file.getName()); // 파일 크기와 파일 이름을 출력
            }
            System.out.println();
        }
    }
}