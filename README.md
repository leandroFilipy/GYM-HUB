# 🏋️‍♂️ GYM HUB

Aplicativo Android desenvolvido em **Kotlin + Jetpack Compose** para **organizar e monitorar treinos semanais** de forma simples, visual e eficiente.

O objetivo do app é permitir que o usuário acompanhe o treino do dia, visualize detalhes de cada exercício e marque as séries realizadas até concluir o movimento.

---

## 📱 Visão Geral do Aplicativo

O fluxo do aplicativo é dividido em três telas principais:

### 🔐 Tela de Login
- Campo para usuário e senha  
- Acesso ao sistema após autenticação  
- Primeira tela exibida ao abrir o app  

---

### 🏠 Tela Home
- Exibe o **dia da semana** (ex: `MONDAY`)  
- Lista com os **exercícios do treino do dia**  

Cada exercício contém:
- 🖼️ Imagem ilustrativa  
- 🏷️ Nome do exercício  
- 🔢 Quantidade de séries/repetições recomendadas  

Ao clicar em um exercício, o usuário é direcionado para a tela de detalhes.

---

### 📖 Tela de Detalhes do Exercício

Tela dedicada com informações completas do movimento:

- 🖼️ Imagem em destaque  
- 📝 Descrição explicando como executar corretamente  
- 👨‍🏫 Informações do instrutor  
- ✅ Botão para registrar as séries realizadas  

#### 📊 Controle de Progresso

O botão atualiza dinamicamente conforme o usuário registra as séries:

- `Série Feita (1/4)`
- `Série Feita (2/4)`
- `Série Feita (3/4)`
- `Concluído! 🎉`

Isso permite acompanhar visualmente a evolução até finalizar o exercício.

---

## 🚀 Funcionalidades Principais

✔ Monitoramento do treino do dia  
✔ Listagem organizada de exercícios  
✔ Navegação entre telas com clique na Home  
✔ Tela detalhada por exercício  
✔ Contador interativo de séries  
✔ Feedback visual de conclusão  

---

## 🛠️ Tecnologias Utilizadas

- 📱 Android Nativo  
- 💻 Kotlin  
- 🎨 Jetpack Compose  
- 🧩 Material 3  

---

## 🧠 Arquitetura e Conceitos Aplicados

- Composição de UI com Jetpack Compose  
- Gerenciamento de estado para controle de séries  
- Navegação entre telas  
- Componentização de interfaces  
- Estrutura organizada de telas e lógica  

---

## ▶ Como Executar o Projeto

1. Abra o projeto no **Android Studio**
2. Aguarde a sincronização do Gradle
3. Conecte um emulador ou dispositivo físico Android
4. Execute o projeto:
   
Run > Run 'app'

O aplicativo iniciará na tela de login e, após o acesso, exibirá o treino do dia com seus respectivos exercícios.

---

### 🔮 Melhorias Planejadas
- Persistência de progresso  
- Treinos personalizados por usuário  
- Histórico semanal  
- Dark Mode  
- Integração futura com backend  
- Video mostrando como executar exercicios 

---

# GYM-HUB
