## Problema #1
```
APPLICATION FAILED TO START
Description: Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
```
- Solução: adicionar dependência `H2 Database` ao spring (Spring > Add Starters > H2 Database)

## Problema #2
```
Error encountered while resolving initializr content for:
T1-PrimeiroProjetoSpringBatch-Exercicio

Error Details:
IOException: Server returned HTTP response code: 400 for URL: https://start.spring.io/dependencies?bootVersion=2.2.5.RELEASE
```
- Solução: atualizar versão do spring boot via pom.xml (ex. 2.7.2)

## Problema #3
```
Aplicação subiu, mas sem executar o job
```
- Solução: adicionar anotações necessárias para a classe de configuração do spring batch:
```
@EnableBatchProcessing (Para a classe)
@Autowired (atributos JobBuilderFactoriy e StepBuilderFactory)
@Bean (método do Job)
```

## Problema #4
```
org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: @Bean method 'imprimeOlaJob' must not be private or final;
```
- Solução: Tornar Job e Steps como públicos