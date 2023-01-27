package uoslife.timetableservicespring.wise.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
@Entity
public class Department {

    @Id
    private String id;

    private String title;

    private String division;

    private String college;

    private String parentId;
}
