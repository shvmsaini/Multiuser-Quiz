package io.github.shvmsaini.superprocurequiz.strategy;

import io.github.shvmsaini.superprocurequiz.interfaces.MarkingStrategy;

public class DefaultMarkingStrategy implements MarkingStrategy {
    @Override
    public long getIncorrectMarks() {
        return -2;
    }

    @Override
    public long getSkipMarks() {
        return 0;
    }

    @Override
    public long getCorrectMarks() {
        return +5;
    }
}
