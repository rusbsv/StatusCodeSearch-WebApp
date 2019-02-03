package com.webapp;

import java.sql.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "User")
public class User {
    
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
            statement.close();
            return description;
        } catch (Exception e) {
            e.printStackTrace();
            return "ОТСУТСТВУЕТ ОШИБКА С ДАННЫМ КОДОМ";
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
                resSp += rs.getString("name") + "   ";
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
    
    //метод возвращает сообщение SOAP списка всех систем (таблиц в БД)
    @WebMethod
    public String getTables(){
        
        String ret = "";
        if (openDB()){
            ret = "Таблицы в БД: \n" + selectTablesDB();
            closeDB();
        }
        return ret;
    }
}
