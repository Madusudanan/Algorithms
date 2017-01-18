package euler;


public class Euler2 {

    public static void main(String[] args) {


        long range = 0;

        long sum = 0;


        while (fibo_iter(range)<=4000000){
            if(fibo_iter(range)%2==0){
                sum = sum + fibo_iter(range);
            }

            range++;
        }


        System.out.println(sum);


    }

    public static long fibo_iter(long n)
    {
        long x, y, z;

        if(n == 0)
            return 1;

        else
        {
            x = 0;
            y = 1;
            for(long i = 0; i <= n; i++)
            {
                z = x + y;
                x = y;
                y = z;
            }

            return y;

        }
    }
}

