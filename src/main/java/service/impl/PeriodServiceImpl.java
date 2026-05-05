package service.impl;

import Repository.PeriodRepository;
import service.PeriodService;
import models.Period;
import java.util.List;

public class PeriodServiceImpl implements PeriodService {

    private final PeriodRepository periodRepository;

    public PeriodServiceImpl(PeriodRepository periodRepository) {
        this.periodRepository = periodRepository;
    }

    @Override
    public Period create(Period period) {
        return periodRepository.createPeriod(period);
    }

    @Override
    public boolean update(Period updatePeriod) {
        return periodRepository.updatePeriod(updatePeriod);
    }

    @Override
    public boolean delete(Long periodId) {
        return periodRepository.deletePeriod(periodId);
    }

    @Override
    public Period findById(Long periodId) {
        return periodRepository.findById(periodId);
    }

    @Override
    public List<Period> findAll() {
        return periodRepository.findAll();
    }
}

