## Cadastro de Ninjas
Uma API para cadastro de ninjas usando Spring Boot

### Sobre o projeto
O CadastroDeNinjas é uma API REST desenvolvida em Java com Spring Boot que permite gerenciar (cadastrar, listar, buscar e remover) ninjas. O objetivo é servir de base para estudos de API REST, boas práticas de arquitetura com Service/Repository, e integração com banco de dados usando Spring Data JPA.

### Funcionalidades
- **Cadastrar Ninja**: Adicione novos ninjas ao sistema.
- **Listar Ninjas**: Consulte todos os ninjas cadastrados.
- **Buscar Ninja** por ID: Consulte detalhes de um ninja específico.
- **Remover Ninja**: Exclua um ninja pelo ID.

### Tecnologias Utilizadas
- [Java 17+](https://www.oracle.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/)
- [Maven](https://maven.apache.org/)

### Como Executar
1. Clone o repositório:
   ```
      git clone https://github.com/Coronel-Marc/CadastroDeNinjas.git
      cd CadastroDeNinjas
   ```
2. Configure o banco de dados:
    - Por padrão, o projeto pode usar H2 (memória). Verifique e ajuste o arquivo `application.properties` conforme sua necessidade.
3. Compile e execute o projeto:
   ```
   ./mvnw spring-boot:run
   ```
   ou
   ```
   mvn spring-boot:run
   ```
4. Acesse a API:
    - A API estará disponível em: `http://localhost:8080/ninjas`


### Estrutura do Projeto
- `NinjaModel`: Entidade do Ninja
- `NinjaRepository`: Interface de acesso a dados
- `NinjaService`: Camada de regras de negócio
- `NinjaController`: Endpoints REST