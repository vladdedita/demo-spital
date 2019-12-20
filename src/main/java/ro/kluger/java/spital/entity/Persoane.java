
package ro.kluger.java.spital.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


/**
 * 
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persoane", schema = "public")
public class Persoane
    implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cnp", nullable = false, length = 10, columnDefinition = "INT")
    private Integer cnp;
    @Column(name = "nume", nullable = true, length = 255, columnDefinition = "VARCHAR")
    private String nume;

}
