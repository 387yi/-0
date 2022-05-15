package text_5_15;

import java.util.Scanner;

public class xuexi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个整数");
        int a=sc.nextInt();
        System.out.println("输入第二个整数");
        int b=sc.nextInt();
        int c=daxiao(a,b);
        System.out.println(c);
    }
    public static int daxiao(int a,int b)
    {
        return a>b?a:b;
    }
}
