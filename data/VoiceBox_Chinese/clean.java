import java.io.*;
import java.util.*;

public class clean {

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("TOTAL.jieba.utf8"));
		PrintStream ps = new PrintStream("TOTAL.jb.utf8");

		String line = "";
		while ((line = br.readLine()) != null) {
			line = line.replaceAll("/[a-z]+[0-9]*", "");
			ps.println(line);
		}
	}
}