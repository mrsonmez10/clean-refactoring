package com.cleanref.chapter02.c01;

import java.util.ArrayList;
import java.util.List;

public class ExampleOneRefactored {

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public List<Cell> getFlaggedCells(Cell[] gameBoard) {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }

}
