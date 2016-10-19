# ES3Composite

## **Composite** 

“Compor objetos em estruturas de árvore para representar hierarquia partes-todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos.” 
            **GAMMA, Erich et al. Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos.**

Entende-se por Composite um padrão de projeto de software utilizado para representar um objeto formado pela composição de objetos similares. Este conjunto de objetos pressupõe uma mesma hierarquia de classes a que ele pertence. Normalmente, utilizado para representar listas recorrentes - ou recursivas - de elementos. Além disso, este modo de representação hierárquica de classes permite que os elementos contidos em um objeto composto sejam tratados como se fossem um objeto único. Desta forma, os métodos comuns às classes podem ser aplicados, também, ao conjunto agrupado no objeto composto.

A ideia do Composite é criar uma classe base que contém toda a interface necessária para todos os elementos e criar um elemento especial que agrega outros elementos. 
