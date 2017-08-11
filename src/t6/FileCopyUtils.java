package t6;

import java.io.IOException;

/**
 * Интерфейс копирования файлов
 * 
 * @author nedis
 * @version 1.0
 */
public interface FileCopyUtils {
	
	/**
	 * Функция копирования файла source в файл destination. Source и destination - это пути к файлам
	 * 
	 * @param source путь к исходному файлу
	 * @param destination путь к целевому файлу
	 * @throws FileAlreadyExistsException если целевой файл уже существует
	 * @throws IOtheme.FileCopyFailedException если произошла какая-нибудь ошибка при копировании файлов, в cause следует указать источник ошибки
	 */
	void copyFile(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException;

	void copyFileOverwrite(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException;

	/**
	 * Функция копирования файла source в файл destination используя средства Java 8. Source и destination - это пути к файлам
	 *
	 * @param source путь к исходному файлу
	 * @param destination путь к целевому файлу
	 * @throws FileAlreadyExistsException если целевой файл уже существует
	 * @throws IOtheme.FileCopyFailedException если произошла какая-нибудь ошибка при копировании файлов, в cause следует указать источник ошибки
	 */
	void copyFileUsingJava8(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException, IOException;

	/**
	 * Функция копирования файла с перезаписью destination, source в файл destination используя средства Java 8. Source и destination - это пути к файлам
	 *
	 * @param source путь к исходному файлу
	 * @param destination путь к целевому файлу
	 * @throws FileAlreadyExistsException если целевой файл уже существует
	 * @throws IOtheme.FileCopyFailedException если произошла какая-нибудь ошибка при копировании файлов, в cause следует указать источник ошибки
	 */
	void copyFileUsingJava8Overwrite(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException, IOException;
}
