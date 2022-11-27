package com.hamitmizrak.data.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//entity
@Entity
@Table(name="register")
public class RegisterEntity implements Serializable {
    public static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    @Column(name="email_address")
    //@Column(name="email_address",nullable = false,unique = true,length = 20)
    private String emailAddress;

    private String password;

    @Column(name="created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdDate;
}
