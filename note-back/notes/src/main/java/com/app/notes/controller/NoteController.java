package com.app.notes.controller;

import com.app.notes.Class.Notes;
import com.app.notes.Repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    NoteRepo noteRepo;

    public NoteController(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    @GetMapping("/notes")
    public ResponseEntity<List<Notes>> getAllNotes(){

        try{
            List<Notes> notes= new ArrayList<>();
            noteRepo.findAll().forEach(notes::add);
            return new ResponseEntity<>(notes, HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
