# Serialização-Desserialização
Interface Serializable
A interface Serializable é uma marca (interface sem métodos) usada para indicar que os objetos de uma classe podem ser convertidos em um fluxo de bytes. Este processo é chamado de serialização. Quando um objeto é serializado, todos os seus campos, incluindo os de suas superclasses (se estas também forem serializáveis), são salvos.

Serialização e Desserialização
Quando você deseja salvar o estado de um objeto (serialização) ou reconstruí-lo a partir de um fluxo de bytes (desserialização), você pode usar os métodos ObjectOutputStream e ObjectInputStream.

Tratamento Especial com writeObject e readObject

Quando uma classe implementa a interface Serializable, ela pode precisar de controle adicional sobre como seus objetos são serializados e desserializados. Para isso, a classe pode sobrescrever os métodos writeObject e readObject.
writeObject(ObjectOutputStream out): Usado para salvar o estado do objeto de maneira personalizada.
readObject(ObjectInputStream in): Usado para restaurar o estado do objeto de maneira personalizada.
