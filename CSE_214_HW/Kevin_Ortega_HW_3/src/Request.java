public class Request {
    private int sourceFloor;
    private int destinationFloor;
    private int timeEntered;
    private int maxFloor;

    public Request(int maxFloor)
    {
        this.sourceFloor=(int)(1+Math.random()* maxFloor);
        this.destinationFloor=(int)(1+Math.random()*maxFloor);
        this.maxFloor=maxFloor;
    }

    public int getSourceFloor()
    {
        return sourceFloor;
    }

    public void setSourceFloor(int sourceFloor1)
    {
        if(sourceFloor1>=1 && sourceFloor1<=this.getMaxFloor())
        {
            this.sourceFloor=sourceFloor1;
        }
        else
            {
                throw new IllegalArgumentException("Error source");
            }


    }



    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor1) throws IllegalArgumentException
    { if(destinationFloor1>=1 && destinationFloor1<=this.getMaxFloor())
    {
        this.destinationFloor=destinationFloor1;
    }
    else
    {
        throw new IllegalArgumentException("Error destination");
    }

    }

    public int getTimeEntered() {
        return timeEntered;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor( int maxFloor1) throws IllegalArgumentException
    {
        if(maxFloor1>1)
        {
            this.maxFloor=maxFloor1;
        }
        else{ throw new IllegalArgumentException("Error max");}
    }

    public void setTimeEntered(int timeEntered1)
    {
        if(timeEntered1>=0)
        {
            this.timeEntered=timeEntered1;
        }
        else
        {
            throw new IllegalArgumentException("Error time");
        }
    }
    public String toString()
    {
        return "Source Floor:"+getSourceFloor()+"Destination Floor"+getDestinationFloor()+"\n";
    }
}
