package concise.triathlon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TriathlonTests {

	private final Triathlon app = new Triathlon();

	@Test
	void teamwork() {
		assertEquals("First one's easy!", app.tutorial());
	}

	@Test
	void commitment() {
		assertEquals(-1, app.F(-100));
		assertEquals(-1, app.F(-10));
		assertEquals(-1, app.F(-5));
		assertEquals(-1, app.F(-1));

		assertEquals(0, app.F(0));
		assertEquals(1, app.F(2));
		assertEquals(5, app.F(5));
		assertEquals(21, app.F(8));
		assertEquals(89, app.F(11));
		assertEquals(144, app.F(12));
		assertEquals(610, app.F(15));
		assertEquals(28657, app.F(23));
		assertEquals(514229, app.F(29));

		assertEquals(1836311903, app.F(46));
		assertEquals(-1, app.F(47));
		assertEquals(-1, app.F(48));
		assertEquals(-1, app.F(500));
	}

	@Test
	void passion() {
		assertEquals("sihT si a yletelpmoc lamron .ecnetnes",
			app.rvrs("This is a completely normal sentence."));

		assertEquals("tA ,esicnoC ew eveileb ni gnignahc eht dlrow yb gnidliub latigid stcudorp rof htworg .seinapmoc",
			app.rvrs("At Concise, we believe in changing the world by building digital products for growth companies."));

		assertEquals("eW era maet sreyalp ohw mrofsnart otni ruo stneilc TI ,tnemtraped ylsselmaes gnitaroballoc ruo maet htiw .srieht",
			app.rvrs("We are team players who transform into our clients IT department, seamlessly collaborating our team with theirs."));

		assertEquals("eW ekat lluf ytilibisnopser dna syawla tup ruo tseb toof drawrof nehw decaf htiw .segnellahc",
			app.rvrs("We take full responsibility and always put our best foot forward when faced with challenges."));

		assertEquals("snoituloS dereffo yb su era edam-roliat dna nevird yb ruo noissap ot etaerc gnihtemos .yranidroartxe",
			app.rvrs("Solutions offered by us are tailor-made and driven by our passion to create something extraordinary."));

		assertEquals("eW eulav ,krowmaet ,tnemtimmoc ,noissap noitavonni dna .ytivitaerc",
			app.rvrs("We value teamwork, commitment, passion, innovation and creativity."));

		assertEquals("eW era dettimmoc ot gnidivorp secivres hcihw lliw ekam a evitisop tcapmi .yllabolg",
			app.rvrs("We are committed to providing services which will make a positive impact globally."));
	}

	@Test
	void innovation() {
		assertEquals("", app.multiple(-10));
		assertEquals("", app.multiple(0));
		assertEquals("abc", app.multiple(3));
		assertEquals("abcde", app.multiple(5));
		assertEquals("abcdefgh", app.multiple(8));
		assertEquals("abcdefghijklmnopqrstuvwxyzabc", app.multiple(29));
		assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", app.multiple(52));
	}

	@Test
	void creativity() {
		assertEquals(Arrays.asList("hello", "hi"), app.lower(Arrays.asList("Hello", "Hi")));
		assertEquals(Arrays.asList("aaa", "bbb", "ccc"), app.lower(Arrays.asList("AAA", "BBB", "ccc")));
		assertEquals(Arrays.asList("kitten", "chocolate"), app.lower(Arrays.asList("KitteN", "ChocolaTE")));
		assertEquals(Arrays.asList("concise", "systems"), app.lower(Arrays.asList("CoNcIsE", "sYsTeMs")));
		assertEquals(Arrays.asList("red", "bull", "coffee", "tea", "monster"),
			app.lower(Arrays.asList("RED", "bUll", "cOFfee", "tea", "MONSTeR")));
		assertEquals(Arrays.asList("p2rnu", "tallinn", "tartu", "v6ru"),
			app.lower(Arrays.asList("P2rnu", "Tallinn", "Tartu", "V6ru")));
	}

}
