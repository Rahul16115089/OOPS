package Oops.StaticAndImmutable;

import java.util.Objects;

public class Custom {

    private String name;

    private Integer id;

    private Long amount;

    public Custom(String name, Integer id, Long amount){
        this.amount = amount;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Custom)) return false;
        Custom custom = (Custom) o;
        return name.equals(custom.name) && id.equals(custom.id) && Objects.equals(amount, custom.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, amount);
    }
}
