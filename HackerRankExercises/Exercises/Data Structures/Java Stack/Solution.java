import java.util.*;
class Solution{

    private static final Deque<Character> sQueue = new ArrayDeque<>();

private static boolean isBalanced(String str) {
        sQueue.clear();
        int len = str.length();
        boolean failed = false;
        for (int ix = 0; !failed && ix < len; ++ix) {
            char currChar = str.charAt(ix);
            switch (currChar) {
                case '(':
                case '[':
                case '{':
                    sQueue.addFirst(currChar);
                    break;
                case ']':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '[');
                    break;
                case ')':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '(');
                    break;
                case '}':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '{');
                    break;
                default:
                    failed = true;
                    break;
            }
        }
        failed |= (sQueue.size() != 0);
        return !failed;
    }
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isBalanced(input));
	    }
    }
}



