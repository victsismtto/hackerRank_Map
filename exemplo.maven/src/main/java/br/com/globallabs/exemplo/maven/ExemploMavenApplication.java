package br.com.globallabs.exemplo.maven;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ExemploMavenApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> list = new HashMap<>();
		List<String> answer = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String name=in.nextLine();
			int phone=in.nextInt();
			list.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext()) {
			String s=in.nextLine();
			if (list.containsKey(s)) {
				answer.add(s + "=" + list.get(s));
			} else {
				answer.add("Not found");
			}
		}
		for (int i  = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
