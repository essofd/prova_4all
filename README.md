
# [](https://github.com/essofd/prova_4all) 4all - Automação de Teste de Software

Site Testado: 4all : [4all](https://shopcart-challenge.4all.com/)

Donwload do projeto: [4all](https://github.com/essofd/prova_4all/archive/master.zip).

Softwares necessários:
IDE: [Eclipse](http://www.eclipse.org/)
Java: [Java](http://www.oracle.com/technetwork/pt/java/index.html)
Maven: [Maven](https://maven.apache.org/download.cgi)
Google Chrome: [Chrome](https://www.google.com.br/chrome/)

**Caso de teste proposto: Desafio 1**
1. Acessar o site: https://shopcart-challenge.4all.com/
2. Selecionar categoria "Doces"
    ● Adicionar todos os produtos ao carrinho
3. Selecionar categoria "Todos"
4. Acessar o carrinho
    ● Aumentar a quantidade do produto "Brigadeiro" em 4 unidades
5. Clicar no botão "Finalizar Compra"
    ● Validar a mensagem "Pedido realizado com sucesso!"
6. Clicar no botão "Fechar"
7. Fechar o browser


**Caso de teste proposto: Desafio 2**
1. Acessar o site: https://shopcart-challenge.4all.com/
2. Selecionar categoria "Bebidas"
    ● Adicionar todos os produtos ao carrinho
3. Selecionar categoria "Todos"
4. Adicionar o produto "Rissole médio" ao carrinho
5. Acessar o carrinho
    ● Aumentar a quantidade do produto "Brigadeiro" em 4 unidades
    ● Diminuir a quantidade do produto "Rissole médio" em 5 unidades
6. Validar o valor total dos produtos
7. Clicar no botão "Finalizar Compra"
    ● Validar a mensagem "Pedido realizado com sucesso!"
8. Clicar no botão "Fechar"
9. Fechar o browser


**Preparação do ambiente - Passo a Passo:**
 1. Baixe e instale o Eclipse;
 2. Baixe e instale o Java: JRE e JDK;
 3. Baixe e instale o Google Chrome versão 87;
 4. Baixe e descompacte o Maven;
 5. Configure o Java e o Maven no Windows 10: vá até o Painel de Controle > Sistema e Segurança > Sistema;
 6. Clique em "Configurações avançadas do sistema";
 7. Clique em "Variáveis de Ambiente...";
 8. Clique no botão “Nova” em “Variáveis do sistema”;
 9. Digite no nome da variável: "JAVA_HOME";
 10. No valor da variável: coloque o endereço onde foi instalado. Exemplo: “C:\Program Files\Java\jdk1.8.0_161”;
 11. Clique em "OK";
 12. Clique novamente no botão “Nova” em “Variáveis do sistema”;
 13. Digite no nome da variável: "MAVEN_HOME";
 14. No valor da variável: coloque o endereço onde foi instalado. Exemplo: “C:\Program Files\Maven\apache-maven-3.6.3”;
 15. Clique em "OK";
 16. Selecione "Path" e clique em "Editar...";
 17. Clique em "Novo" e digite "%JAVA_HOME%\bin";
 18. Clique em "Novo" novamente e digite "%MAVEN_HOME%\bin" e depois clique em "OK"
 19. Clique em "OK" novamente para salvar as configurações;
 20. Para confirmar se foi configurado certo e a verificar a versão:
            vá ao CMD(Prompt de comando) e digite: "java -version"
            e após isto no CMD digite: "mvn -version"

**Executando o script - Passo a Passo:**
 1. Baixe o projeto e descompacte-o;
 2. Acesse o Eclipse;
 3. Dentro do eclipse clique em "File" e depois em "Open Projects from File System...";
 4. Em Import source, digite o endereço do projeto. Exemplo: "C:\Repositorio\desafio4all". Ou clique em "Directory" e selecione a pasta do projeto "desafio4all" e clique em "OK";
 5. Clique em "Finish" e espere o projeto carregar;
 6. Após, clique em "src/test/java";
 7. Clique no pacote "testSuite" e com o botão direito sobre o "SuiteTeste.java" e selecione "Run As" e após "JUnit Test";
 8. Espere o caso de teste ser executado no navegador web;
 9. Ao terminar e a barra de status do JUnit ficar verde, acesse a pasta do projeto e clique em "reports" e clique para abrir o report.html no navegador web, você poderá verificar o resultado gerado.
