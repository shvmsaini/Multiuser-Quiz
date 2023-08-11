package io.github.shvmsaini.superprocurequiz.strategy;

import io.github.shvmsaini.superprocurequiz.interfaces.QuizFetchingStrategy;

public class TieBreakingQuizFetchingStrategy implements QuizFetchingStrategy {
    @Override
    public int getTotalQuiz() {
        return 10;
    }
}
