import java.io.*;
public class BinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("c:\\Temp\\srcimg.jpg"); // 원본 파일 경로명
		File dest = new File("c:\\Temp\\copyimg.jpg"); // 복사 파일 경로명

		long start = System.currentTimeMillis(); // 현재 시간
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // 파일 입력 바이트 스트림 생성
			FileOutputStream fo = new FileOutputStream(dest); // 파일 출력 바이트 스트림 생성
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			long end = System.currentTimeMillis();	// 복사 완료 시간
			double seconds = (end-start)/1000.0; // 복사에 걸린 시간(초 단위)
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
			System.out.println("복사 시간은 " + seconds + "초입니다.");			
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}