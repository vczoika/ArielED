import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // I. Crie um vetor chamado v com 10 elementos, valores de 1 a 10
        System.out.println("\nI");
        int[] v = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int a : v) {
            System.out.print(a + " ");
        }

        // II. Imprima na tela o vetor na ordem inversa
        System.out.println("\n\nII");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        // III. Encontre o maior número no vetor int v[]={2,4,1,7,8} *usei o v como v2*
        System.out.println("\n\nIII");
        int v2[] = {2, 4, 1, 7, 8};

        int maiorNum = 0;
        for (int j : v2) {
            if (j > maiorNum) {
                maiorNum = j;
            }
        }
        System.out.print("O maior numero é: " + maiorNum);

        // IV. Encontre soma de todos os valores do vetor v[]={2,4,5,6,3,1,4,0} *usei o v como v3*
        System.out.println("\n\nIV");
        int v3[]={2,4,5,6,3,1,4,0};
        int soma = 0;
        for (int n: v3) {
            soma += n;
        }
        System.out.println(soma);


        // V. Encontrar media dos valores do exercicio IV
        System.out.println("\nV");
        int tamanho = v3.length;
        Double media;
        media = ((double)soma / (double)tamanho);
        System.out.println("Média = " + media);

        /*
        Fiz os dois exercicios juntos ok?
        VI. Considerando o exercicio V, mostre na tela valores do vetor que sejam maiores que a média.
        VII. Complementando o exercicio anterior, coloque 0 nos valores menores que a media
        */
        System.out.println("\nVI & VII.");
        for (int c : v3) {
            if (c > media) {
                System.out.print(c + " ");
            } else {
                System.out.print((c = 0) + " ");
            }
        }

        // Exercicio Bonus - Encontrar quantos numeros 2 estao presentes no vetor v[]={5,8,2,6,8,4,8} *Usei o v como v4*
        System.out.println("\n\nExercicio BONUS");
        int v4[]={5,8,2,6,8,4,8};
        for (int b : v4 )
            if (b == 2) {
                System.out.println(b);
            } else {
                System.out.println("!=2");
            }

        // Dado o vetor v[]={8,6,4,2,1,0}, crie um algoritmo que o coloque em ordem crescente. *Usei v como v5*
        System.out.println("\n\nExercicio BONUS EXTRA");
            int v5[]={8,6,4,2,1,0};

            Arrays.sort(v5);
            for (int ii : v5) {
            System.out.println(ii);
        }

        System.out.println("\n\nExercício bônus extra especial para ficar feroz em Array");
            String[] PRIMEIRO = {"Ana", "Beatriz", "Celso", "Diego"};
            int[] B ={3,0,1,2};
            for (int indice : B)
                System.out.println(PRIMEIRO[B[indice]]);
    }
}

