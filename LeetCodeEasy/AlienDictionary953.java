

//In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
//Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//Output: true
//Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

public class AlienDictionary953 {

	public boolean isAlienSorted(String[] words, String order) {
		int alphabet[] = new int[26];
		// here we are mapping the alphabet character with the alien character
		for (int i = 0; i < order.length(); i++) {
			alphabet[order.charAt(i) - 'a'] = i;
		}

		
		// looping to the word list 
		for (int i = 0; i < words.length; i++) {
			
			for (int j = i + 1; j < words.length; j++) {
				
				// make sure that the two world we are comparing is at least the same size so we don't go out of bound
				int min = Math.min(words[i].length(), words[j].length());
				
				// looping to check the character of the first word with the second word is in order or not
				for (int k = 0; k < min; k++) {
					// creating a variable for the i character at the k postion and same for j character 
					char iChar = words[i].charAt(k);
					char jChar = words[j].charAt(k);
				
					if (alphabet[iChar - 'a'] < alphabet[jChar - 'a']) {
						break;
					} else if (alphabet[jChar - 'a'] < alphabet[iChar - 'a']) {
						return false;
					} else if (k == min - 1 && words[i].length() > words[j].length()) {
						return false;
					}
				}

			}

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
