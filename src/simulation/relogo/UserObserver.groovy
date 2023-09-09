//UserObserver.groovy
package simulation.relogo

import repast.simphony.relogo.Stop
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

/*import org.jfree.chart.ChartFactory///////////
import org.jfree.chart.ChartPanel
import org.jfree.chart.JFreeChart
import org.jfree.chart.plot.PlotOrientation
import org.jfree.data.category.DefaultCategoryDataset
import repast.simphony.visualizationOGL2D.DisplayOGL2D*/
import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.BaseObserver;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import simulation.ReLogoObserver;

class UserObserver extends ReLogoObserver {
    def userGlobals = new UserGlobalsAndSettings()

    @Setup
    def setup() {
		userGlobals = new UserGlobalsAndSettings() // Инициализация настроек
		
		/*clearAll()
		setDefaultShape(User,"person")
		createUsers(numUsers){
			setxy(randomXcor(),randomYcor())
		}
		setDefaultShape(Course,"box")
		createCourses(numCourses){
			setxy(randomXcor(),randomYcor())
			size = 2
		}*/

        // Логика инициализации
        println("UserObserver: Начальная инициализация модели")
        if (userGlobals.userRole == "Обучающийся") {
			// Логика инициализации для обучающихся
            println("UserObserver: Инициализация для обучающихся")
        } else if (userGlobals.userRole == "Создатель курсов (ментор)") {
			// Логика инициализации для создателей курсов
            println("UserObserver: Инициализация для создателей курсов")
        } else if (userGlobals.userRole == "Администратор") {
			// Логика инициализации для администраторов
            println("UserObserver: Инициализация для администраторов")
        } else {
			// Логика для других ролей
            println("UserObserver: Инициализация для других ролей")
        }
    }

    @Go
    def go() {
		/*ask (courses()){
			step()
			courseSignal++
		}
		diffuseAndEvaporate()
		ask (patches()){
			recolorPatch()
		}
		
		ask (users()){
			step()
		}*/
		
        // Логика моделирования
        println("UserObserver: Запуск моделирования")

        if (userGlobals.userRole == "Обучающийся") {
			// Логика моделирования для обучающихся
            println("UserObserver: Моделирование для обучающихся")
        } else if (userGlobals.userRole == "Создатель курсов (ментор)") {
			// Логика моделирования для создателей курсов
            println("UserObserver: Моделирование для создателей курсов")
        } else if (userGlobals.userRole == "Администратор") {
			// Логика моделирования для администраторов
            println("UserObserver: Моделирование для администраторов")
        } else {
			// Логика для других ролей
            println("UserObserver: Моделирование для других ролей")
        }

        if (userGlobals.viewingAppeals) {
			// Логика для просмотра обращений
            println("UserObserver: Просмотр обращений")
        }

        if (userGlobals.helpRequested) {
			// Логика для запросов на помощь
            println("UserObserver: Запросы на помощь")
        }

        //Завершение моделирования
        if (stopCondition()) {
			Stop.stop()
        }
    }
	
	// Метод для создания и отображения графика
	/*def createAndDisplayChart() {
		def dataset = new DefaultCategoryDataset()
		dataset.addValue(1, "Series 1", "Category 1")
		dataset.addValue(2, "Series 1", "Category 2")
		dataset.addValue(3, "Series 1", "Category 3")

		def chart = ChartFactory.createBarChart(
			"Sample Chart", "Category", "Value", dataset,
			PlotOrientation.VERTICAL, true, true, false
		)
		
		// Здесь не создаем ChartPanel, а отображаем график напрямую
		displayChart(chart)
	}
	
	// Метод для отображения графика
	def displayChart(JFreeChart chart) {
		// Создание экземпляра DisplayOGL2D без параметров
		DisplayOGL2D display = new DisplayOGL2D()
		
		// Отображение графика
		display.attach(chart, "Chart")
		display.display()
	}*/
	
	/*def remainingUsers(){////////
		count(users())
	}
		
	def diffuseAndEvaporate(){
		diffuse("courseSignal",courseDiffusionRate)
		diffusibleMultiply("courseSignal", 1 - courseEvaporationRate)
	}////////*/
	
	def stopCondition() {
		// Пример: завершение моделирования, если все обучающиеся выполнили все задания
		if (userGlobals.userRole == "Обучающийся" && userGlobals.allAssignmentsCompleted) {
			println("UserObserver: Моделирование завершается, все обучающиеся выполнили все задания.")
			return true
		}
		return false
	}
}