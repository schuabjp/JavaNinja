package BatismoJava;

public class RegistroMissoes {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Defender a ponte";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'S';

        if (idade < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Missão não concluída";
            }
        } else {
            statusDaMissao = "Missão concluída";
        }

        System.out.println("-----");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da Missao: " + nivelDaMissao);
        System.out.println("Status da Missão: " + statusDaMissao);

        System.out.println("-----");

        // Ninja 2
        String nomeNinja2 = "Itachi Uchiha";
        int idade2 = 22;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'A';

        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Missao concluida";
            } else {
                statusDaMissao2 = "Missao nao concluida!";
            }
        } else {
            statusDaMissao2 = "Missão concluída";
        }

        System.out.println("-----");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status da Missao: " + statusDaMissao2);
        System.out.println("Nivel da Missao: " + nivelDaMissao2);

        System.out.println("-----");

        // Ninja 3
        String nomeNinja3 = "Tsunade Senju";
        int idade3 = 70;
        String missao3 = "Curar Feridos da guerra";
        String statusDaMissao3 = "Em andamento";
        char nivelDaMissao3 = 'S';

        if (idade3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Você conseguiu curar os feridos";
            } else {
                statusDaMissao3 = "Sem condições de curar os feridos!";
            }
        } else {
            statusDaMissao3 = "Missão concluída";
        }

        System.out.println("-----");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status da Missao: " + statusDaMissao3);
        System.out.println("Nivel da Missao: " + nivelDaMissao3);

        System.out.println("-----");
    }
}