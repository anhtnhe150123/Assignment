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
import model.Employee;

/**
 *
 * @author Apple
 */
public class EmployeeDAO {

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from EMPLOYEE inner join POSITION\n"
                    + "on EMPLOYEE.position_id = POSITION.id";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getString(1));
                employee.setName(rs.getString(2));
                employee.setDob(rs.getDate(3));
                employee.setGender(rs.getString(4));
                employee.setPositionId(rs.getInt(5));
                employee.setStartDate(rs.getDate(6));
                employee.setImgUrl(rs.getString(7));
                employee.setPositionName(rs.getString(9));
                list.add(employee);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insertToEmploy(Employee employee) {
        try {
            String sql = "INSERT INTO [EMPLOYEE]\n"
                    + "           ([em_id]\n"
                    + "           ,[full_name]\n"
                    + "           ,[birth_date]\n"
                    + "           ,[gender]\n"
                    + "           ,[position_id]\n"
                    + "           ,[start_date]\n"
                    + "           ,[imgUrl])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setDate(3, employee.getDob());
            ps.setString(4, employee.getGender());
            ps.setInt(5, employee.getPositionId());
            ps.setDate(6, employee.getStartDate());
            ps.setString(7, employee.getImgUrl());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteInEmploy(String id) {
        try {
            String sql = "DELETE FROM [EMPLOYEE]\n"
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
            String sql = "select * from EMPLOYEE inner join POSITION\n"
                    + "on EMPLOYEE.position_id = POSITION.id\n"
                    + "where em_id = ?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            //Thực thi và trả về kết quả
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getString(1));
                employee.setName(rs.getString(2));
                employee.setDob(rs.getDate(3));
                employee.setGender(rs.getString(4));
                employee.setPositionId(rs.getInt(5));
                employee.setStartDate(rs.getDate(6));
                employee.setImgUrl(rs.getString(7));
                employee.setPositionName(rs.getString(9));
                return employee;
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void update(Employee employee) {
        try {
            String sql = "UPDATE [EMPLOYEE]\n"
                    + "   SET [full_name] = ?\n"
                    + "      ,[birth_date] = ?\n"
                    + "      ,[gender] = ?\n"
                    + "      ,[position_id] = ?\n"
                    + "      ,[start_date] = ?\n"
                    + "      ,[imgUrl] = ?\n"
                    + " WHERE em_id = ?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, employee.getName());
            ps.setDate(2, employee.getDob());
            ps.setString(3, employee.getGender());
            ps.setInt(4, employee.getPositionId());
            ps.setDate(5, employee.getStartDate());
            ps.setString(6, employee.getImgUrl());
            ps.setString(7, employee.getId());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Employee> getEmployeesByPositionId(int positionId) {
        List<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from EMPLOYEE where EMPLOYEE.position_id = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, positionId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getString(1));
                employee.setName(rs.getString(2));
                employee.setDob(rs.getDate(3));
                employee.setGender(rs.getString(4));
                employee.setPositionId(rs.getInt(5));
                employee.setStartDate(rs.getDate(6));
                employee.setImgUrl(rs.getString(7));
                list.add(employee);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
