public class BooleanSource
{
    private double probability;

    public BooleanSource()
    {}
    public BooleanSource(double probability)
    {
        setProbability(probability);
    }
    public double getProbabilty()
    {
        return probability;
    }
    public void setProbability(double probability)
    {
        this.probability=probability;
    }
    public boolean requestArrived()
    {
        if(Math.random()<this.probability)
        {
            return true;
        }
        else{return false;}
    }
}
