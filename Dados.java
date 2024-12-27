package EX3;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Dados {
    public void leDados(File arq) {
        try {
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("\nConteúdo lido...");
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

