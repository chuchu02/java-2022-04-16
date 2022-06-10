package text;

import java.io.*;
import java.util.*;
    
public class Test2 {
    static int priority(char temp) {
        if(temp == '(') return 0;
        else if (temp == '+' || temp == '-') return 1;
        else return 2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String input = br.readLine();
        for(int i =0; i < input.length(); i++) {
            char temp = input.charAt(i);

            if('A' <= temp && temp <= 'Z') {
                sb.append(temp);
            }

            else if(temp == '(') {
                stack.add('(');
                System.out.printf("%s",temp);
            }

            else if(temp == ')') {
                while(!stack.isEmpty()) {
                    if(stack.peek() == '(') {
                        stack.pop();
                        System.out.printf("종료");
                        break;
                    }
                    sb.append(stack.pop());
                }
            }
            else {
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(temp))
                {
                    sb.append(stack.pop());
                    System.out.printf("중간 끝\n");

                }
                stack.add(temp);
                System.out.printf("중간2 :%s ",temp);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
