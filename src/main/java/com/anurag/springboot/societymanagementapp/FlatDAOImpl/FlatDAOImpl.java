package com.anurag.springboot.societymanagementapp.FlatDAOImpl;

import java.util.List;

import com.anurag.springboot.societymanagementapp.FlatDAO.FlatDAO;
import com.anurag.springboot.societymanagementapp.flat.Flat;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String sql = "INSERT INTO flats (flat_number, rooms, balcony, area) values (?, ?, ?, ?)";
        int create = jdbcTemplate.update(sql, flat.getFlat_number(), flat.getRooms(), flat.isBalcony(), flat.getArea());
        return create;
    }

    @Override
    public int delete(String flat_number) {
        String sql = "DELETE FROM flats WHERE flat_number = ?";
        jdbcTemplate.update(sql, flat_number);
        return 0;
    }

    @Override
    public List<Flat> read() {
        String sql = "SELECT * FROM flats";
        BeanPropertyRowMapper<Flat> rowMapper = BeanPropertyRowMapper.newInstance(Flat.class);
        List<Flat> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }
    
}
