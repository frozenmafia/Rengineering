package com.facebook;

import com.dreampay.commons.constants.Constants;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class FacebookGraphResponseException extends FacebookException {
    private final GraphResponse graphResponse;

    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.graphResponse = graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        GraphResponse graphResponse = this.graphResponse;
        FacebookRequestError valueOf = graphResponse == null ? null : graphResponse.valueOf();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        runAnimators.ah$a(sb, "StringBuilder().append(\"{FacebookGraphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(Constants.WHITE_SPACE);
        }
        if (valueOf != null) {
            sb.append("httpResponseCode: ");
            sb.append(valueOf.getInitSettings());
            sb.append(", facebookErrorCode: ");
            sb.append(valueOf.valueOf());
            sb.append(", facebookErrorType: ");
            sb.append(valueOf.HaptikSDK$b());
            sb.append(", message: ");
            sb.append(valueOf.values());
            sb.append("}");
        }
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
