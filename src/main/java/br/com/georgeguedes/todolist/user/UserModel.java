package br.com.georgeguedes.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.UUID;
import java.time.LocalDateTime; 

import org.hibernate.annotations.CreationTimestamp;


@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID Id;

    
    @Column (unique = true)
    private String username;
    private String name;
    private String password;   

    @CreationTimestamp
    private LocalDateTime createdAt;


     }