/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;

/**
 *
 * @author Apple
 */
public class EmployeeDAO {

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from EMPLOYEE";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getString(1));
                employee.setName(rs.getString(2));
                employee.setDob(rs.getDate(3));
                employee.setGender(rs.getString(4));
                employee.setPosition(rs.getString(5));
                employee.setStartDate(rs.getDate(6));
                list.add(employee);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void create(Employee employee) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[EMPLOYEE]\n"
                    + "           ([em_id]\n"
                    + "           ,[full_name]\n"
                    + "           ,[birth_date]\n"
                    + "           ,[gender]\n"
                    + "           ,[position]\n"
                    + "           ,[start_date])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setDate(3, employee.getDob());
            ps.setString(4, employee.getGender());
            ps.setString(5, employee.getPosition());
            ps.setDate(6, employee.getStartDate());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(String id) {
        try {
            String sql = "DELETE FROM [dbo].[EMPLOYEE]\n"
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

    public Employee getEmployeeByID(String id) {
        try {
            String sql = "select * from EMPLOYEE\n"
                    + "where em_id=?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            //Thực thi và trả về kết quả
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getDate(7));
                return employee;
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void update(Employee employee) {
        try {
            String sql = "UPDATE [AssignmentDB].[dbo].[EMPLOYEE]\n"
                    + "   SET [em_id] = ?\n"
                    + "      ,[full_name] = ?\n"
                    + "      ,[birth_date] = ?\n"
                    + "      ,[gender] = ?\n"
                    + "      ,[position] = ?\n"
                    + "      ,[start_date] = ?\n"
                    + " WHERE em_id = ?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setDate(3, employee.getDob());
            ps.setString(4, employee.getGender());
            ps.setString(5, employee.getPosition());
            ps.setDate(6, employee.getStartDate());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
