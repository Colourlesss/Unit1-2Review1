
public class sumOfFibonacci
{
    public static void main(String[] args){
        int v1 = 0;
        int v2 = 1;
        int current = v1+v2;
        int sum = 0;
        while(current<=4000000){
            if(current%2==0){
                sum+=current;
            }
            v1 = v2;
            v2 = current;
            current = v1 + v2;
        }
        System.out.println(sum);
    }
}
