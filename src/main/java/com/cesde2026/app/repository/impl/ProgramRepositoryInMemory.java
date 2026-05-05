package Repository.impl;

import Repository.ProgramRepository;
import models.Program;
import java.util.ArrayList;
import java.util.List;

public class ProgramRepositoryInMemory implements ProgramRepository {

    private List<Program> programs;
    private Long nextProgramId;

    public ProgramRepositoryInMemory() {
        this.programs = new ArrayList<>();
        this.nextProgramId = 1L;
    }

    @Override
    public Program createProgram(Program program) {
        if (program == null) {
            return null;
        }
        if (finByCode(program.getCode())) {
            return null;
        }
        program.setProgramId(nextProgramId++);
        programs.add(program);
        return program;
    }

    @Override
    public boolean deleteProgram(Long programId) {
        Program program = findById(programId);
        if (program == null) {
            return false;
        }
        return programs.remove(program);
    }

    @Override
    public boolean updateProgram(Program program) {
        if (program == null || program.getProgramId() == null) {
            return false;
        }
        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getProgramId().equals(program.getProgramId())) {
                programs.set(i, program);
                return true;
            }
        }
        return false;
    }

    @Override
    public Program findById(Long programId) {
        if (programId == null) {
            return null;
        }
        for (Program program : programs) {
            if (program.getProgramId().equals(programId)) {
                return program;
            }
        }
        return null;
    }

    @Override
    public boolean finByCode(String code) {
        if (code == null || code.isBlank()) {
            return false;
        }
        for (Program program : programs) {
            if (code.equals(program.getCode())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Program> findAll() {
        return new ArrayList<>(programs);
    }

    @Override
    public boolean existsById(Long programId) {
        return findById(programId) != null;
    }

    @Override
    public boolean existsByCode(String code) {
        return finByCode(code);
    }
}

