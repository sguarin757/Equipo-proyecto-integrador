package service;

import models.Period;
import java.util.List;

public interface PeriodService {
    Period create(Period period);

    boolean update(Period updatePeriod);

    boolean delete(Long periodId);

    Period findById(Long periodId);

    List<Period> findAll();
}

