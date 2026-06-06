package Day1;

public class topic13 {
    public static void main(String[] args) {
        int[] num = { 10, -5, 3, -8, 7 };

        int possitive = 0;
        int negative = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                possitive++;
            }
            if (num[i] < 0) {
                negative++;
            }
        }
        System.out.println(possitive);
        System.out.println(negative);
    }
}

// find this arr how much negative value and how much possitive value also
//  firtt creat a class to  whicjh name is Also we creart class in main ke undr int array creat kiya num name se 
// fir int possitive &int negative doni ki value zero dege tha web go for loop and the namwe of loop is for loop
// int i =0 ; i < num.length; i++;
// than in for loop we need to cheak come condation (num[i] >0){
// than possitive++ }  
// and usi for loop me hi eek aur condation jayevaga to cheak num(num[i]< 0){
// negative++;
// than print krwa diya possitivr  
// and negative also/
// }
