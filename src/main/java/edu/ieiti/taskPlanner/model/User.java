package edu.ieiti.taskPlanner.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "userInfo")
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    @OneToMany
    private List<Task> tasks;

}
