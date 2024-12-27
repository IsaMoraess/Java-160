package EX3;

import java.io.File;
import java.io.IOException;

public class Verificar {

    public void verificaArquivo(File arq) {
        if (!arq.exists()) {
                System.out.println("Arquivo não localizado");
         }
    }
}

