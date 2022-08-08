'''An online retailer sells two products: widgets and gizmos. Each widget weighs 75
grams. Each gizmo weighs 112 grams. Write a program that reads the number of
widgets and the number of gizmos in an order from the user. Then your program
should compute and display the total weight of the order.'''

#Peso en gramos
GIZMO_PESO = 75
WIDGET_PESO = 112

gizmos_cantidad = int(input("Ingrese la cantidad de gizmos: "))
widgets_cantidad = int(input("Ingrese la cantidad de widgets: "))

gizmos_peso = GIZMO_PESO*gizmos_cantidad
widgets_peso = WIDGET_PESO * widgets_cantidad

print("El peso de todos los gizmos es {a} gramos , y el de todos los widgets es {b} gramos. \nEl peso total es {c} gramos".format(b = widgets_peso, a = gizmos_peso, c = gizmos_peso + widgets_peso))
