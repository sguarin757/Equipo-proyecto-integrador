package Repository;

import models.Period;
import java.util.List;

public interface PeriodRepository {
    Period createPeriod(Period period);

    boolean deletePeriod(Long periodId);

    boolean updatePeriod(Period period);

    Period findById(Long periodId);

    boolean finByCode(String code);

    List<Period> findAll();

    boolean existsById(Long periodId);

    boolean existsByCode(String code);
}

