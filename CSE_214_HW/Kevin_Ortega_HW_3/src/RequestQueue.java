import java.util.LinkedList;

public class RequestQueue extends LinkedList <Request>
{
    private LinkedList<Request> requestQueue= new LinkedList<>();
    private int size;



    public RequestQueue()
    {
        requestQueue=null;
        size=0;
    }

    public void enqueue(Request request)
    {
        size++;
        this.addLast(request);
    }
    public Request dequeue()
    {
        size--;
        return this.removeFirst();
    }

    public boolean isEmpty()
    {
        if(this.size<=0)
        {
            return true;
        }
        else{return false;}
    }
    public int size()
    {
        return this.size;
    }
}
