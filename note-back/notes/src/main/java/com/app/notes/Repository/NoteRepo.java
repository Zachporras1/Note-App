package com.app.notes.Repository;

import com.app.notes.Class.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Notes,Long> {

}
