package modules

import org.scalatest.funsuite.AnyFunSuite

class MyMathSpec extends AnyFunSuite {

  test("add should return the sum of two integers") {
    assert(MyMath.add(2, 3) == 5)
  }

  // --- ADD THIS NEW TEST CASE ---
  test("multiply should return the product of two integers") {
    assert(MyMath.multiply(2, 3) == 6)
    assert(MyMath.multiply(5, 0) == 0)
  }
}