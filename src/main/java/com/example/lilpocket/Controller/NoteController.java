package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.Note;
import com.example.lilpocket.Bean.User;
import com.example.lilpocket.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * method : return note message , return by send account ,return by receiver account
 */

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @Autowired
    public NoteController(NoteService service) {
        this.noteService = service;
    }

    @PostMapping("/add")
    public int addNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }

    @PostMapping("/get/receiver")
    public List<Note> getNoteByReceiveAccount(@RequestBody User user) {
        return noteService.getNoteFromReceiver(user.getAccount());
    }

    @PostMapping("/get/sender")
    public List<Note> getNoteBySendAccount(@RequestBody User user) {
        return noteService.getNoteFromSender(user.getAccount());
    }
}
