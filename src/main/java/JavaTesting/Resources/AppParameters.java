package JavaTesting.Resources;

import com.sun.jdi.InvalidStackFrameException;

public class AppParameters {
    //afegir-hi objectes connexio de Base de Datos

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";


    //public static final Object BD_CON = new ClasseConnexionBBDD();

    //public static Object MESSAGES_TRANSLATIONS;

    //Implementar SINGLETON PATTERN
    private static AppParameters instance;

    private AppParameters(){

    }

    private void initApp(){
        //codi necessari per la inicializacion de l'app
    }

    public void resetApp(){
        //codi per reconfigurar l'app
    }

    public static AppParameters getInstance(){
        if(instance == null )
        instance = new AppParameters();

        return instance;
    }

    public static  String deployedURL ( ){
        return "https://" + DOMAIN + ":" + PORT;
    }
}
