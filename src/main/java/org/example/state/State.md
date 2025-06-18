# State

---

## Quando utilizar?
- Quando um objeto deve mudar o seu comportamento quando seu estado muda.
- Adicionar novos estados muda a implementação dos comportamentos existentes.

## Solução / Estrutura
- Definir uma interface para encapsular o comportamento.
- Prover implementações para cada comportamento.
- Implementar o a máquina de estados com uma instância do estado atual.

```mermaid
stateDiagram
    direction LR
    OffState --> LockedState
    LockedState --> OffState
    LockedState --> ReadyState
    ReadyState --> OffState
```

```mermaid
classDiagram
direction LR
    class State {
	    +String onHome()
	    +String onOffOn()
    }

    class Phone {
	    -State state
	    +Phone()
	    +void setState(State)
	    +String getStateName()
	    +String lock()
	    +String unlock()
	    +String home()
	    +String turnOn()
    }

    class OffState {
	    -Phone phone
	    +OffState(Phone)
	    +String onHome()
	    +String onOffOn()
    }

    class LockedState {
	    -Phone phone
	    +LockedState(Phone)
	    +String onHome()
	    +String onOffOn()
    }

    class ReadyState {
	    -Phone phone
	    +ReadyState(Phone)
	    +String onHome()
	    +String onOffOn()
    }

	<<Interface>> State

    State <|.. OffState
    State <|.. LockedState
    State <|.. ReadyState
    Phone "1" o-- "1" State : state
```
## Consequências (Pros / Cons)
- Princípio aberto/fechado
- Transição de estado é representada pela troca entre objeto concreto.
- Estados como objetos protegem o contexto de inconsistências.
