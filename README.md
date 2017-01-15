# EFREI-S7-REST
Services REST pour le site web d'un festival du film

Vous devrez créer différents services pour obtenir différents
fichiers XML:

- la liste de tous les films
path: /films

- la liste des films participant pour une année donnée
path examples: /films/2015   /films/2014

- le lauréat d'une année donnée
path examples: /films/2014/laureat   /films/2014/laureat

- la liste de tous les réalisateurs
path: /realisateurs

- l'information de un réalisateur pour id
path examples: /realisateurs/1      /realisateurs/2

- les films d'un réalisateur
path examples: /realisateurs/1/films    /realisateurs/2/films

- tous les commentaires pour un film (id du film)
path examples: /commentaires/1    /commentaires/2

- Un service pour ajouter des commentaires à un film avec un formulaire HTML

- Un service pour obtenir une ''text plain'' avec tous les lauréats (Année et nom du film par ligne.)
path: /laureats

- Utilisez votre imagination pour définir et créer 2 services Web supplémentaires pour le festival du film.

Envoyer: jabier.martinez.11000761@intervenants.groupe-efrei.fr
- Un fichier ZIP avec le code source (projet Eclipse). Lorsque vous créez le Zip, vous pouvez supprimer les fichiers Jar de la distribution Jersey. \WebContent\WEB-INF\lib Cela réduira la taille et l'email ne sera pas bloqué par votre client de messagerie.
- Un document PDF expliquant:
-- La version java, le Server utilisé, la version du Jersey, et toutes les informations nécessaires pour exécuter votre projet dans une autre machine.
-- Les services et leur implémentation. N'hésitez pas à ajouter des captures d'écran dans le document.
-- Si vous n'étiez pas en mesure de terminer un service ou certains d'entre eux, expliquer les difficultés rencontrées.
