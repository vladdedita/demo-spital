
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
@Table(name = "userrole", schema = "public")
public class Userrole
    implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false, length = 10, columnDefinition = "INT")
    private Integer idUser;
    @Column(name = "id_role", nullable = true, length = 10, columnDefinition = "INT")
    private Integer idRole;

}
