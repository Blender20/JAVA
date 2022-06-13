public class Iterator implements Iterable
{
    private Iterable iterable;

    public Iterator()
    {

    }

    public Iterator(Iterable iterable)
    {
        this.iterable = iterable; 
    }

    public void setIterable(Iterable iterable)
    {
        this.iterable=iterable;
    }

    public Iterable getIterable()
    {
        return iterable;
    }

    public void Iterate()
    {
        iterable.Iterate();
    }
};
