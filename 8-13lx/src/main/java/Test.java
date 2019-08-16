import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;


public class Test{
	public static void main(String[] args) throws IOException {
		Reader in;
		 try {
			in = new FileReader("D:/abc.txt");
			BufferedReader br = new BufferedReader(in);
			StringBuffer sb = new StringBuffer();
			String str=null;
			while(br.ready()){
				str = br.readLine();
				sb.append(str+" ");
			}
			br.close();
			String[] arr = sb.toString().split(" ");
			HashMap<String, Integer> map  = new HashMap<String, Integer>();
			
				int q = 0;
			for (int i = 0; i < arr.length; i++) {
			 map.put(arr[i], map.get(arr[i])+1);
				if(map.keySet().contains("*")){
				}
			}
			System.out.println("a:"+q);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
