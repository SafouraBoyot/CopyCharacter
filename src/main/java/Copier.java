public class Copier {


    private final Source source;
    private final Destination destination;

    public Copier(Source source, Destination destination) {
        this.source = source;
        this.destination = destination;
    }


    public void Copy() {
        while (true) {
            char aChar = source.getChar();
            if (aChar == '\n') {
                break;
            }
            destination.setChar(aChar);
        }
    }
}
