class Eagle extends Birds implements canFly
{
    public void theTruth()
    {
        System.out.println("I can fly!!!");

    }

    @Override
    public void favoriteFood()
    {
        System.out.println("Hi! I'm an "+ this.name+ ". I like Hamburger");
    }
    @Override
    public void setInfo()
    {
        this.name = "Eagle";
        this.Type = "Bird";
        this.nr_legs = 2;
        this.eggShape = "EggShaped";
    }

    @Override
    public void getInfo()
    {

    }
}