package Oops.DesignPattern.BuilderPattern.ThreadUnSafe;

final class University {

    private String name;

    private Integer id;

    private String state;

    //normal builder pattern
    public University setName(String name){
        this.name = name;
        return this;
    }

    public University setId(Integer id){
        this.id = id;
        return this;
    }

    public University setState(String state){
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", state='" + state + '\'' +
                '}';
    }

    public static void main(String[] args){
        University universityA = new University();
        System.out.println(universityA.setId(1).setName("IITR").setState("UK"));

        University universityB = new University();
        System.out.println(universityB.setId(2).setName("IITD").setState("Delhi"));

    }
}
