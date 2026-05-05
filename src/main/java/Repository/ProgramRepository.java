package Repository;

import models.Program;
import java.util.List;

public interface ProgramRepository {
    Program createProgram(Program program);

    boolean deleteProgram(Long programId);

    boolean updateProgram(Program program);

    Program findById(Long programId);

    boolean finByCode(String code);

    List<Program> findAll();

    boolean existsById(Long programId);

    boolean existsByCode(String code);
}

