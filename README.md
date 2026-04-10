Sistema Scolastico MDP – Teoria
Descrizione

Questo progetto è stato sviluppato durante il corso di Metodologie di Programmazione e Modellazione della Conoscenza (MDP) presso l’Università di Camerino.

L’obiettivo principale è quello di applicare i concetti fondamentali della programmazione orientata agli oggetti (OOP) attraverso la realizzazione di un semplice sistema che modella un contesto universitario.

In particolare, il progetto non è pensato come applicazione completa, ma come esercitazione per comprendere e mettere in pratica i principali concetti teorici visti a lezione.

Obiettivi del progetto
Comprendere e applicare i principi della OOP
Utilizzare l’incapsulamento per proteggere i dati
Applicare l’ereditarietà per evitare duplicazione di codice
Introdurre il concetto di interfaccia per modellare comportamenti
Separare responsabilità tra le classi
Struttura del progetto

Il sistema modella alcune entità principali del contesto universitario:

Persona

Classe base che rappresenta una persona generica con:

nome
cognome
Studente

Estende Persona e aggiunge:

matricola (immutabile)
comportamento di saluto
Professore

Estende Persona e aggiunge:

settore di appartenenza
capacità di assegnare un voto
Corso

Rappresenta un corso universitario:

ha un nome
è associato a un professore
contiene una lista di studenti
permette di iscrivere studenti
stampa gli iscritti
Valutatore (interfaccia)

Definisce un comportamento generico:

assegnare un voto a uno studente
SistemaAutomatico

Implementazione alternativa di Valutatore:

assegna voti in modo automatico
Esame

Rappresenta un esame:

è associato a un Valutatore
permette di sostenere l’esame e ottenere un voto
Concetti applicati

Nel progetto sono stati applicati i seguenti concetti:

Incapsulamento
utilizzo di campi private
accesso tramite getter e setter
Ereditarietà
Studente e Professore estendono Persona
eliminazione del codice duplicato
Polimorfismo
utilizzo dell’interfaccia Valutatore
possibilità di usare diversi tipi di valutazione
Separazione delle responsabilità
ogni classe ha un ruolo ben definito
Esecuzione

Per eseguire il progetto:

gradle build
gradle run
Note

Il progetto è stato sviluppato a scopo didattico e rappresenta una base per comprendere i concetti fondamentali della programmazione orientata agli oggetti in Java.

Autore

Francesco Pizzi
