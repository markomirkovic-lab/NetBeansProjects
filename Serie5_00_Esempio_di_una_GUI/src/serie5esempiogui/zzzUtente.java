package serie5esempiogui;

import java.util.Scanner;

public class zzzUtente
{
    public static void main(String[] args)
    {
        //Facciamo partire il sistema operativo
        OperatingSystem op=new OperatingSystem();
        
        //Facciamo partire l'app orologio
        //coordinate 10,10 dimensioni 30,40
        Orologio o=new Orologio("Orologio", 10,10,30,40);
        op.addApp(o);

        //Facciamo partire l'app solitario
        //coordinate 20,20 dimensioni 20,20
        Solitario s=new Solitario("Solitario", 20,20,20,20);
        op.addApp(s);

        //Facciamo partire l'app notepad
        //coordinate 20,30 dimensioni 50,70
        Notepad n=new Notepad("Notepad", 20,30,50,70);
        op.addApp(n);
        
        Scanner in=new Scanner(System.in);
        String tmp;
        int x, y;
        char c,action;
        boolean pressed;
        
        while(true)
        {
            System.out.println("--------------------------------------");
            System.out.println("Inserisci K<shift><lettera> per simulare la pressione di un tasto e del pulsante SHIFT (S/ )");
            System.out.println("    Es: KSa    pressione di a e di SHIFT");
            System.out.println("    Es: K q    pressione di q ma non di SHIFT");
            System.out.println("\nInserisci M<tasto><coordinataX>-<coordinataY> per simulare un evento del mouse alla coordinata. <tasto> può essere premuto (C) o no ( )");
            System.out.println("    Es: MC20-30    click del mouse alla coordinata 20-30");
            System.out.println("    Es: M 10-40    spostamento del mouse alla coordinata 10-40");
            System.out.println("Premi il punto per uscire.");
            
            tmp=in.nextLine();

            action='.';
            c=' ';
            pressed=true;
            x=0;
            y=0;
            
            
            try
            {                
                if(tmp.equals(""))
                    break;
                else
                    tmp=tmp.toLowerCase();

                action=tmp.charAt(0);
                
                if(tmp.charAt(1)==' ')  //Se c'è uno spazio significa che shoft non è premuto o click del mouse assente
                    pressed=false;

                if(action=='k')         //È un evento da tastiera
                    c=tmp.charAt(2);
                else
                {
                    action='m';
                    
                    tmp=tmp.substring(2);

                    x=Integer.parseInt( tmp.substring(0,tmp.indexOf("-")) );
                    y=Integer.parseInt( tmp.substring(tmp.indexOf("-")+1).trim() );
                }
            }
            catch(Exception e)
            {
                
            }
            
            
            switch(action)
            {
                case '.':
                    System.exit(0);
                    break;

                case 'k':
                    //Il sistema operativo riceve il tasto premuto
                    op.KeyboardAction(new KeyboardEvent(pressed,c));
                    break;
                case 'm':
                    //Il sistema operativo riceve l'evento del mouse
                    op.MouseAction(new MouseEvent(pressed,x,y));
                    break;
            }            
            
            
        }
    }
}
