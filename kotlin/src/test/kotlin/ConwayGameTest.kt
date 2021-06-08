import org.approvaltests.Approvals
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConwayGameTest {

    @Test
    fun empty() {
        val game = ConwayGame(3, 3)
        game.iterate()
        Approvals.verify(GridPrinter.print(game.data()))
    }

    @Test
    fun one_death() {
        val game = ConwayGame(3, 3)
        game.setAliveAt(1, 1)
        game.iterate()
        Approvals.verify(GridPrinter.print(game.data()))
    }

    @Test
    fun stable_foursome() {
        val game = ConwayGame(4, 4)
        game.setAliveAt(1, 1)
        game.setAliveAt(1, 2)
        game.setAliveAt(2, 1)
        game.setAliveAt(2, 2)
        game.iterate()
        Approvals.verify(GridPrinter.print(game.data()))
    }

    @Test
    fun blinker() {
        val game = ConwayGame(5, 5)
        game.setAliveAt(1, 1)
        game.setAliveAt(1, 2)
        game.setAliveAt(1, 3)
        game.iterate()
        Approvals.verify(GridPrinter.print(game.data()))
    }

}