//UserGlobalsAndPanelFactory.groovy
package simulation.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory
import simulation.ReLogoObserver
import org.jfree.chart.ChartFactory
import org.jfree.chart.JFreeChart
import org.jfree.data.category.DefaultCategoryDataset

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		// Добавляем график на панель
		//addChart(createChartPanel())
		
		// Добавляем другие элементы интерфейса
		addChooserWL("Пользователь", "Пользователь", ["1","2","3"], 2)
		addChooserWL("Курс", "Курс", ["1","2","3"], 2)
		addSliderWL("numUsers", "Number of Users", 1, 1, 100, 50)
		addSliderWL("numCourses", "Number of Courses", 1, 1, 10, 5)
		addSliderWL("courseDuration", "Course duration", 5, 1, 30, 5)
		addChooserWL("Attack", "Attack", ["51%","Sybil","Nodes"], 2)
		addStateChangeButtonWL("test","attack")
		addSliderWL("NSS", "number-stack-server", 1, 1, 100, 50)
		addSliderWL("NA", "number-attack", 1, 1, 100, 50)
		addSliderWL("IBD", "initial-blockchain-defense", 1, 1, 100, 50)
		addSliderWL("ET", "energy-attack", 1, 1, 100, 50)
		addSliderWL("AR", "attack-reproduce", 1, 1, 100, 50)
		addSliderWL("RD", "required-defenses", 1, 1, 100, 50)
	}
		
	/*private def createChartPanel() {
		// Создаем набор данных для графика
		def dataset = createDataset()

		// Создаем график
		def chart = createChart(dataset)
		
		// Возвращаем график как объект для отображения на панели
		return chart
	}
	
	private def createDataset() {
 
 //UserGlobalsAndPanelFactory.groovy
package simulation.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory
import simulation.ReLogoObserver
import org.jfree.chart.ChartFactory
import org.jfree.chart.JFreeChart
import org.jfree.data.category.DefaultCategoryDataset

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		// Добавляем график на панель
		//addChart(createChartPanel())
		
		// Добавляем другие элементы интерфейса
		addChooserWL("Пользователь", "Пользователь", ["1","2","3"], 2)
		addChooserWL("Курс", "Курс", ["1","2","3"], 2)
		addSliderWL("numUsers", "Number of Users", 1, 1, 100, 50)
		addSliderWL("numCourses", "Number of Courses", 1, 1, 10, 5)
		addSliderWL("courseDuration", "Course duration", 5, 1, 30, 5)
	}
		
	/*private def createChartPanel() {
		// Создаем набор данных для графика
		def dataset = createDataset()

		// Создаем график
		def chart = createChart(dataset)
		
		// Возвращаем график как объект для отображения на панели
		return chart
	}
	
	private def createDataset() {
		def dataset = new DefaultCategoryDataset()
		dataset.addValue(1, "Series 1", "Category 1")
		dataset.addValue(2, "Series 1", "Category 2")
		dataset.addValue(3, "Series 1", "Category 3")
		return dataset
	}
	
	private def createChart(dataset) {
		def chart = ChartFactory.createBarChart(
			"Sample Chart", "Category", "Value", dataset,
			PlotOrientation.VERTICAL, true, true, false
		)
		return chart
	}*/
}
