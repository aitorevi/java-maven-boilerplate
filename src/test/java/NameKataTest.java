import name_kata.NameKata;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameKataTest {

    @Test
    public void nameTest() {
        NameKata kata = new NameKata();
        String result = kata.greet("World");
        assertEquals("Hello, World!", result);
        assertThat("Hello, World!").isEqualTo(result);
    }
}
