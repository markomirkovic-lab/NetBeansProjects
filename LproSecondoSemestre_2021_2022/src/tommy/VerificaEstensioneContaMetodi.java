package tommy;

/**
 *  Programma che verifica tipo estensione e conta quanti metodi sono contenuti.
 *
 * @version 28.05.2022
 * @author Tommaso Zanini
 */
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class VerificaEstensioneContaMetodi {

    public static void contaMetodi(Path file) {
        int count = 0;
        String java = "";
        try {
            java = Files.readString(file, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Leggo da file txt la lista di indirizzi ip da monitorare
        String[] programma = java.split(" ");
//        System.out.println(Arrays.toString(programma));
        for (int i = 0; i < programma.length; ++i) {
            if (programma[i].equals("public")) {
                count++;
            } else {
            };
        }
        System.out.println("I metodi contenuti all'interno del file sono: " + (count-1));
    }

    public static String CheckEstensione(Path file) {
        String nome = "", estensione = "", conferma = "";
        nome = file.getFileName().toString();
//        System.out.println(nome);
        estensione = nome.substring(nome.indexOf(".") + 1);
//        System.out.println(estensione);
        if (estensione.equals("java")) {
            conferma = "Il file ha l'estensione JAVA";
            return conferma;
//            System.out.println(conferma);
        } else {
            System.out.println("Il file NON ha l'estensione JAVA");
            //Se estensione non di tipo JAVA chiudo il programma
            System.exit(0);
        }
        return null;
    }

    public static void main(String[] args) {
        String conferma = "";
        Path file = Paths.get("..", "PingerTool", "src", "pingertool", "PingerTool.java");
//        System.out.println(file.getFileName());
        conferma = CheckEstensione(file);
        System.out.println(conferma);
        contaMetodi(file);

    }
}
