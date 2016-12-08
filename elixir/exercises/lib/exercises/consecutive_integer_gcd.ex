defmodule Exercises.ConsecutiveIntegerGCD do
  def gcd(m, n) do
    _gcd(m, n, min(m, n))
  end

  defp _gcd(m, n, t) when rem(m, t) == 0 and rem(n,t) == 0 do
    t
  end

  defp _gcd(m, n, t) do
    _gcd(m, n, t - 1)
  end
end
