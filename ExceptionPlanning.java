import javax.naming.SizeLimitExceededException;

public class ExceptionPlanning extends Exception implements ConstanteErreur {
    private int chCodeErreur;

    public ExceptionPlanning (int parCodeErreur) {
        chCodeErreur = parCodeErreur;
    }

    public String getChCodeErreur() {
        return ERREURS_PLANNING[chCodeErreur];
    }



}
