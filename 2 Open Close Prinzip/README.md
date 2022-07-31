# Aufgabenstellung
Ein Produkt mit den Eigenschaften 
- Name
- Größe
- Farge

soll gefiltert werden können. Erstelle dafür einen Filter der nach diesen Eigenschaften eine Liste von Produkten filtern kann.


# Lösung
![PlantUML model](https://www.plantuml.com/plantuml/png/XP0n2yCW58HtVyKRarANZY64b4Ad3eNy0j4dVM1KV6Of_V6rIJeaGpjv9vztd3rdbV8qEa4-Ox9A8mmHDLdIAbFmOkEW0UAXIBQ4fhgdO2QT8TP2EyKCLt8bHIn7WUqigXjnRbUuWxW8FcwRW8khnQvGEhHPmlguWGvq6ADAo3kmVKa9S0akf5y35coW9_wZ3d3sPdFzQNyeXjDtu1or9rICZf15ZzwKZtq3)

<!--
@startuml
interface Specification
Specification : isSatisfied(Product p)
class Filter
Filter : filter(List<Product> products, Specification spec)

Specification -left- Product: > compares
Specification <|--  ColorSpecification
Specification <|--  SizeSpecification
Specification <|--* AndSpecification: > has 2
Filter --  Specification: > applies
@enduml
-->
