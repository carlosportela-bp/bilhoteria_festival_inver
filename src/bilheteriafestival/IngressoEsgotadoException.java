package bilheteriafestival;

// Lançada quando o pedido é maior que a quantidade disponível (Etapa 4)
public class IngressoEsgotadoException extends BilheteriaException {

    private final int restantes;

    public IngressoEsgotadoException(String mensagem, int restantes) {
        super(mensagem);
        this.restantes = restantes;
    }

    public IngressoEsgotadoException(String mensagem, int restantes, Throwable causa) {
        super(mensagem, causa);
        this.restantes = restantes;
    }

    public int getRestantes() {
        return restantes;
    }
}
