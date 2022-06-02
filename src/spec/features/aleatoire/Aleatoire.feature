@aleatoire
Feature: Je me connecte à l'application bouletcorp
  ETQ utilisateur je souhaite me connecter

  @aleatoire1
  Scenario: Module aléatoire valide
    Given Je me connecte à l'application bouletcorp
    When Je clique sur le bouton Aléatoire
    Then Je me redirige vers la page suivante
    And Je vérifie l'affichage des widgets
