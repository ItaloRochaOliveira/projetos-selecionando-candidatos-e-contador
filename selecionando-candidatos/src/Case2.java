import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORDANA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;

                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }

            candidatoAtual++;
        }
    }
}
