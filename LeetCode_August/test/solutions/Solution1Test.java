package solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution1Test {
    Solution1 testSolution;

    @BeforeEach
    void setUp() {
        testSolution = new Solution1();
    }
    //    void methodBeingTested_conditionsUnderTest_expectedOutcome() {
//        // Given:
//        // Given this state of the universe (initial conditions)
//
//        // When:
//        // Invoke the thing you're going to test
//
//        // Then:
//        // Assert expected outcome
//    }

    @Test
    void detectCapitalUse_beginsWithCapitalLetter_true() {
        assertTrue(testSolution.detectCapitalUse("Capitalized"));
    }

    @Test
    void detectCapitalUse_multipleCapitalLetters_false() {
        assertFalse(testSolution.detectCapitalUse("CapItalized"));
    }

    @Test
    void detectCapitalUse_allCapitalLetters_true() {
        assertTrue(testSolution.detectCapitalUse("CAPITALIZED"));
    }

    @Test
    void detectCapitalUse_noCapitalLetters_true() {
        assertTrue(testSolution.detectCapitalUse("capitalized"));
    }

}
