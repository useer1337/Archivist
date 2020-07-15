CREATE TABLE archivist.patientData(
    id serial not null ,
    userId numeric not null,
    cardNumber varchar (255) null,
    lastName varchar (255) null,
    firstName varchar (255) null,
    middleName varchar (255) null,
    snils varchar (1000) null,
    enp varchar (1000) null,
    birthDate date null,
    remdResult varchar (255) null,
    codeMo varchar (1000) null,
    date_insert timestamp (255) null,
    date_update timestamp (255) null,
    primary key (id)
);

-- Column comments
COMMENT ON COLUMN archivist.patientData.userId IS 'id пользователя';
COMMENT ON COLUMN archivist.patientData.cardNumber IS 'Номер карты';
COMMENT ON COLUMN archivist.patientData.lastName IS 'Фамилия пациента';
COMMENT ON COLUMN archivist.patientData.middleName IS 'Отчество пациента';
COMMENT ON COLUMN archivist.patientData.firstName IS 'Имя пациента';
COMMENT ON COLUMN archivist.patientData.snils IS 'Снилс';
COMMENT ON COLUMN archivist.patientData.enp IS 'Полис ОМС';
COMMENT ON COLUMN archivist.patientData.birthDate IS 'Дата рождение поциента';
COMMENT ON COLUMN archivist.patientData.remdResult IS 'Результат оптравки документа';
COMMENT ON COLUMN archivist.patientData.codeMo IS 'Код мед. орг.';
COMMENT ON COLUMN archivist.patientData.date_insert IS 'Дата добавления';
COMMENT ON COLUMN archivist.patientData.date_update IS 'Дата обновления';




