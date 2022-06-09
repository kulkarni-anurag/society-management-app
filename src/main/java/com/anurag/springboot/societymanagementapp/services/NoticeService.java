package com.anurag.springboot.societymanagementapp.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.springboot.societymanagementapp.DAO.NoticeDAO;
import com.anurag.springboot.societymanagementapp.model.Notice;

@Service
public class NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    public List<Notice> getAllNotices(){
        return noticeDAO.read();
    }

    public List<Notice> getAllAnnouncements(){
        List<Notice> list = noticeDAO.read();
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    public Notice getOneNotice(int notice_id){
        return noticeDAO.read(notice_id);
    }

    public void addNotice(Notice notice){
        noticeDAO.create(notice);
    }

    public void updateNotice(Notice notice){
        noticeDAO.update(notice);
    }

    public void deleteNotice(int notice_id){
        noticeDAO.delete(notice_id);
    }
}
