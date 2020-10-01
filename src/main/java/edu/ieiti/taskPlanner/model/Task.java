package edu.ieiti.taskPlanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Task{

    @Id
    private Long id;

    private String description;
    private LocalDate dueDate;
    private String status;
    @ManyToOne
    @JoinColumn(name="userDetails")
    private User responsible;

}
