/* 
Calcule a distância de Hamming entre duas cadeias de DNA. 
Seu corpo é feito de células que contêm DNA. Essas células se desgastam regularmente e 
precisam ser substituídas, o que elas conseguem ao se dividir em células-filhas. Na verdade, o 
corpo humano médio passa por cerca de 10 quatrilhões de divisões celulares durante a vida!

Quando as células se dividem, seu DNA também se replica. Às vezes, durante esse processo, 
ocorrem erros e pedaços únicos de DNA são codificados com as informações incorretas. Se 
compararmos duas cadeias de DNA e contarmos as diferenças entre elas, podemos ver quantos 
erros ocorreram. Isso é conhecido como "Distância de Hamming".

Lemos o DNA usando as letras C,A,G e T. Duas fitas podem se parecer com isso: 
   
G A G C C T A C T A A C G G G A T 
C A T C G T A A T G A C G G C C T 
^   ^   ^     ^   ^         ^ ^  
Eles têm 7 diferenças e, portanto, a distância de Hamming é 7. 
*/

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        System.out.print("\nDNA (Padrão: A - 'adenosina' C - 'citosina' T - 'timina' G - 'guanina' |ATCG|) \n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Fita 1: ");
        String fita1 = scan.nextLine();
        fita1 = fita1.replace(" ", "");
        System.out.print("Fita 2: ");
        String fita2 = scan.nextLine();
        fita2 = fita2.replace(" ", "");

        int contDistancia = 0;
        Boolean diferenteLetra = true; // Essa variável foi criada somente para fazer um comparativo e não deixar imprimir informações de regras de negocios invalidos

        if (fita1.length() == fita2.length()) {
            for (int i = 0; i < fita1.length(); i++) {

                char letras1 = fita1.charAt(i);
                char letras2 = fita2.charAt(i);
                
                if ((letras1 != 'A' && letras1 != 'C' && letras1 != 'G' && letras1 != 'T') || (letras2 != 'A' && letras2 != 'C' && letras2 != 'G' && letras2 != 'T')) { 
                    diferenteLetra = false;
                    System.out.print("\nERROR - ALGUMA LETRA INCOMPATIVEL COM O PADRÃO DO DNA!\n\n");
                    break;
                }

                if (letras1 != letras2) {
                    contDistancia = contDistancia + 1;
                }
            }
            if (diferenteLetra == true) {
                System.out.print("\nA distância de Hamming é: " + contDistancia + "\n\n");
            }
            

        } else {
            System.out.print("\nERROR - Fitas com tamanhos diferentes!\n\n");
        }

    }
}
