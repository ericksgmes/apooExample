# Singleton

---

## Quando utilizar?
- Garantir que apenas uma instância da classe será criada.

## Solução / Estrutura
- Ocultar o construtor da classe (private ...)
- Definir um método pra retornar a instância da classe.

```mermaid
classDiagram
    class Singleton {
        - instance: Singleton
        - Singleton()
        + getInstance(): Singleton
        + otherMethod(): AnyType
    }
```
## Consequências
- Baixa testabilidade (dificil mockar)
- Alto acoplamento
- Menor escalabilidade





