public class p1 {

    void print(int n) {
        if (n == 0) // base case : bs yhi rokna hai
            return;
        print(n - 1);  // recursive function or call
        System.out.println(n);
    }
    public static void main(String[] args) {
        p1 obj = new p1(); // object bnaya method Static nhi hai
        obj.print(5);
    }
}

// first creat a class to oprate the function
// first we go and cheak and verify the base case if mtlb
// ydii (n==0)than the operatio will not executed
// and return nothing even clos the operation this is always repeat every time
// pehele print n= 5 0 nhi hai ko cal;l kiya kyuki prin (n-1) tha to print 4
// fir call n=4 0 nhi hai mtlb n ==0 nhi hai thats why we priint 3
// again call n=3 0 nhi h mtlb n ==0 not true than print 2
// again call n=2 0 nhi hia n=0 gthats why we return 1
// again call n = 1 0 nhi hai n==0 nhit true thqb=n also we
// get 1 output tha again it compare it with
// n=0 0 hai its true than go to return the base casre is executed
// mtlb return n = 0 its true than Stop !! and return it
// fir se wapis aaya print n= 1 than ec=xecuted and print 1
// again itrate is n=2 than its is also executed
// bexcause this is also not = to n ==0 than prrint 2
// again print n=3 than true tha n print 3
// n=4 true than print 4
// n= 5 it is also print 5 Cz same reason thats why it return and print 5
// ab fir yhi ktm ho jayega kyuiki hm logone n ki jo calue li tha vo 5 ke
// equal tha thats why return and operation is stop as well as;