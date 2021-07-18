import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */

    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
        ArrayList list=new ArrayList();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        int num1=0;
        int num2=0;
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1);
        for (int i = 0; i < 1; i++) {
            
        }
        for (Object o : list) {
            
        }
    }

    public void method(){
        System.out.println("hello");
        System.out.println();
        System.out.println("HelloWorld.method");

    }
}
