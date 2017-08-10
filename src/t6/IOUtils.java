package t6;

import java.io.Reader;
import java.io.Writer;

/**
 * Утилиты для работы с потоками ввода-вывода. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface IOUtils {
	
	/**
	 * Копирование стороки из входного потока в выходной, попутно заменяя
 символы из которые есть в <code>inChars</code>, на символы которые
 находятся в той же позиции в <code>outChars</code>. Строки
 <code>inChars</code> и <code>outChars</code> должны быть одинаковой
 длинны. Если <code>inChars</code> или <code>outChars</code> == null
 считаем что на вход была подана пустая строка. <b> Пример: in =
 1234567890<b> inChars = 357<b> outChars = 480<b> <b> out = 1244860890<b>
	 * 
	 * @param in
	 * @param out
	 * @param inChars
	 * @param outChars
	 * @throws NullPointerException если любой из параметров in или out == null 
	 * @throws IllegalArgumentException если inChars.length != outChars.length
	 */
	void replaceChars(Reader in, Writer out,String inChars,String outChars) throws NullPointerException, IllegalArgumentException;
	
	/**
	 * Функция находит все файлы в директории и поддиректориях и возвращает их полные пути в виде массива строк. 
	 * 
	 * @param dir папка с которой необходимо начать поиск 
	 * @return массив путей к файлам 
	 * @throws NullPointerException если dir == null  
	 * @throws IllegalArgumentException если dir не существует
	 */
	String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException;
}
