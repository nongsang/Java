package Java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

public class Hello_World
{
    public static void main(String[] args)
    {
		Path path = Paths.get("src/data.txt");	// NIO에 있는, 파일이 있는 경로를 전달해주는 객체
		Stream<String> stream;

		// Files.lines()로 읽는 방법
		try
		{
			stream = Files.lines(path, Charset.defaultCharset());	// NIO에 있는, path에 있는 파일을 어떤 문자셋으로 읽을 것인지 알려주는 메서드
																	// 파일을 읽는 행위는 중간에 끊어질 때 위험할 수 있으므로 예외처리를 한다.
			stream.forEach(System.out::println);
			stream.close();
		}
		catch (Exception e) {}

		// BufferedReader의 lines()로 읽는 방법
		File file = path.toFile();		// path로 부터 파일을 얻어낸다.
		try
		{
			FileReader fileReader = new FileReader(file);	// 파일 읽기 객체를 생성하고 파일로부터 읽기
			BufferedReader bufferedReader = new BufferedReader(fileReader);	// 파일 읽기 객체에 연결된 파일로 부터 읽어서 버퍼에 저장한다.
			stream = bufferedReader.lines();		// 버퍼리더의 스트림을 얻어서
			stream.forEach(System.out::println);	// 출력
			stream.close();
		}
		catch (Exception e) {}
	}
}