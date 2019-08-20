import java.util.List;

public class App1 {

    public static void main(String[] args) {

        ControleVeiculo cv = new ControleVeiculo();
        System.out.println(cv.getTodosVeiculos());
        System.out.println(cv.getVeiculo(Veiculo.CategoriaVeiculo.valueOf("LUXO")));
        System.out.println(cv.getVeiculo("ABC1J23"));
        Veiculo foda = new Veiculo("123ABC","FERRARI","VERMELHO", Veiculo.CategoriaVeiculo.LUXO);
        List<Veiculo> pica = cv.pers.cars;
        pica.add(foda);
        System.out.println(cv.pers.persisteVeiculo(pica));


    }

}
