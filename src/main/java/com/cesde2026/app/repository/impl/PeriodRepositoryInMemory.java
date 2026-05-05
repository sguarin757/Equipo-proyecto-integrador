package Repository.impl;

import Repository.PeriodRepository;
import models.Period;
import java.util.ArrayList;
import java.util.List;

public class PeriodRepositoryInMemory implements PeriodRepository {

    private List<Period> periods;
    private Long nextPeriodId;

    public PeriodRepositoryInMemory() {
        this.periods = new ArrayList<>();
        this.nextPeriodId = 1L;
    }

    @Override
    public Period createPeriod(Period period) {
        if (period == null) {
            return null;
        }
        if (finByCode(period.getCode())) {
            return null;
        }
        period.setPeriodid(nextPeriodId++);
        periods.add(period);
        return period;
    }

    @Override
    public boolean deletePeriod(Long periodId) {
        Period period = findById(periodId);
        if (period == null) {
            return false;
        }
        return periods.remove(period);
    }

    @Override
    public boolean updatePeriod(Period period) {
        if (period == null || period.getPeriodid() == null) {
            return false;
        }
        for (int i = 0; i < periods.size(); i++) {
            if (periods.get(i).getPeriodid().equals(period.getPeriodid())) {
                periods.set(i, period);
                return true;
            }
        }
        return false;
    }

    @Override
    public Period findById(Long periodId) {
        if (periodId == null) {
            return null;
        }
        for (Period period : periods) {
            if (period.getPeriodid().equals(periodId)) {
                return period;
            }
        }
        return null;
    }

    @Override
    public boolean finByCode(String code) {
        if (code == null || code.isBlank()) {
            return false;
        }
        for (Period period : periods) {
            if (code.equals(period.getCode())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Period> findAll() {
        return new ArrayList<>(periods);
    }

    @Override
    public boolean existsById(Long periodId) {
        return findById(periodId) != null;
    }

    @Override
    public boolean existsByCode(String code) {
        return finByCode(code);
    }
}

