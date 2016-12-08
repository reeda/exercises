defmodule Exercises.SieveEratosthenes do
  def execute(n) do
    range = Range.new(2, n)
    Enum.filter(range, fn(p) ->
      range_end = 
        cond do
          2 > Kernel.trunc(:math.sqrt(p)) -> 2
          true -> Kernel.trunc(:math.sqrt(p))
        end 
      not Enum.any?(Range.new(2, range_end), fn(x) -> x != p and rem(p, x) == 0 end)
    end)
  end
end
