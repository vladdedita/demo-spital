
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
    @JoinColumn(name = "doctor_id")
    @ManyToOne
    private Doctor doctor;
    @JoinColumn(name = "pacient_id")
    @ManyToOne
    private Pacient pacient;
    @JoinColumn(name = "status_id")
    @ManyToOne
    private Status status;

}
