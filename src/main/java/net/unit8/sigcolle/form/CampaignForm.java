package net.unit8.sigcolle.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

/**
 * @author kawasima
 */
@Data
public class CampaignForm extends FormBase {
    @DecimalMin("1")
    @DecimalMax("9999")
    private String campaignId;

    @NotNull
    @Length(min = 1, max = 20)
    private String title;

    @NotNull
    @Length(max = 5000)
    private String statement;

    @NotNull
    private Long goal;

    public Long getCampaignIdLong() {
        return Long.parseLong(campaignId);
    }
}
