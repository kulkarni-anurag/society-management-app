package com.anurag.springboot.societymanagementapp.FlatDAOImpl;

import java.util.List;

import com.anurag.springboot.societymanagementapp.FlatDAO.FlatDAO;
import com.anurag.springboot.societymanagementapp.flat.Flat;

import org.springframework.jdbc.core.JdbcTemplate;

public class FlatDAOImpl implements FlatDAO {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Flat flat) {
        
        return 0;
    }

    @Override
    public int update(Flat flat) {
        
        return 0;
    }

    @Override
    public int delete(Flat flat) {
        
        return 0;
    }

    @Override
    public List<Flat> read() {
        
        return null;
    }
    
}
