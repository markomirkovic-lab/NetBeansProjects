/**
 * Manipolazione string
 * @author marko.mirkovic
 * @version 06.01.2022
 */

package snippetstesting;


public class SnippetsTesting2
{
    public static void main(String[] args)
    {
        
        //1. Estrarre una parte di string - prefisso del telefono
        
        String tel = "+41 (0)91 111 22 33";
        //            0123456789012345678901234567890123456789            
        
        //spazzi         3     9   13 16
        int primoSpazioInizio = tel.indexOf(" ");//3 primo spazio
        int secondoSpazioInizio = tel.indexOf(" ", primoSpazioInizio+1);//9
        int terzoSpazioInizio = tel.indexOf(" ", secondoSpazioInizio+1);//13
        int quartoSpazioInizio = tel.indexOf(" ", terzoSpazioInizio+1);//16
        
        
        int indicePrimoSpazioFine   = tel.indexOf(" ", primoSpazioInizio+1);//9 secondo spazio
        
        String primoSpazioString = tel.substring(primoSpazioInizio, indicePrimoSpazioFine);//" (0)91"
        int lunghezzaPrimoSpazioString = tel.substring(primoSpazioInizio+1, secondoSpazioInizio).length();//5
        //uguale a System.out.println(tel.substring(4,9).length());//5
        String finoAPrimoSpazioString = tel.substring(0, indicePrimoSpazioFine);//"+41 (0)91"
        int lunghezzaFinoAPrimoSpazioString = finoAPrimoSpazioString.length();//9
        
        String prefissoLocale = tel.substring(primoSpazioInizio+1, indicePrimoSpazioFine);
        System.out.println("prefissoLocale: " + prefissoLocale);
        
        String prefissoLocaleFinale = prefissoLocale.replace("(","").replace(")","");
        System.out.println("prefissoLocaleFinale: " + prefissoLocaleFinale);
        
        
        //System.out.println(tel.substring(4,9).length());
        //System.out.println(lunghezzaPrimoSpazioString);
        //System.out.println(lunghezzaFinoAPrimoSpazioString+2);


        int lunghezzaPrimoSpazio = (primoSpazioInizio+1) + indicePrimoSpazioFine;//4+9 = 13
        
        
        // int secondoSpazioInizio = tel.indexOf(" ", 13+1);//16
        

        //int fine2   = tel.indexOf(" ", inizio);
        
        //int fine3   = tel.indexOf(" ", inizio);
        //int fine4   = tel.indexOf(" ", inizio);
        
        /*
        System.out.println("primoSpazioInizio: " +primoSpazioInizio);//3+1 = 4
        System.out.println("---");
        System.out.println("indicePrimoSpazioFine: " + indicePrimoSpazioFine);//9
        System.out.println("---");
        System.out.println(primoSpazioString);
        System.out.println("---");
        System.out.println("lunghezzaPrimoSpazioString: " + lunghezzaPrimoSpazioString);
        System.out.println("---");
        System.out.println("finoAPrimoSpazioString: " + finoAPrimoSpazioString);
        System.out.println("---");
        System.out.println("lunghezzaFinoAPrimoSpazioString " + lunghezzaFinoAPrimoSpazioString);
        System.out.println("---");
        System.out.println("secondoSpazioInizio: " + secondoSpazioInizio);
        System.out.println("---");
        System.out.println("terzoSpazioInizio: " + terzoSpazioInizio);
        System.out.println("---");
        System.out.println("quartoSpazioInizio: " + quartoSpazioInizio);
        System.out.println("lunghezzaPrimoSpazio: " + lunghezzaPrimoSpazio);
        System.out.println("---");
        System.out.println("secondoSpazioInizio: " + secondoSpazioInizio);
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
        */
        System.out.println("---");
        //----------------------------------------------------------------
        
        //2. Estrarre una parte della stringa - dominio da un indirzizzo email:
        
        String email = "pinco.pallingo@edu.ti.ch";
        //              012345678901234567890123
        
        //Individuare i separatori che delimitano l'elemento da trovare
        int indexInizioSeparatore = email.indexOf("@")+1;
        int indexFineSeparatore = email.length();
        
        //Dominio con CH
        String dominio = email.substring(indexInizioSeparatore, indexFineSeparatore);
        
        System.out.println("dominio: " + dominio);
        
        //Dominio senza CH
        //Primo separatore
        //int indexInizioSeparatore = email.indexOf("@")+1;
        //Secondo separatore
        
        int ultimoPunto = email.lastIndexOf(".");
        
        String dominioSenzaCh = email.substring(indexInizioSeparatore, ultimoPunto);
        
        System.out.println("dominioSenzaCh: " + dominioSenzaCh);
        
         System.out.println("---");
        //----------------------------------------------------------------
        
        //3. Estrarre una parte della stringa - delimitata da parole e
        //   non da singoli char
        
        //                    10     |  20        30    |   40        50
        //          0123456789012345678901234567890123456789012345678901234567
        String t = "Questa è una STOP frase telegrafica STOP con le frasi STOP"
                 + " separate dalla string STOP";
        //          890123456789012345678901234
        //            60        70        80
        
        //Cerco la substring tra il primo e secondo "STOP"
        
        //Individuare i separatori che delimitano l'elemento da trovare
        int primoSeparatore = t.indexOf("STOP")+"STOP".length();//primoSeparatore 17
        System.out.println("primoSeparatore: " + primoSeparatore);//primoSeparatore 17
        
        int secondoSeparatore = t.indexOf("STOP", primoSeparatore);//secondoSeparatore: 36
        System.out.println("secondoSeparatore: " + secondoSeparatore);//secondoSeparatore: 36
        
        //Estrazzione sottostringa
        String tt = t.substring(primoSeparatore+1, secondoSeparatore-1);
        System.out.println("tt: " + tt);//tt: frase telegrafica
        
        
        /*
        run:
        prefissoLocale: (0)91
        prefissoLocaleFinale: 091
        ---
        dominio: edu.ti.ch
        dominioSenzaCh: edu.ti
        ---
        primoSeparatore: 17
        secondoSeparatore: 36
        tt: frase telegrafica
        */
        
        /*
        int a = 1;
        a+= 2 * ++a;
        System.out.println(a);
        */
        
    }
}
