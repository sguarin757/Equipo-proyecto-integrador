package service;

import models.Program;
import java.util.List;

public interface ProgramService {
    Program create(Program program);

    boolean update(Program updateProgram);

    boolean delete(Long programId);

    Program findById(Long programId);

    List<Program> findAll();
}

