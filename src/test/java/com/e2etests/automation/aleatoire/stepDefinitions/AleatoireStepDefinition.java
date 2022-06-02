package com.e2etests.automation.aleatoire.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.e2etests.automation.aleatoire.pageObjects.AleatoirePage;
import com.e2etests.automation.utils.Assertions;
import com.e2etests.automation.utils.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AleatoireStepDefinition {

	AleatoirePage aleatoirePage;

	Assertions assertions;

	CommonUtils commonUtils;

	public AleatoireStepDefinition() {

		this.aleatoirePage = new AleatoirePage();
		this.commonUtils = new CommonUtils();
		this.assertions = new Assertions();
	}

	@Given("Je me connecte à l'application bouletcorp")
	public void jeMeConnecteÀLApplicationBouletcorp() throws IOException {
		commonUtils.get(commonUtils.readFromConfig("home.url"));
	}

	@When("Je clique sur le bouton Aléatoire")
	public void jeCliqueSurLeBoutonAléatoire() {
		aleatoirePage.clickOnAleatoire();
	}

	@Then("Je me redirige vers la page suivante")
	public void jeMeRedirigeVersLaPageSuivante() throws IOException {
		Assert.assertTrue(aleatoirePage.urlIsChanged());
	}

	@Then("Je vérifie l'affichage des widgets")
	public void jeVérifieLAffichageDesWidgets() {
		Assert.assertTrue(assertions.isElementDisplayed(AleatoirePage.facebook));
		Assert.assertTrue(assertions.isElementDisplayed(AleatoirePage.tumblr));
		Assert.assertTrue(assertions.isElementDisplayed(AleatoirePage.twitter));
	}

}
