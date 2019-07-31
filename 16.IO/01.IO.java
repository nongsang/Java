package Java;

import java.io.*;   // 자바의 기본적인 데이터 입출력 API 제공

public class IO
{
    public static void main(String[] args)
    {
        File file = null;   // 파일 시스템의 파일 정보를 얻기위한 클래스

        Console console = null; // 콘솔로부터 문자를 입출력하기 위한 클래스

        // 바이트 단위 입출력을 위한 최상위 입출력 스트림 추상클래스
        InputStream inputStream = null;
        OutputStream outputStream = null;

        // 바이트 단위 입출력을 위한 하위 스트림 클래스
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        PrintStream printStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        // 문자 단위 입출력을 위한 최상위 입출력 스트림 추상클래스
        Reader reader = null;
        Writer writer = null;

        // 문자 단위 입출력을 위한 하위 스트림 클래스
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter= null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
    }
}