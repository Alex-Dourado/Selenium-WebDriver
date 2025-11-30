 **🧪<h2>Teste Automatizado com Selenium WebDriver – Pesquisa no Google</h2>**

Este projeto demonstra um teste automatizado simples utilizando Java + Selenium WebDriver + JUnit 5.
O objetivo é acessar o Google, interagir com a barra de pesquisa e validar o texto digitado — simulando o comportamento real de um usuário.

**🚀 <h2>O que o teste faz</h2>**

Abre o navegador Chrome usando o WebDriverManager (que configura o driver automaticamente).

Acessa o site do Google (https://www.google.com.br).

Localiza a barra de pesquisa usando o seletor name="q" (padrão do Google).

Clica no campo de busca para iniciar a interação.

Digita a palavra “Linkendin” na caixa de pesquisa.

Valida automaticamente que o texto digitado realmente foi inserido no campo, garantindo que o envio da informação ao input está correto.

Aguarda alguns segundos (para visualização).

Fecha o navegador ao final do teste.

**🧰 <h2>Tecnologias utilizadas</h2>**

Java 17+

Selenium WebDriver

JUnit 5

WebDriverManager (para configurar o ChromeDriver)

Maven

***📌 <h2>Objetivo do projeto</h2>***

Este teste faz parte do meu portfólio como QA e demonstra:

Interação com elementos na página

Automação de navegação em browser

Validação de campos de entrada

Boas práticas básicas com Selenium e JUnit

Um exemplo simples, porém funcional, para mostrar domínio em automação de testes web.
