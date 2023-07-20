package com.br.supervisorio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = {"id"})
public class OperationWaterPump {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private boolean waterPump;

    @Column(nullable = false)
    private boolean solenoid;

    @Column(nullable = false)
    private boolean manual;
}
