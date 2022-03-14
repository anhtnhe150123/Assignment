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
import model.Absent;

/**
 *
 * @author Apple
 */
public class AbsentDAO {

    public void insert(Absent absent) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[NGHIPHEP]\n"
                    + "           ([em_id]\n"
                    + "           ,[start_from]\n"
                    + "           ,[end_from]\n"
                    + "           ,[day_off])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, absent.getId());
            ps.setDate(2, absent.getStart());
            ps.setDate(3, absent.getEnd());
            ps.setInt(4, absent.getDayOff());
            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AbsentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Absent> getAllAbsent() {
        List<Absent> list = new ArrayList<>();
        try {
            String sql = "select NGHIPHEP.id, NGHIPHEP.em_id, NGHIPHEP.start_from, NGHIPHEP.end_from, NGHIPHEP.day_off,EMPLOYEE.full_name, EMPLOYEE.imgUrl from \n"
                    + "NGHIPHEP inner join EMPLOYEE on NGHIPHEP.em_id = EMPLOYEE.em_id";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Absent absent = new Absent();
                absent.setStt(rs.getInt(1));
                absent.setId(rs.getString(2));
                absent.setStart(rs.getDate(3));
                absent.setEnd(rs.getDate(4));
                absent.setDayOff(rs.getInt(5));
                absent.setFullName(rs.getString(6));
                absent.setImgUrl(rs.getString(7));
                list.add(absent);
            }
        } catch (Exception ex) {
            Logger.getLogger(AbsentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void deleAbsent(String id) {
        try {
            String sql = "DELETE FROM [AssignmentDB].[dbo].[NGHIPHEP]\n"
                    + "      WHERE em_id = ?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
