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
import model.Usalary;

/**
 *
 * @author Apple
 */
public class UsalaryDAO {

    public void insert(Usalary usalary) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[UNGLUONG]\n"
                    + "           ([em_id]\n"
                    + "           ,[Date]\n"
                    + "           ,[money]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usalary.getId());
            ps.setDate(2, usalary.getDate());
            ps.setDouble(3, usalary.getMoney());
            ps.setString(4, usalary.getStatus());
            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(UsalaryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usalary> getAllUsalary() {
        List<Usalary> list = new ArrayList<>();
        try {
            String sql = "select UNGLUONG.id, UNGLUONG.em_id, EMPLOYEE.full_name, EMPLOYEE.imgUrl, UNGLUONG.Date, UNGLUONG.money, UNGLUONG.status   \n"
                    + "from UNGLUONG inner join EMPLOYEE\n"
                    + "on UNGLUONG.em_id = EMPLOYEE.em_id";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usalary usalary = new Usalary();
                usalary.setStt(rs.getInt(1));
                usalary.setId(rs.getString(2));
                usalary.setFullName(rs.getString(3));
                usalary.setImgUrl(rs.getString(4));
                usalary.setDate(rs.getDate(5));
                usalary.setMoney(rs.getDouble(6));
                usalary.setStatus(rs.getString(7));

                list.add(usalary);
            }
        } catch (Exception ex) {
            Logger.getLogger(UsalaryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Usalary getUsalaryByID(String id) {
        try {
            String sql = "select UNGLUONG.id, UNGLUONG.em_id, EMPLOYEE.full_name, EMPLOYEE.imgUrl, UNGLUONG.Date, UNGLUONG.money, UNGLUONG.status   \n"
                    + "from UNGLUONG inner join EMPLOYEE\n"
                    + "on UNGLUONG.em_id = EMPLOYEE.em_id\n"
                    + "where UNGLUONG.em_id = ?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            //Thực thi và trả về kết quả
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usalary usalary = new Usalary();
                usalary.setStt(rs.getInt(1));
                usalary.setId(rs.getString(2));
                usalary.setFullName(rs.getString(3));
                usalary.setImgUrl(rs.getString(4));
                usalary.setDate(rs.getDate(5));
                usalary.setMoney(rs.getDouble(6));
                usalary.setStatus(rs.getString(7));
                return usalary;
            }
        } catch (Exception ex) {
            Logger.getLogger(UsalaryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateSala(Usalary usalary) {
        try {
            String sql = "UPDATE [AssignmentDB].[dbo].[UNGLUONG]\n"
                    + "   SET [status] = ?\n"
                    + " WHERE em_id =?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, usalary.getStatus());
            ps.setString(2, usalary.getId());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(UsalaryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
