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
        Scanner scan = new Scanner(System.in);
        System.out.print("Fita 1 do DNA:");
        String fita1 = scan.nextLine();
        fita1 = fita1.replace(" ", "");
        System.out.print("Fita 2 do DNA:");
        String fita2 = scan.nextLine();
        fita2 = fita2.replace(" ", "");


        
    }
}
