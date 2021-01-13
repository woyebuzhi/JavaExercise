package indi.Test.jdbc;

import org.junit.Test;
import util.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.*;
import indi.Test.jdbc.Orders;

public class OrderTableQuery {



    @Test
    public void testQueryForOrder(){
        String sql = "select id , name ,birth from `order` where  id != ?";
        Orders order = queryForOrder(sql, "1");
        System.out.println(order);

    }

    public Orders queryForOrder(String sql, Object...args){
        Connection conn = null;
        PreparedStatement ps=null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++){
                ps.setObject(i+1, args[i]);
            }

            rs = ps.executeQuery();
            ResultSetMetaData resu = rs.getMetaData();
            int columCount = resu.getColumnCount();

            if (rs.next()){
                Orders or = new Orders();

                for (int i=0; i < columCount; i++){
                    Object columValue = rs.getObject(i + 1);

                    String columnLabel = resu.getColumnLabel(i + 1);

                    Field field = Orders.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(or, columValue);
                }
                return or;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }




    @Test
    public void testQuery() {

        Connection conn = null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select id , name , birth from `order` where  id=?";
            ps=conn.prepareStatement(sql);
            ps.setObject(1,1);

            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Date birth = rs.getDate(3);


                Orders order = new Orders(id, name, birth);
                System.out.println(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
    }

}
