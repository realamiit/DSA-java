package DSA.Day1.practice;

public class printStudentsMarks {
    public static void main(String[] args) {
        int[] arr = { 88, 89, 74, 80, 78, 94 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student " + (i+1) + " ka marks " + arr[i]);
        }
    }

}

// complexity 
// Time: O(n) 
// Space: O(1)