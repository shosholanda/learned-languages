triangulos:: [(Int,Int,Int)] -> [(Int,Int,Int)]
triangulos xs = [ (x,y,z) | x <- [1..10], y <- [1..10], z <- [1..10], x+y+z == 24, x^2 + y^2 == z^2]

factorial:: Integer -> Integer
factorial x = product [1..x]

circunferencia:: Double -> Double 
circunferencia r = 2*pi*r

sonIguales:: Int -> Int -> Bool
sonIguales x y = x == y

primeraLetra:: String -> Char
primeraLetra xs = head xs
