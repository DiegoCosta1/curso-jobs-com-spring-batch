# [Curso para desenvolvimento de jobs com Spring Batch](https://www.udemy.com/course/curso-para-desenvolvimento-de-jobs-com-spring-batch/learn/lecture/18418770#overview)
### Criado por: [Giuliana S Bezerra](https://www.udemy.com/user/giuliana-silva-bezerra/)

## Veja mais...
1. [Desenvolvimento com Spring Batch - Overview](https://giuliana-bezerra.medium.com/spring-batch-para-desenvolvimento-de-jobs-1674ec5b9a20)
2. [Por que você deveria utilizar Spring Batch para processamento batch](https://giuliana-bezerra.medium.com/why-you-should-be-using-spring-batch-for-batch-processing-83f5aafb965f)
3. [Linguagem de domínio do Spring Batch](https://docs.spring.io/spring-batch/docs/current/reference/html/domain.html#domainLanguageOfBatch)
4. [Configuração do Job](https://medium.com/@giu.drawer/desenvolvimento-com-spring-batch-jobs-b4363dd6c676)
5. [Configuração de Step](https://medium.com/@giu.drawer/desenvolvimento-com-spring-batch-steps-4d42af2696ec)

## Exercícios
1) O que é processamento batch?
###### É o processamento de uma quantidade finita de dados sem interação ou interrupção. Uma vez iniciado, o processamento batch consome uma quantidade finita de dados até atingir um critério de completude definido internamente.

2) O que motivou a criação do framework Spring Batch
###### Padronizar o processamento batch adotando as melhores práticas e técnicas da indústria. A Accenture juntou as melhores práticas em processamento batch para criar a primeira versão do framework.

3) A respeito dos desafios existentes no processamento batch, NÃO é um deles:
###### UX (experiência com o usuário). Por não possuírem interface gráfica, UX não representa um desafio no processamento batch. Sendo apenas as questões de:
###### - Usabilidade
###### - Escalabilidade
###### - Disponibilidade

4) Como o processamento batch é implementado com o Spring Batch?
###### Através de um job e seu conjunto de steps. Um job é a tarefa maior que é composta por tarefas menores (os steps) que possuem início e fim.

5) Qual a vantagem de usar o Spring Boot com o Spring Batch?
###### - Facilitar o empacotamento e implantação do job em ambiente produtivo
###### - Facilitar a criação e configuração do job
###### - Facilitar o gerenciamento de dependências do projeto

6) Sobre steps, é correto afirmar:
###### - Existem dois tipos de step: Tasklet e baseado em\ chunk.
###### - Steps do tipo tasklet são utilizados para criar tarefas mais simples.
###### - Steps baseados em chunk são utilizados para executar tarefas mais complexas que envolvem a leitura e escrita de dados.
###### - Um leitor e um escritor são obrigatórios para criar um step baseado em chunk.

7) Steps baseados em chunk possuem uma propriedade chamada commit interval. Sobre essa propriedade, é correto afirmar:
###### - Deve ser definida de forma a equilibrar o uso de memória do job e o seu tempo de execução. A definição do valor é empírica. A volumetria da base de dados deve ser analisada para que o valor definido tire o máximo proveito do uso de chunks.

8) Qual a vantagem em persistir os metadados de um Job Spring Batch no banco de dados?
###### - Os dados de execução não serão perdidos e assim é possível realizar audiotira no futuro.
###### - É possível monitorar o andamento da execução de um Job consultando os dados salvos no banco de dados.
###### - É possíve verificar quantos itens foram processados com sucesso pelo Job, após a sua execução.

9) Qual a vantagem em externalizar propriedades de um Job Spring Batch?
###### - Separar dados específicos do seu ambiente de implantação da implementação do Job, o que produz um único implantável para todos os ambientes.
###### - Não expor dados sensíveis no repositório de código fonte do Job.
###### - Modificar propriedades sem a necessidade de realizar um novo deploy do Job.

10) Qual a vantagem em configurar múltiplos bancos de dados num Job Spring Batch?
###### - Permite ler e escrever dados em diferentes bases de dados.
###### - Permite separar a lógica de negócio dos metadados do Spring Batch.
###### - Permite isolar a infraestrutura de implantação da base de dados do Job, da infraestrutura de implantação dos sistemas que consomem os dados de negócio.

11) Qual a vantagem em configurar o log em Jobs Spring Batch?
###### - Permite customizar o formato do log para que seja compatível com sistemas que consomem e expõe esses logs em interfaces gráficas (e.g Kibana, Prometheus, ...).
###### - Logs facilitam a identificação de erros no Job.
###### - Dependendo do ambiente de implantação do Job, é possível configurar a verbosidade do log, evitando assim que informações de DEBUG apareçam em logs do ambiente de produção, por exemplo.