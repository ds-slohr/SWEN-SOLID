
![PlantUML model](https://www.plantuml.com/plantuml/png/XT2nQiSW40RmtQSu_bDIQeQC8PIKGgSEXJo1w0a7HiMxBAKFNsco648x-Ht-vF1RM4oHVGkAec3nnYAi6IrviaOeHTLCC07nMYDxGjTzbkHsAv1xPODXXdSAWaKTHyN-DtGVn3AV-0No4VYvtGHSfrvT5kg0NZISZoUmQSkc85_O_Aqrm5iAgJGNjsobB_nVlKRt5tggvZ4Em_YueMS1bRH_dC3a70XPBHXThVq7)

<!--
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
-->
