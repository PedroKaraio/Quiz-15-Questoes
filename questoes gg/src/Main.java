import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int total = 15;
        int erradas = 0;

        // Perguntas
        Questao[] questoes = new Questao[total];

        // Definindo as questões
        questoes[0] = new Questao();
        questoes[0].pergunta = "1 Pergunta Quem ensinou o Kamehameha para o Goku?";
        questoes[0].opcaoA = "Goten";
        questoes[0].opcaoB = "Mestre Kame";
        questoes[0].opcaoC = "Vegeta";
        questoes[0].opcaoD = "Bulma";
        questoes[0].opcaoE = "Kami-Sama";
        questoes[0].correta = "B";

        questoes[1] = new Questao();
        questoes[1].pergunta = "2 Pergunta Quem cortou a cauda de Goku quando ele era pequeno?";
        questoes[1].opcaoA = "Pual";
        questoes[1].opcaoB = "Bulma";
        questoes[1].opcaoC = "Radiz";
        questoes[1].opcaoD = "Brolly";
        questoes[1].opcaoE = "Freeza";
        questoes[1].correta = "A";

        questoes[2] = new Questao();
        questoes[2].pergunta = "3 Pergunta Qual o nome do pai de Goku?";
        questoes[2].opcaoA = "Krulian";
        questoes[2].opcaoB = "Zeno";
        questoes[2].opcaoC = "Majin Boo";
        questoes[2].opcaoD = "Gohan";
        questoes[2].opcaoE = "Bardock";
        questoes[2].correta = "E";

        questoes[3] = new Questao();
        questoes[3].pergunta = "4 Pergunta Qual é o nome do planeta natal de Goku?";
        questoes[3].opcaoA = "Namekusei";
        questoes[3].opcaoB = "Terra";
        questoes[3].opcaoC = "Vegeta";
        questoes[3].opcaoD = "Sayajin";
        questoes[3].opcaoE = "Frieza";
        questoes[3].correta = "D";

        questoes[4] = new Questao();
        questoes[4].pergunta = "5 Pergunta Quem é o criador da Dragon Ball?";
        questoes[4].opcaoA = "Akira Toriyama";
        questoes[4].opcaoB = "Masashi Kishimoto";
        questoes[4].opcaoC = "Jotaro Kujo";
        questoes[4].opcaoD = "Yoshihiro Togashi";
        questoes[4].opcaoE = "Machado De Assis";
        questoes[4].correta = "A";

        questoes[5] = new Questao();
        questoes[5].pergunta = "6 Pergunta Qual é a técnica que Goku aprende com o Kaio-shin?";
        questoes[5].opcaoA = "Genki Dama";
        questoes[5].opcaoB = "Final Flash";
        questoes[5].opcaoC = "Choque do Trovão";
        questoes[5].opcaoD = "Super Kamehameha";
        questoes[5].opcaoE = "Combo do Dragão";
        questoes[5].correta = "A";

        questoes[6] = new Questao();
        questoes[6].pergunta = "7 Pergunta Qual dos seguintes personagens é um vilão icônico da série?";
        questoes[6].opcaoA = "Freeza";
        questoes[6].opcaoB = "Oozaru";
        questoes[6].opcaoC = "Mister Satan";
        questoes[6].opcaoD = "Kuririn";
        questoes[6].opcaoE = "Machado De Assis";
        questoes[6].correta = "A";

        questoes[7] = new Questao();
        questoes[7].pergunta = "8 Pergunta Qual é a transformação que permite ao Goku acessar o poder dos Deuses?";
        questoes[7].opcaoA = "Super Saiyajin 3";
        questoes[7].opcaoB = "Super Saiyajin 1";
        questoes[7].opcaoC = "Super Saiyajin God";
        questoes[7].opcaoD = "Ultra Instinct";
        questoes[7].opcaoE = "Oozaru";
        questoes[7].correta = "C";

        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual é a forma final de Frieza?";
        questoes[8].opcaoA = "Forma Mutante";
        questoes[8].opcaoB = "Forma Final";
        questoes[8].opcaoC = "Forma Máxima";
        questoes[8].opcaoD = "Forma Dourada";
        questoes[8].opcaoE = "Nenhuma";
        questoes[8].correta = "D";

        questoes[9] = new Questao();
        questoes[9].pergunta = "Qual é o desejo que Goku faz para as Dragon Balls no final da saga de Majin Buu?";
        questoes[9].opcaoA = "Reviver todos que o Buu matou";
        questoes[9].opcaoB = "Ser o Sayajin Mais Forte";
        questoes[9].opcaoC = "Ser Imortal";
        questoes[9].opcaoD = "Ganhar na Mega da vira";
        questoes[9].opcaoE = "Reviver o Vegita";
        questoes[9].correta = "A";

        questoes[10] = new Questao();
        questoes[10].pergunta = "Qual a nova animação produzida pela Netflix de Dragon Ball?";
        questoes[10].opcaoA = "Dragon Ball Xenoverse";
        questoes[10].opcaoB = "Dragon Ball Daima";
        questoes[10].opcaoC = "Super Mega Dragon ball";
        questoes[10].opcaoD = "As Terríveis Histórias de Freeza";
        questoes[10].opcaoE = "Super Onze";
        questoes[10].correta = "B";

        questoes[11] = new Questao();
        questoes[11].pergunta = "Quem é o mestre de Kuririn?";
        questoes[11].opcaoA = "Androide 18";
        questoes[11].opcaoB = "Bills";
        questoes[11].opcaoC = "Yamcha";
        questoes[11].opcaoD = "Kame";
        questoes[11].opcaoE = "Nenhuma";
        questoes[11].correta = "D";

        questoes[12] = new Questao();
        questoes[12].pergunta = "Quem voltou do futuro para ajudar os Guerreiros Z?";
        questoes[12].opcaoA = "Trunks";
        questoes[12].opcaoB = "Piccolo";
        questoes[12].opcaoC = "Goku";
        questoes[12].opcaoD = "Vegeta";
        questoes[12].opcaoE = "Gohan";
        questoes[12].correta = "A";

        questoes[13] = new Questao();
        questoes[13].pergunta = "Qual o verdadeiro nome de Goku Black?";
        questoes[13].opcaoA = "Goku Preto";
        questoes[13].opcaoB = "Zamasu";
        questoes[13].opcaoC = "Supremo Senhor Kaio";
        questoes[13].opcaoD = "Albedo";
        questoes[13].opcaoE = "Majito";
        questoes[13].correta = "B";

        questoes[14] = new Questao();
        questoes[14].pergunta = "Quem é o Super Sayajin lendário?";
        questoes[14].opcaoA = "Goku";
        questoes[14].opcaoB = "Brolly";
        questoes[14].opcaoC = "Bradock";
        questoes[14].opcaoD = "Rei Vegita";
        questoes[14].opcaoE = "Kayle";
        questoes[14].correta = "B";

        // Realiza o quiz
        for (int i = 0; i < questoes.length; i++) {
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                score++;
            }
        }

        // Resultado final
        erradas = total - score;

        // Calcular as porcentagens
        double percentageCorrect = (score * 100.0) / total;
        double percentageIncorrect = (erradas * 100.0) / total;

        // Exibir o resultado em porcentagem
        System.out.println("Você acertou " + score + " de 15 perguntas.");
        System.out.println("Porcentagem de acertos: " + percentageCorrect + "%");
        System.out.println("Porcentagem de erros: " + percentageIncorrect + "%");
    }
}
