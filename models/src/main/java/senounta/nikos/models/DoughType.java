package senounta.nikos.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@JsonRootName(value = "dough_type")
@JsonPropertyOrder({ "id", "type" })
public class DoughType {

    @Positive
    private Integer id = null;
    @NotNull
    @NotBlank
    private String type = null;

    public DoughType(){}

    public DoughType(Integer id, String type) {
        this.id = id;
        this.type = type;
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
}
