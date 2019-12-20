
package ro.kluger.java.spital.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * 
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "programare", schema = "public")
public class Programare
    implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 10, columnDefinition = "INT")
    private Integer id;
    @Column(name = "ora_programare", nullable = true, length = 19, columnDefinition = "TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oraProgramare;
    @Column(name = "doctor_id", nullable = true, length = 10, columnDefinition = "INT")
    private Integer doctorId;
    @Column(name = "pacient_id", nullable = true, length = 10, columnDefinition = "INT")
    private Integer pacientId;
    @Column(name = "status_id", nullable = true, length = 10, columnDefinition = "INT")
    private Integer statusId;

}
