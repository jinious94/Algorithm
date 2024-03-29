import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        
        int data1, data2, sum = 0;
        
        while (pq.size() != 1) {
        	data1 = pq.poll();
        	data2 = pq.poll();
        	
        	sum += (data1 + data2);
        	pq.add(data1 + data2);
        }
        
        System.out.println(sum);

	}

}