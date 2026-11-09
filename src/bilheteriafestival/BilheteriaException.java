package bilheteriafestival;

// Classe-mãe de todas as exceções da bilheteria (Etapa 5)
public class BilheteriaException extends Exception {

    public BilheteriaException(String mensagem) {
        super(mensagem);
    }

    public BilheteriaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
