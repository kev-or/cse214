public class Elevator
{
    private int currentFloor;
    private int elevatorState;
    private final int IDLE=-1;
    private final int TO_SOURCE=0;
    private final int TO_DESTINATION=1;
    private Request request;

    public Elevator()
    {
        request= null;
        elevatorState= IDLE;
        currentFloor=1;
    }
    public int getCurrentFloor()
    {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor1) throws IllegalArgumentException
    {
        if(currentFloor1>0 && currentFloor1<=this.getRequest().getMaxFloor())
        {
            this.currentFloor=currentFloor1;
        }else throw new IllegalArgumentException("Error current floor");

    }

    public int getElevatorState()
    {
        return elevatorState;
    }

    public void setElevatorState(int elevatorState1)
    {
        this.elevatorState=elevatorState1;
    }
    public Request getRequest()
    {
        return request;
    }

    public void setRequest(Request request) {
        if(this.getElevatorState()==IDLE)
        {
            this.request=null;
        }
        else{this.request = request;}
    }
    public String toString()
    {
        if(this.getRequest()==null)
        {
            return "Error request";
        }
        else{return "Source: "+this.getRequest().getSourceFloor()+"Destination: "+
                this.getRequest().getDestinationFloor()+"\n";}
    }
}
