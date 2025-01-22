//import java.util.Random;
import java.lang.Math;

public class Activity1 {
    public static void main(String[] args) {
        int[] id = {9, 8, 7, 6, 5, 4, 3};
        //Random random = new Random();
        //double x = random.nextInt( 0,  100);

        double Old, New;

        for(int x=0; x<=50; x++){
            Old = x;
            boolean flag = false;

            int iterations = 2000;

            int count = 0;

            while(flag == false){
                double fun = function(x, id);
                double pr = prime(x, id);
            
                New = Old - fun/pr;

                if (Math.abs(New - Old) < 0.00001){
                    flag = true;
                    if (function(New, id) == 0){
                        System.out.println("The root is: " + New);
                        System.out.println("Found in " + count + " iterations");
                        System.out.println("Function value at root: " + function(New, id));
                    }
                    else{
                        System.out.println("Not Found");
                    }
                }
                if (count == iterations){
                  flag = true;
                  System.out.print("Initial x: " + x);
                  System.out.print(" Not Found");
                  System.out.print(" After " + iterations + " iterations");
                  System.out.print(" Old: " + Old);
                  System.out.print(" New: " + New);
                  System.out.println("\n");
                }

                Old = New;

                count++;
            }
        }
        System.out.println("Tested 50 times");
    }

    public static double solve(double x, double fun, double pr){
        double New = x - (fun/pr);
        return New;
    }

    public static double function(double x, int[] id){
        double result = (id[0] * Math.pow(x, 6)) - (id[1] * Math.pow(x, 5)) + (id[2] * Math.pow(x, 4)) - (id[3] * Math.pow(x, 3)) + (id[4] * Math.pow(x, 2)) - (id[5] * x) + id[6];
        return result;
    }

    public static double prime(double x, int[] id){
        double result = (6 * id[0] * Math.pow(x, 5)) - (5 * id[1] * Math.pow(x, 4)) + (4 * id[2] * Math.pow(x, 3)) - (3 * id[3] * Math.pow(x, 2)) + (2 * id[4] * x) - id[5];
        return result;
    }
}