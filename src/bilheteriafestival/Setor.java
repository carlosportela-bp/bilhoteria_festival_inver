package bilheteriafestival;

// Etapa 0: setor encapsulado. Etapas 3 e 4: o próprio setor valida a venda
public class Setor {

    private String nome;
    private int capacidade;
    private int vendidos;

    public Setor(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.vendidos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getVendidos() {
        return vendidos;
    }

    public int getRestantes() {
        return capacidade - vendidos;
    }

    // Etapa 3: quantidade 0 ou negativa é argumento inválido, por isso IllegalArgumentException.
    // Não criei exceção nova porque o Java já tem uma exatamente para "argumento inválido"
    // e é um erro de uso do método, não uma regra de negócio da bilheteria.
    // Etapa 4: pedido maior que o disponível lança a exceção checked da bilheteria.
    public void vender(int quantidade) throws IngressoEsgotadoException {
        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "Quantidade inválida: " + quantidade + ". Informe pelo menos 1 ingresso.");
        }
        if (quantidade > getRestantes()) {
            throw new IngressoEsgotadoException(
                    "Ingressos insuficientes no setor " + nome + ".", getRestantes());
        }
        vendidos += quantidade;
    }

    @Override
    public String toString() {
        return nome + " - restam " + getRestantes() + " de " + capacidade;
    }
}
