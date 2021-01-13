package indi.Test.jdbc;

import org.junit.Test;
import util.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PrepareStatementUpateTest {

    public void update(String sql, Object...args)  {
        Connection conn = null;
        PreparedStatement ps = null ;

        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            for (int i = 0; i<args.length; i++){
                ps.setObject(i+1, args[i]);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        JDBCUtils.closeResource(conn, ps);

    }

    @Test
    public void testUpdate(){
        String sql = "update `order` set name = ? where id = ?";
        update(sql, "QQ", "1");
    }
}
