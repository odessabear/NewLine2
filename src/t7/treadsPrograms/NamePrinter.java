package t7.treadsPrograms;

import java.io.PrintStream;

/**
 * Интерфейс нити печатающей имя, которое введено c помошью setPrintName. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface NamePrinter {

	/**
	 * Установить имя нити. 
	 * 
	 * @param name имя нити
	 * @throws NullPointerException если name == null 
	 * @throws IllegalArgumentException если name.length == 0
	 */
	void setPrintName(String name) throws NullPointerException, IllegalArgumentException;
	
	/**
	 * Установить поток куда должно печататься имя. Например System.out
	 * 
	 * @param stream поток в который будет печататься имя. 
	 * @throws NullPointerException если stream == null
	 */
	void setStream(PrintStream stream) throws NullPointerException;
	
	/**
	 * Установить интервал в милисекундах между выводами в поток имени. 
	 * 
	 * @param ms время в милисекундах между выводами в поток имени. 
	 * @throws IllegalArgumentException если ms <= 0
	 */
	void setInterval(long ms) throws IllegalArgumentException;
	
	/**
	 * Установить количество выводов имени в поток. 
	 * 
	 * @param count количество выводов имени в поток. 
	 * @throws IllegalArgumentException если count <= 0
	 */
	void setCount(int count) throws IllegalArgumentException;
}
