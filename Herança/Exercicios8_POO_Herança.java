package Herança;

import javax.sound.sampled.SourceDataLine;

public class Exercicios8_POO_Herança {
    Mensagem mensagem1 = new Mensagem("João", "Olá, tudo bem?");
    System.out.println(mensagem1.Enviar());
    Email email1 = new Email("Maria", "Reunião amanhã às 10h", "Convite para reunião");
    System.out.println(email1.Enviar());
    SMS sms1 = new SMS("Carlos", "Parabéns pelo seu aniversário! Que você tenha um dia incrível cheio de alegria e felicidade!");
    System.out.println(sms1.Enviar());
     SMS sms2 = new SMS("Carlos", "Parabéns pelo seu aniversário! Que você tenha um dia incrível cheio de alegria e felicidade! Aproveite cada momento e que este novo ano de vida seja repleto de realizações e sucesso!");
    System.out.println(sms2.Enviar());

}
/* Crie uma Classe Base Mensagem:
- destinatario: string
- conteudo: string
Métodos:
+ enviar() que imprime: "Enviando mensagem genérica para [destinatario]".
Subclasse Email que herda Mensagem:
- assunto: string
Métodos:
- Sobrescrever enviar(): imprime "Enviando E-mail para [destinatario] com o assunto [assunto]".
Subclasse SMS que estende Mensagem:
sobrescreve enviar() que verifica se o conteúdo tem mais de 160 caracteres. Se tiver,
imprime: “Erro: SMS muito longo”. Se não, imprime “Enviando SMS para [destinatário]”. */