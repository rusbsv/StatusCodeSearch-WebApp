package com.webapp;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.sql.*;
import javax.jws.WebParam;

@WebService(serviceName = "Admin")
public class Admin {
    
    //строка подключения к БД SQLite, путь прописывается после jdbc:sqlite:
    String dbConnect = "jdbc:sqlite:" + "C:\\rabot\\soap\\WebApp\\errorcodes.db";
    
    //библиотека org.sqlite.JDBC для взаимодействия с SQLite
    String dbClass = "org.sqlite.JDBC";
    
    //объект подключения к БД
    Connection co;
    
    //открытие соединения с БД
    boolean openDB(){
        try {
            //подключаем библиотеку org.sqlite.JDBC для взаимодействия с SQLite
            Class.forName(dbClass);
            //задаем подключение к БД
            co = DriverManager.getConnection(dbConnect);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            //в случае ошибки подключения
            return false;
        }
    }
    
    //вставка записи в БД
    boolean insertDB(String nametable, int errcode, String errdescription){
        try{
            //строка запроса для вставки новой записи в таблицу
            String query = "INSERT INTO " + nametable + " (code, description) "+
                        "VALUES (" + errcode + ", '" + errdescription +"');";
            //создаем объект для sql-запроса
            Statement statement = co.createStatement();
            //запрос на обновление данных
            statement.executeUpdate(query);
            //закрываем
            statement.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    //удаление записи в БД
    boolean delFromDB(String nametable, int errcode){
        try{
            //строка запроса для удаления записи
            String query = "DELETE FROM " + nametable + " WHERE code=" + errcode +";";
            //создаем объект для sql-запроса
            Statement statement = co.createStatement();
            //запрос на обновление данных
            statement.executeUpdate(query);
            //закрываем
            statement.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    //выдает строку с описанием ошибки по её коду
    String selectFromDB(String nametable, int errcode){
        try {
            //строка запроса выборки данных из таблицы
            String query = "SELECT * FROM " + nametable +
                    " WHERE code=" + errcode + ";";
            //создаем объект для sql-запроса
            Statement statement = co.createStatement();
            //запрос на получение данных
            ResultSet rs = statement.executeQuery(query);
            
            //Получаем строку с ошисанием ошибки по коду
            String description = rs.getString("description");

            //закрываем
            rs.close();
            return description;
        } catch (Exception e) {
            e.printStackTrace();
            return "ОТСУТСТВУЕТ ОШИБКА С ДАННЫМ КОДОМ";
        }
    }
    
    //выдает список всех ошибок для системы (т.е. в данной таблице)
    String selectAllFromTableDB(String nametable){
        try {
            //строка запроса выборки данных из таблицы
            String query = "SELECT * FROM " + nametable + ";";
            //создаем объект для sql-запроса
            Statement statement = co.createStatement();
            //запрос на получение данных
            ResultSet rs = statement.executeQuery(query);
            
            String resSp = "<table border=\"1\" cellspacing=\"0\" cellpadding=\"5\">";
            // в цикле получаем из таблицы список всех ошибок строкой
            while(rs.next()){
                int code = rs.getInt("code");
                String description = rs.getString("description");
                resSp += "<tr><td>" + Integer.toString(code) + "</td><td>" + description + "</td></tr>";
            }

            //закрываем
            rs.close();
            statement.close();
            return resSp;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    
    //создает пустую таблицу ошибок для новой системы
    boolean createTableDB(String nametable){
        try {
            //строка запроса создания таблицы
            String query = "CREATE TABLE " + nametable +
                    "(code NUMERIC INTEGER NOT NULL PRIMARY KEY, " +
                    "description TEXT)";
            //создаем объект для sql-запроса
            Statement statement = co.createStatement();
            //запрос на создание таблицы
            statement.executeUpdate(query);

            statement.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //выводит список всех таблиц в БД
    String selectTablesDB(){
        try {
            //строка запроса выборки имен таблиц
            String query = "select name from sqlite_master where type = 'table';";
            //создаем объект для sql-запроса
            Statement statement = co.createStatement();
            //запрос на получение данных
            ResultSet rs = statement.executeQuery(query);
            
            String resSp = "";
            // в цикле получаем список всех таблиц строкой
            while(rs.next()){
                resSp += " " + rs.getString("name");
            }

            //закрываем
            rs.close();
            statement.close();
            return resSp;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    
    //закрывает соединение с таблицей
    boolean closeDB(){
        try {
            co.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //метод возвращает сообщение SOAP ошибки по её коду, передается название системы (таблицы) и код ошибки
    @WebMethod
    public String getErrorDescription(@WebParam(name = "nametable")String nametable, @WebParam(name = "code")int code){
        
        String ret = "";
        if (openDB()){
            ret = selectFromDB(nametable, code);
            closeDB();
        }
        return ret;
    }
    
    //метод возвращает сообщение SOAP списка всех ошибкок в системе, передается название системы (таблицы)
    @WebMethod
    public String getAll(@WebParam(name = "nametable") String nametable){
        
        String ret = "";
        if (openDB()){
            ret = selectAllFromTableDB(nametable);
            closeDB();
        }
        return ret;
    }
    
    //метод возвращает сообщение SOAP успешного создания новой таблицы, передается название системы (таблицы)
    @WebMethod
    public String createTable(@WebParam(name = "nametable") String nametable){
        
        String ret = "";
        if (openDB()){
            if(createTableDB(nametable)) ret = "Таблица " + nametable + " создана";
            closeDB();
        }
        return ret;
    }
    
    //метод возвращает сообщение SOAP успешного добавления новой записи, передается название системы (таблицы), код ошибки и описание
    @WebMethod
    public String addError(@WebParam(name = "nametable") String nametable, @WebParam(name = "errcode") int errcode, @WebParam(name = "description") String description){
        
        String ret = "";
        if (openDB()){
            if(insertDB(nametable, errcode, description)){ 
                ret = "Запись об ошибке успешно добавлена!" + 
                        "<p><b>В таблицу:  </b>" + nametable +
                        "<p><b>Код ошибки: </b>" + Integer.toString(errcode) +
                        "<p><b>Описание:   </b>" + description;
            }
            closeDB();
        }
        return ret;
    }
    
    //метод возвращает сообщение SOAP успешного удаления новой записи, передается название системы (таблицы), код ошибки и описание
    @WebMethod
    public String delError(@WebParam(name = "nametable") String nametable, @WebParam(name = "errcode") int errcode){
        
        String ret = "";
        if (openDB()){
            if(delFromDB(nametable, errcode)){ 
                ret = "Запись успешно удалена!" + 
                        "<p><b>Удалена из таблицы:   </b>" + nametable +
                        "<p><b>Код удаленной ошибки: </b>" + Integer.toString(errcode);
            }
            closeDB();
        }
        return ret;
    }
    
    //метод возвращает сообщение SOAP списка всех систем (таблиц в БД)
    @WebMethod
    public String getTables(){
        
        String ret = "";
        if (openDB()){
            ret = selectTablesDB();
            closeDB();
        }
        return ret;
    }
}
