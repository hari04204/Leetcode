class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        char[] r = new char[c.length];

        int ri = findAndCopyWord(c, r, 0, 0);

        return new String(r, 0, ri);
    }

    private int findAndCopyWord(char[] c, char[] r, int i, int ri) {
        while(i<c.length && c[i]==' ')i++;
        int e = i;
        while(e<c.length && c[e]!=' ')e++;

        if(i==e) return ri;

        ri = findAndCopyWord(c,r,e+1, ri);

        if(ri>0) {
            r[ri]=' ';
            ri++;
        }
        for(int j=i;j<e;j++) {
            r[ri++]=c[j];
        }
        return ri;
    }

}