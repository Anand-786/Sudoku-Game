package sudoku;

import static sudoku.persistence.LocalStorageImpl.GAME_DATA;

public class Main {
    public static void main(String[] args)
    {
        sudoku.SudokuApplication.main(new String[]{});
        GAME_DATA.deleteOnExit();
    }
}
