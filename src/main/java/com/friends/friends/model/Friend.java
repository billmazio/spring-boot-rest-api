package com.friends.friends.model;
;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "FRIENDS")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Getter
@Setter
public class Friend {
    @Id
    @GeneratedValue
    private int friendId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;



}
