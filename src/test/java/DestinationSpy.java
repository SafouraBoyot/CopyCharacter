public class DestinationSpy implements Destination {
    public int setCharWasCalled = 0;
    private char character;
    private String outPutString="";


    @Override
    public void setChar(char character) {
        this.character = character;
        outPutString=outPutString+character;
        setCharWasCalled ++;
    }

    public char verifyCharacter() {
        return character;
    }

    public String verifyString(){
        return outPutString;
    }
}
