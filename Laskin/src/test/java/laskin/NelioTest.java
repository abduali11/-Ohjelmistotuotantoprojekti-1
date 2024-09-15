package laskin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NelioTest {

	private Laskin laskin = new Laskin();
	private final double DELTA = 0.001;

	@ParameterizedTest
	@CsvSource({
			"5, 25",
			"6, 36",
			"7, 49"
	})
	public void testNelio(int input, int expected) {
		laskin.nelio(input);
		assertEquals(expected, laskin.annaTulos(), "Neliöön korotus ei nyt kyllä skulaa");
	}
}