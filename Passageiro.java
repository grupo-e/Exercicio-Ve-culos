public class Passageiro{
    private String cpf;
    private String nome;
    private String nroCartao;
    private double pontuacaoMedia;
    public FormaPagamento forPag;

    public enum FormaPagamento{
        DINHEIRO,CARTAO,TODAS;
    }

    public Passageiro (String nome, String cpf, String nroCartao) {

        this.nome = nome;
        this.cpf = cpf;
        this.nroCartao = nroCartao;

    }

    public String getNome(){
        return nome;
    }

    public FormaPagamento getFormaPagamento(){
        return forPag;
    }

    public String getNroCartao(){
        return nroCartao;
    }

    public double getPontuacaoMedia(){
        return pontuacaoMedia;
    }

    public void infoPontuacao(int pontuacao){
        pontuacaoMedia = pontuacao;
    }

}