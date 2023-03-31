public class ExceptionPlageHoraire extends Exception{
    private int chMessage;

    public ExceptionPlageHoraire (int parMessage) {
        chMessage = parMessage;
    }

    public int getChMessage() {
        return chMessage;
    }
}
