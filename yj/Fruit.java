class Fruit {
    private String caption;

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }

    public Fruit(String caption) {
        this.caption = caption;
    }

    public String toString() {
        return caption;
    }
}