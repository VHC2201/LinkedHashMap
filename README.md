# 🛒 Java LinkedHashMap na Prática: Sistema de E-commerce

Este repositório contém um projeto prático desenvolvido para demonstrar o funcionamento e as vantagens da estrutura de dados `LinkedHashMap` em Java, com foco na preservação da ordem de elementos e construção de Cache.

Projeto acadêmico desenvolvido para o curso de Sistemas de Informação.

## 🚀 Funcionalidades Demonstradas

O projeto simula duas funcionalidades clássicas de um sistema de E-commerce:

1. **Carrinho de Compras (Insertion-Order):**
   - Utiliza o comportamento padrão do `LinkedHashMap` para garantir que os produtos sejam exibidos no checkout exatamente na mesma ordem em que o cliente os adicionou.
   - Demonstra que a atualização de valores (quantidade/preço) não altera a posição do item na fila.

2. **Histórico de Produtos Recentes (Access-Order / Cache LRU):**
   - Utiliza a configuração avançada de ordem de acesso (`accessOrder = true`).
   - Sobrescreve o método `removeEldestEntry` para criar um limite de memória (Cache LRU - *Least Recently Used*).
   - O sistema apaga automaticamente o produto visto há mais tempo quando o usuário visualiza um novo item.

## 🛠️ Tecnologias Utilizadas
- **Java SE** (Collections Framework)

## ⚙️ Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone git@github.com:SEU_USUARIO/SEU_REPOSITORIO.git


2. Navegue até a pasta onde está o arquivo fonte (ex: `src`):
```bash
cd src
```

3. Compile o arquivo Java:
```bash
javac DemonstracaoLinkedHashMap.java
```

4. Execute a classe compilada:
```bash
java DemonstracaoLinkedHashMap
```

## 👨‍💻 Autor
- **Vinicius Cordeiro** - *Programador e Estudante de Sistemas de Informação* 
