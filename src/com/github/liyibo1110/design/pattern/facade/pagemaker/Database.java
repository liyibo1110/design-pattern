package com.github.liyibo1110.design.pattern.facade.pagemaker;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

    private Database() {

    }

    /**
     * 根据数据库name获取Properties
     * @param dbName
     * @return
     */
    public static Properties getProperties(String dbName) {
        String filename = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
