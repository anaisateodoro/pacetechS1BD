# Semana 01 - Pacetech - BD 

<h1 align="center"> Semana 01 - Java Collections </h1>

## Collections
Uma coleção é uma estrutura de dados que permite armazenar vários objetos.

Em Java, a coleção também é um objeto.

As operações que podem ser feitas em coleções variam mas normalmente incluem:

- Adição de elementos;
- Remoção de elementos;
- Acesso aos elementos;
- Pesquisa de elementos;

### Arraylist

Primeira coisa que precisamos saber: **arraylist não é um array**, é uma lista.

Antes que alguém pergunte, qual a diferença entre um array e uma lista?

![ArrayListPratico](https://user-images.githubusercontent.com/70113922/186070038-9d9caa4c-06b1-443d-8277-13fa1a089907.png)

Um **array** é um vetor de objetos ou tipos primitivos, possui um tamanho fixo informado no momento em que é inicializado.

Um **ArrayList** é uma implementação da interface List, outra implmentação desta interface é o Likedlist. 

Como o próprio nome sugere, são implementações de um tipo de dado conhecido como Lista.

### LinkedList


### Classes Wrapper

Classes Wrapper possuem métodos públicos disponíveis na sbclasse Object.

Por exemplo: o método equals(Object) usamos para comparações, enquanto o toString possibilita imprimir o conteúodo de um objeto em formato texto.

Classes derivadas da subclasse Number possuem vários métodos para devolverem um tipo primitivo, tais como: _byteValue()_,_shortValue()_,_intValue()_,_longValue()_,_doubleValue()_,_floatValue()_.

Além disso as classes, derivadas de Number possuem também o método compareTo que faz comparações entre objetos wrapper.

Dessa maneira, podemos então inferir que há uma relação entre classes wrapper e os tipos primitivos.

Abaixo uma pequena tabela com tal exemplo de diferenciação.

|                       | Tipo primitivo | Classe Wrapper | Sub Classe
| --------------------- |:-------------: |:-------------:|:-------------:
| Lógico tipo primitivo | Boolean        | right foo     |  
| --------------------- |:-------------: |:-------------:| Object
| Caractere             | Char           | right bar     | 
| --------------------- |:-------------: |:-------------:|:-------------:
| Integral              | byte           | Byte          | Number
| Integral              | short          | Short         | Number 
| Integral              | int            | Integer       | Number
| Integral              | long           | Long          | Number
| Ponto Flutuante       | float          | Float         | Number
| Ponto Flutuante       | Double         | Double        | Number

#### Vantagens de usar Tipos Primitivos;

- Tipos primitivos são bem rápidos;
- Consomem pouca memória;
- Permitem operações mais complexas;

Boxing-Unboxing / Encaixotamento

### **Autoboxing (wrapping automático) :** é um processo de conversão automática que o comilador Java realiza para que um tipo primitivo passe a ser um objeto utilizando uma classe Wrapper.
Exemplo: boolean -> Boolean.

### Generics


### Annotations 

Um recurso que permite adicionar informações complementares no código fonte.

Formas de Uso no Código-fonte

Informações para o compilador

Em tempo de execução

O código-fonte pode utilizar essas informações para compilar o código-fonte(.class) ou no caso de desenvolvimento Web(.war);

As Annotations são precedidas de @Override,@Inherited @Deprecated.,etc.

Uso de anotações
- Documentação, por exemplo, XDoclet;
- Copilação;
- IDE;
- Estrutura de teste, por exemplo, JUnit;
- Recipiente IoC, por exemplo, como Spring
- Serialização, por exemplo, XML
- Programação orientada a aspectos (AOP), por exemplo, Spring AOP
- Servidores de aplicativos, por exemplo, contêiner EJB, serviço da Web
- Mapeamento objeto-relacional (ORM), por exemplo, Hibernate, JPA e muito mais..

### Threads

Threads são conjuntos de instruções que podem ser executados dentro de processos. Ou seja, processos são constituídos de threads. Esse conceito permite que as threads sejam exeutadas de forma paralela.Porém é importante salientar que o programador(a) não tem controle sobre a sequência de execuão dos processos, então, não tem como determinar quem vai executar antes ou depois. 

### ComandoForEach


### DatasTratamento


### Projeto Cassino 
<div aligner="center">
Projeto da Semana 01 está listado na pasta deste repositório.
<div aligner="center">

![ProjetoCassino](https://user-images.githubusercontent.com/70113922/186069974-c376974f-9187-4268-84b6-e7a19f712f70.png)

## Dificuldades encontradas

* Nesta semana, enfrentei alguns problemas de ordem operacional. Atualmente uso o sistema operacional Ubuntu 20.04 LTS. Nele estava instalado o NetBeans versão 14. Infelizmente o mesmo não estava criando itens básicos da IDE para desenvolvimento dos algoritmos e não estava rodando no Java Gladle. Depois, mesmos desinstalando e instalando a versão 12.5, obtive erros de compilação. Assim, tive que optar por outra IDE, a Eclipse. Estou usando neste PC no momento a versão do Java 17.0.4. 
Realmente foi desafiante e estou contente com estes novos aprendizados propostos e com erros aprendidos. Está um pouco mais lento do que imaginava, mas se vai ganhando expertise com a prática do uso desta linguagem.

---


  

  
  ⌨️ Com ❤️ por [Anaísa](https://github.com/anaisateodoro) 😊
</div>

