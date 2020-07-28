package 其他;

public class YiHuo {
    public static void main(String[] args) {
        /*
        不使用第三个变量做变量转换（用异或符）
        *
         ^是异或运算符，异或的规则是转换成二进制比较，相同为0，不同为1.
        一个数a与另一个数b异或的结果等于a^b，用结果（ a^b)异或a，就会得到b；
        上面的结果，我们用代码来验证。代码( a=a^b; b=a^b; a=a^b;)可以转换成这样。
        int c=a^b ; ------------ 01=10^11 得到结果C（ a^b)
        b=c^b; ------------ 10=01^11 用结果（ a^b)异或a，就会得到b；
        a=c^a; -------------11=01^10 用结果（ a^b)异或b，就会得到a；*/
        int a = 2;
        int b = 3;
        a = a ^ b;//a=1,b=3
        b = a ^ b;//a=1,b=2
        a = a ^ b;//a=3,b=2
        System.out.println("a=" + a + ",b=" + b);
    }
}
