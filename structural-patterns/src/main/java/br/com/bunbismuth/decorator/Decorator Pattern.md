# Decorator Pattern

## Definição (GoF)

Anexar responsabilidades adicionais a um objeto dinamicamente. Decorators 
oferecem uma alternativa flexível ao uso de herança para estender uma 
funcionalidade.


## Problemas

* Como podemos adicionar funcionalidades dinamicamente em um objeto?

## Solução

Com objetos decorators é possível adicionar novas responsabilidades 
para um objeto de forma dinâmica, tendo o benefício da composição,
que sempre é preferida acima da herança. Este padrão também respeita
o O (Open-Closed Principle) do S.O.L.I.D., que é o "Aberto para extensão mas 
fechado para modificação".