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
@Table(name = "subjects")
@Entity
public class Subject {

    @Id
    private String id;

    private String name;

    private String semester;

    private String area;

    private String title;

    private String professor;

    private String code;

    private String division;

    private  String studentYear;

    private String credits;

    private String etcPermit;

    private String secPermit;

    private String department;

    private String times;

    private String location;
}
