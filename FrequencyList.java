import java.util.ArrayList;
import java.util.Iterator;
class FrequencyList
{
    private boolean add, remove;
    Data temp;
    int index = 0;
    ArrayList<Data> list=new ArrayList<>();

    public void addValues(char letter[], int count[])
    {
        
        for (int i = 0; i < letter.length; i++)
        {
            // create an object and send values to the
            // constructor to be saved in the Data class
            add = list.add(new Data(index, letter[i], count[i]));
            index++;
        }
        deleteZeros();
        modInsertionSort();
    }
    
    public void printValues()
    {       
        for (Data data : list)
        {
            System.out.println(data.letter+" - "+data.count);
        }
    }
    
    void modInsertionSort()
    {
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            int key = list.get(i).getLetter();
            int j = i - 1;

            
            while (j >= 0 && list.get(j).getLetter() > key) {
                temp = list.get(j+1); 
                list.set(j+1, list.get(j));
                list.set(j,temp);

                j = j - 1;
            }
            temp = list.get(j+1); 
            list.set(j+1, list.get(i));
            list.set(i,temp);
        }
    }

    void deleteZeros(){
        Iterator i = list.iterator();
        ArrayList<Integer> zeros = new ArrayList<>();
        while (i.hasNext()) {
            char symbol = ((Data)i.next()).getLetter();
            System.out.println("Symbol of element: "+symbol);
            if (symbol == '0') {
                zeros.add(((Data)i.next()).getIndex());
            }
        }

        for (int k : zeros){
            list.remove(k);
        }

        for (int k = 0; k<list.size(); k++){
            if (k != list.get(k).getIndex())
                list.get(k).setIndex(k);
        }
    }
}
    

