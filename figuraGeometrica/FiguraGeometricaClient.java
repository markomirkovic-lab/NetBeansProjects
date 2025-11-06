package figuraGeometrica;

/**
 *
 * @author Neil Otupacca
 */
public class FiguraGeometricaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////
        // Se lo desiderate, potete eseguire il seguente script in modalità
        // step-by-step tramite il debugger.

        // Istanzia le 4 sottoclassi di FiguraGeometrica e invoca il rispettivo
        // metodo getPerimetro() che è stato concretizzato da ogni sottoclasse.
        // Nota: il concetto di "astratto" è opposto al concetto di "concreto".
        Cerchio c = new Cerchio(10, 20, 2.6);
        System.out.println("Perimetro del cerchio: " + c.getPerimetro());
        System.out.println("Perimetro di " + c.getClass().getSimpleName() +
                               ": " + c.getPerimetro());

        // Quadrato è una sottoclasse di rettangolo e utilizza l'implementazione
        // del metodo getPerimetro() di Rettangolo (per eredità, infatti la
        // formula per il calcolo è la stessa e non serve riscriverla).
        Quadrato q = new Quadrato(15, -7, 4.52);
        System.out.println("Perimetro quadrato: " + q.getPerimetro());
        System.out.println("GetCoordinataXY quadrato: " + q.getCoordinataXY());

        Rettangolo r = new Rettangolo(15, -7, 4.52, 2.6);
        System.out.println("Perimetro rettangolo: " + r.getPerimetro());

        TriangoloEquilatero t = new TriangoloEquilatero(-2, 24, 3.35);
        System.out.println("Perimetro triangolo: " + t.getPerimetro());

        System.out.println();

        System.out.println("---");
        ////////////////////////////////////////////////////////////////////////
        // Polimorfismo.                                                      //
        ////////////////////////////////////////////////////////////////////////

        // Verifichiamo il polimorfismo passando un'istanza di Cerchio, Quadrato,
        // Rettangolo e TriangoloEquilatero ad un metodo che richiede un'istanza
        // di FiguraGeometrica.
        // Ognuna delle 4 istanze può essere passata come parametro di tipo
        // FiguraGeometrica perché ognuna di esse è anche una FiguraGeometrica.
        // Vedi regola del "is a".
        // Esempi:
        //   Cerchio "is a" FiguraGeometrica  // Non vale il contrario.
        //   Student "is a" Person            // Non vale il contrario.
        //vedi sotto: private static void printPerimetro(FiguraGeometrica fg)
        System.out.println("private static void printPerimetro(FiguraGeometrica fg) :");
        printPerimetro(c);  // Passa un'istanza di Cerchio.
        printPerimetro(q);  // Passa un'istanza di Quadrato.
        printPerimetro(r);  // Passa un'istanza di Rettangolo.
        printPerimetro(t);  // Passa un'istanza di TriangoloEquilatero.
        System.out.println("---");
        // Per completezza di informazione, utilizziamo anche una classe anonima.
        // Da notare che, quando il metodo printPerimetro() stamperà il nome
        // della classe, questo sarà una stringa vuota, proprio perché abbiamo
        // istanziato una classe anonima (senza nome).
        // L'implementazione del metodo getPerimetro() appartiene a questa unica
        // istanza di classe anonima.
        printPerimetro(new FiguraGeometrica(0, 0, 5.5) {
            @Override
            public double getPerimetro() {
                // Questo è il metodo richiamato da fg.getPerimetro() all'interno
                // del metodo printPerimetro() quando viene passata un'istanza
                // di questa classe anonima.
                //
                // Nota:
                // non ci interessa il valore di ritorno, si tratta solo di
                // un esempio e, ad ogni modo, in un caso reale non esiste una
                // formula di calcolo del perimetro per una figura indefinita.
                return 0.0;
            }
        });

        System.out.println();

        ////////////////////////////////////////////////////////////////////////
        // Il meccanismo di polimorfismo permette di assegnare un'istanza di una
        // classe qualsiasi ad una variabile di un altro tipo, a condizione che
        // l'altro tipo sia una sua super-classe.
        // Esempi:
        //   // Capitolo 3.4.1 della dispensa "03. Ereditarietà".
        //   Persona p = new Studente();
        //
        //   // Passa un'istanza di Cerchio ad un metodo che richiede un'istanza
        //   // di FiguraGeometrica (vedi codice precedente).
        //   printPerimetro(c);
        //
        //   // Assegna un'istanza di Cerchio ad un elemento di un array di tipo
        //   // FiguraGeometrica (vedi codice seguente).
        //   arr[0] = c;

        // Array di 5 elementi di istanze della classe FiguraGeometrica.
        FiguraGeometrica[] arr = new FiguraGeometrica[5];
        arr[0] = c;  // Assegna un'istanza di Cerchio.
        arr[1] = q;  // Assegna un'istanza di Quadrato.
        arr[2] = r;  // Assegna un'istanza di Rettangolo.
        arr[3] = t;  // Assegna un'istanza di TriangoloEquilatero.

        // Anche in questo caso, assegnamo una classe anonima derivata da
        // FiguraGeometrica e concretizzata.
        arr[4] = new FiguraGeometrica(7, -25, 12.3) {
            @Override
            public double getPerimetro() {
                // Questo è il metodo richiamato da elem.getPerimetro() all'interno
                // del ciclo 'for' seguente.
                //
                // Nota:
                // di nuovo, non ci interessa il valore di ritorno.
                return -1.0;
            }
        };

        // Itera tutti gli elementi dell'array 'arr'.
        // vedi sopra: FiguraGeometrica[] arr = new FiguraGeometrica[5]
        for (FiguraGeometrica elem : arr) {
            // Ad 'elem' viene assegnato il valore dell'elemento correntemente
            // iterato (dall'indice 0 all'indice 4).
            // Stampa la classe effettiva di 'elem' e il suo perimetro.
            System.out.println("Perimetro di " + elem.getClass().getSimpleName() +
                               ": " + elem.getPerimetro());

            // La variabile 'elem' contiene l'elemento dell'array correntemente
            // iterato ed è assunto come istanza di FiguraGeometrica (super-classe).
            // Sebbene ogni elemento contenga un'istanza di una sottoclasse di
            // FiguraGeometrica, finché 'elem' è "interpretato" come un'istanza
            // di FiguraGeometrica, i membri dell'effettiva sottoclasse non sono
            // accessibili.
            // Nel caso si voglia accedere ai metodi specifici della classe
            // effettiva, è necessario effettuare un cast.
            // Prima di farlo però, ci assicuriamo che l'istanza corrente sia
            // effettivamente un'istanza della classe Cerchio (o una sua
            // sottoclasse) e quindi che il seguente cast non generi un errore.
            // Per determinare se un'istanza è di una determina classe, può
            // essere utilizzato l'operatore instanceof (ritorna un boolean).
            if (elem instanceof Cerchio) {
                // Cast di 'elem' in 'cr', dopo l'assegnamento, le due variabili
                // contengono la stessa reference, ma dato che 'cr' è definita
                // di tipo Cerchio, allora saranno accessibili anche i membri
                // della classe Cerchio (ad esempio: il metodo getRaggio()).
                Cerchio cr = (Cerchio) elem;  // Cast.
                System.out.println("Questo è un cerchio con raggio " +
                                   cr.getRaggio());
            }
        }
    }

    private static void printPerimetro(FiguraGeometrica fg) {
        // L'istanza 'fg' è definita come un'istanza di FiguraGeometrica.
        // La classe FiguraGeometrica è astratta, ma dato che 'fg' è un'istanza
        // concreta (quindi una sottoclasse o una classe anonima), allora è
        // garantita la presenza del metodo getPerimetro() che richiamerà
        // l'implementazione specifica dell'effettiva classe concreta.
        // Se 'fg' è un'istanza di Cerchio, il metodo getPerimetro() sarà quello
        // della classe Cerchio.
        // In modo analogo, per un'istanza di Rettangolo o TriangoloEquilatero,
        // il metodo getPerimetro() invocato sarà quello della stessa classe.
        // Infine, per quanto riguarda la classe Quadrato (derivata da Rettangolo)
        // il metodo getPerimetro() invocato, per ereditarietà, sarà quello di
        // Rettangolo (che lo ha già concretizzato).
        System.out.println("Perimetro di " + fg.getClass().getSimpleName() +
                           ": " + fg.getPerimetro());
    }
}
