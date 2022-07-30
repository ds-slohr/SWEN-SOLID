
http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/ds-slohr/SWEN-SOLID/master/2%20Open%20Close%20Prinzip/README.md

@startuml

interface Specification
Specification : isSatisfied(Product p)
class Filter
Filter : filter(List<Product> products, Specification spec)

Specification -left- Product: compares
Specification <|--  ColorSpecification
Specification <|--  SizeSpecification
Specification <|--  AndSpecification
Specification *-- "2..2"  AndSpecification
Filter --  Specification: applies

@enduml
