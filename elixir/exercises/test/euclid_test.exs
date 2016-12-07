defmodule EuclidTest do
  use ExUnit.Case
  doctest Exercises.Euclid

  test "gcd of 15 and 30" do
    assert 15 == Exercises.Euclid.gcd(15, 30)
  end

  test "gcd of 32 and 6" do
    assert 2 == Exercises.Euclid.gcd(32, 6)
  end

  test "gcd of 72 and 112" do
    assert 8 == Exercises.Euclid.gcd(72, 112)
  end
end
