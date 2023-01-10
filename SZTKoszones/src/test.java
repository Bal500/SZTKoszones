import static org.junit.Assert.assertEquals;

import org.junit.Test;
@SuppressWarnings("ALL")
public class test {
    @Test
    public void ShouldGreet_1() {
        assertEquals("Hello, my friend.", new GreetPeople().greeter(new String[]{}));
    }

    @Test
    public void ShouldGreet_2() {
        assertEquals("Hello, Dincso.", new GreetPeople().greeter(new String[]{"Dincso"}));
    }

    @Test
    public void ShouldGreet_3() {
        assertEquals("HELLO, PIZZA.", new GreetPeople().greeter(new String[]{"PIZZA"}));
    }

    @Test
    public void ShouldGreet_4() {
        assertEquals("Hello, Macko, Kata, and Balazs.", new GreetPeople().greeter(new String[]{"Macko", "Kata", "Balazs"}));
    }

    @Test
    public void ShouldGreet_5() {
        assertEquals("HELLO, JOCI, BELA, AND TEHEN.", new GreetPeople().greeter(new String[]{"JOCI", "BELA", "TEHEN"}));
    }

    @Test
    public void ShouldGreet_6() {
        assertEquals("Hello, Raspberry, and Chocolate. AND HELLO, DONUT, AND BOX.", new GreetPeople().greeter(new String[]{"Raspberry", "Chocolate", "DONUT", "BOX"}));
    }

    @Test
    public void ShouldGreet_7() {
        assertEquals("Hello, Tollas, and Malac.", new GreetPeople().greeter(new String[]{"Tollas, Malac"}));
    }

    @Test
    public void ShouldGreet_8() {
        assertEquals("HELLO, MICKEY, AND MINNIE.", new GreetPeople().greeter(new String[]{"MICKEY, MINNIE"}));
    }

    @Test
    public void ShouldGreet_9() {
        assertEquals("Hello, Pufi, and Hapi. AND HELLO, SAPI, AND HATYI.", new GreetPeople().greeter(new String[]{"Pufi, Hapi", "SAPI, HATYI"}));
    }

    @Test
    public void ShouldGreet_10() {
        assertEquals("Hello, Twix, Meki, and Teve. AND HELLO, CSIRKE, KACSA, AND OREO.", new GreetPeople().greeter(new String[]{"Twix", "Meki, Teve", "CSIRKE, KACSA", "OREO"}));
    }

    @Test
    public void ShouldGreet_11() {
        assertEquals("Hello, JUdit.", new GreetPeople().greeter(new String[]{"JUdit"}));
    }

    @Test
    public void ShouldGreet_12() {
        assertEquals("Hello, KaCsU.", new GreetPeople().greeter(new String[]{"KaCsU"}));
    }
}