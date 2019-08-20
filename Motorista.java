public class Motorista{
    public String cpf;
    public String nome;
    public Veiculo veiculo;
    public enum FormaPagamento{
        DINHEIRO,CARTAO,TODAS;
    }
    public int pontuacaoMedia;
    
    public String getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public FormaPagamento getFormaPagamento(){
        return FormaPagamento;
    }

      public int getPontuacaoMedia(){
        return pontuacaoMedia;
    }

    public void infoPontuacao(int pontuacao){
        pontuacaoMedia = pontuacao;
    }
}