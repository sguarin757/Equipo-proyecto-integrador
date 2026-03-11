package models;

import java.time.LocalDate;

public class Period {
    private Long periodid;
    private String code;
    private LocalDate startDate;
    private LocalDate endDate;

    public Period() {
    }

    public Period(Long periodid, String code, LocalDate startDate, LocalDate endDate) {
        this.periodid = periodid;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getPeriodid() {
        return periodid;
    }

    public void setPeriodid(Long periodid) {
        this.periodid = periodid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "period =" + "Period{" +
                "periodid=" + periodid +
                ", code='" + code + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
