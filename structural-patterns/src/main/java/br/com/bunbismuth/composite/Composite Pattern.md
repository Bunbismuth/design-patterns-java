# Composite Pattern

## Definição (GoF)

Compor objetos em estruturas de árvore para representar hierarquias 
todo-parte. Composite permite que clientes tratem objetos individuais e 
composições de maneira Uniforme.

## Problemas

* Como seria possivel criar uma estrutura onde uma unidade e um conjunto
delas possam ser tratadas de forma transparente, sem diferenças?

## Solução

Definir uma composição que possa comportar tanto um elemento apenas 
quanto um conjunto desses mesmos elementos. Ou seja, tanto um conjunto
de elementos implementa uma interface quanto um elemento apenas 
implementa a mesma interface, conseguindo trabalhar com uma solução
todo-parte.