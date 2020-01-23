package flux;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferWriter {

	public static void main(String[] args){
		//FileWriter et BufferWritter sont des autres moyen d'écriture

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"))) {
		bw.write("Bonjour");
		bw.newLine();
		bw.write("ReBonjour");


		} catch (IOException e) {
		e.printStackTrace();
		}
	}

}
