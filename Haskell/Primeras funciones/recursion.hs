import Data.List

--Función que nos dice el máximo de una lista

maximo:: (Ord a) => [a] -> a
maximo [a] = a
maximo (x:xs) 
    | x > maximo xs = x
    | otherwise = maximo xs

--Funcion optimizada*
maximo':: (Ord a) => [a] -> a
maximo' [] = error "Tu dime cual es el maximo elemento de una lista vacia"
maximo' [a] = a
maximo' (x:xs) 
    | x > maxCola = x
    | otherwise = maxCola
    where maxCola = maximo xs
          
--Funcion que replica n veces m
replicar:: Int -> Int -> [Int]
replicar 0 _ = []
replicar n m = (m: replicar (n-1) m)

replicar':: Int -> Int -> [Int]
replicar' m n
    | m <= 0 = []
    | otherwise = (m: replicar (n-1) m)
    
--funcion que toma m elementos de una lista
toma:: Int -> [a] -> [a]
toma _ [] = []
toma n (x:xs)
    | n <= 0 = []
    | n >= length (x:xs) = (x:xs)
    | otherwise = (x: toma (n-1) xs)
    
--funcion que regresa el reverso de una lista
reversa:: [a] -> [a]
reversa [] = []
reversa (x:xs) = reversa xs ++ [x]


--funcion que repite infinitamente
repite:: a -> [a]
repite x  = (x: repite x)

--funcion qeu une dos lista en tuplas 1 a 1
zipper:: [a] -> [b] -> [(a,b)]
zipper _ [] = []
zipper [] _ = []
zipper (x:xs) (y:ys) = (x,y): zipper xs ys


--funcion que busca si el elemento a esta en la lista
busca:: (Eq a) => a -> [a] -> Bool
busca a [] = False
busca a (x:xs)
    | a == x = True
    | otherwise = busca a xs
    
--Quicksort
quicksort:: (Ord a) => [a] -> [a]
quicksort [] = [] 
quicksort (x:xs) = [a | a <- xs, a < x] ++ [x] ++ [a | a <- xs, a >= x]

