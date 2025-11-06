package log;

public class Log
{
    public static int howManyTimes;
    public static int logMaxId;
    public static String[] log;
    
    
    public static void resetLog()
    {
        howManyTimes=0;
        logMaxId=0;
        log= new String[1];
    }
    
    
    public static void logging(int id, String title, char[][] tris, final char EMPTY, int level)
    {
        String indent="";
        for(int l=0; l<level; l++) indent+="    ";

        String out=String.format("%s\n", indent + "--------------------");
        out+=String.format("%s%-9d\n", indent, id);
        out+= indent+title+"\n";
        for(int rr=0; rr<tris.length; rr++)
        {
            out+=indent;
            for(int cc=0; cc<tris[rr].length; cc++)
            {
                out+= tris[rr][cc]==EMPTY ? '.' : tris[rr][cc];
            }
            out+="\n";
        }
        
        
        //Gestione array
        if(id+1 > logMaxId) logMaxId= id;
        if( log.length < id+1)
        {
            String[] tmp= new String[log.length+10000];     //Ridimensione di 10000 alla volta
            for(int i=0; i<log.length; i++) tmp[i]=log[i];
            log=tmp;
        }
        log[id]=out;
    }   
    
    
    public static void printLog()
    {
        if(log!=null)
        {
            for(int i=0; i<logMaxId+1; i++)
            {
                System.out.println(log[i]);
            }
        }
    }      
}