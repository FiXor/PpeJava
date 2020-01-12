### ProjetJavaPpe

----------

**Introduction**

Ce projet correspond à une application permettant de gérer le parcours professionnel des étudiants du BTS SIO. Le composant disponible ci dessus est l'espace administrateur de l'application.

Développement de composants java permettant de :

1.  S’enregistrer dans un système d’information (S.I.) (champ identifiant, mot de passe, nom, prénom, numéro de téléphone, date de naissance, photo. PAQUETAGE : com.karimandco.auth
    
2.  S’identifier dans un système d’information (champ identifiant et mot de passe) PAQUETAGE : com.karimandco.auth
    
3.  uploader une photo, la stocker dans le S.I. et l’afficher dans un JPanel PAQUETAGE : com.karimandco.photo
    
4.  saisir et gérer des lignes d’un CV, un utilisateur pourra avoir un cv composé de :
    

1.  titre
    
2.  formation.s (année - lieu)
    
3.  expériences pro (année - lieu)
    

PAQUETAGE : com.karimandco.cv

5.  gérer un espace administrateur - crud sur les utilisateurs PAQUETAGE : com.karimandco.admin
    
6.  générer en pdf le cv
    

PAQUETAGE : com.karimandco.pdf

**Fonctionnalités**

Avec ce composant, on peut :

```
-   Voir les différents utilisateurs créer
-   Créer un utilisateur
-   Supprimer un utilisateur 
-   Supprimer tout les utilisateurs
-   Supprimer Modifier les valeurs d'un utilisateur 

```

**Documentation**

Javadoc : [cliquez-ici] 
([https://drive.google.com/drive/u/0/folders/1WrhycMSDc_J2tnBF_AOnucj6STEesQYp](https://drive.google.com/drive/u/0/folders/1WrhycMSDc_J2tnBF_AOnucj6STEesQYp))
Pour la javadoc télécharger ce dossier et ouvrir index.html avec votre navigateur

Document utilisateur :  [cliquez-ici]([https://drive.google.com/drive/u/0/folders/1vnjQsrF4dIv3KNwGcRKz7tZwBqSLHpu8](https://drive.google.com/drive/u/0/folders/1vnjQsrF4dIv3KNwGcRKz7tZwBqSLHpu8))

**Dépendances utilisés**



**Mise en marche du composant**

1.  Télécharger le composant en cliquant sur le bouton vert "Clone or Download" puis "Download ZIP".
2.  Dézipper le projet
3.  Copier coller les trois packages "com.karimandco.admin", "com.karimandco.auth" et "com.karimandco.bdd dans votre nouveau projet ou ouvrir le projet avec votre IDE
4.  Ajouter la librairie JCBD à votre projet Sur NetBeans clic droit sur le projet, propriété, Libraries, add Library. Si la Library JCBD n'existe pas aller sur  [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
5.  Ajouter les dépendances. Sur NetBeans clic droit sur le projet, propriété, Libraries, add JAR/Folder. Dépendances :  [cliquez-ici](https://drive.google.com/drive/folders/1dKuqR9ON-Xatcf9F6PNjLwxOV_AhOw_f?usp=sharing)

Info importante : - Il se peut que le package "com.karimandco.auth" soit mise à jour assez régulièrement.Pour télécharger la dernière version  [cliquez-ici](https://github.com/pawel956/projetKarimAndCo_ConnexionInscription/)

**Informations divers**

Les actions de suppression sont protégées par un identifiant et un mot de passe administrateur.  
Identifiant : Admin  
Mot de passe : 123456  
  
Le panneau qui contient l'espace administrateur : PanneauAdministration.java La connexion a la base de donnée se fais avec la classe DaoSio


    Voici les identifiants de la BDD :
    
    - serveur : www.cnadal.fr
    
    - port : 3306
    
    - nom : sio2_cv
    
    - identifiant : sio2_cv
    
    - mot de passe : formation2020
