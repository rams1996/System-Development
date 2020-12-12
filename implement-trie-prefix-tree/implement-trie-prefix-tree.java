​
        char curr = prefix.charAt(i);
​
        if (!root.hasChild(curr)) return false;
​
        if (i == prefix.length() - 1) {
            return true;
        } else {
            return startWith(root.getChild(curr), prefix, i + 1);
        }
    }
}
​
class Node {
    private char value;
    private boolean isEnd;
    private Node[] children;
​
    public Node(char value) {
        this.value = value;
        children = new Node[26];
    }
​
    public char getValue() {
        return value;
    }
​
    public boolean isEnd() {
        return isEnd;
    }
​
    public void setEnd(boolean end) {
        isEnd = end;
    }
​
    public boolean hasChild(char c) {
        if (children[c - 'a'] == null)  {
            return false;
        }
        return true;
    }
​
    public void addChild(char c) {
        children[c - 'a'] = new Node(c);
    }
​
    public Node getChild(char c) {
        return children[c - 'a'];
    }
}
​
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
