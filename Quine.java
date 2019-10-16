//Origin
import java.io.*;

public class Quine{

	static int c = 0;
	static int[] a = {34, 10, 39};
	static String[] b = {"import java.io.*;" ,
						"static int[] a = {34, 10, 39};" ,
						"public static void main(String[] args) throws FileNotFoundException {" ,
						"if (c > 3) { System.exit(0); }" ,
						"File newFile = new File('Quine' + c + '.java');" ,
						"PrintStream ps = new PrintStream(newFile);" ,
						"ps.print(b[0] + (char)a[1]);" ,
						"ps.print('public class Quine' + c + '{' + (char)a[1]);" ,
						"ps.print('static int c = ' + (++c) + ';' + (char)a[1]);" ,
						"ps.print(b[1] + (char)a[1]);" ,
						"ps.print('static String[] b = {' + (char)a[1]);" ,
						"for (int j = 0; j < b.length; j++) {" ,
						"ps.print((char)a[0]);" ,
						"ps.print(b[j] + (char)a[0] + ',' + (char)a[1]);" ,
						"}" ,
						"ps.print('};' + (char)a[1]);" ,
						"for (int k = 2; k < b.length; k++) {" ,
						"ps.print(b[k].replace((char)a[2], (char)a[0]) + (char)a[1]);" ,
						"}" ,
						"}" ,
						"}"
	};

public static void main(String[] args) throws FileNotFoundException {
	if (c > 3) { System.exit(0); }
	File newFile = new File("Quine" + c + ".java");
	PrintStream ps = new PrintStream(newFile);
	ps.print(b[0] + (char)a[1]);
	ps.print("public class Quine" + c + "{" + (char)a[1]);
	ps.print("static int c = " + (++c) + ";" + (char)a[1]);
	ps.print(b[1] + (char)a[1]);
	ps.print("static String[] b = {" + (char)a[1]);
	for (int j = 0; j < b.length; j++) {
		ps.print((char)a[0]);
		ps.print(b[j] + (char)a[0] + "," + (char)a[1]);
	}
	ps.print("};" + (char)a[1]);
	for (int k = 2; k < b.length; k++) {
		ps.print(b[k].replace((char)a[2], (char)a[0]) + (char)a[1]);
	}
	
	}

}