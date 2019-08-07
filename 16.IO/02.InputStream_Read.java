package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class InputStream_Read
{
    public static void main(String[] args) throws Exception // 입출력을 위해서 예외처리를 해줘야 한다.
    {
        //InputStream inputStream = new FileInputStream("C:\\Users\\nongsang\\Documents\\JavaProject\\src\\Java\\test.txt");  // 파일과 스트림을 연결한다.
                                                                                                                              // 텍스트 파일을 바이트로 읽어서 출력하기 위해서다.
                                                                                                                              // '\\'로 디렉토리를 구분한다.
        InputStream inputStream = new FileInputStream("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt");     // '/'로 디렉토리를 구분할 수 있다.

        // 1. int InputStream.read()
        while (true)
        {
            int readByte = inputStream.read();  // InputStream에 연결된 파일을 바이트로 읽어서 반환
            if(readByte == -1) break;           // 만약 파일의 끝까지 갔으면 탈출
            System.out.println(readByte);       // 읽은 데이터를 출력
                                                // read()는 문자를 읽어서 ASCII에 따라 정수형으로 반환한다.
        }
        inputStream.close();    // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        inputStream = new FileInputStream("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt"); // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 축약형
        int readByte;
        while( (readByte = inputStream.read()) != -1 )
        {
            System.out.println((char)readByte); // 강제형변환으로 반환된 정수를 문자로 변환하여 출력한다.
        }
        inputStream.close();    // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        inputStream = new FileInputStream("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt"); // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 2. int InputStream.read(byte[] b)
        String data = "";   // 파일에서 읽은 데이터를 문자열로 출력하기 위한 변수
                            // 초기화되지 않은 변수는 사용할 수 없다.
                            // ""를 초기값으로 설정하는 이유는 null을 저장하면 null이라는 문자열이 저장되기 때문이다.
                            // data에 데이터를 누적해서 저장하기 때문에 null 문자열 뒤에 읽어들인 데이터가 저장된다.
        while(true)
        {
            int readByteNum;
            byte[] readBytes = new byte[3];
            readByteNum = inputStream.read(readBytes);  // InputStream에 연결된 파일을 readBytes 크기만큼씩 읽고, readBytes에 저장한다.
                                                        // 읽기에 성공한 갯수를 readByteNum에 저장한다.
            if(readByteNum == -1) break;
            System.out.println(readByteNum);    // InputStream에 연결된 파일에는 4개의 문자가 있고 3개씩 읽었기 때문에 3 1이 출력된다.

            data += new String(readBytes, 0, readByteNum);  // readBytes에 저장된 데이터를 0부터 readByteNum 값만큼 읽어서 data에 누적하여 저장한다.
        }
        System.out.println(data);   // 데이터 출력
        inputStream.close();    // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.

        inputStream = new FileInputStream("C:/Users/nongsang/Documents/JavaProject/src/Java/test.txt"); // 파일을 닫아줬으니 다시 사용하려면 연결해줘야 한다.

        // 3. int InputStream.read(byte[] b, int offset, int length)
        int readByteNum;
        byte[] readBytes = new byte[8];
        readByteNum = inputStream.read(readBytes, 2, 2);    // InputStream에 연결된 파일을 2 크기만큼 읽고, 2번 인덱스부터 readBytes에 저장한다.
                                                                    // 읽기에 성공한 갯수를 readByteNum에 저장한다.
        for (var elem : readBytes)
        {
            System.out.println(elem);
        }
        inputStream.close();    // 스트림 사용이 끝나면 스트림을 닫아줘야 한다.
    }
}