# Practica 2 Parcial 2
Este repositorio contiene la resolución de los 3 ejercicios planteados en la práctica. 
* Segundo_Parcial1 (Resolución del ejercicio 1 de las muñecas)
* Segundo_Parcial2 (Resolución del ejercicio 2 del swap en la lista)
* Segundo_Parcial3 (Resolución del ejercicio 3 del árbol)
## Consideraciones del ejercicio 1
* El metodo **ordenar** esta dentro de ejercicio1SP, el mismo recibe un array de strings que van a ser las letras de las muñecas y retorna un array de arrays de Strings que van a ser las muniecas finales correctamente formadas.
* Para formar las muñecas la logica que se siguio es la siguiente:
	* Primero ordenamos el array de entrada en orden descendente
	* Luego iteramos sobre cada letra del array y vamos creando pilas, las cuales representan a cada una de las muñecas.
	* Al final se tiene un array de pilas/muñecas las cuales se las convierte en array de strings.
	* Dandonos como resultado final el array de arrays de muñecas.
	* Nota. Para el ordenamiento inicial del array de strings, se esta utilizando el algoritmo MergeSort. 
## Consideraciones del ejercicio 2
* El metodo **swap** esta dentro de ejercicio2. Para la ejecución del ejercicio existen 2 formas:
	* Puede ejecutar primero el **setList** que recibe un array de enteros, los cuales son convertidos e insertados en una **ListaCSE**. Luego dicha lista esta siendo retornada para que desde el BlueJ pueda ejecutar el metodo **swap** (metodo que fue agregado dentro de la ListaCSE que basicamente recibe dos indices y hace el intercambio de sus elementos) y luego pueda ejecutar el metodo **print**, el cual finalmente le mostrara en consola el estado final de la lista.  
	* La segunda forma de ejecutar el ejercicio 2, es llamando a la funcion **swap** dentro del **ejercicio2** que recibe directamente un array de enteros, y los dos indices que van a ser intercambiados dentro de la lista. El resultado de este metodo va a ser la **ListaCSE** final, la cual a su vez podra ser accedida a traves de BlueJ y posteriormente ejecutar el **print** respectivo sobre la lista para que muestre en consola el resultado final.
## Consideraciones del ejercicio 3
La **mirarArbol** esta dentro de **ejercicio3**, dentro tiene el arbol ejemplo que esta en la practica por defecto. Tambien se puso un segundo ejemplo de un arbol para probar el algoritmo con diferentes tipos de arboles.
Para resolver el problema se tuvo en cuenta lo siguiente:
* Se creo una clase Tree para poder almacenar el arbol ejemplo. El mismo sigue los lineamientos de la practica.
* Se creo una clase Cola para utilizar la estructura cola en el algoritmo.
* La logica que se esta siguiendo es la siguiente:
	* Primero armamos la estructura del arbol ejemplo.
	* Luego llamamos al metodo mostrar **mostrar**.
	* Dentro de este metodo hacemos lo siguiente:
		* Primero imprimimos el primer elemento o root del arbol.
		* Luego obtenemos los hijos del root y uno por uno los encolamos en la cola auxiliar. 
		* Luego entramos a un while cuya condicion es que vamos a iterar hasta que dejen de haber elementos en la cola auxiliar.
		* Dentro del while, sacamos el primer elemento de la cola para imprimirlo y luego obtener a sus correspondientes hijos y encolarlos en la cola auxiliar, tal cual se hizo con el primer elemento root.
		* Este proceso sera repetido hasta que no queden elementos en la cola, lo cual a su vez indica que terminamos de recorrer el arbol entero.
		* Nota. Tener en cuenta que se esta utilizando una variable booleana adicional **isLastChild** que me sirve para saber cuando tengo que hacer un salto de linea en la impresion del arbol.
