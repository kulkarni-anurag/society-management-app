package com.anurag.springboot.societymanagementapp.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anurag.springboot.societymanagementapp.DAO.OwnerDAO;
import com.anurag.springboot.societymanagementapp.model.Owner;

@Component("ownerDao")
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
        String sql = "UPDATE Owners SET name = ?, email = ?, mobile = ? WHERE owner_id = ?";
        int update = jdbcTemplate.update(sql, owner.getName(), owner.getEmail(), owner.getMobile(), owner.getOwner_id());
        return update;
    }

    @Override
    public int delete(int owner_id) {
        String sql = "DELETE FROM Owners WHERE owner_id = ?";
        int delete = jdbcTemplate.update(sql, owner_id);
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
    public Owner read(int owner_id) {
        String sql = "SELECT * FROM Owners WHERE owner_id = ?";
        BeanPropertyRowMapper<Owner> rowMapper = BeanPropertyRowMapper.newInstance(Owner.class);
        Owner owner = jdbcTemplate.queryForObject(sql, rowMapper, owner_id);
        return owner;
    }

    @Override
    public Owner read(String email) {
        String sql = "SELECT * FROM Owners WHERE email = ?";
        BeanPropertyRowMapper<Owner> rowMapper = BeanPropertyRowMapper.newInstance(Owner.class);
        Owner owner = jdbcTemplate.queryForObject(sql, rowMapper, email);
        return owner;
    }

    @Override
    public List<Owner> readSome(int fl_no) {
        String sql = "SELECT O.owner_id, O.name, O.email, O.mobile FROM Owners O INNER JOIN Flat_Owner F ON F.owner_id = O.owner_id AND F.fl_no = ?";
        BeanPropertyRowMapper<Owner> rowMapper = BeanPropertyRowMapper.newInstance(Owner.class);
        List<Owner> result = jdbcTemplate.query(sql, rowMapper, fl_no);
        return result;
    }
    
}
