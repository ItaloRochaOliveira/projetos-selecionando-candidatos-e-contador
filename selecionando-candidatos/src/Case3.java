public class Case3 {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "FABRICIO", "MIRELA"};

        for(String candidato: candidatos){
            System.out.println("Candidato " + candidato.substring(0,1).toUpperCase().concat(candidato.substring(1).toLowerCase())  + " foi selecionado");
        }
    }
}
