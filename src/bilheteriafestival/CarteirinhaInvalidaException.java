package bilheteriafestival;

// Lançada quando a carteirinha de estudante não é numérica (Desafio 2)
public class CarteirinhaInvalidaException extends BilheteriaException {

    public CarteirinhaInvalidaException(String mensagem) {
        super(mensagem);
    }

    public CarteirinhaInvalidaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
