import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{
    //  Creates an empty DocumentIndex with the default
    // initial capacity.
    public DocumentIndex()
    {
        // TODO complete constructor
    }

    //  Creates an empty DocumentIndex with a given
    //  initial capacity.
    public DocumentIndex(int initialCapacity)
    {
        // TODO complete constructor
    }

    //  If word is not yet in this DocumentIndex,
    //  creates a new IndexEntry for word, and inserts
    //  it into this list in alphabetical order;
    //  adds num to this word's IndexEntry by calling
    //  its add(num) method.
    public void addWord(String word, int num)
    {
        // TODO complete method
    }

    //  For each word in str, calls addWord(word, num).
    public void addAllWords(String str, int num)
    {
        // TODO complete method
    }

    // Tries to find an EndexEntry with a given word in this
    // DocumentIndex.  If not found, inserts a new EndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry
    private int foundOrInserted(String word)
    {
        // TODO complete method
        return 0;  // TODO Fix this!!
    }
}
