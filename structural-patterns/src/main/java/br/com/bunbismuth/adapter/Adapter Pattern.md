# Adapter Pattern

## Definição (GoF)

Converter a interface de uma classe em outra interface esperada pelos
clientes. Adapter permite a comunicação entre classes que não poderiam
trabalhar juntas devido à incompatibilidade de suas interfaces.

## Problemas

* Como uma classe pode ser reutilizada mesmo que não tenha a interface
  requisitada pelo cliente?
* Como classes de interfaces incompatíveis podem trabalhar juntas?

## Solução

Definir uma classe Adapter que converta a interface de uma classe
em outra que o cliente necessite. **Adaptando as interfaces** que precisam
se comunicar. Um bom exemplo na vida real disso é um adaptador de tomadas,
que permite que uma tomada de 3 pinos aceite entradas com 2 pinos.

Existem dois tipos de Adapter, os de Objeto e os de Classe.