//Java Program for insertion sort
class InsertionSort
{
    /*sorting fuction*/
    void sort(int arr[])
    {
        int len = arr.length;
        for(int i = 1; i<len; ++i)
        {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

public static void main(String args[])
{
    int arr[] = {12,11,13,5,6};

    InsertionSort obj = new InsertionSort();
    obj.sort(arr);
}
}