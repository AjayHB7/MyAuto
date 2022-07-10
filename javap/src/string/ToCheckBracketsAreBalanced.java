package string;

import java.util.LinkedList;
import java.util.Stack;

public class ToCheckBracketsAreBalanced {

	public static void main(String[] args) {

		String str = "{([])}";

		LinkedList<Character> llist = new LinkedList<Character>();

		//	for (int i = 0; i < str.length(); i++) {
		//		char c = str.charAt(i);
		//		if (c=='{'||c=='}'||c=='['||c==']'||c=='('||c==')') {
		//			llist.add(c);
		//		}
		//	}


		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(c=='{'||c=='['||c=='('){
				stack.push(c);

			}else{

				switch (c) {
				case ']': if(stack.lastElement()=='['){
					stack.pop();}
				break;
				case ')': if(stack.lastElement()=='('){
					stack.pop();}
				break;
				case '}': if(stack.lastElement()=='{'){
					stack.pop();}
//				break;	
				
				default :{
					System.out.println("no element");
				}
				break;
				}

			}
		}

		if (stack.size()==0) {
			System.out.println("string is balanced");
		}else{
			System.out.println("string is not balanced");
		}























		//	for (int i = 0; i < llist.size(); i++) {
		//		if()
		//	}
		//	
		//	
		//	
		//	
		//	
		//	System.out.println(llist);










	}

}
