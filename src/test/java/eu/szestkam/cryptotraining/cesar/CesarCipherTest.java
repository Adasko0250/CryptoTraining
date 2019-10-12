package eu.szestkam.cryptotraining.cesar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CesarCipherTest {

    private static final String SAMPLE_PHRASE = "sample";
    private CesarCipher cipherNoArg;
    private CesarCipher cipherPhrase;

    @BeforeEach
    void setUp() {
        cipherNoArg = new CesarCipher();
        cipherPhrase = new CesarCipher(SAMPLE_PHRASE);
    }

    @DisplayName("Correct cipher instance with no args")
    @Test
    public void testIfCesarExist() {
        CesarCipher cipher = cipherNoArg;
        assertNotNull(cipher);
    }

    @DisplayName("Correct cipher instance with phrase")
    @Test
    public void testPassStringToConstructor() {
        CesarCipher cipher = cipherPhrase;
        assertNotNull(cipher);
    }

    @Test
    public void testEncrypWhenNoTextThenEmptyString() {
        CesarCipher cipher = cipherNoArg;
        String encoded = cipher.encode();

        assertNotNull(encoded);
        assertEquals("", encoded);
    }

    @Test
    public void testEncrypWhenTextThenSameLenghtOfString() {
        CesarCipher cipher = cipherPhrase;
        String encoded = cipher.encode();

        assertNotNull(encoded);
        assertEquals(SAMPLE_PHRASE.length(), encoded.length());
    }

}