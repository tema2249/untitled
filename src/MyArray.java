public class MyArray implements Array{
    int a[] = new int[50];
    int size = 0;

    @Override
    public int Get (int i) {
        return a[i];
    }
}
