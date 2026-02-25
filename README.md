## GYM HUB

Aplicativo Android desenvolvido em Kotlin com Jetpack Compose para **monitorar os treinos da semana**.

Ele foi pensado para organizar os exercícios do dia, permitindo que o usuário veja o treino planejado e acompanhe o progresso das séries de cada exercício.

### Visão geral

- **Login**: tela inicial onde o usuário informa usuário e senha e acessa o app.
- **Home**: mostra o **dia da semana** (atualmente configurado como "MONDAY") e a **lista de exercícios do treino do dia**, com nome, imagem e quantidade de séries/repetições.
- **Detalhe do exercício**: ao clicar em um exercício na Home, o app abre uma tela dedicada com:
  - imagem em destaque do exercício;
  - descrição explicando como executar o movimento;
  - informações do instrutor;
  - botão para **contar as séries realizadas**.

Nos detalhes de cada exercício, o botão atualiza o texto conforme o usuário registra as séries, exibindo algo como **"Série Feita (2/4)"** até chegar em **"Concluído!"**, indicando que todas as séries planejadas foram feitas.

### Funcionalidades principais

- **Monitoramento dos treinos da semana** por dia (com foco no treino do dia atual).
- **Lista de exercícios do dia** com nome, imagem e séries recomendadas.
- **Abertura do exercício ao clicar na Home**, com tela dedicada.
- **Contador de séries** dentro da tela do exercício, mostrando o progresso até concluir o treino daquele movimento.

### Tecnologias utilizadas

- Android nativo
- Kotlin
- Jetpack Compose
- Material 3

### Como executar o projeto

1. Abra o projeto no **Android Studio**.
2. Aguarde a sincronização do Gradle.
3. Conecte um emulador ou dispositivo físico Android.
4. Execute o app (`Run > Run 'app'`).

O aplicativo será iniciado na tela de login e, após o acesso, mostrará a Home com o dia da semana e o treino do dia. Clicando em qualquer exercício, você poderá visualizar os detalhes e marcar as séries concluídas.

# GYM-HUB
