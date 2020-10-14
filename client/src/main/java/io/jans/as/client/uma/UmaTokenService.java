/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.as.client.uma;

import io.jans.as.model.uma.UmaConstants;
import io.jans.as.model.uma.UmaTokenResponse;

import javax.ws.rs.*;

/**
 * @author yuriyz on 06/21/2017.
 */
public interface UmaTokenService {

    @POST
    @Consumes({UmaConstants.JSON_MEDIA_TYPE})
    @Produces({UmaConstants.JSON_MEDIA_TYPE})
    UmaTokenResponse requestRpt(
            @HeaderParam("Authorization") String authorization,
            @FormParam("grant_type") String grantType,
            @FormParam("ticket") String ticket,
            @FormParam("claim_token") String claimToken,
            @FormParam("claim_token_format") String claimTokenFormat,
            @FormParam("pct") String pctCode,
            @FormParam("rpt") String rptCode,
            @FormParam("scope") String scope);

    @POST
    @Consumes({UmaConstants.JSON_MEDIA_TYPE})
    @Produces({UmaConstants.JSON_MEDIA_TYPE})
    UmaTokenResponse requestJwtAuthorizationRpt(
            @FormParam("client_assertion_type") String clientAssertionType,
            @FormParam("client_assertion") String clientAssertion,
            @FormParam("grant_type") String grantType,
            @FormParam("ticket") String ticket,
            @FormParam("claim_token") String claimToken,
            @FormParam("claim_token_format") String claimTokenFormat,
            @FormParam("pct") String pctCode,
            @FormParam("rpt") String rptCode,
            @FormParam("scope") String scope);
}
