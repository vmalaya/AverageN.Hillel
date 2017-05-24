import java.util.Scanner;

/**
 * Created by Валентина on 20.05.2017.
 */
public class Program {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of numbers");
        int size = scanner.nextInt();
        int[] Array = new int[size];
        System.out.println("Enter numbers");
        for(int i = 0 ; i<size; i++){
            Array[i] = scanner.nextInt();
        }
       Average(size, Array);

    }
    public static void Average( int size, int[] Array){
        double sum = 0;
        double avg;
        for(int i = 0; i<size;i++ ){
            sum = sum + Array[i];
        }
          avg = sum/size;
        System.out.println("Average is "+ avg);



    }
}
