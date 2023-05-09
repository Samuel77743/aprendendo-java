# Java - Aprendendo a Linguagem
    Neste repositório ficará registrado todo avanço no desenvolvimento de Java SE, 
    sua sintaxe, particularidades, Lógica de Programação aprimorada por 
    conceitos de Java, conhecimento de termos importantes para desenvolvimento 
    desta maravilhosa linguagem:
    - JDK -> Java Development Kit
    - JRE -> Java Runtime Enviroment
    - JavaC -> Compilador do Java
    - Bytecode -> Código realocado (.class)
    - JVM -> Java Virtual Machine
    - JIT -> Just in Time(compõe a JVM)
    - WORE -> Write Once Run Everywhere

## O que foi feito?
    Foi realizado exercícios e projetos em objetivo de aprender o funcionamento da linguagem, conceitos
    primitivos e exclusivos, aprendizagem de packages, métodos e classes.

<h3 align="center">
STATUS: 🚧 Em construção...  🚧
</h3>

### Exercícios de base e lógica de Java
- **Exercício 001:** Comando de saída de dados fazendo "Hello World", expondo particularidades 
e diferenças do conjunto System.Out.

- **Exercício 002:** Tipos Primitivos em Java, declarações e relações
**(percebi que em Java o dev está sujeito a sofrer com Casting)**

- **Exercício 003:** Estruturas de Decisão --> IFs ELSEs

- **Exercício 004:** Operação Ternária

- **Exercício 005:** Switch

- **Exercício 006:** Entrada de dados --> Scanner

- **Exercício 007:** Laços de repetição PT1: FOR

- **Exercício 008:** Laços de repetição PT2: WHILE e DO-WHILE

- **Exercício 009:** Arrays PT1

- **Exercício 010:** Arrays PT2 -> declarando valores previamente e usando 
atributo .length

- **Exercício 011:** Arrays PT3 -> Comparando dois arrays em um loop

- **Exercício 012:** Arrays PT4 -> Shorthandd e FOR pra interagir com todos índices

- **Exercício 013:** Arrays PT5 -> Classe "Arrays."

    ➡ Ordenar vetores --> *Arrays.sort*

    ➡ Preencher índices com um valor --> *Arrays.fill*

    ➡ Comparar Arrays --> *Arrays.equals(n1, n2)* 

    ➡ Pesquisar um valor dentro dos índices --> *Arrays.Binarysearch* 
                                            ⚠⚠ ARRAY DEVE ESTÁ ORDENADO ⚠⚠

- **Exercício 014:** Arrays PT6 -> Copiar conteúdo de um Array pra outro (*System.arraycopy*)

- **Exercício 015:** Arrays Bidimensionais -> Matrizes
    ➡ Preenchimento de Matriz na declaração
    ➡ Preenchimento de Matriz usando laço de repetição FOR
    ➡ Leitura de valores dos índices da Matriz

- **Exercício 016:** Formatações em printf --> indentar, zeros a esquerda, alinhar tabelas

- **Exercício 017:** Procedimentos sem retorno

- **Exercício 018:** Procedimentos que retornam valores

- **Exercício 019:** Procedimentos de mesmo nome mas diferentes tipos

- **Exercício 020:** Algorítmo de Fibonacci(usando Array)

- **Exercício 021:** Potencial do Switch Case

- **Exercício 022:** Funcionamento do comando CONTINUE
    DIFERENÇA DE BREAK E CONTINUE
    - **BREAK**: Quebra o laço de repetição do qual está dentro(encerra o ciclo do loop)
    - **CONTINUE**: Ignora a iteração atual, ou seja interrompe o a reptição atual, mas
    continua a posterior normalmente
    
- **Exercício 023:** Revendo Arrays

- **Exercício 024:** Fazendo estrutura de Exame Escolar

- **Exercício 025:** Extraindo cada caractere de uma String individualmente com *.toCharArray*

- **Exercício 026:** Usando array como parâmetro de uma função, identificando Par/Impar de cada
índice do vetor.

- **Exercício 027:** Retornando array no final de um método

- **Exercício 028:** Utilizando array como parâmetro de funcao para entender:
<p align="center">Cópia de valor != Cópia de referência</p>
    Cópia de valor --> Variável comum passada como parâmetro, se o valor for
    alterado no meio do método, a original não sofrerá alteração

    Cópia por referência --> Array passado como parâmetro, desta forma,
    as alterações feitas dentro de um método também valem para original

- **Exercício 029:** Utilizando função com número parâmetros indeterminados
    Usando a sintaxe *funcao(int... parametro)* pode-se alocar quando valores
    forem necessários para serem usados no método, pois os valores dos parâmetros
    serão colocados dentro de um **Array**.

- **Exercício 030:** Entendendo e utilizando o parâmetro do método main -> *String[args]*
    Este parâmetro pode ter os valores de seus indices informado no prompt,
    no momento em que fazemos o comando para executar o arquivo ".class"
    Além disso usei o metdo *Integer.valueof()* para converter de
    **String >> Inteiro**

- **Exercício 031:** Atribuindo valores com SecureRandom nos índices de uma Matriz

- **Exercício 032:** Criando método de atribuição e impressão de matrizes

- **Exercício 033:** Aprendendo sobre ArrayLists:

    import java.util.ArrayList

    Declaracao -> ArrayList<Integer> numeros = new ArrayList<>();

    <h3 align="center">Métodos relativos:</h3>

    ➡ numeros.add(2) //adicona "2" na próxima posição disponível 

    ➡ numeros.add(3, 4) //adiciona 4 no *índice* 3, caso esteja 
    ocupado serão empurrados para frente

    ➡ numeros.clear() //Reseta *posições*

    ➡ numeros.size() //Retorna número de *posições* existentes, como .length

    ➡ numeros.indexOf(5) //Retorna a primeira *posicao* em que 5 aparece 

    ➡ numeros.get(2) //Retorna o *valor* da posicao 2 desse array

    ➡ numeros.remove(5) //Remove o *valor* dentro dos parenteses da lista, e as 
    posições seguintes são deslocadas para esquerda para preencher o void

    ➡ numeros.trimToSize() //Elimina *posições* vazias do array caso tenha

    **Exercicio 034:** TRY / CATCHs e Finnaly:
        São estrutura que permitem retornar um procedimento em caso de erro
        do programa, *SÃO UM TRATAMENTO DE ERROS*

    **Exercício 035:** THROW --> Criar uma excessão personalizada

    **Exercício 036:** Opções de construtor na instanciação de objetos da *Classe String* e
    métodos da classe.

    **Exercício 037:** Comparação de Objetos Strings e soluções de case-sensivity
    - *.equals* --> Compara os valores dos objetos, inibindo o resultado insatisfatório
    que poderia se retornar caso usasse o operador '==', **É CASE SENSITIVY**
    (retorna BOOLEAN)

    - *.equalsIgnoreCase* --> Compara valores das Strings sem relevar distinção entre letras
    maíusculas e minúsculas (retorna BOOLEAN)

    - *.compareTo* --> Diferente dos dois acima, ele verifica se a quantidade de caracteres
    entre duas Strings são iguais. 
    (retorna <0 se o objeto tiver menos que o comparado)
    (retorna  >0 se o objeto tiver mais que o comparado)
    (retorna 0 se tiverem a mesma quantidade)

    - *.regionMatch* --> permite comparar intervalo nas posições de uma String
    **Sintaxe:**

    **<String rem>.regionMatches(BOOL :relev_casesens:, int :indice_init_rem:, String :dest:,**
    **int :indice_init_dest: , int :indice_final:)**




    
