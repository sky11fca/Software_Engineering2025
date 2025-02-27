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
        System.out.printf("[ANIMAL INFO]\nNAME: %s\nTYPE: %s\n NR_OF_LEGS: %d\n EGG_SHAPE: %s\n", this.name, this.Type, this.nr_legs, this.eggShape);
    }

    @Override
    public void setHeight(int max, int min)
    {
        this.maxHeight = max;
        this.minHeight = min;
    }

    @Override
    public void setHeight(int max)
    {
        this.maxHeight = max;
        this.minHeight = 0;
    }

    public void getHeight()
    {
        if(this.minHeight==0)
        {
            System.out.println("the animal "+ this.name + " can fly up to " + this.maxHeight);

        }
        else
        {
            System.out.println("the animal "+ this.name + " can fly between " + this.minHeight + " and " + this.maxHeight);
        }
    }

}