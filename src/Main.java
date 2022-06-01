public class Main {

    public static void main(String[] args) {
        String author = "Lorand";
        int x = 2;
        int y = 4;
        double z = 73;
        int sum = x+y;
        double div = z/y;
        int a = -5+8*6;
        float b = (55+9)%9;
        int c = 20+(-3*5)/8;
        double d = 5+((15/3)*2)-8%3;

        System.out.println(
                "Hello,\n"+author+"\n2.The addition of 2 and 4 is: "+sum
                +"\n3.The division of 73 by 4 is: "+div
                +"\n4.a: "+a+"\n4.b "+b+"\n4.c "+c+"\n4.d "+d
        );


    }

}
