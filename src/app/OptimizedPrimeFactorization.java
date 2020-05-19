package app;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 2;
        while (count < 1000){
            if (count == 2){
                show(count);
            }else{
                boolean check = true;
                int nextTo = (int) Math.sqrt(count);
                for (int i = 2; i <= nextTo; i++){
                    if (count%i == 0){
                        check = false;
                        break;
                    }
                }
                if (check){
                    show(count);
                }
            }
            count++;
        }
    }
    public void show(int i){
        System.out.println(i);
    };
}
