# StatusCodeSearch-WebApp
Клиент-серверное приложение на Java, позволяющее искать описание проблемы в разл.системах по коду ошибки/статус-коду


<img src="https://raw.githubusercontent.com/rusbsv/StatusCodeSearch-WebApp/master/1.jpg" />

<b>WebApp</b> - сервер, содержит бизнес-логику, обращается к БД SQLite в errorcodes.db

Строка подключения прописывается в User.java и в Admin.java

<b>WebAppClient</b> - клиент с веб-интерфейсом пользователя (поиск по коду)

<b>WebAppClientAdmin</b> - клиент с веб-интерфейсом администратора


Проект можно развернуть на NetBeans 8.6 с GlassFish 4.1

<table>
  <tr>
    <td> Страница администратора
    </td>
    <td> Пользовательская страница
    </td>
  <tr>
    <td>
<img src="https://raw.githubusercontent.com/rusbsv/StatusCodeSearch-WebApp/master/4.jpg" />
    </td>
    <td>
<img src="https://raw.githubusercontent.com/rusbsv/StatusCodeSearch-WebApp/master/2.jpg" height="220"/>
<img src="https://raw.githubusercontent.com/rusbsv/StatusCodeSearch-WebApp/master/3.jpg" height="220"/>
    </td>
  </tr>
</table>
