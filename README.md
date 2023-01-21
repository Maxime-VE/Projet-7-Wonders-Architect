# <u> Projet 7 Wonders Architect </u>

## <u> Best Practices </u>

#### Nommage :
    - Nommination CLAIRE de chaque variable, fonction, classe !
    On doit savoir en un coup d'oeil qui fait quoi.
    
    Règles:
    - Les packages : toujours écrits tout en minuscules
    - Les classes, les interfaces et les constructeurs :
      En PascalCase, à savoir, comme son nom l'indique, une majuscule à chaque début de mot. (ExempleDeNommage)
    - Les méthodes : En camelCase, à savoir la première lettre en minuscule et une majusculepour chaque nouveau mot. (exempleDeNommage)

#### Structure du code :

Donner au maximum une structure logique au code notamment via des packages.

#### Avancée du projet : 

Ce fichier (README.md) est accessible sur vos IDE et on mettera rapidement en place un backlog (Todo list)
pour savoir les actions a effectuer en priorité il devra ête mis à jour fréquemment

### Règle du jeu: https://youtu.be/p2VmTlU01t8

## <u> Backlog </u>

1) Etudier l'existant (Comprendre ce qui a été fait)
2) Fonction nbrJoueurs --> nbrJeton


#### Objectif n°1 : Lancer une partie avec le moins de fonctionnalité (Priorité Création de Merveille)

1) [CHECK] Info en Entrée: Nombre de joueur --> Nom de joueur, (+Le plus jeune [Plus tard])
                   Choisir sa Merveille,
2) [CHECK] Façonner les decks (boîtes) --> chacun différent et contient les cartes du joueurs et la merveille à créer
3) [CHECK] Créer le contexte de partie commun :
   + Carte neutre
   +   Jeton Paix
   +   Jeton Victoire militaire
   +   Pion Chat
   +   Jeton Progrès
   
4) [CHECK] Chaque paquet de carte contient 5 type de carte (couleur et forme):
   + Carte Or
   + Carte Ressource
   + Carte Combat
   + Carte Victoire
   + Carte Science
5) [CHECK] Faire le mélange des cartes
6) [EN COURS] Système de pioche au choix (gauche/milieu/droite) ATTENTION UNE PIOCHE VIDE N'EST PLUS UTILISABLE
7) <strike>Faire la Défosse (les cartes utilisées se retrouvent ici )</strike> <b>Pas de défosse (inutile)</b>
8) [EN COURS] Faire en sorte que la merveille progresse lorsque les ressources nécessaires sont acquises.
   + Une merveille terminée symbolise la fin de la partie
   + On ne peut pas construire une partie de merveille inaccessible
9) Fin de partie : comptage de point, gagnant, etc

#### Objectif n°2 : Lancer une partie avec une nouvelle fonctionnalité (Au choix parmi:)
1) Système de carte/jeton progrès scientifiques [Plus tard++]
2) Système de carte/jeton de Conflit --> Batailles associées point de victoire 