defmodule Exercises.Euclid do
  
  def gcd(m, n) do
    _gcd(m, n)
  end

  defp _gcd(m, 0) do
    m
  end

  defp _gcd(m, n) do
    _gcd(n, rem(m, n))
  end
end
