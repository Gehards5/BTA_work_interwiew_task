class Data 
{
    int index;
    char letter;
    int count;
    Data(int index, char letter, int count)
    {
        this.index = index; 
        this.letter = letter;
        this.count = count;
    }

    public char getLetter() {
        return letter;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getIndex() {
        return letter;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }


    public int compareTo(Data compareData) {

        int compareLetter = ((Data) compareData).getLetter(); 
        
        //ascending order
        return this.letter - compareLetter;
        
        //descending order
        //return compareLetter - this.letter;
    }
};

