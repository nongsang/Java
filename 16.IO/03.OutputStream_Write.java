package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class OutputStream_Write
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        OutputStream outputStream = new FileOutputStream("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");  // 파일과 스트림을 연결한다.

        // 1. void OutputStream.write(int b)
        byte[] data1 = "ABC".getBytes();    // 문자열의 각 문자의 바이트를 얻어 저장
        for(var elem : data1)
        {
            outputStream.write(elem);   // 1 바이트씩 outputStream에 연결된 파일에 덮어쓴다.
        }
        outputStream.flush();   // outputStream의 출력버퍼에 남은 공간이 있으면 파일에 출력이 안되는 경우가 있다.
                                // 따라서 강제적으로 출력버퍼를 비워줄 필요가 있다.
        outputStream.close();   // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        outputStream = new FileOutputStream("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");   // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 2. void OutputStream.write(byte[] b)
        byte[] data2 = "ABC".getBytes();    // 문자열의 각 문자의 바이트를 저장
        outputStream.write(data2);          // data2를 한번에 outputStream에 연결된 파일에 덮어쓴다.
                                            // 전달할 데이터가 많다면 효율적일 수 있다.
        outputStream.flush();
        outputStream.close();

        // 3. void OutputStream.write(byte[] b, int offset, int length)
        byte[] data3 = "ABC".getBytes();    // 문자열의 각 문자의 바이트를 저장
        outputStream.write(data3, 1, 2);    // data3를 1번 인덱스부터 2 크기만큼 한번에 outputStream에 연결된 파일에 덮어쓴다.
        outputStream.flush();
        outputStream.close();
    }
}