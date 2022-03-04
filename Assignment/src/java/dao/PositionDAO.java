/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Position;

/**
 *
 * @author Apple
 */
public class PositionDAO {

    public List<Position> getAllPosition() {
       List<Position> list = new ArrayList<>();
        try {
            String sql = "select * from POSITION";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Position position = new Position();
                position.setPosition(rs.getString(1));
                position.setBasicSalary(rs.getDouble(2));
                list.add(position);
            }
        } catch (Exception ex) {
            Logger.getLogger(PositionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
