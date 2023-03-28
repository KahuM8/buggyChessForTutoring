package swen221.chessview.pieces;

import swen221.chessview.*;

/**
 * Represents a bishop on the board.
 *
 * @author David J. Pearce
 *
 */
public class Pawn extends PieceImpl implements Piece {
	private boolean wasDoubleStep; // remember whether took double step or not.

	/**
	 * Construct a new bishop.
	 *
	 * @param isWhite True if the bishop is white.
	 */
	public Pawn(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position oldPosition, Position newPosition,
			Piece isTaken, Board board) {
		int oldRow = oldPosition.row();
		int oldCol = oldPosition.column();
		
		int newRow = newPosition.row();
		int newCol = newPosition.column();

		Piece p = board.pieceAt(oldPosition);
		Piece t = board.pieceAt(newPosition);
		Piece o;

		// this logic is more complex than for other pieces, since there is a
		// difference between a take and non-take move for pawns.
		int bow = 0;
	
		if(isWhite) {
			bow = 1;
		}else {
			bow = -1;
		}
			
			if (isTaken != null) { 
				return this.equals(p) && isTaken.equals(t) && (oldCol == (newCol + bow) || oldCol == (newCol - bow))
						&& (oldRow + bow) == newRow;
				
			} else if ((oldRow + bow) == newRow && oldCol == newCol) {
				return this.equals(p) && t == null;
			}else if ((this.isWhite() && newRow == oldRow+2 && oldRow == 1) ||
					((!this.isWhite() && newRow == oldRow-2 && oldRow == 7))) {
				if (isWhite()) { o = board.pieceAt(new Position(oldRow+1, newCol)); }
				else { o = board.pieceAt(new Position(oldRow-1, newCol)); }
				wasDoubleStep = true;
				return this.equals(p) && t == null && o == null;
			}
		return false;
	}
		 

	/**
	 * Return true if the last move made by this piece was a double step.
	 *
	 * @return True if the last step was a double step.
	 */
	public boolean wasDoubleStep() {
		return wasDoubleStep;
	}

	/**
	 * Mark this piece has having made a double step on the last move.
	 *
	 * @param flag True if the last move was a double step, false otherwise.
	 */
	public void setDoubleStep(boolean flag) {
		wasDoubleStep = flag;
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "P";
		} else {
			return "p";
		}
	}

}
