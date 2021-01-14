package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class OrderState {
    @NotNull
    @Min(value = 0)
    @Max(value = 4)
    private Integer state;

    public OrderState(){

    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "OrderState{" +
                "state=" + state +
                '}';
    }
}
