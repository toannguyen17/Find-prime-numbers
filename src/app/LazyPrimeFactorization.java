package app;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 2;
        while (count < 1000){
            if (count == 2){
                show(count);
            }else{
                boolean check = true;
                for (int i = 2; i < count; i++){
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
