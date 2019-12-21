package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.Note;
import com.example.lilpocket.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping
    public List<Note> getNoteByReceiveAccount(@RequestBody String account) {

    }

    @GetMapping
    public List<Note> getNoteBySendAccount(@RequestBody String account) {

    }
}
