//UserModelRunner.groovy
package simulation.relogo

import repast.simphony.engine.environment.RunEnvironment
import repast.simphony.engine.schedule.ScheduleParameters
import repast.simphony.scenario.ScenarioUtils

public class UserModelRunner {
	static void main(String[] args) {
		def model = new UserModel()
		def builder = ScenarioUtils.createBuilder()
		builder.setStepLimit(1) // Количество шагов моделирования
		builder.setContext(UserModel)
		builder.build()
		RunEnvironment.getInstance().endAt(10) // Когда моделирование завершится
		RunEnvironment.getInstance().run(builder.getScenario())
	}
}