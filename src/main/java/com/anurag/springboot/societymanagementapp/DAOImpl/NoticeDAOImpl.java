package com.anurag.springboot.societymanagementapp.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anurag.springboot.societymanagementapp.DAO.NoticeDAO;
import com.anurag.springboot.societymanagementapp.model.Notice;

@Component("noticeDao")
public class NoticeDAOImpl implements NoticeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Notice notice) {
        String sql = "INSERT INTO Notices (description, date) values (?, ?)";
        int create = jdbcTemplate.update(sql, notice.getDescription(), notice.getDate());
        return create;
    }

    @Override
    public int update(Notice notice) {
        String sql = "UPDATE Notices SET description = ?, date = ? WHERE notice_id = ?";
        int update = jdbcTemplate.update(sql, notice.getDescription(), notice.getDate(), notice.getNotice_id());
        return update;
    }

    @Override
    public int delete(int notice_id) {
        String sql = "DELETE FROM Notices WHERE notice_id = ?";
        int delete = jdbcTemplate.update(sql, notice_id);
        return delete;
    }

    @Override
    public List<Notice> read() {
        String sql = "SELECT * FROM Notices";
        BeanPropertyRowMapper<Notice> rowMapper = BeanPropertyRowMapper.newInstance(Notice.class);
        List<Notice> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }

    @Override
    public Notice read(int notice_id) {
        String sql = "SELECT * FROM Notices WHERE notice_id = ?";
        BeanPropertyRowMapper<Notice> rowMapper = BeanPropertyRowMapper.newInstance(Notice.class);
        Notice notice = jdbcTemplate.queryForObject(sql, rowMapper, notice_id);
        return notice;
    }
    
}
