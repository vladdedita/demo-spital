package ro.kluger.java.spital.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class ProgramareDTO {
    @NotNull
    private Date oraProgramare;
    @NotNull
    @Min(1)
    private Long doctorId;
    @NotNull
    @Min(1)
    private Long pacientId;
    @NotNull
    @Min(1)
    private Long statusId;
}
