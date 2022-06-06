package com.anurag.springboot.societymanagementapp.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anurag.springboot.societymanagementapp.DAO.FlatOwnerDAO;

@Component("flatownerDao")
public class FlatOwnerDAOImpl implements FlatOwnerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(int fl_no, int owner_id) {
        String sql = "INSERT INTO Flat_Owner(fl_no, owner_id) values (?, ?)";
        int create = jdbcTemplate.update(sql, fl_no, owner_id);
        return create;
    }

    @Override
    public int delete(int fl_no, int owner_id) {
        String sql = "DELETE FROM Flat_Owner WHERE fl_no = ?, owner_id = ?";
        int delete = jdbcTemplate.update(sql, fl_no, owner_id);
        return delete;
    }
    
}
