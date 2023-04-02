package lr2;

public class Example23_Animal {
    private String name;
    private Integer age;
    private String voice;

    public Example23_Animal(String name, Integer age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
