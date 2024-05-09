package pw;

public class resourceException extends Exception {
    public resourceException(String message) {
        super(message);
    }
    public resourceException() {
        System.out.println("Ha saltado una resourceException");
    }
}
