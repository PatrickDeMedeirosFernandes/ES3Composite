# ES3Composite

## **Composite** 

“Compor objetos em estruturas de árvore para representar hierarquia partes-todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos.” 
        
        GAMMA, Erich et al. Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos.

Entende-se por Composite um padrão de projeto de software utilizado para representar um objeto formado pela composição de objetos similares. Este conjunto de objetos pressupõe uma mesma hierarquia de classes a que ele pertence. Normalmente, utilizado para representar listas recorrentes - ou recursivas - de elementos. Além disso, este modo de representação hierárquica de classes permite que os elementos contidos em um objeto composto sejam tratados como se fossem um objeto único. Desta forma, os métodos comuns às classes podem ser aplicados, também, ao conjunto agrupado no objeto composto.


## **Ideia do Composite** 

A ideia do Composite é criar uma classe base que contém toda a interface necessária para todos os elementos e criar um elemento especial que agrega outros elementos. 


## **Vantagem** 
A principal vantagem e talvez mais forte é o fato que clientes os clientes do código Composite serem bem simplificados, pois podem tratar todos os objetos da mesma maneira.
E com ele temos uma página para somente para controlar e modificar o programa determinado, sem nescessariamente modificar a abstrata.


## **Implementação**

Para implementar o Padrão Composite, é necessário considerar vários aspectos, sendo eles:

Referências explícitas aos pais: Manter referências dos componentes-filhos para seus pais pode simplificar o percurso e a administração de uma estrutura composta, ou seja, caso seja necessário mover-se para cima ou deletar um componente, isso seria simplificado.

Compartilhamento de Componentes: Seria reduzido os requisitos de espaço de armazenamento. Porém, quando um componentes não pode ter mais do que um pai, o compartilhamento de componentes torna-se difícil.

Maximização da interface de Component: Torna os clientes desconhecedores das classes específicas que estão usando.

Declarando as operações de gerenciamento de filhos
