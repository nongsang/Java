package Java;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

public class Directory_Stream
{
    public static void main(String[] args)
    {
		Path path = Paths.get("C:\\Users\\nongsang\\Documents\\JavaProject\\src\\Java");	// NIO에 있는, 파일이 있는 경로를 전달해주는 객체

		try
		{
			Stream<Path> stream = Files.list(path);	// path에 있는 디렉토리의 이름을 가져와서 스트림과 연결해준다.
													// 파일을 다루는 것은 항상 예외가 발생할 수 있으므로 예외처리를 해준다.
			stream.forEach(p -> System.out.println(p.getFileName()));	// 스트림에 있는 디렉토리의 이름을 출력
			stream.close();
		}
		catch (Exception e) {}
    }
}