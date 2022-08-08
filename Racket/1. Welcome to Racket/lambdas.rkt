#lang racket

;;FUNCIONES LAMBDA
;;En este ejercicios veremos como pasasr funciones como parámetro.

;;Definimos una funcion que aplica 2 veces una funcion
(define (twice f v)
  (f (f v)))

;;f todavía no esta definida. podemos definir funciones que todavía no están definidas.
;; esta funcion agrega 1 ! al final de la palabra
(define (louder s)
  (string-append s "!"))

;;podemos definir una funcion en el args de la funcion que la llama.
;;(lambda (s) (string-append s "!")) <--- El argumento 


