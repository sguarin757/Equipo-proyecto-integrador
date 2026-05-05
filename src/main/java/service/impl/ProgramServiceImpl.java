package service.impl;

import Repository.ProgramRepository;
import service.ProgramService;
import models.Program;
import java.util.List;

public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepository programRepository;

    public ProgramServiceImpl(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public Program create(Program program) {
        return programRepository.createProgram(program);
    }

    @Override
    public boolean update(Program updateProgram) {
        return programRepository.updateProgram(updateProgram);
    }

    @Override
    public boolean delete(Long programId) {
        return programRepository.deleteProgram(programId);
    }

    @Override
    public Program findById(Long programId) {
        return programRepository.findById(programId);
    }

    @Override
    public List<Program> findAll() {
        return programRepository.findAll();
    }
}

