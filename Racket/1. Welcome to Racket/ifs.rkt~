#lang racket

;;Los "define" se definen como:
;; (define <id> <exp>)
(define pie 3)
;;O bien
;; (define (<id1> <id2>) (<exp>))
;;Donde <id1> es el nombre de la función
;;      <id2>* es el nombre del parámetro que utilizaremos
;; y    <exp>+ es la lista de expresiones que serán el cuerpo de la función.
(define (piece str)
  (substring str 0 pie))

;;se recomienda utliizar solo una expresión y no múlitples expresiones (es decir (....) una vez)
;;De lo contrario el resultado será lo que regrese la última función. Las demás funciones se evaluan 1 vez. 
(define (bake flavor)
  (printf "pre-heating oven...\n")
  (string-append flavor " pie"))

;;Un ejemplo más claro de que regresa el último resultado sería:
(define (nobake flavor)
  string-append flavor " jello")
;;en este ejemplo, string-append, flavor y " jello" son expresiones independientes y se evaluan pero nunca se
;;utilizan sus resultados, por lo que la función nobake regresa la última expresión que es " jello"

;;La identación DrRacket te la va dando conforme vayas escribiendo
;;Esta función no tiene expresiones y racket con la identación nos ayuda a ver donde está el error.
;;igual marca con rojo los parentesis que no cierran. 
(define (halfbake flavor)
                  (string-append flavor " creme brulee"))