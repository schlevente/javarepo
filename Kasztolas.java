public class Kasztolas{
    void main(){
        float lebego=1.23f;
        int i=1;
        double d=2.1d;
        char c='c';
        String str="alma";
        long l=123;
        short s=456;
        byte b=100;
        boolean bool = true;

        System.out.println(lebego);
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);
        System.out.println(l);
        System.out.println(s);
        System.out.println(b);
        System.out.println(bool);

        // konvertálás
        System.out.println(d); // eredeti double

        float doublebol = (float)d;
        System.out.println(doublebol);

        long floatbol = (long)doublebol;
        System.out.println(floatbol);

        int longbol = (int)floatbol;
        System.out.println(longbol);

        char intbol = (char)longbol;
        System.out.println(intbol);

        short charbol = (short)intbol;
        System.out.println(charbol);

        byte shortbol = (byte)charbol;
        System.out.println(shortbol);
    }
}
