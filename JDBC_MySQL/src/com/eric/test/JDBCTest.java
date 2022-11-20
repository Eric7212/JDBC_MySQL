package com.eric.test;

import com.eric.jdbc.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            queryID(111);
            setBalance(6666.0);
        }catch (Exception e){
            System.out.println("出现异常");
        }
    }

    public  static<T extends Object>  ArrayList<T> queryID(int ID) throws SQLException {

        String sql = "select * from t_act where actno = ? ";



        ArrayList<T_ACT> list = JDBCUtil.executeDQLWithValue(T_ACT.class,sql,ID);
        Iterator<T_ACT> iterator = list.iterator();
        while (iterator.hasNext()){
            T_ACT t = iterator.next();
            System.out.println(t.actno + "," + t.balance);
            //System.out.println(iterator.next());
        }

        return null;
    }

    public static void setBalance(Double doubleNum){

        String sql = "update t_act set balance = ?  where actno = ?";
        boolean b = JDBCUtil.executeDMLWithValue(sql, doubleNum, 111);
        if (b){
            System.out.println("已修改");
        }else {
            System.out.println("修改失败");
        }
    }
}
