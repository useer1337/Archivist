package com.example.Archivist.jpa.models;

import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.*;

/**
 * 
 * @author kovalalexander
 * Create at 2020-07-12 20:56
 */
@Entity
@Table(name = "patient", schema = "archivist")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Patient {

    /**
     * 
     */
    @Id
    @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * id пользователя
     */
    @Column(name = "userid", nullable = false)
    private BigDecimal userId;

    /**
     * Номер карты
     */
    @Column(name = "cardnumber")
    private String cardNumber;

    /**
     * Фамилия пациента
     */
    @Column(name = "lastname")
    private String lastName;

    /**
     * Имя пациента
     */
    @Column(name = "firstname")
    private String firstName;

    /**
     * Отчество пациента
     */
    @Column(name = "middlename")
    private String middleName;

    /**
     * Снилс
     */
    @Column(name = "snils")
    private String snils;

    /**
     * Полис ОМС
     */
    @Column(name = "enp")
    private String enp;

    /**
     * Дата рождение поциента
     */
    @Column(name = "birthdate")
    private LocalDate birthDate;

    /**
     * Результат оптравки документа
     */
    @Column(name = "remdresult")
    private String remdResult;

    /**
     * Код мед. орг.
     */
    @Column(name = "codemo")
    private String codeMo;

    /**
     * Дата добавления
     */
    @Column(name = "date_insert")
    private OffsetDateTime dateInsert;

    /**
     * Дата обновления
     */
    @Column(name = "date_update")
    private OffsetDateTime dateUpdate;
}