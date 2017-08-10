package t6;

/**
 * Интерфейс тестирования различных типов копирования файлов
 * 
 * @author nedis
 * @version 1.0
 */
public interface FileCopyTestUtils {

	/**
	 * Создает класс копирования используя FileInputStream
	 * 
	 * @return класс копирования используя FileInputStream
	 */
	FileCopyUtils createSimpleFileCopyUtils();
	
	/**
	 * Создает класс копирования используя буфферизированные потоки
	 * 
	 * @return класс копирования используя буфферизированные потоки
	 */
	FileCopyUtils createBufferedFileCopyUtils();
	
	/**
	 * Создает класс копирования используя каналы
	 * 
	 * @return класс копирования используя каналы
	 */
	FileCopyUtils createChannelsFileCopyUtils();
	
	/**
	 * Создает класс копирования с помощью возможностей Java 7
	 * 
	 * @return класс копирования с помощью возможностей Java 7
	 */
	FileCopyUtils createJava7CopyUtils();
}
