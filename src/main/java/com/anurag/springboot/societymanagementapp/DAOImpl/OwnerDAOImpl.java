package com.anurag.springboot.societymanagementapp.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.anurag.springboot.societymanagementapp.DAO.OwnerDAO;
import com.anurag.springboot.societymanagementapp.model.Owner;

public class OwnerDAOImpl implements OwnerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Owner owner) {
        String sql = "INSERT INTO Owners (name, email, mobile) values (?, ?, ?)";
        int create = jdbcTemplate.update(sql, owner.getName(), owner.getEmail(), owner.getMobile());
        return create;
    }

    @Override
    public int update(Owner owner) {
        String sql = "UPDATE Owners SET name = ?, email = ?, mobile = ? WHERE id = ?";
        int update = jdbcTemplate.update(sql, owner.getName(), owner.getEmail(), owner.getMobile(), owner.getId());
        return update;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM Owners WHERE id = ?";
        int delete = jdbcTemplate.update(sql, id);
        return delete;
    }

    @Override
    public List<Owner> read() {
        String sql = "SELECT * FROM Owners";
        BeanPropertyRowMapper<Owner> rowMapper = BeanPropertyRowMapper.newInstance(Owner.class);
        List<Owner> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }

    @Override
    public Owner read(int id) {
        String sql = "SELECT * FROM Owners WHERE id = ?";
        BeanPropertyRowMapper<Owner> rowMapper = BeanPropertyRowMapper.newInstance(Owner.class);
        Owner owner = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return owner;
    }
    
}
