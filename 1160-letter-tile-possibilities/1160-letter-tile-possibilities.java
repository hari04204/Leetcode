class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];  // Frequency array
        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }
        return backtrack(freq);
    }

    private int backtrack(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;  // Count the current sequence
                freq[i]--;  // Use this tile
                count += backtrack(freq);  // Recurse for the next tile
                freq[i]++;  // Backtrack and restore frequency
            }
        }
        return count;
    }
}
