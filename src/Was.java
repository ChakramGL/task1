import java.util.Scanner;

public class Was {
    public static void Was(){
        int k = 0;
        int count = 1;
        int lineQuantity = 0;
        String line;
        System.out.println ("Input line quantity: ");
        Scanner sc = new Scanner (System.in);
        if(sc.hasNextInt()){
            lineQuantity = sc.nextInt();
    }
        for ( int i = 0; i < lineQuantity; i++){
            count++;
            System.out.println ("Input line: ");
            Scanner sx = new Scanner (System.in);
            if(sx.hasNext()){
                line = sx.next();
        String strs[] = {line};

        System.out.println("Original array: ");
        for (String s: strs){
            System.out.println(s + " ");

        }
        System.out.println("\n");
        strs[1] = "was";
        strs[3] = "test, too!";
        System.out.println("Modified array: ");
        for (String s : strs){
            System.out.println(s + " ");
        }

    }}}}


