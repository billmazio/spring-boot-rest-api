package com.friends.friends.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
