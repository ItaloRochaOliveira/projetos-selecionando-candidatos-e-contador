package customErrors;

public class TypeErrorException extends Exception {
    public TypeErrorException(){
        super("Tipo de valor invalido, valor esperado: número inteiro.");
    }
}
