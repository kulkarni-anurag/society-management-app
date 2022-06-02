package com.anurag.springboot.societymanagementapp.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anurag.springboot.societymanagementapp.DAO.ComplaintDAO;
import com.anurag.springboot.societymanagementapp.model.Complaint;

@Component("complaintDao")
public class ComplaintDAOImpl implements ComplaintDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Complaint complaint) {
        String sql = "INSERT INTO Complaints (fl_no, description, isResolved) values (?, ?, ?)";
        int create = jdbcTemplate.update(sql, complaint.getFl_no(), complaint.getDescription(), complaint.isResolved());
        return create;
    }

    @Override
    public int update(Complaint complaint) {
        String sql = "UPDATE Complaints SET fl_no = ?, description = ?, isResolved = ? WHERE id = ?";
        int update = jdbcTemplate.update(sql, complaint.getFl_no(), complaint.getDescription(), complaint.isResolved(), complaint.getId());
        return update;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM Complaints WHERE id = ?";
        int delete = jdbcTemplate.update(sql, id);
        return delete;
    }

    @Override
    public List<Complaint> read() {
        String sql = "SELECT * FROM Complaints";
        BeanPropertyRowMapper<Complaint> rowMapper = BeanPropertyRowMapper.newInstance(Complaint.class);
        List<Complaint> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }

    @Override
    public Complaint read(int id) {
        String sql = "SELECT * FROM Complaints WHERE id = ?";
        BeanPropertyRowMapper<Complaint> rowMapper = BeanPropertyRowMapper.newInstance(Complaint.class);
        Complaint complaint = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return complaint;
    }
    
}
