package my.com;//패키지 선언문
import java.lang.System;//import 패키지명.클래스명;
import java.util.Date;

//클래스 선언문: 클래스명과 파일명은 동일하게
public class Hello
{
    //main()메서드
    public static void main(String[] args)
    {
        System.out.println("Hello Java?");
        System.out.print("안녕? ");
        System.out.print("자바~");
        System.out.println("The End~~");
        
        Date today = new Date();
        System.out.println(today);
    }//main()-----------------------------

}//class----------------------------------
//Hello.java (원시코드)
//[1] 컴파일 : javac -encoding utf-8 -d . Hello.java 
//==> my/com/Hello.class (클래스파일, 바이트코드 : JVM이 해석할 수 있는 코드)
//[2] 인터프리터로 실행
