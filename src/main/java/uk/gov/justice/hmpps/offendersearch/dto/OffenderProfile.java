package uk.gov.justice.hmpps.offendersearch.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OffenderProfile {
    private String ethnicity;
    private String nationality;
    private String secondaryNationality;
    private String notes;
    private String immigrationStatus;
    private OffenderLanguages offenderLanguages;
    private String religion;
    private String sexualOrientation;
    private String remandStatus;
    private PreviousConviction previousConviction;
    private String riskColour;
    private List<Disability> disabilities;
}
