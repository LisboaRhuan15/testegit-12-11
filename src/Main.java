public class Main {

    static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }


    static String situacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        String nome = "Maria";
        double[] notas = {8.5, 7.0, 9.0, 6.5};

        System.out.println("Aluno: " + nome);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        double media = calcularMedia(notas);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao(media));

        System.out.println("\nTabuada do 3:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));]

            // ===== INÍCIO: trecho adicionado na branch nova-funcionalidade =====
            double[] notasExtras = {8.5, 7.0, 9.0, 6.5};
            double maior = notasExtras[0];
            for (double nota : notasExtras) {
                if (nota > maior) {
                    maior = nota;
                }
            }
            System.out.println("\nMaior nota: " + maior);
            // ===== FIM: trecho adicionado na branch nova-funcionalidade =====
        }

    }
}