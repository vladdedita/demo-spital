
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
public class UserRole
    implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 10, columnDefinition = "INT")
    private Integer id;
    @JoinColumn(name = "id_user")
    @ManyToOne
    private User user;
    @JoinColumn(name = "id_role")
    @ManyToOne
    private Role role;

}
