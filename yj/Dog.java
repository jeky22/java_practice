class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        int j = super.getStep() + 5;
        System.out.println("Dogs can walk and run step" + j);
    }
}