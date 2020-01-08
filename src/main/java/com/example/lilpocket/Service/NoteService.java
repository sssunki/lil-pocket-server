package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.Note;
import com.example.lilpocket.DAO.NoteDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private NoteDAO noteDAO;

    public NoteService(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    public int addNote(Note note) {
        return 0;
    }

    public List<Note> getNoteFromReceiver(String receiverAccount) {
        return null;
    }

    public List<Note> getNoteFromSender(String sendAccount) {
        return null;
    }

}
