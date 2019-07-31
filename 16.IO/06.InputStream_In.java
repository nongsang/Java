package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class InputStream_In
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        InputStream inputStream = System.in;    // 키보드 입력을 받을 수 있다.
                                                // System.in은 InputStream 타입의 입력스트림이다.

        char data1 = (char)inputStream.read();   // 문자 1개를 키보드로부터 읽어서 inputChar에 저장
        System.out.println(data1);

        inputStream.skip(1);    // 1 바이트 만큼 데이터를 스킵
                                  // 키보드 입력을 받은 후 버퍼에는 \n이 남아 있으므로 이후 키보드 입력을 받을 때 입력으로 인식할 수 있다.
                                  // 따라서 \n, 1 바이트만 무시해주면 다시 입력받을 수 있다.

        byte[] data2 = new byte[100];           // read()는 1 바이트씩 읽으므로 한글을 저장하려면 배열로 받아야 한다.
        int bytes = inputStream.read(data2);    // 키보드 입력을 받아 data2에 저장
                                                // ASCII로 입력받아 1 바이트씩 입력되지만 한글은 유니코드로 3 바이트씩 입력받는다.
        //String string = new String(bytesData, 0, bytes-2);    // 순수하게 문자열 내용만 저장하려면 -2를 해야했다.
                                                                // 문자열을 입력하면 뒤에 자동으로 '캐리지리턴 + 라인피드'가 입력되면서 2 바이트가 추가로 저장됬다.
        String string = new String(data2, 0, bytes-1);  // Java 12 기준 '캐리지리턴 + 라인피드'를 1 바이트로 인식하므로 -1만 하면 된다.
        System.out.println(string);

        inputStream.skip(1);

        byte[] data3 = new byte[100];
        inputStream.read(data3);
        System.out.println(new String(data3));  // data3의 데이터를 String을 생성하면서 저장하여 출력한다.
                                                // '캐리지리턴 + 라인피드'도 같이 저장되니 주의

        inputStream.skip(1);

        String data4 = null;
        inputStream.read(data4);    // read()는 String 변수를 사용할 수 없다.
    }
}