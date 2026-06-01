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
