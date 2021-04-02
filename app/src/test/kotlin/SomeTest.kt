import org.junit.*

class SomeTest {
  @Test
  fun `ok test`() {
    // ok
  }

  @Test
  fun `ex test`() {
    throw IllegalStateException()
  }
}
