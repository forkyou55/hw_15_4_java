public class hwJava {
        public static void main(String[] args) {
            boolean meaning = true;
            byte aByte;// 8 бит (-128/127)
            short aShort; // 16 бит (-32768/32767)
            int aInt; // 32 бит (-2147483648 ; 2147483647)
            long aLong; // 64 бит (-9223372036854775808 ; 9223372036854775807)
            float aFloat; // 32 бит (3.4e-38 ; 3.4e+38)
            double aDouble; // 64 бит (1.7e-308 ; 1.7e+308)
            char aChar; // 16 бит (0 ; 65535)

            // int x = 33333333333333; превышение диапазона int
            // char y = 1111111111; превышение диапазона char

            // Операторы математические + - * / %
            // Операторы условные > < >= <= == != !
            // Операторы логические && - И" || - "ИЛИ"

            int a = 5;
            int b = 10;

            double c = 2.5;
            double d = 4.5;

            System.out.println(a>b);
            System.out.println(a*b);
            System.out.println(a-b);
            System.out.println(a+c);
            System.out.println(b/d);

        /* приоритет операторов
        1 ++ -- !
        2 * / %
        3 + -
        4 < <= > >=
        5 == !=
        6 && || */

            double e = ++a*b + c ;

            System.out.println(e);



        }
}

