package bai6;

public class SumArray {
    public static int Sum(int a[], int n){
        int S,i;
        if(n==0)    return -1;
        S=0; i=0;
        while(i<n){
            S=S+a[i];
            i++;
        }
        return S;
    }
}
