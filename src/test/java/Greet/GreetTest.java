import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GreetTest {

    @Test
    void shouldGreetWithDefaultGreeting() {
        String result = Greet.greet("World");
        assertThat(result).isEqualTo("Hello, World!");
    }

    @Test
    void shouldGreetWithCustomGreeting() {
        String result = Greet.greet("Java", "Welcome");
        assertThat(result).isEqualTo("Welcome, Java!");
    }

    @Test
    void shouldHandleEmptyName() {
        String result = Greet.greet("");
        assertThat(result).isEqualTo("Hello, !");
    }

    @Test
    void shouldHandleSpecialCharactersInName() {
        String result = Greet.greet("José María");
        assertThat(result).isEqualTo("Hello, José María!");
    }

    @Test
    void shouldHandleCustomGreetingWithSpecialCharacters() {
        String result = Greet.greet("Developer", "¡Hola");
        assertThat(result).isEqualTo("¡Hola, Developer!");
    }
}
