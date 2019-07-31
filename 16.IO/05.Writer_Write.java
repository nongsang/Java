package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class Writer_Write
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        Writer writer = new FileWriter("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");  // 파일과 스트림을 연결한다.

        // 1. void Writer.write(int c)
        char[] data1 = "홍길동".toCharArray();    // 문자열의 각 문자의 유니코드를 얻어 저장
        for(var elem : data1)
        {
            writer.write(elem);   // 2 바이트씩 writer에 연결된 파일에 덮어쓴다.
        }
        writer.flush(); // Writer의 출력버퍼에 남은 공간이 있으면 파일에 출력이 안되는 경우가 있다.
                        // 따라서 강제적으로 출력버퍼를 비워줄 필요가 있다.
        writer.close(); // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        writer = new FileWriter("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 2. void Writer.write(char[] cbuf)
        char[] data2 = "홍길동".toCharArray(); // 문자열의 각 문자의 바이트를 저장
        writer.write(data2);    // data2를 한번에 writer에 연결된 파일에 덮어쓴다.
                                // 전달할 데이터가 많다면 효율적일 수 있다.
        writer.flush();
        writer.close();

        writer = new FileWriter("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 3. void Writer.write(char[] cbuf, int offset, int length)
        char[] data3 = "홍길동".toCharArray(); // 문자열의 각 문자의 바이트를 저장
        writer.write(data3, 1, 2);    // data3를 1번 인덱스부터 2 크기만큼 한번에 writer에 연결된 파일에 덮어쓴다.
        writer.flush();
        writer.close();

        writer = new FileWriter("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 4. void Writer.write(String str)
        String data4 = "자바 프로그래밍";
        writer.write(data4);    // data4를 한번에 writer에 연결된 파일에 덮어쓴다.
        writer.flush();
        writer.close();

        writer = new FileWriter("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 5. void Writer.Write(String str, int offset, int length)
        String data5 = "자바 프로그래밍";
        writer.write(data5, 0, 2);  // data5를 0번 인덱스부터 2 크기만큼 한번에 writer에 연결된 파일에 덮어쓴다.
        writer.flush();
        writer.close();
    }
}