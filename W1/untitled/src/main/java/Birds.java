abstract class Birds extends Animal
{
    protected String eggShape;
    protected int maxHeight;
    protected int minHeight;

    abstract void setInfo();
    abstract void getInfo();

    abstract void setHeight(int max, int min);
    abstract void setHeight(int max);
}