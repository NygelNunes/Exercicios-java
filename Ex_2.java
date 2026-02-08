/* 
Dado um número, determine se ele é ou não válido de acordo com a fórmula de Luhn. O 
algoritmo Luhn é uma fórmula de soma de verificação simples usada para validar uma variedade 
de números de identificação, como números de cartão de crédito. O objetivo deste exercício é 
determinar se uma String de números é ou não válida. 

Validando um número 
    • Strings de comprimento 1 ou menos não são válidas. Espaços são permitidos na entrada, mas 
    devem ser removidos antes da verificação. Todos os outros caracteres que não sejam dígitos não são permitidos. 

Exemplo: Número de cartão de crédito válido 
4539 3195 0343 6467 

A primeira etapa do algoritmo de Luhn é remover os espaços e dobrar cada segundo dígito, 
começando pela direita nós estaremos dobrando. 
4_3_ 3_9_ 0_4_ 6_6_ 

Se dobrar o número resultar em um número maior que 9, subtraia 9 do produto. Os resultados da 
nossa duplicação: 
8569 6195 0383 3437 

Em seguida, some todos os dígitos: 
8+5+6+9+6+1+9+5+0+3+8+3+3+4+3+7 = 80  

Se a soma for divisível por 10, o número é válido. Este número é válido! Caso contrário, o 
número é inválido. 
*/

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite:");
        String entrada = scan.nextLine(); // Sem o "Line" o Java ia parar de ler no primeiro espaço " "..
        entrada = entrada.replace(" ", ""); // Formatação sem espaços " "..

        int digito;
        int posicaoD;
        int dobrar = 0;
        int somaTotal = 0;
        boolean entradavalida = true; // Essa variável foi criada somente para fazer um comparativo e não deixar imprimir informações de regras de negocios invalidos


// Essa parte se trata da regra de negócio já que se a quantidade de dígitos for inferior ou igual a 1, o sistema não continua...
        if (entrada.length() <= 1) {
            System.out.print("Está Qtd de caracteres é INVALIDA!");
        } else {

        // Aqui a lógica Padrão do For foi alterada, já que o for se trata da contabilização da esquerda para a direita!
        // Esse sistema de fórmula de Luhn é da direita para a esquerda, então o índice [0] é o último elemento e o
        // primeiro elemento depende da quantidade de dígitos que essa linha possui, se 10 é a quantidade de digito(Length)
        // o primeiro Dígito vai ser 9 já que (9,8,7,6,5,4,3,2,1,0) aqui já possui 10 caracteres/digitos

            for (int i = (entrada.length() - 1); i >= 0; i--) {

                // Outra regra de negócio que determina se o caracter é um dígito, se não for ele para/break o loop ali mesmo
                if (Character.isDigit(entrada.charAt(i)) == false) {
                    System.out.print("Letras ou Simbolos NAO SAO PERMITIDOS!\n");
                    entradavalida = false; 
                    break;
                }
                
                digito = Character.getNumericValue(entrada.charAt(i)); // Aqui é feito a conversão De um caracter para
                                                                       // um valor numérico(entrada.charAt(i) -> Essa parte pega um caracter(Char) que está na
                                                                       // primeira posição(9) e assim por diante (8,7...)

                posicaoD = (entrada.length() - i); // Converte o índice do Java (esq -> dir) para a posição do Luhn (dir -> esq).
                                                   // Ex: Num total de 10, o índice 9 vira posição 1 (ímpar, mantém). O índice 8 vira 2 (par, dobra)
                                                   // -> 10 - 9 = 1; 10 - 8 = 2; 10 - 7 = 3... |o "resto" da subtração é a "posicaoD"|.
                                                   // Se (posicaoD % 2 == 0), estamos numa posição par vindo da direita, então dobramos.
                if (posicaoD % 2 == 0) {
                    dobrar = digito * 2;
                    if (dobrar > 9) {
                        dobrar = dobrar - 9;
                    }
                    somaTotal = somaTotal + dobrar;
                } else {
                    somaTotal = somaTotal + digito;
                }

            }

            if ( entradavalida == true) {
                if (somaTotal % 10 == 0) {
                    System.out.print("Este numero é valido!\n");
                } else {
                    System.out.print("Este numero é invalido!\n");
                }
                System.out.print("Soma Total: " + somaTotal);
            }
        }
    }
}
