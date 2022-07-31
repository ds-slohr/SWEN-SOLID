# Aufgabenstellung
Es sollen verschiedene Geräte abgebildet werden:
- Drucker
- Scanner
- Fax

Außerdem existieren Geräte, die beliebige kombinationen aus den obigen Geräte abbilden können.

# Lösung
![PlantUML model](https://www.plantuml.com/plantuml/png/TOw_2i8m4CRtFCMDEhGF80uTH70G19_WI5CCf9UINg233-zPUrW2sRu_lro-RcPCdCTWFB5B0re7joikU_kqIEJIFdgarHZju0IpgCCbsZmwuhPjeT_qV3JA2pPzLPMJduKPSAaHviUStqq38lwNrqIDsOPflfcIVaMEDavUWls3iYgwUmxiXqoMVIGCe5UhjGukAzCvwlCOFW007)

<!--
@startuml
interface IFax
interface IScanner
interface IPrinter
IScanner : scan(Document... documents)
IPrinter : print(Document... documents)
IFax : fax(Document... documents)


IFax <|-- Fax
IPrinter <|-- Printer 

IScanner <|-- Scanner
IPrinter <|-- Photocopier 
IScanner <|-- Photocopier 

IScanner <|-- Multifunctional 
IPrinter <|-- Multifunctional 
IFax <|-- Multifunctional 
@enduml
-->
