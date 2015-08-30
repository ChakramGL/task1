import java.util.Scanner;

public class Task {

    public static void Task(){
        int k = 0;
        int count = 1;
        System.out.println("Input line quantity: ");
        Scanner sc = new Scanner (System.in);
        int lineQuantity = 0, array[];
        if(sc.hasNextInt()){
            lineQuantity = sc.nextInt();
        }
        array = new int[lineQuantity];
        for ( int i = 0; i < lineQuantity; i++){
            count++;
            System.out.println("Input line: ");
            Scanner sx = new Scanner(System.in);
            String line = "1";
            if(sx.hasNext()){
                line = sx.next();
                k = line.length();
                System.out.println("Line number " + (i+1) + " is " + line +  " " + k);
            }
        }


        /*array2[lineQuantity] = k;
        for ( int i = 0; i < array.length-1; i++){
            for (int j = i + 1; j < array.length - 1; j++){
                if (array2[j])
            }*/

        }

        //for ( int i = 0; i < array.length; i++){

        }
        //System.out.println(lineQuantity);


