﻿
# Serialização e Desserialização

**Serialização** é um mecanismo de conversão do estado de um objeto em um fluxo de bytes. 

**Desserialização** 
é o processo reverso em que o fluxo de bytes é usado para recriar o objeto Java real na memória. 

Esse mecanismo é usado para persistir o objeto. O fluxo de bytes criado é independente de plataforma. Portanto, o objeto serializado em uma plataforma pode ser desserializado em uma plataforma diferente. Para tornar um objeto Java serializável, implementamos a interface java.io.Serializable . A classe ObjectOutputStream contém o método writeObject() para serializar um Object. 

![image](https://github.com/user-attachments/assets/af602d9a-371b-4142-91dc-e8f805e2ef7c)


**Vantagens da serialização* 
- Para salvar/persistir o estado de um objeto. 
- Para percorrer um objeto através de uma rede.

*Pontos a serem lembrados*

1. Se uma classe pai implementou a interface Serializable, então a classe filha não precisa implementá-la, mas vice-versa não é verdade.

2. Apenas membros de dados não estáticos são salvos via processo de serialização.

3. Membros de dados estáticos e membros de dados transitórios não são salvos via processo de serialização. Então, se você não quiser salvar o valor de um membro de dados não estático, então torne-o transitório.

4. O construtor do objeto nunca é chamado quando um objeto é desserializado.
 
5. Objetos associados devem estar implementando a interface Serializable.
## Tratamento Especial com writeObject e readObject

Quando uma classe implementa a interface Serializable, ela pode precisar de controle adicional sobre como seus objetos são serializados e desserializados. Para isso, a classe pode sobrescrever os métodos writeObject e readObject.

**writeObject(ObjectOutputStream out):** Usado para salvar o estado do objeto de maneira personalizada.

**readObject(ObjectInputStream in):** Usado para restaurar o estado do objeto de maneira personalizada.


