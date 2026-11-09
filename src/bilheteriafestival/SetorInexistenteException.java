package bilheteriafestival;

// Lançada quando o atendente digita um setor que não existe (Etapa 2)
public class SetorInexistenteException extends BilheteriaException {

    public SetorInexistenteException(String mensagem) {
        super(mensagem);
    }

    public SetorInexistenteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
