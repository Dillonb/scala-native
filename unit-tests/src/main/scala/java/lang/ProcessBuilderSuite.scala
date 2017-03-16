package java.lang

object ProcessBuilderSuite extends tests.Suite {
  test("ProcessBuilder can execute echo") {
    val process = new ProcessBuilder("echo", "hello", "world").start()
    assert(process.waitFor() == 0)
  }
}