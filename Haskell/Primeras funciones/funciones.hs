lucky:: (Integral a) => a -> String
lucky 7 = "Es el numero de la suerte"
lucky x = "Hoy no es tu día de suerte :C"

sayMe :: (Integral a) => a -> String
sayMe 1 = "¡Uno!"
sayMe 2 = "¡Dos!"
sayMe 3 = "¡Tres!"
sayMe 4 = "¡Cuatro!"
sayMe 5 = "¡Cinco!"
sayMe x = "No entre uno 1 y 5"

factorial :: (Integral a) => a -> a
factorial 0 = 1
factorial n = n*factorial(n-1)

sumaVectores :: (Num a) => (a,a) -> (a,a) ->(a,a)
sumaVectores (x1,y1) (x2, y2) = (x1+x2, y1+y2)

--para una tripla
first:: (a,b,c) -> a
first (x,_,_) = x

second:: (a,b,c) -> b
second (_,y,_) = y

third :: (a,b,c) -> c
third (_,_,z) = z

--funcionp ara tener la cabeza de una lista
cabeza :: [a] -> a
cabeza [] = error "hora de ir a mimir"
cabeza (x:_) = x

elementos:: (Show a)=> [a] -> String
elementos [] = "hora de ir a mimir"
elementos (x:[]) = "el primer elemento es: " ++ show x
elementos (x:y:[]) = "los dos primeros elementos son: " ++ show x ++ show y 
elementos (x:y:z:_) = "La lista tiene 3 elementos: y son " ++ show x ++ ", " ++ show y ++ ", " ++ show z

longitud:: (Num b) => [a] -> b
longitud [] = 0
longitud (x:xs) = 1 + longitud xs

imc:: (RealFloat a) => a -> String
imc peso 
    | peso <= 18.5 = "Tienes infrapeso, eres emo?"
    | peso <= 25 = "supestamente eres normal"
    | peso <= 30 = "Estas gordo"
    |  otherwise = "eres una ballena"
    
maximo:: (Ord a) => a -> a -> a
maximo a b
    | a > b     = a
    | otherwise   = b
    
imc2:: (RealFloat a) => a -> a -> String
imc2 peso altura
    | resultado <= 18 = "Tienes infrapeso, eres emo?"
    | resultado <= 25 = "supestamente eres normal"
    | resultado <= 30 = "Estas gordo"
    |  otherwise = "eres una ballena"
    where resultado = peso / altura^2
          
cilindro:: (RealFloat a) => a -> a-> a
cilindro radio altura = 
    let areacirculo = radio^2* pi
