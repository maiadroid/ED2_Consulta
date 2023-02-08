
/*
Complexidades de menor para maior

O(logn), O(1) -> O(n) -> O(nlogn) -> O(n^2), O(2^n), O(n!)

*/


/*
Árvore binária de busca

Uma árvore binária de busca é uma árvore binária em ordem simétrica

Uma árvore binária é uma árvore em que cada nó tem, no máximo, dois filhos e cada filho tem apenas um pai.

Uma árvore binária cheia é uma árvore binária em que cada nó (exceptuando as folhas) tem dois filhos.

Uma árvore binária perfeita é uma árvore binária completa cujas folhas se encontram todas ao mesmo nível. Esta definição impõe que o número de nós seja 1, 3, 7, 15, 31, 63, ..., 2(n+1) - 1, sendo n a altura da árvore.

Uma árvore binária completa é uma árvore binária cujos níveis, exceptuando eventualmente o último, estão completamente preenchidos e, no último nível, os nós encontram-se o mais à esquerda possível. 
Por outras palavras, é uma árvore "o mais perfeita possível", tendo em conta que dependendo do número de nós, as árvores nem sempre podem ser perfeitas.

Uma árvore binária equilibrada é uma árvore onde a profundidade de todas as folhas difere, no máximo, por 1. A vantagem de uma árvore desta natureza é a sua aplicabilidade e a previsibilidade em termos de profundidade ao serem percorridas.

Uma árvore degenerada é uma árvore em que todos os nós tem apenas um filho. Neste caso, a árvore degenera numa lista ligada cuja cabeça é o nó raiz.

Uma árvore binária ordenada é uma árvore em que, para cada nó, a sub-árvore esquerda/direita desse nó apenas contém, respectivamente, valores menores/maiores que o nó em questão.

Complexidades: 
 - Espaço: O(n) média, O(n) pior caso
 - Busca: O(logn) média, O(n) pior caso
 - Inserção: O(logn) média, O(n) pior caso
 - Deleção: O(logn) média, O(n) pior caso 
 - Iteração ordenada: O(nlogn) média, O(n) pior caso
*/



/*
Árvore AVL

Uma árvore AVL é uma árvore na qual as alturas das subárvores esquerda e direita de cada nó diferem no máximo por uma unidade.

A árvore AVL é muito útil, pois executa as operações de inserção, busca e remoção em tempo O(log n). 
Comparado-a com a árvore rubro-negra, a AVL é mais rápido nas aplicações que fazem uma quantidade excessiva de buscas, porém esta estrutura é um pouco mais lenta para inserção e remoção.
Isso se deve ao fato de as árvores AVL serem mais rigidamente balanceadas.

Medida de desbalanceamento é o chamado fator de equilibrio. Para estar balanceada, tem que ser <= 1. Se >= 2, está desbalanceada.

O equilibrio das árvores é corrigido através de rotações.
- Rotação á esquerda
- Rotação a direita
- Rotação dupla a esquerda
- Rotação dupla a direita

Complexidades: 
 - Espaço: O(n) média, O(n) pior caso
 - Busca: O(logn) média, O(logn) pior caso
 - Inserção: O(logn) média, O(logn) pior caso
 - Deleção: O(logn) média, O(logn) pior caso 

*/



/*
Árvore 2-3

Uma árvore de busca que está sempre em Ordem Simétrica e Perfeitamente Balanceada, e que adere as seguintes definições:
– Cada nó pode ter uma ou duas chaves.
– Cada nó não folha pode ter 2 ou 3 filhos.

A árvore 2-3 tem as seguintes vantagens:

Equilíbrio: a árvore 2-3 é auto-equilibrada, o que significa que ela mantém seu equilíbrio mesmo com grandes quantidades de dados, evitando problemas de desempenho como a degeneração em uma lista ligada.
Eficiência: as operações de inserção, exclusão e pesquisa são realizadas em tempo logarítmico, o que pode ser mais eficiente do que outros algoritmos de árvore.
Armazenamento de dados: a árvore 2-3 é eficiente no armazenamento de dados, permitindo a inserção de mais de um item em cada nó, o que ajuda a maximizar o uso do espaço de armazenamento.
Flexibilidade: a árvore 2-3 é flexível o suficiente para lidar com inserções e exclusões frequentes, sem comprometer seu equilíbrio ou sua eficiência.

Complexidades: 
 - Espaço: O(n) média, O(n) pior caso
 - Busca: O(logn) média, O(logn) pior caso
 - Inserção: O(logn) média, O(logn) pior caso
 - Deleção: O(logn) média, O(logn) pior caso 

*/



/*
Árvore Rubro-Negra

Uma árvore rubro-negra é uma árvore binária de busca, com algumas propriedades adicionais.

As propriedades da árvore rubro-negra são:
- Todo nó da árvore ou é vermelho ou é preto
- A raiz é preta
- Toda folha é preta
- Se um nó é vermelho, então ambos os filhos são pretos
- Para todo nó, todos os caminhos do nó até as folhas descedentes contém o mesmo número de nós pretos

AVL vs Rubro-Negra:
- Na teoria, possuem a mesma complexidade computacional
- Na prática, a árvore AVL é mais rápida na operação de busca, e mais lenta nas operações de
inserção e remoção
- A árvore AVL é mais balanceada do que a árvore Rubro-Negra, o que acelera a operação de busca

- AVL: balanceamento mais rígido. Maior custo na operação de inserção e remoção. No pior caso, uma operação de remoção pode exigir O(logN) rotações na árvore AVL, mas apenas 3 rotações na
árvore Rubro-Negra.

- Operação de busca é a mais usada? Melhor usar uma árvore AVL

- Inserção ou remoção são mais usadas? Melhor usar uma árvore Rubro-Negra

- Árvores Rubro-Negra são de uso mais geral do que
as árvores AVL. Ela é utilizada em diversas aplicações e bibliotecas de
linguagens de programação

Possui apenas duas funções de rotação
- Rotação à Esquerda
- Rotação à Direita

Remoção: Como na inserção, temos que percorremos um
conjunto de nós da árvore até chegar ao nó que
será removido
-> Existem 3 tipos de remoção
- Nó folha (sem filhos)
- Nó com 1 filho
- Nó com 2 filhos

Uma vez removido o nó:
- Devemos voltar pelo caminho percorrido e verificar se
ocorreu a violação de alguma das propriedades da
árvore para cada um dos nós visitados
- Aplicar uma das rotações ou mudança de cores para
restabelecer o balanceamento da árvore

Diferença com relação a árvore AVL:
- A remoção na árvore rubro-negra corrige o
balanceamento da árvore tanto na ida quanto na volta
da recursão
- O processo de busca pelo nó a ser removido já prevê
possíveis violações das propriedades da árvore
- Somente devemos executar a remoção se o nó a ser
removido realmente existe na árvore

Árvore Rubro-Negra caída para a Esquerda:
- Sua implementação corresponde a de uma árvore 2-3
- A árvore 2-3 não é uma árvore binária
- Cada nó interno pode armazenar um ou dois valores
- Pode ter dois (um valor) ou três (dois valores) filhos
- Seu funcionamento é o mesmo da árvore binária de busca

Complexidades: 
 - Espaço: O(n) média, O(n) pior caso
 - Busca: O(logn) média, O(logn) pior caso
 - Inserção: O(logn) média, O(logn) pior caso
 - Deleção: O(logn) média, O(logn) pior caso 

*/



/*
Árvore B

Uma árvore B é uma estrutura de dados em árvore, auto-balanceada, que armazena dados classificados e permite pesquisas, acesso sequencial, inserções e remoções em tempo logarítmico.
A árvore B é uma generalização de uma árvore de pesquisa binária em que um nó pode ter mais que dois filhos.
Diferente das árvores de pesquisa binária auto-balanceadas, a árvore B é bem adaptada para sistemas de armazenamento que leem e escrevem blocos de dados relativamente grandes, como discos.

A árvore B é uma árvore balanceada em que o número de nós acessados em uma busca/inserção/remoção é muito pequeno se comparado às outras árvores estudadas.
Outro ponto importante é que a árvore B garante que as folhas se encontrem todas em um mesmo nível, independente da ordem em que os dados serão inseridos. 
Nesse sentido, a árvore B é, basicamente, uma extensão da árvore AVL e, conseqüentemente, da árvore binária de busca


As propriedades da árvore b são:

- Árvore B armazena em disco e não em memória. 
- Os valores são armazenados nós nós folhas.
- Ela não é uma árvore binária. 
- Em todo nó você tem que ter cópia das chaves dos nós filhos.
- Árvore B utiliza equilibro perfeito

Ordem M: Casa nó tem no máximo m-1 chaves e no mínimo m/2. p/m>4. A raiz tem no minimo 1. Arvore perfeitamente balanceada.

Na remoção: 
- Caso 1: se o elemento estiver em uma folha e a folha mantiver 50% de ocupação, basta remove-lo
- Caso 2: se o elemento não estiver em uma folha, troca-lo pelo seu antecessor
- Caso 3: Se a folha ficar com menos de 50% de ocupação e as páginas irmãs não puderem ceder uma chave


Complexidades: 
 - Espaço: O(n) média, O(n) pior caso
 - Busca: O(logn) média, O(logn) pior caso
 - Inserção: O(logn) média, O(logn) pior caso
 - Deleção: O(logn) média, O(logn) pior caso 

*/


