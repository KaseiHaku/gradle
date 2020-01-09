package kasei.gradle.java;

class HakuTest {

    @org.junit.jupiter.api.Test
    void test() {
        Haku haku = new Haku();
        assertEquals("true", haku.junit());
    }
}
