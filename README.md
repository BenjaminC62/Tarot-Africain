# Tarot Africain

## Description
Un jeu de tarot de base développé en Java.

## Prérequis
- Java 8 ou supérieur
- Maven (optionnel, pour la gestion des dépendances)

## Installation
1. Clonez le dépôt :
    ```sh
    git clone https://github.com/Benjamin62130/tarot-africain.git
    ```
2. Accédez au répertoire du projet :
    ```sh
    cd tarot-africain
    ```

## Compilation et Exécution
### Avec Maven
1. Compilez le projet :
    ```sh
    mvn compile
    ```
2. Exécutez le projet :
    ```sh
    mvn exec:java -Dexec.mainClass="fr.univartois.butinfo.r304.tarotafricain.Main"
    ```

### Sans Maven
1. Compilez les fichiers Java :
    ```sh
    javac -d out src/main/java/fr/univartois/butinfo/r304/tarotafricain/*.java
    ```
2. Exécutez le projet :
    ```sh
    java -cp out fr.univartois.butinfo.r304.tarotafricain.Main
    ```

## Utilisation
Décrivez ici comment jouer au jeu, les règles de base, et toute autre information pertinente pour les utilisateurs.

## Contribuer
1. Forkez le projet.
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/AmazingFeature`).
3. Commitez vos modifications (`git commit -m 'Add some AmazingFeature'`).
4. Poussez votre branche (`git push origin feature/AmazingFeature`).
5. Ouvrez une Pull Request.

## Licence
Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.