# Segunda mejora

## Objetivo

* Veremos un código y discutiremos la posible problemática
* Plantearemos una mejora a este código


## Descripción

Hemos solventado el primer escollo, ya podemos tener en nuestro taller vehículos con motores diesel y gasolina.

Resulta que los motores diesel ahora consumen menos litros a los 100Km, ahora consumen 4L

Ya se le empiezan a ver las costuras a nuestro código. Resulta que tenemos que cambiar todas las instancias que tengamos a lo largo de nuestra aplicación....

Motor motorDiesel = new Motor(4);

De hecho parece redundante que creemos instancias de Motor a lo largo de nuestro código. Pensando un poco, seguro que podemos mejorar nuestro código.

Podemos tener un contrato que nos diga cuantos litros consume un motor y cada tipo de motor tendrá implementado ese contrato indicado el valor consumido.

Vuestro objetivo será mejorar este código anterior, quizás usando algún patrón de diseño creacional logremos "fabricar" un código más robusto.

Aquí podéis encontrar como fabricar este código:
https://www.tutorialspoint.com/design_pattern


## Instrucciones
* Crea un subpaquete: afundacion.injectiondependency.v2.solution
* Crear ahí las clases que consideres necesarias para aplicar el patrón de diseño que consideres que encaja con nuestras necesidades.

