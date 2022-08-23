package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(sudoku.problemdomain.SudokuGame game) throws IOException;
    sudoku.problemdomain.SudokuGame getGameData()throws IOException;
}
