package lr2;

public class Example23_Cat extends Example23_Animal {
    private String breed;
    private String type_feed;

    public Example23_Cat(String name, Integer age, String voice, String breed, String type_feed) {
        super(name, age, voice);
        this.breed = breed;
        this.type_feed = type_feed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getType_feed() {
        return type_feed;
    }

    public void setType_feed(String type_feed) {
        this.type_feed = type_feed;
    }
}
