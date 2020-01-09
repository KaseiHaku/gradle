package kasei.java;

import static org.junit.jupiter.api.Assertions.*;

class HakuTest {

    @org.junit.jupiter.api.Test
    void test() {
        Haku haku = new Haku();
        assertEquals("true", haku.junit());
    }
}
