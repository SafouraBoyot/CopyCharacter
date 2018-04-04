public class SourceStub implements Source {


    private final String input ;
    private int inputCharacterCounter = 0;

    public SourceStub(String input) {
        this.input = input;


    }

    @Override
    public char getChar() {
        return input.charAt(inputCharacterCounter++);
    }
}
