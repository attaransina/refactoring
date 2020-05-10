package errorhandler;

/**
 * Created by Alireza on 6/28/2015.
 */
public final class ErrorHandler {
    public static boolean hasError = false;

    private ErrorHandler() {
    }

    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
