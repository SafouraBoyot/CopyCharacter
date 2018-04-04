import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CopierShould {
    private DestinationSpy destinationSpy;

    @Before
    public void
    setUp() {
        destinationSpy = new DestinationSpy();
    }

    @Test
    public void
    copy_a_character() {

        Source sourceStub = new SourceStub("a\n");
        Copier copier = new Copier(sourceStub, destinationSpy);

        copier.Copy();

        assertEquals(1, destinationSpy.setCharWasCalled);
        assertEquals('a', destinationSpy.verifyCharacter());


    }

    @Test
    public void
    copy_a_line_of_characters() {
        Source sourceStub = new SourceStub("aaaAB" + "\n");
        Copier copier = new Copier(sourceStub, destinationSpy);

        copier.Copy();

        assertEquals(5, destinationSpy.setCharWasCalled);
        assertEquals("aaaAB", destinationSpy.verifyString());


    }
}
