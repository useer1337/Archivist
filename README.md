# Archivist
Техничесĸое задание «Архивариус»

Инструкция по запуску приложения.

1.В файле application.yml можно изменить настройки бд. 
Если вы измените url бд в конфигурационном файле то нужно будет также изменить url в файле pom.xml в конфигурации к плагину flyway.  
Также в application.yml можно поменять адрес куда приложение будет отправлять soap запросы (soapUrl)
и rest запросы (url).
2.Очистить и собрать мавен проект. Можно с помощью команды "mvn clean compile" или с помощью ide(если она позволяет так делать).
