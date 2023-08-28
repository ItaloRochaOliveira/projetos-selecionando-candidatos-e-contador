import java.util.Random;

public class Case4 {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "FABRICIO", "MIRELA"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }


    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        } while(continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de " + tentativasRealizadas + " tentativas realizadas");
        }
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
