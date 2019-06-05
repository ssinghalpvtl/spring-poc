package io.pivotal.rest.springpoc.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@ApiModel("User information")
public class User {

    private Integer id;

    @Size(min = 2, message = "Name should be minimum of 2 characters")
    @ApiModelProperty("User name")
    private String name;

    @Past
    @ApiModelProperty("User date of Birth")
    private LocalDate dateOfBirth;

}