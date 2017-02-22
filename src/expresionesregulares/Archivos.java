package expresionesregulares;

import java.io.*;
import java.util.ArrayList;

public class Archivos {

    File entrada;
    FileOutputStream salida;
    File archivo;
    BufferedReader reader;
    String text = "";
    ArrayList<Ejemplos> linesFile;

    ArrayList<Tokens> tokenPatron;
    String[] comparativo;
    LineNumberReader lineNumberReader;

    public Archivos() {

    }
//Abrir archivo de texto

    public ArrayList<Tokens> OpenToken(String direccion) {

        try {
            tokenPatron = new ArrayList<Tokens>();
            entrada = new File(direccion);
            lineNumberReader = new LineNumberReader(new FileReader(entrada));
            int lines = 0;
            while (lineNumberReader.readLine() != null) {
                lines++;
            }
            lineNumberReader.close();
            reader = new BufferedReader(new FileReader(entrada));
            String line;
            int y = 0;
            while ((line = reader.readLine()) != null) {
                tokenPatron.add(new Tokens(line.substring(1, (line.indexOf(";") - 1)), line.substring(line.indexOf(";") + 1)));

                if (tokenPatron.get(y).getExpression().contains("λ")) {
                    String replace = tokenPatron.get(y).getExpression().replace("λ", "");
                    tokenPatron.get(y).setExpression(replace);
                }
                y++;
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("Problema en: " + e);
        }
        return tokenPatron;
    }

    public ArrayList<Ejemplos> OpenFile(String direccion) {
        try {
            linesFile = new ArrayList<Ejemplos>();
            entrada = new File(direccion);
            reader = new BufferedReader(new FileReader(entrada));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!linesFile.isEmpty()) {
                    boolean flag = false;
                    for (int x = 0; x < linesFile.size(); x++) {
                        if (linesFile.get(x).getDefinicion().equals(line)) {
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        linesFile.add(new Ejemplos(line, null));
                    }
                } else {
                    linesFile.add(new Ejemplos(line, null));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("Problema en: " + e);
        }
        return linesFile;
    }

//guardar archivo texto
    public String SaveText(File archivo, String contenido) {
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] byteTxt = contenido.getBytes();
            salida.write(byteTxt);
            respuesta = "se guardo con exito el archivo.";
        } catch (Exception e) {
            System.err.println("Problema en: " + e);
        }
        return respuesta;
    }

    boolean canread(String direccion) {
        File f = new File(direccion);
        if (f.canRead()) {
            return true;
        } else {
            return false;
        }

    }

}
