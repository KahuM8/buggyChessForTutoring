package swen221.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Map;
import java.util.Set;



import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;
import swen221.chessview.Position;
import swen221.chessview.moves.SinglePieceMove;
import swen221.chessview.pieces.King;
import swen221.chessview.pieces.Knight;
import swen221.chessview.pieces.Pawn;
import swen221.chessview.pieces.Queen;

public class ChessViewTests {

	// ================================================
	// Valid Tests
	// ================================================

	@Test public void testValid_01() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	//moving pawn double move
	@Test public void testValid_02() {
		
	}
	
	@Test public void testValid_03() {
		String input =
			"a2-a3 d7-d6\n" + "";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|p|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";
			check1(input,output);
		}
	
    //testing double move
	
	
	//trying to take black pawn
	@Test public void testValid_04() {
		String input =
			"a2-a4 b7-b5\n" +
		"a4xb5\n";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|P|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	//bishop move
	@Test public void testValid_05() {
		String input =
			"b2-b4 e7-e5\n" +
		"Bc1-a3\n";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|p|_|_|_|\n" +
			"4|_|P|_|_|_|_|_|_|\n" +
			"3|B|_|_|_|_|_|_|_|\n" +
			"2|P|_|P|P|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	//double move
	@Test public void testValid_06() {
		String input =
			"a2-a4 h7-h5\n" +
		"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|_|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|p|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	//moving knights
	
	@Test public void testValid_07() {
		
	}
	//black pawn takes white pawn
	@Test public void testValid_08() {
		String input =
			"d2-d4 e7-e6\n" +
		"d4-d5 e6xd5\n";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|p|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|P|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

	}
	
	@Test public void testValid_09() {
		String input =
			"d2-d4 ng8-f6\n " +
		"d4-d5 nf6xd5\n ";
		String output =
			"8|r|n|b|q|k|b|_|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|n|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

	}
	



    //enPassent tests

   
    @Test public void testValid_10() {
	
}

    @Test public void testValid_11() {

		String input =
			"h2-h3 b7-b5\n" + 
			"g2-g3 b5-b4\n" + 
			"a2-a4 b4xa3ep\n" + 
			"";

		String output =
			"8|r|n|b|q|k|b|n|r|\n"+
			"7|p|_|p|p|p|p|p|p|\n"+
			"6|_|_|_|_|_|_|_|_|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|p|_|_|_|_|_|P|P|\n"+
			"2|_|P|P|P|P|P|_|_|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
		check1(input,output);

	}
	
    @Test public void testValid_12() {

		 String input =
		 "Nb1-c3 e7-e6\n"+
		 "Nc3-d5 e6-e5\n"+
		 "Nd5xc7 Ke8-e7\n"+
		 "Nc7xRa8\n" +
		 "";

		 String output =
		 "8|N|n|b|q|_|b|n|r|\n"+
		 "7|p|p|_|p|k|p|p|p|\n"+
		 "6|_|_|_|_|_|_|_|_|\n"+
		 "5|_|_|_|_|p|_|_|_|\n"+
		 "4|_|_|_|_|_|_|_|_|\n"+
		 "3|_|_|_|_|_|_|_|_|\n"+
		 "2|P|P|P|P|P|P|P|P|\n"+
		 "1|R|_|B|Q|K|B|N|R|\n"+
		 "  a b c d e f g h";
		 check1(input,output);
		 }
    
    @Test public void testValid_13() {

		 String input =
		 "d2-d4 e7-e5\n"  +
		 "d4-d5 Ke8-e7\n" +
		 "d5-d6 e5-e4\n"  +
		 "d6-c7+\n" +
		 "";

		 String output =
		 "8|r|n|b|q|_|b|n|r|\n"+
		 "7|p|p|p|p|k|p|p|p|\n"+
		 "6|_|_|_|P|_|_|_|_|\n"+
		 "5|_|_|_|_|_|_|_|_|\n"+
		 "4|_|_|_|_|p|_|_|_|\n"+
		 "3|_|_|_|_|_|_|_|_|\n"+
		 "2|P|P|P|_|P|P|P|P|\n"+
		 "1|R|N|B|Q|K|B|N|R|\n"+
		 "  a b c d e f g h";
		 check1(input,output);
		 
		 }
	
	
	
   //rook testing moving/removing and king in check and taken out of check
	@Test public void testValid_14() {
		 String input =
		 "a2-a4 a7-a5\n"+
		 "Ra1-a3 Ra8-a6\n"+
		 "Ra3-h3 Ra6-e6\n"+
		 "Rh3xh7 Re6xe2+\n"+
		 "Bf1xRe2\n" +
		 "";
		 String output =
		 "8|_|n|b|q|k|b|n|r|\n"+
		 "7|_|p|p|p|p|p|p|R|\n"+
		 "6|_|_|_|_|_|_|_|_|\n"+
		 "5|p|_|_|_|_|_|_|_|\n"+
		 "4|P|_|_|_|_|_|_|_|\n"+
		 "3|_|_|_|_|_|_|_|_|\n"+
		 "2|_|P|P|P|B|P|P|P|\n"+
		 "1|_|N|B|Q|K|_|N|R|\n"+
		 "  a b c d e f g h";
		 check1(input,output);
		 }
		 
	@Test public void testValid_15() {
				String input =
					"e2-e4 e7-e5\n" +
					"Ke1-e2 Ke8-e7\n";
				String output =
					"8|r|n|b|q|_|b|n|r|\n" +
					"7|p|p|p|p|k|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|p|_|_|_|\n" +
					"4|_|_|_|_|P|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|K|P|P|P|\n" +
					"1|R|N|B|Q|_|B|N|R|\n" +
					"  a b c d e f g h";

				check1(input,output);
			}
		 
	@Test public void testValid_16() {
				String input =
					"Nb1-a3 c7-c5\n"+
			     	"Na3-b5 c5-c4\n" +
					"Nb5-c7 c4-c3\n"+
			     	 "Nc7xRa8\n";
				String output =
					"8|N|n|b|q|k|b|n|r|\n" +
					"7|p|p|_|p|p|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|p|_|_|_|_|_|\n" +
					"2|P|P|P|P|P|P|P|P|\n" +
					"1|R|_|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

				check1(input,output);
			}
		 
	@Test public void testValid_17() {
				String input =
					"a2-a4 b7-b5\n" +
					"a4xb5 h7-h5\n"+
					"b5-b6 h5-h4\n"+
					"b6-b7 h4-h3\n"+
					"b7xRa8\n";
				String output =
					"8|P|n|b|q|k|b|n|r|\n" +
					"7|p|_|p|p|p|p|p|_|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|p|\n" +
					"2|_|P|P|P|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

				check1(input,output);
			}
		 
	@Test public void testValid_19() {
		        String input =
		            "a2-a4 a7-a5\n" +
		            "Ra1-a3 Ra8-a6\n" +
		            "Ra3-h3 Ra6-h6\n" +
		                    "";
		        String output =
		            "8|_|n|b|q|k|b|n|r|\n" +
		            "7|_|p|p|p|p|p|p|p|\n" +
		            "6|_|_|_|_|_|_|_|r|\n" +
		            "5|p|_|_|_|_|_|_|_|\n" +
		            "4|P|_|_|_|_|_|_|_|\n" +
		            "3|_|_|_|_|_|_|_|R|\n" +
		            "2|_|P|P|P|P|P|P|P|\n" +
		            "1|_|N|B|Q|K|B|N|R|\n" +
		            "  a b c d e f g h";

		        check1(input,output);
		    }
		 
	@Test public void testValid_20() {


		

		        String input =
		            "a2-a4 a7-a5\n" +
		            "Ra1-a3 Ra8-a6\n" +
		            "Ra3-h3 Ra6-h6\n" +
		            "Rh3xRh6\n"+
		                    "";
		        String output =
		            "8|_|n|b|q|k|b|n|r|\n" +
		            "7|_|p|p|p|p|p|p|p|\n" +
		            "6|_|_|_|_|_|_|_|R|\n" +
		            "5|p|_|_|_|_|_|_|_|\n" +
		            "4|P|_|_|_|_|_|_|_|\n" +
		            "3|_|_|_|_|_|_|_|_|\n" +
		            "2|_|P|P|P|P|P|P|P|\n" +
		            "1|_|N|B|Q|K|B|N|R|\n" +
		            "  a b c d e f g h";

		        check1(input,output);
		 
		 }
	
	
	
	//castleing tests
	//king side
	@Test public void testValid_21() {
           }

	//queen side 
	@Test public void testValid_22() {

		
		 String input =
		            "b2-b3 b7-b6\n" +
		            "Nb1-c3 Nb8-c6\n" +
		            "Bc1-a3 Bc8-a6\n" +
		            "d2-d3 d7-d6\n" +
		            "Qd1-d2 Qd8-d7\n" +
		            "O-O-O O-O-O\n" +
		            "";

		        String output =
		            "8|_|_|k|r|_|b|n|r|\n" +
		            "7|p|_|p|q|p|p|p|p|\n" +
		            "6|b|p|n|p|_|_|_|_|\n" +
		            "5|_|_|_|_|_|_|_|_|\n" +
		            "4|_|_|_|_|_|_|_|_|\n" +
		            "3|B|P|N|P|_|_|_|_|\n" +
		            "2|P|_|P|Q|P|P|P|P|\n" +
		            "1|_|_|K|R|_|B|N|R|\n" +
		            "  a b c d e f g h";

		            check1(input,output);
		        
		        check1(input,output);
		    }
	
	
	
	//empassent test 2.0
	@Test public void testValid_23() {
		String input =
			"a2-a3 b7-b5\n" +
			"a3-a4 b5-b4\n" +
			"c2-c4 b4xc3ep\n";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|p|_|_|_|_|_|\n" +
			"2|_|P|_|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	
	
	//king in check
	
	@Test public void testValid_24() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_25() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	
	//queen different types of moves  
	@Test public void testValid_27() {
		
	}
	//king moves
	@Test public void testValid_28() {
		String input =
			"c2-c4 c7-c5\n" +
			"Qd1-a4 Qd8-a5\n"+
			"d2-d4 d7-d5\n"+
			"e2-e4 e7-e5\n"+
			"f2-f4 f7-f5\n"+
			"Bf1-d3 Bf8-d6\n"+
			"Ke1-e2 Ke8-e7\n"+
			"Ke2-e1 Ke7-e8\n"+
			"Ke1-d1 Ke8-d8\n"+
			"Kd1-e1 Kd8-e8\n"+
			"Qa4-d7+ Ke8xd7\n"+
			""
			;
		String output =
			"8|r|n|b|_|k|_|n|r|\n" +
			"7|p|p|_|_|_|_|p|p|\n" +
			"6|_|_|_|b|_|_|_|_|\n" +
			"5|q|_|p|p|p|p|_|_|\n" +
			"4|Q|_|P|P|P|P|_|_|\n" +
			"3|_|_|_|B|_|_|_|_|\n" +
			"2|P|P|_|_|_|_|P|P|\n" +
			"1|R|N|B|_|K|_|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_29() {
        // Black on white en-passant 
        String input =
            "Ng1-h3 g7-g5\n" +
            "Nh3-f4 g5-g4\n" +
            "h2-h4 g4xh3ep\n" +
            "";
        String output =
            "8|r|n|b|q|k|b|n|r|\n" +
            "7|p|p|p|p|p|p|_|p|\n" +
            "6|_|_|_|_|_|_|_|_|\n" +
            "5|_|_|_|_|_|_|_|_|\n" +
            "4|_|_|_|_|_|N|_|_|\n" +
            "3|_|_|_|_|_|_|_|p|\n" +
            "2|P|P|P|P|P|P|P|_|\n" +
            "1|R|N|B|Q|K|B|_|R|\n" +
            "  a b c d e f g h";

        check1(input,output);
    }

	
	//knight tests
	@Test public void testValid_30() {
		String input =
			"d2-d4 Nb8-c6\n" +
			"Ng1-f3 Nc6-e5\n" +
			"Nf3xNe5" +
			"";
			String output =
				"8|r|_|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|N|_|_|_|\n" +
				"4|_|_|_|P|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|_|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|_|R|\n" +
				"  a b c d e f g h";

			check1(input,output);
	}
	
	@Test public void testValid_31() {
		String input =
			"d2-d4 Nb8-c6\n" +
			"e2-e4 Nc6xd4\n" +
			"";
		String output =
			"8|r|_|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|n|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	@Test public void testValid_32() {
		String input =
			"Nb1-c3 e7-e5\n" +
			"e2-e3 e5-e4\n" +
			"Nc3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|N|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	
	
	//pawn promotion tests
	@Test public void testValid_33() {
		String input =
				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a5\n"+ "Nb1-c3 Bc8-a6\n"+ 
				"b6-b7 d7-d5\n" + 
				"b7-b8=Q\n" +
				"";
		
		String output =
				"8|r|Q|_|q|k|b|n|r|\n"+
				"7|_|_|p|_|p|p|p|p|\n"+
				"6|b|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|p|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_34() {
		String input =
				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
				"b7-b8=Q\n" +
				"";
		String output =
				"8|r|Q|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
	
	}
	
	@Test public void testValid_35() {
		String input =
				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
				"b7-b8=R\n" +
				"";
		String output =
				"8|r|R|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
	
	}
	
	@Test public void testValid_36() {
		String input =
				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
				"b7-b8=N\n" +
				"";
		String output =
				"8|r|N|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
	
	}

	@Test public void testValid_37() {

		String input =
				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
				"b7-b8=B\n" +
				"";
		String output =
				"8|r|B|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
	
	}
	
	
	//king tests
	
	@Test public void testValid_38() {
		String input =
				"e2-e4 d7-d5\n"+
				"Bf1-d3 Qd8-d6\n"+
				"e4xd5 Ke8-d8" +
				"";
		String output =
				 "8|r|n|b|k|_|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|q|_|_|_|_|\n"+
				 "5|_|_|_|P|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|B|_|_|_|_|\n"+
				 "2|P|P|P|P|_|P|P|P|\n"+
				 "1|R|N|B|Q|K|_|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_39() {
		String input =
				"e2-e4 d7-d5\n" +
				"Ke1-e2\n" +
			"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|p|_|_|_|_|\n"+
				 "4|_|_|_|_|P|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|K|P|P|P|\n"+
				 "1|R|N|B|Q|_|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_40() {
		String input =
				"e2-e4 d7-d5\n"+
				"Bf1-d3 d5xe4\n"+
				"Ke1-f1" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|p|_|_|_|\n"+
				 "3|_|_|_|B|_|_|_|_|\n"+
				 "2|P|P|P|P|_|P|P|P|\n"+
				 "1|R|N|B|Q|_|K|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_41() {
		String input =
				"f2-f4 e7-e5\n" + "Ke1-f2 c7-c6\n"+ 
				"Kf2-e3 g7-g6\n" + "Ke3-e4 h7-h6\n" + 
				"Ke4xe5\n" +
				"";
		String output =
                "8|r|n|b|q|k|b|n|r|\n"+
                "7|p|p|_|p|_|p|_|_|\n"+
                "6|_|_|p|_|_|_|p|p|\n"+
                "5|_|_|_|_|K|_|_|_|\n"+
                "4|_|_|_|_|_|P|_|_|\n"+
                "3|_|_|_|_|_|_|_|_|\n"+
                "2|P|P|P|P|P|_|P|P|\n"+
                "1|R|N|B|Q|_|B|N|R|\n"+
                "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_42() {


		
		
		String input =
				"e2-e4 d7-d5\n" + "Ke1-e2 Nb8-c6\n" + 
				"e4xd5 Nc6-d4\n"+ "Ke2-d3 e7-e5\n"+
				"d5xe6ep Qd8-e7\n" + "Kd3xNd4\n" +
			    "";
		String output =
                "8|r|_|b|_|k|b|n|r|\n"+
                "7|p|p|p|_|q|p|p|p|\n"+
                "6|_|_|_|_|P|_|_|_|\n"+
                "5|_|_|_|_|_|_|_|_|\n"+
                "4|_|_|_|K|_|_|_|_|\n"+
                "3|_|_|_|_|_|_|_|_|\n"+
                "2|P|P|P|P|_|P|P|P|\n"+
                "1|R|N|B|Q|_|B|N|R|\n"+
                "  a b c d e f g h";

		check1(input,output);
	}
	
	
	
	//bishop test 
	@Test public void testValid_43() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_44() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5-h4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|B|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_45() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" + "Bg5-h4 f7-f6\n"+
			"Bh4xf6\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|_|p|p|\n" +
			"6|_|_|_|_|_|B|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_46() {
		String input =
				"e2-e4 e7-e5\n" +
				"Bf1-a6 Bf8-a3\n" +
				"Ba6xb7 Ba3xb2"+
						"";
			String output =
					"8|r|n|b|q|k|_|n|r|\n"+
					"7|p|B|p|p|_|p|p|p|\n"+
					"6|_|_|_|_|_|_|_|_|\n"+
					"5|_|_|_|_|p|_|_|_|\n"+
					"4|_|_|_|_|P|_|_|_|\n"+
					"3|_|_|_|_|_|_|_|_|\n"+
					"2|P|b|P|P|_|P|P|P|\n"+
					"1|R|N|B|Q|K|_|N|R|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	
	//queen tests
	@Test public void testValid_47() {
		String input =
			"e2-e4 d7-d5\n" +
			"Qd1-e2\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|Q|P|P|P|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_48() {
		String input =
			"e2-e4 d7-d5\n" +
			"Qd1-e2 Qd8-d6\n" +
			"";
		String output = 
			"8|r|n|b|_|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|q|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|Q|P|P|P|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_49() {
		String input =
			"e2-e4 d7-d5\n" +
			"Qd1-g4 Qd8-d6\n" +
			"Qg4xBc8\n"+
			"";
		String output = 
			"8|r|n|Q|_|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|q|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_50() {
		String input =
			"e2-e4 d7-d5\n" +
			"Qd1-g4 Qd8-d6" +
			"";
		String output =
				 "8|r|n|b|_|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|q|_|_|_|_|\n"+
				 "5|_|_|_|p|_|_|_|_|\n"+
				 "4|_|_|_|_|P|_|Q|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|_|P|P|P|\n"+
				 "1|R|N|B|_|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testValid_51() {

		String input =
			"e2-e4 e7-e5\n" +
			"Qd1-g4 Qd8-h4\n" +
			"Qg4-f4 Qh4-h6\n" +
			"Qf4-f6 Qh6xh2\n" +
			"";
		String output =
			"8|r|n|b|_|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|Q|_|_|\n" +
			"5|_|_|_|_|p|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|q|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	//bishop
	
	@Test public void testValid_52() {
	String input =
			"f2-f4 e7-e5\n" +
			"g2-g3 Bf8-c5\n" +
			"Nb1-c3 Bc5xNg1"+
					"";
		String output =
				"8|r|n|b|q|k|_|n|r|\n"+
				"7|p|p|p|p|_|p|p|p|\n"+
				"6|_|_|_|_|_|_|_|_|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|_|P|_|_|\n"+
				"3|_|_|N|_|_|_|P|_|\n"+
				"2|P|P|P|P|P|_|_|P|\n"+
				"1|R|_|B|Q|K|B|b|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
}

	@Test public void testValid_53() {
	String input =
		"d2-d3 d7-d5\n" +
		"Bc1-g5 Bc8-g4\n" +
		"Bg5xe7\n" +
		"";
	String output =
		"8|r|n|_|q|k|b|n|r|\n" +
		"7|p|p|p|_|B|p|p|p|\n" +
		"6|_|_|_|_|_|_|_|_|\n" +
		"5|_|_|_|p|_|_|_|_|\n" +
		"4|_|_|_|_|_|_|b|_|\n" +
		"3|_|_|_|P|_|_|_|_|\n" +
		"2|P|P|P|_|P|P|P|P|\n" +
		"1|R|N|_|Q|K|B|N|R|\n" +
		"  a b c d e f g h";

	check1(input,output);
}

	@Test public void testValid_54() {
	String input =
		"d2-d3 d7-d5\n" +
		"Bc1-g5 Bc8-g4\n" + "Bg5-h4 f7-f6\n"+
		"Bh4xf6\n" +
		"";
	String output =
		"8|r|n|_|q|k|b|n|r|\n" +
		"7|p|p|p|_|p|_|p|p|\n" +
		"6|_|_|_|_|_|B|_|_|\n" +
		"5|_|_|_|p|_|_|_|_|\n" +
		"4|_|_|_|_|_|_|b|_|\n" +
		"3|_|_|_|P|_|_|_|_|\n" +
		"2|P|P|P|_|P|P|P|P|\n" +
		"1|R|N|_|Q|K|B|N|R|\n" +
		"  a b c d e f g h";

	check1(input,output);
}

	@Test public void testValid_55() {
	String input =
			"e2-e4 e7-e5\n" +
			"Bf1-a6 Bf8-a3\n" +
			"Ba6xb7 Ba3xb2"+
					"";
		String output =
				"8|r|n|b|q|k|_|n|r|\n"+
				"7|p|B|p|p|_|p|p|p|\n"+
				"6|_|_|_|_|_|_|_|_|\n"+
				"5|_|_|_|_|p|_|_|_|\n"+
				"4|_|_|_|_|P|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|P|b|P|P|_|P|P|P|\n"+
				"1|R|N|B|Q|K|_|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);
}
	
	
	// Pawn promotion test v3
	
	
	@Test public void testValid_56() {

		String input =

				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a5\n"+ "Nb1-c3 Bc8-a6\n"+ 
				"b6-b7 d7-d5\n" + 
				"b7-b8=Q\n" +
				"";	

			String output =

				"8|r|Q|_|q|k|b|n|r|\n"+
				"7|_|_|p|_|p|p|p|p|\n"+
				"6|b|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|p|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
			check1(input,output);

	}

	@Test public void testValid_57() {

		String input =

				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
			    "b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
			    "b7-b8=B\n" +
			    "";

		String output =

				"8|r|B|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";
			check1(input,output);

		}
	 
	@Test public void testValid_58() {

		String input =

				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
				"b7-b8=N\n" +
				"";

		String output =

				"8|r|N|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);

	}

    @Test public void testValid_59() {

		String input =

				"a2-a4 b7-b5\n"+ "a4xb5 Nb8-c6\n"+ 
				"b5-b6 a7-a6\n"+ "b6-b7 a6-a5\n" + 
				"b7-b8=R\n" +
				"";

		String output =

				"8|r|R|b|q|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|_|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|_|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|N|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";

		check1(input,output);

	}

	@Test public void testValid_60() {

		String input =

				"a2-a4 b7-b5\n"+
				"a4xb5 Nb8-c6\n"+
				"b5-b6 a7-a5\n"+
				"Nb1-c3 Bc8-a6\n"+
				"b6-b7 Qd8-c8\n"+
				"b7xQc8=Q" +
				"";

		String output =

				"8|r|_|Q|_|k|b|n|r|\n"+
				"7|_|_|p|p|p|p|p|p|\n"+
				"6|b|_|n|_|_|_|_|_|\n"+
				"5|p|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|_|_|N|_|_|_|_|_|\n"+
				"2|_|P|P|P|P|P|P|P|\n"+
				"1|R|_|B|Q|K|B|N|R|\n"+
				"  a b c d e f g h";



		check1(input,output);

	}

	@Test public void testValid_61() {

		String input =

				"a2-a3 d7-d5\n"
				+ "b2-b3 d5-d4\n"
				+ "c2-c4 d4xc3ep\n"
				+ "Bc1-b2 c3xBb2\n"
				+ "Qd1-c1 b2xQc1=Q+" +
				"";

		String output =

				"8|r|n|b|q|k|b|n|r|\n"+
				"7|p|p|p|_|p|p|p|p|\n"+
				"6|_|_|_|_|_|_|_|_|\n"+
				"5|_|_|_|_|_|_|_|_|\n"+
				"4|_|_|_|_|_|_|_|_|\n"+
				"3|P|P|_|_|_|_|_|_|\n"+
				"2|_|p|_|P|P|P|P|P|\n"+
				"1|R|N|Q|_|K|B|N|R|\n"+
				"  a b c d e f g h";



		check1(input,output);

	}
	
	//Castling tests v2

	@Test public void testValid_62() {
		String input =
				"e2-e4 e7-e6\n"+
				"Ng1-f3 d7-d6\n"+
				"Bf1-b5 f7-f6\n"+
				"O-O\n"+
				"";
			String output =
					"8|r|n|b|q|k|b|n|r|\n"+
					"7|p|p|p|_|_|_|p|p|\n"+
					"6|_|_|_|p|p|p|_|_|\n"+
					"5|_|B|_|_|_|_|_|_|\n"+
					"4|_|_|_|_|P|_|_|_|\n"+
					"3|_|_|_|_|_|N|_|_|\n"+
					"2|P|P|P|P|_|P|P|P|\n"+
					"1|R|N|B|Q|_|R|K|_|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	
	@Test public void testValid_63() {
		String input =
				"a2-a3 d7-d5\n" + "b2-b3 Qd8-d6\n" +
				"c2-c3 Bc8-e6\n" + "d2-d3 Nb8-a6\n" +
				"e2-e3 O-O-O\n"+
				"";
			String output =
					"8|_|_|k|r|_|b|n|r|\n"+
					"7|p|p|p|_|p|p|p|p|\n"+
					"6|n|_|_|q|b|_|_|_|\n"+
					"5|_|_|_|p|_|_|_|_|\n"+
					"4|_|_|_|_|_|_|_|_|\n"+
					"3|P|P|P|P|P|_|_|_|\n"+
					"2|_|_|_|_|_|P|P|P|\n"+
					"1|R|N|B|Q|K|B|N|R|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	
	@Test public void testValid_64() {
		String input =
				"e2-e3 e7-e6\n"+
				"d2-d3 Ng8-f6\n"+
				"c2-c3 Bf8-b4\n"+
				"a2-a4 O-O\n"+
				"";
			String output =
					"8|r|n|b|q|_|r|k|_|\n"+
					"7|p|p|p|p|_|p|p|p|\n"+
					"6|_|_|_|_|p|n|_|_|\n"+
					"5|_|_|_|_|_|_|_|_|\n"+
					"4|P|b|_|_|_|_|_|_|\n"+
				    "3|_|_|P|P|P|_|_|_|\n"+
					"2|_|P|_|_|_|P|P|P|\n"+
					"1|R|N|B|Q|K|B|N|R|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	
	// ================================================
	// Invalid Tests
	// ================================================

	@Test public void testInvalid_01() {
		String input =
			"a2-a2\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}

	
	

	// The following provides a simple helper method for all tests.
	public static void check1(String input, String expectedOutput) {
		try {
			ChessGame game = new ChessGame(input);
			List<Board> boards = game.boards();
			if (boards.isEmpty()) {
				fail("test failed with insufficient boards on input: " + input);
			}
			String actualOutput = boards.get(boards.size() - 1).toString();
			assertEquals(expectedOutput, actualOutput);
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
		
	}
	

//pawn can't move illegally
	@Test public void testInvalid_02() {
			String input =
			"a2-a3 b7-b5\n" +
			"a3-a4 b5-b4\n" +
			"a4xb5ep\n" +
			"";
			String output =
			"8|r|n|b|q|k|b|n|r|\n"+
			"7|p|_|p|p|p|p|p|p|\n"+
			"6|_|_|_|_|_|_|_|_|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|P|p|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|_|P|P|P|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
			
			check1(input,output);
			}
			
	@Test public void testInvalid_03() {
			String input =
			"h2-h3 b7-b5\n" +
			"a2-a3 b5-b4\n" +
			"a3-a4 b4xa3ep\n" +
			"";
			String output =
			"8|r|n|b|q|k|b|n|r|\n"+
			"7|p|_|p|p|p|p|p|p|\n"+
			"6|_|_|_|_|_|_|_|_|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|P|p|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|P|\n"+
			"2|_|P|P|P|P|P|P|_|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
			
			
			check1(input,output);
			}
			
	@Test public void testInvalid_04() {
			String input =
			"a2-a4 b7-b6\n" +
			"a4-a5 b6-b5\n" +
			"a5xb6ep\n" +  
			"";
			String output =
			"8|r|n|b|q|k|b|n|r|\n"+
			"7|p|_|p|p|p|p|p|p|\n"+
			"6|_|P|_|_|_|_|_|_|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|_|_|_|_|_|_|\n"+
			"2|_|P|P|P|P|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";
			
			check1(input,output);
			}
			
	@Test public void Testinvalid_05() {
				String input =
					"e2-e4+" +
					"";
				String output =
			 		 "8|r|n|b|q|k|b|n|r|\n"+
					 "7|p|p|p|p|p|p|p|p|\n"+
					 "6|_|_|_|_|_|_|_|_|\n"+
					 "5|_|_|_|_|_|_|_|_|\n"+
					 "4|_|_|_|_|_|_|_|_|\n"+
					 "3|_|_|_|_|_|_|_|_|\n"+
					 "2|P|P|P|P|P|P|P|P|\n"+
					 "1|R|N|B|Q|K|B|N|R|\n"+
					 "  a b c d e f g h";
				check1(input,output);
			}
			
	@Test public void Testinvalid_06() {
				String input =
					"Nb1-c3 e7-e6\n"+
					"Nc3-d5 e6-e5\n"+
					"Nd5xc7 h7-h6" +
					"";
				String output =
			 		 "8|r|n|b|q|k|b|n|r|\n"+
					 "7|p|p|N|p|_|p|p|_|\n"+
					 "6|_|_|_|_|p|_|_|p|\n"+
					 "5|_|_|_|_|_|_|_|_|\n"+
					 "4|_|_|_|_|_|_|_|_|\n"+
					 "3|_|_|_|_|_|_|_|_|\n"+
					 "2|P|P|P|P|P|P|P|P|\n"+
					 "1|R|_|B|Q|K|B|N|R|\n"+
					 "  a b c d e f g h";
					check1(input,output);
			}
			
	@Test public void Testinvalid_07() {
				String input =
					"c2-c3 h7-h6\n"+
					"Qd1-a4 d7-d6" +
					"";
				String output =
			 		 "8|r|n|b|q|k|b|n|r|\n"+
					 "7|p|p|p|_|p|p|p|_|\n"+
					 "6|_|_|_|p|_|_|_|p|\n"+
					 "5|_|_|_|_|_|_|_|_|\n"+
					 "4|Q|_|_|_|_|_|_|_|\n"+
					 "3|_|_|P|_|_|_|_|_|\n"+
					 "2|P|P|_|P|P|P|P|P|\n"+
					 "1|R|N|B|_|K|B|N|R|\n"+
					 "  a b c d e f g h";
				check1(input,output);
			}
			
	@Test public void Testinvalid_08() {
				String input =
					"d2-d4 e7-e5\n"+
					"d4xe5 a7-a6\n"+
					"e5-e6 Nb8-c6\n"+
					"e6-e7" +
					"";
				String output =
			 		 "8|r|_|b|q|k|b|n|r|\n"+
					 "7|_|p|p|p|P|p|p|p|\n"+
					 "6|p|_|n|_|_|_|_|_|\n"+
					 "5|_|_|_|_|_|_|_|_|\n"+
					 "4|_|_|_|_|_|_|_|_|\n"+
					 "3|_|_|_|_|_|_|_|_|\n"+
					 "2|P|P|P|_|P|P|P|P|\n"+
					 "1|R|N|B|Q|K|B|N|R|\n"+
					 "  a b c d e f g h";
				check1(input,output);
			}
			
	@Test public void testInvalid_09() {
				String input =
					"Nb1-c3 d7-d5\n" +
					"Nc3xb5\n"+
					"";
				String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|_|p|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|p|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|N|_|_|_|_|_|\n" +
					"2|P|P|P|P|P|P|P|P|\n" +
					"1|R|_|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

				check1(input,output);
			}
			
	@Test public void testInvalid_10() {
				String input =
					"g1-a3 a7-a6\n" +
					"";
				String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|p|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

				check1(input,output);
			}
		
			


//invalid test pawn promotion
	@Test public void testInvalid_11() {
					String input =
							"a2-a3 d7-d5\n"+
							"b2-b3 d5-d4\n"+
							"c2-c4 d4xc3ep\n"+
							"Bc1-b2 c3xBb2\n"+
							"Qd1-c1 b2xQc1" +
							"";
					String output =
							"8|r|n|b|q|k|b|n|r|\n"+
							"7|p|p|p|_|p|p|p|p|\n"+
							"6|_|_|_|_|_|_|_|_|\n"+
							"5|_|_|_|_|_|_|_|_|\n"+
							"4|_|_|P|p|_|_|_|_|\n"+
							"3|P|P|_|_|_|_|_|_|\n"+
							"2|_|B|_|P|P|P|P|P|\n"+
							"1|R|N|Q|_|K|B|N|R|\n"+
							"  a b c d e f g h";

					check1(input,output);
				
				}
				
	@Test public void testInvalid_12() {
					String input =
							"d2-d4 e7-e6\n"+
							"d4-d5 c7-c5\n"+
							"d5xc6ep Nb8-a6\n"+
							"c6xd7 Ke8-e7\n"+
							"d7xBc8" +
							"";
					String output =
							"8|r|_|P|q|_|b|n|r|\n"+
							"7|p|p|_|p|k|p|p|p|\n"+
							"6|n|_|_|_|p|_|_|_|\n"+
							"5|_|_|_|_|_|_|_|_|\n"+
							"4|_|_|_|_|_|_|_|_|\n"+
							"3|_|_|_|_|_|_|_|_|\n"+
							"2|P|P|P|_|P|P|P|P|\n"+
							"1|R|N|B|Q|K|B|N|R|\n"+
							"  a b c d e f g h";

					check1(input,output);
				
				}
				
	@Test public void testInvalid_13() {
					String input =
							"a2-a4 b7-b5\n"+
							"a4xb5 Nb8-c6\n"+
							"b5-b6 a7-a5\n"+
							"Nb1-c3 Bc8-a6\n"+
							"b6-b7 Qd8-c8\n"+
							"b7xQc8=Q" +
							"";
					String output =
							"8|r|_|Q|_|k|b|n|r|\n"+
							"7|_|_|p|p|p|p|p|p|\n"+
							"6|b|_|n|_|_|_|_|_|\n"+
							"5|p|_|_|_|_|_|_|_|\n"+
							"4|_|_|_|_|_|_|_|_|\n"+
							"3|_|_|N|_|_|_|_|_|\n"+
							"2|P|_|P|P|P|P|P|P|\n"+
							"1|R|_|B|Q|K|B|N|R|\n"+
							"  a b c d e f g h";

					check1(input,output);
				
				}
				
	@Test public void testInvalid_14() {
					String input =
							"a2-a3 d7-d5\n"
							+ "b2-b3 d5-d4\n"
							+ "c2-c4 d4xc3ep\n"
							+ "Bc1-b2 c3xBb2\n"
							+ "Qd1-c1 b2xQc1=B+" +
							"";
					String output =
							"8|r|n|b|q|k|b|n|r|\n"+
							"7|p|p|p|_|p|p|p|p|\n"+
							"6|_|_|_|_|_|_|_|_|\n"+
							"5|_|_|_|_|_|_|_|_|\n"+
							"4|_|_|P|p|_|_|_|_|\n"+
							"3|P|P|_|_|_|_|_|_|\n"+
							"2|_|B|_|P|P|P|P|P|\n"+
							"1|R|N|Q|_|K|B|N|R|\n"+
							"  a b c d e f g h";

					check1(input,output);
				
				}

	
	//king invalid tests
	@Test public void testInvalid_15() {
		String input =
			"e1-a3 a7-a6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_16() {
		String input =
				"e2-e4 e7-e6\n" +
				"Ke1-e3" +
				"";
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|_|_|_|_|p|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|P|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|_|P|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check1(input,output);
		}
	
    @Test public void testInvalid_17() {
		String input =
				"e2-e4 e7-e6\n" +
				"Ke1-e2 e6-e5\n" +
				"Ke2-f1"+
				"";
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|p|_|_|_|\n" +
				"4|_|_|_|_|P|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|K|P|P|P|\n" +
				"1|R|N|B|Q|_|B|N|R|\n" +
				"  a b c d e f g h";

			check1(input,output);
		}
	
	@Test public void testInvalid_18() {
		String input =
				"Ke1-e2" +
				"";
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check1(input,output);
		}

	//bishop invalid
	
	@Test public void testInvalid_20() {
		String input =
			"c1-a3 a7-a6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	@Test public void testInvalid_21() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-f4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_22() {

		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5-d4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check1(input,output);
		
		
	}//pawn tests 2.0
	
    @Test public void testInvalid_23() {
        // Pawn cannot hop a piece
        String input =
            "b2-b3 h7-h6\n" +
            "Bc1-b2 h6-h5\n" +
            "Bb2-f6 f7-f5\n" +
            "";
        String output =
            "8|r|n|b|q|k|b|n|r|\n" +
            "7|p|p|p|p|p|p|p|_|\n" +
            "6|_|_|_|_|_|B|_|_|\n" +
            "5|_|_|_|_|_|_|_|p|\n" +
            "4|_|_|_|_|_|_|_|_|\n" +
            "3|_|P|_|_|_|_|_|_|\n" +
            "2|P|_|P|P|P|P|P|P|\n" +
            "1|R|N|_|Q|K|B|N|R|\n" +
            "  a b c d e f g h";

        check1(input,output);
    }
    
    @Test public void testInvalid_24() {
        // White - move two squares after having already moved one
        String input =
            "b2-b3 g7-g5\n" +
            "b3-b5" +
            "";
        String output =
            "8|r|n|b|q|k|b|n|r|\n" +
            "7|p|p|p|p|p|p|_|p|\n" +
            "6|_|_|_|_|_|_|_|_|\n" +
            "5|_|_|_|_|_|_|p|_|\n" +
            "4|_|_|_|_|_|_|_|_|\n" +
            "3|_|P|_|_|_|_|_|_|\n" +
            "2|P|_|P|P|P|P|P|P|\n" +
            "1|R|N|B|Q|K|B|N|R|\n" +
            "  a b c d e f g h";

        check1(input,output);
    }
    
    @Test public void testInvalid_25() {
        // Black - move two squares after having already moved one
        String input =
            "b2-b3 g7-g6\n" +
            "c2-c4 g6-g4" +
            "";
        String output =
            "8|r|n|b|q|k|b|n|r|\n" +
            "7|p|p|p|p|p|p|_|p|\n" +
            "6|_|_|_|_|_|_|p|_|\n" +
            "5|_|_|_|_|_|_|_|_|\n" +
            "4|_|_|P|_|_|_|_|_|\n" +
            "3|_|P|_|_|_|_|_|_|\n" +
            "2|P|_|_|P|P|P|P|P|\n" +
            "1|R|N|B|Q|K|B|N|R|\n" +
            "  a b c d e f g h";

        check1(input,output);
    }

	//queen invalid
    @Test public void testInvalid_26() {
		String input =
				"e2-e4 d7-d5\n" + 
				"Qd1-e2 d5xe4\n" + 
				"Qe3-e2" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|p|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|Q|P|P|P|\n"+
				 "1|R|N|B|_|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_27() {
		String input =
				"e2-e4 d7-d5\n" + 
				"Qd1-e2 d5xe4\n" + 
				"Qe2xe6" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|p|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|Q|P|P|P|\n"+
				 "1|R|N|B|_|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_28() {
		String input =
				"e2-e4 d7-d5\n" + 
				"Qd1-e2 d5xe4\n" + 
				"Qe3xe2" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|p|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|Q|P|P|P|\n"+
				 "1|R|N|B|_|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_29() {
		String input =
				"Qd1xQd8" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_30() {
		String input =
				"Qd1xBc1" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	@Test public void testInvalid_31() {
		String input =
				"c2-c3 d7-d5\n" + 
				"Qd1-b3 e7-e6\n" + 
				"Qb3xe6" +
				"";
		String output =
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|_|p|p|p|\n"+
				 "6|_|_|_|_|p|_|_|_|\n"+
				 "5|_|_|_|p|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|Q|P|_|_|_|_|_|\n"+
				 "2|P|P|_|P|P|P|P|P|\n"+
				 "1|R|N|B|_|K|B|N|R|\n"+
				 "  a b c d e f g h";

		check1(input,output);
	}
	
	//Castling invalid test
	
	@Test public void testInvalid_32() {
		String input =
				"e2-e4 e7-e6\n"+
				"Ng1-f3 d7-d6\n"+
				"O-O-O"+
				"";
			String output =
					"8|r|n|b|q|k|b|n|r|\n"+
					"7|p|p|p|_|_|p|p|p|\n"+
					"6|_|_|_|p|p|_|_|_|\n"+
					"5|_|_|_|_|_|_|_|_|\n"+
					"4|_|_|_|_|P|_|_|_|\n"+
					"3|_|_|_|_|_|N|_|_|\n"+
					"2|P|P|P|P|_|P|P|P|\n"+
					"1|R|N|B|Q|K|B|_|R|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	
	@Test public void testInvalid_33() {
		String input =
				"e2-e3 e7-e6\n"+
				"d2-d3 Ng8-f6\n"+
				"c2-c3 O-O"+
				"";
		String output =
			"8|r|n|b|q|k|b|_|r|\n"+
			"7|p|p|p|p|_|p|p|p|\n"+
			"6|_|_|_|_|p|n|_|_|\n"+
			"5|_|_|_|_|_|_|_|_|\n"+
			"4|_|_|_|_|_|_|_|_|\n"+
			"3|_|_|P|P|P|_|_|_|\n"+
			"2|P|P|_|_|_|P|P|P|\n"+
			"1|R|N|B|Q|K|B|N|R|\n"+
			"  a b c d e f g h";

			check1(input,output);
	}
	
	@Test public void testInvalid_34() {
		String input =
				"a2-a3 d7-d5\n" + 
				"b2-b3 Qd8-d6\n" + 
				"c2-c3 Bc8-e6\n" + 
				"e2-e3 O-O"+
				"";
			String output =
					"8|r|n|_|_|k|b|n|r|\n"+
					"7|p|p|p|_|p|p|p|p|\n"+
					"6|_|_|_|q|b|_|_|_|\n"+
					"5|_|_|_|p|_|_|_|_|\n"+
					"4|_|_|_|_|_|_|_|_|\n"+
					"3|P|P|P|_|P|_|_|_|\n"+
					"2|_|_|_|P|_|P|P|P|\n"+
					"1|R|N|B|Q|K|B|N|R|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	
	@Test public void testInvalid_35() {
		String input =
				"e2-e4 e7-e6\n"+
				"Ng1-f3 d7-d6\n"+
				"e1-e2 e8-e7\n" +
				"e2-e1 e7-e8\n"+
				"O-O-O"+
				"";
			String output =
					"8|r|n|b|q|k|b|n|r|\n"+
					"7|p|p|p|_|_|p|p|p|\n"+
					"6|_|_|_|p|p|_|_|_|\n"+
					"5|_|_|_|_|_|_|_|_|\n"+
					"4|_|_|_|_|P|_|_|_|\n"+
					"3|_|_|_|_|_|N|_|_|\n"+
					"2|P|P|P|P|_|P|P|P|\n"+
					"1|R|N|B|Q|K|B|_|R|\n"+
					"  a b c d e f g h";

			check1(input,output);
	}
	// ================================================
	// string tests
	// ================================================
	@Test public void testValidAssertion_01() {
		// Check King's SinglePieceMove string output are correct
		try {					
			String input =
		        "e2-e3 e7-e6\n"+
		        "Ke1-e2\n"+
		        "";
			
			ChessGame game = new ChessGame(input);

			King k = new King(true);
			Position p1 = new Position(1,5);
			Position p2 = new Position(2,5);
			
			SinglePieceMove m = new SinglePieceMove(k, p1, p2);
			assertEquals("Ke1-e2", m.toString());
			
		} catch (Exception e) {
			fail("Test failed");
		}
	}
	
	@Test public void testValidAssertion_02() {
		// Check Queen's SinglePieceMove string output are correct
		try {					
			String input =
		        "d2-d3 e7-e6\n"+
		        "Qd1-d2\n"+
		        "";
			
			ChessGame game = new ChessGame(input);

			Queen q = new Queen(true);
			Position p1 = new Position(1,4);
			Position p2 = new Position(2,4);
			
			SinglePieceMove m = new SinglePieceMove(q, p1, p2);
			assertEquals("Qd1-d2", m.toString());
			
		} catch (Exception e) {
			fail("Test failed");
		}

	
	}
	
	@Test public void testValidAssertion_03() {
		// Check Knight's SinglePieceMove string output are correct
		try {					
			String input =
		        "Nb1-c3\n"+
		        "";
			
			ChessGame game = new ChessGame(input);

			Knight n = new Knight(true);
			Position p1 = new Position(1,2);
			Position p2 = new Position(3,3);
			
			SinglePieceMove m = new SinglePieceMove(n, p1, p2);
			assertEquals("Nb1-c3", m.toString());
			
		} catch (Exception e) {
			fail("Test failed");
		}
	}
	
	@Test public void testValidAssertion_04() {
		// Check Pawn SinglePieceMove string output are correct
		try {					
			String input =
		        "Nb1-c3\n"+
		        "";
			
			ChessGame game = new ChessGame(input);

			Pawn p = new Pawn(true);
			Position p1 = new Position(2,2);
			Position p2 = new Position(3,2);
			
			SinglePieceMove m = new SinglePieceMove(p, p1, p2);
			assertEquals("b2-b3", m.toString());
			
		} catch (Exception e) {
			fail("Test failed");
		}
   }
}



	
	


