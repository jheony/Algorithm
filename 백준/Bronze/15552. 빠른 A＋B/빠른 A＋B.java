//package a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);

		int a = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++)
		{
			BufferedReader tbr = new BufferedReader(new InputStreamReader(System.in));			
			String tstr = br.readLine();
			
			StringTokenizer tst = new StringTokenizer(tstr);

			int x = Integer.parseInt(tst.nextToken());
			int y = Integer.parseInt(tst.nextToken());
			//System.out.print(x+y);
			sb.append(x+y).append('\n');
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}
}