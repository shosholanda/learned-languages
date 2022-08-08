#lang racket

;;La definición del if es como sigue:
;;(if <exp1?> <exp2> <exp3>)
;; <exp> ::= 1,2,3... | {"a","b"...}* | (+ <exp> <exp>)*.... | #t #f
(if (< 2 3)
    "2 es menor a 3";;exp2 si exp1 = #t
    "2 es mayor a 3 wtf") ;;exp3 si exp1 = #f

;;otro ejemplo:
(define (reply s)
  (if (string-prefix? s "hello") ;;if s.prefix(hello) 
      "hi!"
      "huh?")) ;; else huh

;;Podemos anidar ifs
(define (replay-non-string s)
  (if (string? s)
      (if (string-prefix? s "hello")
          "hi!"
          "huh?")
      "это не слова"))

;;Podemos crear condiciones más elaboradas con and y or usando notación prefija.
(define (esCalificacion? int)
  (if (and (> int 0)   ;;este es la notación para poder crear muchos casos. 
           (< int 10))
      "Ese es tu promedio de la carrera jsjs"
      "No es un número válido"))

;;para no anidar ifs, utilizaremos la expresión cond
;;cond es como un switch entre las diferentes [case].donde el case
;;se lee como [if (condición? b) then <exp1> else <siguiente case>]
(define (reply-more s)
  (cond
    [(string-prefix? s "hello") "hi!"]
    [(string-prefix? s "goodbye") "bye!"]
    [(string-suffix? s "?") "I don't know"]
    [else "huh?"])
  )

;;