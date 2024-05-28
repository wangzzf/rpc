import java.util.Hashtable;
import java.util.LinkedHashSet;

public class Demo2 {

    public static void main(String[] args) {

//        Child child = new Child();
//        new StringBuffer()

//        Child instance = Child.getInstance();
//        System.out.println(instance.toString());
//
//        Child instance2 = Child.getInstance();
//        System.out.println(instance2.toString());

//        String str = "";
//        for (int i = 0; i < 10; i++) {
//            str += "1";
//        }
//        String str = "abc";
//        String str2 = str.intern();
//
//        String str3 = new String("abc");
//        String str4 = str3.intern();
//
//        System.out.println(str == str2);

//        String str = String.valueOf(11); // 只会在堆中创建对象，不会在字符串常量池中创建对象
//
//        // intern 方法，如果字符串常量池中没有该字符串对象引用地址，那么就创建一个堆中字符串的引用地址。并且返回的是字符串常量值中的地址，也就是堆中的字符串对象地址
//
//        String str2 = "11"; // 使用当前字符串和字符串常量池中记录的堆中的字符串地址引用做equals比较，如果有就相同，因为equals比较的是内容
//
//        System.out.println(str == str2); // 显然这里字符串常量池中没有引用 所以为false
//

        String s1 = "abc";

        String s3 = s1.intern();

        String s2 = new String("abc");

        System.out.println(s1 == s2);

        System.out.println(s1 ==s3);

        Hashtable

    }
}
