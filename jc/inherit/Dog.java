class Dog extends Animal {
    public void move(){
        super.move();
        int j = super.getStep()+5;
        System.out.println("dogs can walk run step"+ j);
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();
    }
        
}