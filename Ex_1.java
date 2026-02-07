import java.util.Scanner;
/*
Você precisa desenvolver um sistema que permita o usuário digitar vários números inteiros, 
positivos ou negativos. Ao final, quando o usuário digita o valor -1, o programa deve calcular e 
exibir: 
    ○ A quantidade de números digitados pelo usuário; 
    ○ O maior número digitado; 
    ○ O menor número digitado; 
    ○ A média dos números digitados; 
Para esse exercício você NÃO deve trabalhar com vetores ou ArrayList. 
*/
public class Ex_1 {
    public static void main(String[] args){

        float i = 0;
        float maior = 0;
        float menor = 0;
        float soma = 0;
        float media = 0;

        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite (parar = -1):" );
            String entrada = scan.next();
            float numero = Float.parseFloat(entrada);
            
            if(numero == -1){
                System.out.print("Quatidade de numeros digitados: " + i + " \n");
                System.out.print("Maior numero: " + maior + "\n");
                System.out.print("Menor numero: " + menor + "\n");
                System.out.printf("Media: %.2f\n", media);
                break;
            }
            i++;
            soma = soma + numero;
            media = soma/i;

            if(i == 1){
                maior = numero;
                menor = numero;
            }
            else{
                if (numero > maior){
                    maior = numero;
                }
                if(numero < menor){
                    menor = numero;
                }
            }



        }
        

    }

}
