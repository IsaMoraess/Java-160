package EX3;

import java.io.File;

public class Exemplo {

    public static void main(String[] args) {
        File arqEntrada = new File("C:\\Users\\laboratorio\\Desktop\\Ex3.txt");
        Verificar vf = new Verificar();
        vf.verificaArquivo(arqEntrada);
        Dados dd = new Dados();
        dd.leDados(arqEntrada);
    }
}

