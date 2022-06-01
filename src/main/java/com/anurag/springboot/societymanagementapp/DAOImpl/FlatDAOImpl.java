package com.anurag.springboot.societymanagementapp.DAOImpl;

import java.util.List;

import com.anurag.springboot.societymanagementapp.DAO.FlatDAO;
import com.anurag.springboot.societymanagementapp.model.Flat;

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
        String sql = "INSERT INTO Flats (fl_no, rooms, balcony, area) values (?, ?, ?, ?)";
        int create = jdbcTemplate.update(sql, flat.getFl_no(), flat.getRooms(), flat.isBalcony(), flat.getArea());
        return create;
    }

    @Override
    public int update(Flat flat) {
        String sql = "UPDATE Flats SET rooms = ?, balcony = ?, area = ? WHERE fl_no = ?";
        int update = jdbcTemplate.update(sql, flat.getRooms(), flat.isBalcony(), flat.getArea(), flat.getFl_no());
        return update;
    }

    @Override
    public int delete(String fl_no) {
        String sql = "DELETE FROM Flats WHERE fl_no = ?";
        jdbcTemplate.update(sql, fl_no);
        return 0;
    }

    @Override
    public List<Flat> read() {
        String sql = "SELECT * FROM Flats";
        BeanPropertyRowMapper<Flat> rowMapper = BeanPropertyRowMapper.newInstance(Flat.class);
        List<Flat> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }
    
}
