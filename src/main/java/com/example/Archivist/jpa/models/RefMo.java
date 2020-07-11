package com.example.Archivist.jpa.models;

import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 
 * @author kovalalexander
 * Create at 2020-07-11 21:05
 */
@Entity
@Table(name = "ref_mo")
@Data
@EqualsAndHashCode(of = "guid")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class RefMo {

    /**
     * фед.ОИД
     */
    @Column(name = "oid")
    private String oid;

    /**
     * Версия
     */
    @Column(name = "version")
    private String version;

    /**
     * Полное наименование МО
     */
    @Column(name = "namefull")
    private String namefull;

    /**
     * Короткое наименование МО
     */
    @Column(name = "nameshort")
    private String nameshort;

    /**
     * Гуид(что очевидно)
     */
    @Id
    @Setter(AccessLevel.PROTECTED)
    @NonNull
    @Column(name = "guid", nullable = false)
    private BigDecimal guid;

    /**
     * Признак "Показывать в приложении"
     */
    @Column(name = "is_shown")
    private Boolean isShown;
}