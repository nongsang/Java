package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class Reader_read
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        Reader reader = new FileReader("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");  // 파일과 스트림을 연결한다.

        // 1. int Reader.read()
        while(true)
        {
            int readData = reader.read();   // Reader에 연결된 파일을 문자로 읽어서 반환
            if(readData == -1) break;       // 만약 파일의 끝까지 갔으면 탈출
            System.out.println(readData);   // 읽은 데이터를 출력
                                            // read()는 문자를 읽어서 ASCII에 따라 정수형으로 반환한다.
        }
        reader.close();     // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        reader = new FileReader("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 축약형
        int readData;
        while((readData = reader.read()) != -1)
        {
            System.out.println((char)readData); // 강제형변환으로 반환된 정수를 문자로 변환하여 출력한다.
        }
        reader.close();     // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        reader = new FileReader("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 2. int Reader.read(char[] b)
        String data = "";   // 파일에서 읽은 데이터를 문자열로 출력하기 위한 변수

        while(true)
        {
            int readCharNum;
            char[] cbuf = new char[2];
            readCharNum = reader.read(cbuf);    // Reader에 연결된 파일을 cbuf 크기만큼씩 읽고, cbuf에 저장한다.
                                                // 읽기에 성공한 갯수를 readCharNum에 저장한다.
            if(readCharNum == -1) break;
            System.out.println(readCharNum);    // Reader에 연결된 파일에는 3개의 문자가 있고 2개씩 읽었기 때문에 2 1이 출력된다.

            data += new String(cbuf, 0, readCharNum);  // cbuf에 저장된 데이터를 0부터 readCharNum 값만큼 읽어서 data에 누적하여 저장한다.
        }
        System.out.println(data);   // 데이터 출력
        reader.close();     // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        reader = new FileReader("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 3. int Reader.read(byte[] b, int offset, int length)
        int readCharNum;
        char[] cbuf = new char[4];
        readCharNum = reader.read(cbuf, 1, 2);  // Reader에 연결된 파일을 2개의 문자를 읽고, 1번 인덱스부터 readCharNum에 저장한다.
                                                        // 읽기에 성공한 갯수를 readCharNum에 저장한다.
        for (var elem : cbuf)
        {
            System.out.println(elem);   // elem이 char형이므로 char형으로 출력된다.
        }
        reader.close();    // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.
    }
}