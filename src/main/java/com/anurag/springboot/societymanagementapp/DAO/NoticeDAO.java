package com.anurag.springboot.societymanagementapp.DAO;

import java.util.List;

import com.anurag.springboot.societymanagementapp.model.Notice;

public interface NoticeDAO {
    int create(Notice notice);
    int update(Notice notice);
    int delete(int notice_id);
    List<Notice> read();
    Notice read(int notice_id);
}
