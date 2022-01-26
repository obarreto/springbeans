# Beans

Um bena se trata de um objeto que é instanciado, montado e gerenciado por um container do Spring através de Inversão de Controle(IoC) e Injeção de Dependências(DI).

Ciclo de vida de um Bena

Container é iniciado -> Bean é instanciado -> Dependencias são injetadas

 -> Chamada do metodo de iunic -> Bean é utilizado -> Bean é descartado.



# Configurando Beans

É possivel configurar um Bean de duas formas por arquivos XM ou através de anotações. 



Em XML seria preciso definir a tag <bean> dentro de uma tag principal <beans> passando o path da classe assim o Srping saberá quais classes gerenciar a criação de instâncias e a injeção de dependências.

#  BeanFactoru ou ApplicationContext ?

* BeanFactory fornece um mecaniso de configuração avançada capas de gerenciar objetos de qualquer natureza.
* ApllicationContext se baseia na BeanFactory (é uma subinterface e a mais utilizada) e adiciona outra funcionalidade, como integração mais fácil com os recurso AOP do Spring, manipulação de recursos de mensagem (para uso na internacionalização), propagação de eventos e contexto específicos da camada de aplicativo, como WebapplicationContext para uso em aplicativos da web.