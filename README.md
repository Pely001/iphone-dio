# Diagramação de classes do iPhone

## Descrição

Repositório referente ao desafio de código proposto pela plataforma DIO, com o objetivo de descrever as funcionalidades de um iPhone. Projeto utiliza os princípios de POO e UML para apresentar três funcionalidades de um aparelho iPhone: Reproduzir Música, Realizar Chamadas e Navegar na Internet.

## Diagrama UML

![Iphone-DIO](https://github.com/Pely001/iphone-dio/assets/112733794/f7ba6ecf-eb2b-4362-bfde-c9de4058941e)

## Descrição de cada classe

### `iPhone`
A classe `iPhone` é o equipamento em si, nele são implementadas as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `Navegador Internet`

### `ReprodutorMusical`

A interface `ReprodutorMusical` define os métodos necessários para controlar a reprodução de música, como `tocar()`, `pausar()` e `selecionarMusica()`. As classes que implementam essa interface são capazes de reproduzir músicas.

### `AparelhoTelefonico`

A interface `AparelhoTelefonico` define os métodos para realizar chamadas telefônicas e enviar mensagens, incluindo `ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como dispositivos telefônicos.

### `NavegadorInternet`

A interface `NavegadorInternet` define métodos para a navegação na web, como `exibirPagina()`, `adicionarNovaAba()` e `atualizarPagina()`. As classes que implementam essa interface podem atuar como navegadores da Internet.

Cada classe ou interface desempenha um papel específico no sistema e contribui para a versatilidade do dispositivo iPhone, tornando-o capaz de realizar uma variedade de funções.

### `App`

Classe principal onde é instaciado o iPhone e realizado os testes dos métodos implementados
