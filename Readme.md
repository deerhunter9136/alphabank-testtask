
**Сервис выдает случайную гиф определенного типа в зависимости от изменений курса выбранной валюты**

**Стэк**:

Spring Boot 2.7, Lombok, Feign

**Описание:**

• если курс по отношению к USD за сегодня выше вчерашнего, то отдается рандомная гифка отсюда https://giphy.com/search/rich
• если ниже - отсюда https://giphy.com/search/broke
Ссылки
• REST API курсов валют - https://docs.openexchangerates.org/
• REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide

**Запуск**:

AlphabankTesttaskApplication.class

URL:http://localhost:8080/myapp/




