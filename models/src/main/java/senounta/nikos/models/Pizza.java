package senounta.nikos.models;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@JsonRootName(value = "pizza")
public class Pizza {

    @Positive
    private Integer id = null;
    @NotNull
    @NotBlank
    private String type = null;
    @Positive
    @NotNull
    private DoughType doughType = null;

    public Pizza() {}

    public Pizza(Integer id, String type, DoughType doughType) {
        this.id = id;
        this.type = type;
        this.doughType = doughType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DoughType getDoughType() {
        return doughType;
    }

    public void setDoughType(DoughType doughType) {
        this.doughType = doughType;
    }
}
