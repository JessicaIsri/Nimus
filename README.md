# Nimus: Aplicativo para facilitação do agendamento de consultas

## **Fatec Jessen Vidal - São José Dos Campos/SP**

## **Jéssica Isri Dias Cruz**

### **1. Introdução**

Um plano de saúde é um seguro de proteção de pessoas contra o risco de terem de vir a arcar com despesas médicas. 
Planos de saúde suplementar surgiram no Brasil há pouco mais de 60 anos e atualmente servem a cerca de 47,3 milhões de pessoas (22,7% da população brasileira), segundo dados da Agência Nacional de Saúde Suplementar (ANS).

Atualmente em todo o país existem cerca de 754 operadoras em funcionamento, oferecendo tipos diversos de planos (familiares, individuais e empresariais), com as principais modalidades sendo: Autogestão cooperativa médica, filantropia, medicina de grupo e seguradora de saúde. 
Contudo mais de 1,2 bilhões de consultas, exames e internações por ano.

Com o intuito de auxiliar os usuários de planos de saúde suplementar a as clínicas e profissionais que servem aos planos supracitados a realizarem o agendamento e gerenciamento de consultas, alguns softwares foram desenvolvidos, tais como  o *MediLab*, que visa a facilitação e encurtamento da burocracia envolvida no momento de se marcar uma consulta médica.

## 

### **2. Fundamentação Teórica**

### **2.1. Sistemas Mobile**

De acordo com a IBM, a tecnologia móvel é aquela capaz de acompanhar o usuário independente do local onde o mesmo se encontra. Ela é constituída por dispositivos portáteis de comunicação bidirecional, dispositivos de computação e a tecnologia de rede que as conectam.
A tecnologia móvel é caracterizada por dispositivos habilitados para o uso conjunto com a internet, como por exemplo: smartphones, tablets e relógios. [IBM - Mobile Technology](https://www.ibm.com/topics/mobile-technology).

A tecnologia móvel atualmente se encontra em rápida acensão, sendo que o número de usuários já ultrapassa os 3 bilhões.

##

### **2.2. Flutter**

O Flutter é um kit de desenvolvimento de interface de usuário de código aberto desenvolvido pelo Google, que possui como vantagem apresentar um codigo unico para diversas plataformas (Android, IOS, Windowns, Linux e Web), tendo o Dart como principal linguagem de desenvolvimento.

O Flutter possui uma porção de widgets que permite criar o layout dos aplicativos com uma maior facilidade em comparação com linguagem nativas, tendo sido projetado como um sistema extensível em camadas. Ele existe como uma série de bibliotecas independentes em que cada uma depende da camada subjacente. [Flutter - Architectural Overview](https://flutter.dev/docs/resources/architectural-overview)

![Architectural diagram](https://flutter.dev/images/arch-overview/archdiagram.png) 
    > _Figura 1. Arquitetura do funcionamento do Flutter_

Geralmente os desenvolvedores integram com o Flutter por meio da estrutura Flutter, que fornece uma estrutura reativa moderna escrita na lingragem Dart. Incluindo um rico conjunto de plataformas, layout e bibliotecas básicas, composta de uma série de camadas trabalhando de baixo para cima, teremos:

 - Foundation: Classes básicas de serviços de bloco de construção, como animações, pintura e gestos que oferecem abstrações comumente usadas sobre a base subjacente.
 - Rendering Layer: Fornece um conjunto de abstrações para se trabalhar com layout, podendo construir uma árvoe de objetos renderizáveis, podendo ser manipulados dinamicamente.
 - Widget Layer: É uma abstração de composição, onde cada objeto de renderização tem uma classe correspondente na camada de widgets.
 - Material e Cupertino: São bibliotecas que oferecem conjuntos de controles que usam os primitivos de composição da camada de widget para implementar o Material ou linguagens de design do iOS.

### **2.3. CloudSQL**

### **2.4. App Engine**
