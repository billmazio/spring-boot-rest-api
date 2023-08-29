package com.friends.friends.dto;


import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Data
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class FriendRequest {
    @NotBlank(message = "firstname shouldn't be null")
    private String firstName;
    @NotBlank(message = "lastname shouldn't be null")
    private String lastName;
    @Email(message = "invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp ="^\\d{10}$",message = "invalid mobile number entered")
    private String mobile;

}
