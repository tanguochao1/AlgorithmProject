package 其他;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AauthTest /*implements InvocationHandler*/ {

//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return null;
//    }


    public static boolean foo(char a) {
        System.out.print(a);
        return true;

    }

    /**
     * for循环的一些疑问
     *
     * @param args
     */
    //abdbcdcb
    public static void main(String[] args) {
        int i = 0;
        for (foo('a'); foo('b') && (i < 2); foo('c')) {
            i++;
            foo('d');
        }
    }
}
