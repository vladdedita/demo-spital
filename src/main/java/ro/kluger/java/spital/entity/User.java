
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
@Table(name = "user", schema = "public")
public class User
    implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 10, columnDefinition = "INT")
    private Integer id;
    @Column(name = "pass", nullable = true, length = 255, columnDefinition = "VARCHAR")
    private String pass;
    @Column(name = "username", nullable = true, length = 255, columnDefinition = "VARCHAR")
    private String username;
    @Column(name = "persoana_cnp", nullable = true, length = 19, columnDefinition = "BIGINT")
    private Long persoanaCnp;

}
