
package ro.kluger.java.spital.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(name = "cnp", nullable = false, length = 19, columnDefinition = "BIGINT")
    private Long cnp;
    @Column(name = "nume", nullable = true, length = 255, columnDefinition = "VARCHAR")
    private String nume;

}
