CREATE TABLE archivist.patient(
    id serial not null ,
    userId numeric not null,
    cardNumber varchar (255) null,
    lastName varchar (255) null,
    firstName varchar (255) null,
    middleName varchar (255) null,
    snils varchar (1000) null,
    enp varchar (1000) null,
    birthDate varchar (255) null,
    remdResult varchar (255) null,
    codeMo varchar (1000) null,
    date_insert timestamp (255) null,
    date_update timestamp (255) null,
    primary key (id)
);

-- Column comments
COMMENT ON COLUMN archivist.patient.userId IS 'id пользователя';
COMMENT ON COLUMN archivist.patient.cardNumber IS 'Номер карты';
COMMENT ON COLUMN archivist.patient.lastName IS 'Фамилия пациента';
COMMENT ON COLUMN archivist.patient.middleName IS 'Отчество пациента';
COMMENT ON COLUMN archivist.patient.firstName IS 'Имя пациента';
COMMENT ON COLUMN archivist.patient.snils IS 'Снилс';
COMMENT ON COLUMN archivist.patient.enp IS 'Полис ОМС';
COMMENT ON COLUMN archivist.patient.birthDate IS 'Дата рождение поциента';
COMMENT ON COLUMN archivist.patient.remdResult IS 'Результат оптравки документа';
COMMENT ON COLUMN archivist.patient.codeMo IS 'Код мед. орг.';
COMMENT ON COLUMN archivist.patient.date_insert IS 'Дата добавления';
COMMENT ON COLUMN archivist.patient.date_update IS 'Дата обновления';




