package expresionesregulares;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Archivos {

    File entrada;
    FileOutputStream salida;
    File archivo;
    BufferedReader reader;
    String text = "";
    ArrayList<String> linesFile;

    String[][] tokenPatron;
    String[] comparativo;

    public Archivos() {

    }
//Abrir archivo de texto

    public String[][] OpenToken(String direccion) {

        try {
            entrada = new File(direccion);
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(entrada));
            int lines = 0;
            while (lineNumberReader.readLine() != null) {
                lines++;
            }
            tokenPatron = new String[lines][2];
            lineNumberReader.close();
            reader = new BufferedReader(new FileReader(entrada));
            String line;
            int y = 0;
            while ((line = reader.readLine()) != null) {
                tokenPatron[y][0] = line.substring(1, (line.indexOf(";") - 1));
                tokenPatron[y][1] = line.substring(line.indexOf(";") + 1);
                y++;
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("Problema en: " + e);
        }
        return tokenPatron;
    }

    public ArrayList<String> OpenFile(String direccion) {
        try {
            linesFile = new ArrayList<String>();
            entrada = new File(direccion);
            reader = new BufferedReader(new FileReader(entrada));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!linesFile.isEmpty()) {
                    boolean flag = false;
                    for (int x = 0; x < linesFile.size(); x++) {
                        if (linesFile.get(x).equals(line)) {
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        linesFile.add(line);
                    }
                } else {
                    linesFile.add(line);
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
