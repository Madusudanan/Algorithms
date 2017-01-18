package euler;


public class Euler1 {

    public static void main(String[] args) {

        //The input number
        int q = 1000;

        int sum = 0;

        for(int i=0;i<q;i++){
            if(i%3==0 || i%5==0){
                sum = sum+i;
            }
        }

        System.out.println(sum);


    }
}
