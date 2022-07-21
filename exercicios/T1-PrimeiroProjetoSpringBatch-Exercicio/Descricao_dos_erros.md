## Problema #1
```
***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
```
- Solução: adicionar dependência `H2 Database` ao spring

## Problema #2
```
Error encountered while resolving initializr content for:
T1-PrimeiroProjetoSpringBatch-Exercicio

Error Details:
IOException: Server returned HTTP response code: 400 for URL:
https://start.spring.io/dependencies?bootVersion=2.2.5.RELEASE
```
- Solução: atualizar versão do spring boot via pom.xml (ex. 2.7.2)

## Problema #3
```
Aplicação subiu sem executar o job
```
- Solução: adicionar anotações necessárias para a classe de configuração do spring batch:
```
@EnableBatchProcessing (BatchConfiguration.class)
@Autowired (JobBuilderFactoriy e StepBuilderFactory)
@Ben (Job)
```

## Problema #4
```
org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: @Bean method 'imprimeOlaJob' must not be private or final;
```
- Solução: Tornar Job e Steps como públicos