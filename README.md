# Dicas de utilização

&nbsp;

## Índice

- [Introdução](#introdução)
- [Pré-requisitos](#pré-requisitos)
- [Clonando o Repositório](#clonando-o-repositório)
- [Comandos Básicos](#comandos-básicos)
- [Boas Práticas](#boas-práticas)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Introdução

Esta é uma breve introdução sobre o que o projeto faz e seu propósito.

## Pré-requisitos

Antes de começar, você precisará ter o [Git](https://git-scm.com/) instalado em sua máquina. Você pode verificar se o Git está instalado executando:

```bash
git --version
```

## Clonando o Repositório

Para começar a trabalhar no projeto, você precisa clonar o repositório. Use o seguinte comando:

```bash
git clone https://github.com/seu-usuario/AppFeira.git
```

Substitua `seu-usuario` na URL.

## Comandos Básicos

Aqui estão alguns comandos básicos do Git que você deve conhecer:

1. **Verificar o status do repositório:**
   ```bash
   git status
   ```

2. **Adicionar alterações:**
   Para adicionar um arquivo específico:
   ```bash
   git add nome-do-arquivo
   ```
   Para adicionar todos os arquivos alterados:
   ```bash
   git add .
   ```

3. **Fazer um commit:**
   ```bash
   git commit -m "Mensagem descritiva sobre a alteração"
   ```

4. **Enviar suas alterações para o repositório remoto:**
   ```bash
   git push origin main
   ```
   Substitua `main` pelo nome da sua branch, se necessário.

5. **Baixar alterações do repositório remoto:**
   ```bash
   git pull origin main
   ```

6. **Criar uma nova branch:**
   ```bash
   git checkout -b nome-da-branch
   ```

7. **Mudar para uma branch existente:**
   ```bash
   git checkout nome-da-branch
   ```

## Boas Práticas

- **Escreva mensagens de commit claras e descritivas.** Isso ajuda a entender o que foi alterado no projeto.
- **Faça commits pequenos e frequentes.** Isso facilita a revisão e a identificação de problemas.
- **Mantenha sua branch sempre atualizada.** Use `git pull` frequentemente para evitar conflitos.
- **Use branches para novas funcionalidades.** Isso ajuda a manter o código organizado e evita conflitos com o código principal.
- **Documente seu código.** Inclua comentários e mantenha o README atualizado.

Espero que isso ajude! Se precisar de mais alguma coisa, é só avisar.