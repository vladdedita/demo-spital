
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
@Table(name = "role", schema = "public")
public class Role
    implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 10, columnDefinition = "INT")
    private Integer id;
    @Column(name = "name", nullable = true, length = 255, columnDefinition = "VARCHAR")
    private String name;

}
