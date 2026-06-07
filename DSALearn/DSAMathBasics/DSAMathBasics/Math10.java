public class Math10 {

        public static void main(String[] args) {
        // Defining Veriables
        int num1 = 143210;
        int num2 = 143210;

        //performing Substraction
        int ans = (num1*num2);
        // printing Output
        System.out.println(ans);   //OverFlow : aage kis ide se overflow

        int num3 = 5;
        int num4 = -1432863210;

        int anss = (num3*num4);

        System.out.println(anss);  //underFlow : from backside overflow

        int num5 = 15;
        int num6 = 3;

        int ansss = num5 * num6;
        System.out.println(ansss);
    }

}

// output is 
// OverFlow: -965732380
// underFlow: 1425618542
// 45
