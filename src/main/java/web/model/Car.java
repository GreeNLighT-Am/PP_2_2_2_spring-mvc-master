package web.model;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
public class Car {

    private String model;
    private String series;
    private String color;

}
