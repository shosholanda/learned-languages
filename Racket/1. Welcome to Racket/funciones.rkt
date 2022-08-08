#lang racket

;;hemos definidos las funciones como siguen:
(define (double v)
  (if (string? v) (string-append v v) ("ingresa una palabra!")))

;;También podemos llamar a otras funciones
(define (double1 v)
  ;;esto es una función porque esta entre parentesis y no regresa nada (error). 
  ( (if  (string? v) (string-append v v) ("ingresa una palabra!"))))

;;definido bien lo de arriba
(define (double2 v)
  ;;aquí el if el parametro es string, regresa la función string-append, si no regresa +. ( 
  ((if (string? v) string-append +) v v))

(define (double3 v)
  ;;parentesis extra causan errores para las funciones.
  ((if (string? v) (string-append) (+)) v v))

;;----------------------------------------------------------
