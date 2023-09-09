//UserScenario.groovy
package simulation.relogo

import repast.simphony.scenario.Scenario

class UserScenario extends Scenario {
	void initialize() {
		// Создание агентов, обозначение связей и другие начальные действия
		userObserver.setup()
		userTurtle.setup()
		userPatch.setup()
		userLink.setup()
	}

	void execute() {
		// Цикл моделирования
		userObserver.go()
		userTurtle.go()
		userPatch.go()
		userLink.go()
	}
}