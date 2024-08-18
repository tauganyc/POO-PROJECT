# Sistema de Biblioteca em Java

## Descrição do Projeto

Este projeto implementa um sistema de biblioteca utilizando Java, com foco na aplicação dos conceitos fundamentais da Programação Orientada a Objetos (POO). A aplicação permite o gerenciamento de livros, usuários (alunos e professores) e empréstimos de livros, garantindo a persistência dos dados por meio da manipulação de arquivos.
A referência para montar ele foi tirada de um teste de estágio da Dell.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Publicacao** (classe abstrata)
- **Livro** (subclasse de Publicacao)
- **Usuario** (classe base)
- **Aluno** e **Professor** (subclasses de Usuario)
- **Emprestimo** (classe para gerenciamento de empréstimos)
- **Biblioteca** (classe principal para gerenciar o sistema)

## Aplicação dos Conceitos de Programação Orientada a Objetos

### 1. **Classes e Objetos**
As classes foram criadas para representar os elementos principais do sistema, como `Livro`, `Usuario`, `Emprestimo`, entre outros. Cada classe encapsula os atributos e métodos relacionados ao elemento que representa, tornando o sistema modular e facilitando a manutenção.

### 2. **Encapsulamento**
Os atributos das classes são privados, e o acesso a eles é feito por meio de métodos públicos (getters e setters). Esse encapsulamento garante que os dados internos das classes estejam protegidos contra acessos indevidos e manipulações diretas.

### 3. **Herança**
A herança foi aplicada para evitar redundância e promover a reutilização de código. A classe `Usuario` é uma classe base que é estendida por `Aluno` e `Professor`. Cada subclasse herda os atributos e métodos de `Usuario`, e pode adicionar ou sobrescrever funcionalidades específicas.

### 4. **Polimorfismo**
O polimorfismo permite que objetos de diferentes subclasses (`Aluno`, `Professor`) sejam tratados de forma uniforme como `Usuario`. Isso é particularmente útil em métodos que manipulam ou processam instâncias de `Usuario`, sem precisar conhecer a subclasse exata.

### 5. **Sobrecarga e Sobrescrita de Métodos**
- **Sobrecarga:** É utilizada para definir múltiplas versões de um método na mesma classe, como diferentes construtores ou métodos de adição com diferentes parâmetros.
- **Sobrescrita:** Métodos definidos na superclasse `Usuario` são sobrescritos em `Aluno` e `Professor` para personalizar o comportamento, como o método `exibirInformacoes()`.

### 6. **Classes Abstratas**
A classe `Publicacao` é definida como abstrata, pois representa um conceito genérico que não pode ser instanciado diretamente. Subclasses como `Livro` implementam o método abstrato `exibirInformacoes()` para exibir detalhes específicos de uma publicação.

### 7. **Coleções**
A classe `Biblioteca` utiliza coleções (como `ArrayList`) para armazenar e gerenciar grupos de objetos, como livros, usuários e empréstimos. As coleções permitem fácil acesso, adição e remoção de elementos.

### 8. **Manipulação de Arquivos**
A persistência dos dados é garantida por meio da leitura e escrita em arquivos de texto. Isso permite que as informações sobre livros e usuários sejam armazenadas entre as execuções do programa.

### 9. **Tratamento de Exceções**
O tratamento de exceções foi implementado para lidar com possíveis erros na manipulação de arquivos, como falhas na leitura ou gravação. Isso torna a aplicação mais robusta e resistente a falhas.

## Como Executar o Projeto

1. Clone o repositório ou baixe os arquivos do projeto.
2. Compile as classes Java com o comando:
   ```bash
   javac main/Main.java
