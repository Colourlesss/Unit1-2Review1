
public class pythagTrio
{
    public static void main(String[] args){
        outerloop:
        for(int i = 1;i<=1000;i++){
            for(int j = 1;j<=1000-i;j++){
                    if(Math.pow(i,2)+Math.pow(j,2)==Math.pow(1000-i-j,2)){
                        System.out.println(i*j*(1000-i-j));
                        break outerloop;
                    }    
            }
        }
    }
}
