package com.friends.friends.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Data
@NoArgsConstructor
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
