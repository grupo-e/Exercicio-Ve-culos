public class Passageiro{
    private String cpf;
    private String nome;
    private String nroCartao;
    private int pontuacaoMedia;
    public enum FormaPagamento{
        DINHEIRO,CARTAO,TODAS;
    }

    public String getNome(){
        return nome;
    }

    public FormaPagamento getFormaPagamento(){
        return FormaPagamento;
    }

    public String getNroCartao(){
        return nroCartao;
    }

    public int getPontuacaoMedia(){
        return pontuacaoMedia;
    }

    public void infoPontuacao(int pontuacao){
        pontuacaoMedia = pontuacao;
    }
}