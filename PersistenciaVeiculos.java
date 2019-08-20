import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersistenciaVeiculos {
    
    List<Veiculo> cars;
    String path;

    public PersistenciaVeiculos (String path){

        cars = new LinkedList<Veiculo>();
        this.path = path;
        try {
            carregaVeiculo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void carregaVeiculo () throws IOException {
        
        File dir = new File(path);
        File arq = new File(dir, "veiculos.dat");

        try {
            
            FileReader fileReader = new FileReader(arq);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha = "";
            String placa;
            String marca;
            String cor;
            Veiculo.CategoriaVeiculo tipo;

            while ( ( linha = bufferedReader.readLine() ) != null) {
                
                String [] splitado = linha.split(","); 

                for (int i = 0; i < splitado.length; i+=4) {
                    
                    placa = splitado[i];
                    marca = splitado[i+1];
                    cor = splitado[i+2];
                    tipo = Veiculo.CategoriaVeiculo.valueOf(splitado[i+3]);
                    Veiculo v = new Veiculo(placa,marca,cor,tipo);
                    cars.add(v);

                }

            }
            
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public Boolean persisteVeiculo(List<Veiculo> aux) {

        File dir = new File(path);
        File arq = new File(dir, "veiculo.dat");

        try {

            arq.createNewFile();

            FileWriter fileWriter = new FileWriter(arq, false);

            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (Veiculo v : aux) {

                printWriter.println(v);

            }

            printWriter.flush();

            printWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
            return false;

        }

        return true;

    }

}