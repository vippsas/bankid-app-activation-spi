package no.bankid.outgoing.ra;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Request body content for asking an RA to send verification code to end user")
public class SendVerificationCodeRequestBodyDTO extends AuthenticationBodyDTO {

    @Schema(description = "The id of this activation attempt, used for for logging, will be the same for both codes")
    public UUID activation_id;
    @Schema(description = "The alias for the msisdn previously provided in a response from check-user")
    public String msisdn_reference_id;
    public AppClientLocaleDTO locale;
    @Schema(description = "Four digit code")
    public String verification_code;
    @Schema(description = "Time when code expire, ms since epoch, UTC")
    public long exp;
}
