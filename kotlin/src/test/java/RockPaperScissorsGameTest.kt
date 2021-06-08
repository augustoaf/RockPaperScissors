import org.junit.Assert
import org.junit.Test

class RockPaperScissorsGameTest {
    @Test
    fun rockCrushesScissors() {
        val game = RockPaperScissorsGame()
        val actualResult = game.determineWinner("rock", "scissors")
        val expectedResult = "rock beats scissors"
        Assert.assertEquals(expectedResult, actualResult)
    }
}
