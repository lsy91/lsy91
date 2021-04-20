package level2;

public class No13 {
	boolean solution(String s) {
		boolean answer = true;

		char[] arrayS = s.toCharArray();

		int result = 0;

		for (char parenthesis : arrayS) {

			if (parenthesis == '(') {
				result++;
			} else if (parenthesis == ')') {
				result--;
			}

			if (result < 0)
				return false;
		}

		if (result > 0)
			return false;

		return answer;
	}
}
