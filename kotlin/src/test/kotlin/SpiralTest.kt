import org.approvaltests.Approvals
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SpiralTest {

    @Test
    fun test3() {
        assertEquals("", Spiral(3).print())
    }

    @Test
    fun test5() {
        Approvals.verify(Spiral(5).print())
    }

    @Test
    fun test8() {
        Approvals.verify(Spiral(8).print())
    }

    @Test
    fun test9() {
        Approvals.verify(Spiral(9).print())
    }
}