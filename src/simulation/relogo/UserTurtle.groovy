//UserTurtle.groovy
package simulation.relogo

import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup
import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.BaseTurtle;
import repast.simphony.relogo.BasePatch;
import simulation.ReLogoTurtle

class UserTurtle extends ReLogoTurtle {
    def userGlobals = new UserGlobalsAndSettings()

    @Setup
    def setup() {
        userGlobals = new UserGlobalsAndSettings() // Инициализация настроек

        // Логика инициализации для Turtle
        if (userGlobals.userRole == "Обучающийся") {
			// Логика инициализации для обучающихся
            println("UserTurtle: Инициализация для обучающихся")
        } else if (userGlobals.userRole == "Создатель курсов (ментор)") {
			// Логика инициализации для создателей курсов
            println("UserTurtle: Инициализация для создателей курсов")
        } else if (userGlobals.userRole == "Администратор") {
			// Логика инициализации для администраторов
            println("UserTurtle: Инициализация для администраторов")
        } else {
			// Логика для других ролей
            println("UserTurtle: Инициализация для других ролей")
        }
    }

    @Go
    def go() {
        // Логика моделирования для Turtle
        println("UserTurtle: Моделирование для Turtle")

        if (userGlobals.lecturesAvailable) {
			// Логика для просмотра лекций
            println("UserTurtle: Просмотр лекций")
        }

        if (userGlobals.testsAvailable) {
			// Логика для выполнения тестов
            println("UserTurtle: Выполнение тестов")
        }
    }
}