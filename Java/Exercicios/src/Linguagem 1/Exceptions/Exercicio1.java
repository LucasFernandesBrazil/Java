/*
Explique o que é uma Exceção no contexto de programação com Java.

Exceções no java são casos onde o processo do código simplismente morre, de forma
a parar a execução. Isso ocorre quando o código possui brechas que possibilitam
um erro inesperado, em que, caso o programador utilize uma IDE, esse erro não será
considerado antes do programa ser rodado.
 */


/*
Explique que significa a Manipulação ou Tratamento de Exceções.

O processo de manipular ou tratar exceções ocorre para não possibilitar uma parada
repentina no código ao ser processado. Ou seja, caso o usuário digite uma opção inválida
em um formulário, ou tente realizar operações matemáticas impossíveis. Para possibilitar
uma experiência de usuário boa o desenvolvedor deverá prever tais exceções e realizar
seu tratamento ou manipulação: Criar códigos que não possibilitem a parada do processo
e, caso necessário, informe o usuário de uma forma menos científica a cerca do problema
que ocorreu.
 */


/*
Cite alguns exemplos de Classes de Exceções do Java.

Exception, Error, Throwable.
 */


/*
Quais os tipos e diferenças de Exceções do Java. Qual a diferença entre uma exceção
verificada e uma exceção não verificada?

Basicamente temos dois tipos de exceções no java: Implícidas (Não precisam de tratamento - RuntimeException)
e as Explícitas (Necessitam de tratamento e não são contornáveis - RuntimeEx).
Uma exceção verificada representa condições inválidas em áreas fora do controle imediato do programa.
Uma exceção não verificada representam problemas no programa (bugs)
 */


/*
Explique o bloco de Tratamento de Exceções (try...catch...finally...)


Try -> Verifica o corpo do código, caso tenha alguma Exception ele para no momento da captura e passa
para o catch e/ou finally;

catch -> Realiza o tratamento da Exception. É acionado somente em casos que a exception é encontrada
no Try;

Finally -> Realiza o tratamento da Exception. É acionado se encontrar ou não a Exception no Try.
 */


/*
Explique a forma de lançamento de uma Exceção (throw new...)

throw new é utilizado para lançar uma exceção focalizadas, dentro de blocos condicionais ou
em outras estruturas que indentifiquem o problema.
 */
