import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args){

        int i = 0;
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.print("Numero:" );
            String entrada = scan.next();
            int numero = Integer.parseInt(entrada);
            i++;

        //if (numero) {}

            if(numero == -1){
                System.out.print("Qtd:" + i);
                break;
            }
        }
        

    }

}
