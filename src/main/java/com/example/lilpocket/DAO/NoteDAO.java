package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.Note;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NoteDAO {

    void addNote(Note note);
    List<Note> getNoteFromReceiver(String receiveAccount);
    List<Note> getNoteFromSender(String sendAccount);

}
