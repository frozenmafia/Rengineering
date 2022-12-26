package com.apollographql.apollo.exception;

import com.dreampay.commons.constants.Constants;
import okhttp3.Response;
/* loaded from: classes.dex */
public final class ApolloHttpException extends ApolloException {
    private final int code;
    private final String message;
    private final transient Response rawResponse;

    public ApolloHttpException(Response response) {
        super(formatMessage(response));
        this.code = response != null ? response.code() : 0;
        this.message = response != null ? response.message() : "";
        this.rawResponse = response;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public Response rawResponse() {
        return this.rawResponse;
    }

    private static String formatMessage(Response response) {
        if (response == null) {
            return "Empty HTTP response";
        }
        return "HTTP " + response.code() + Constants.WHITE_SPACE + response.message();
    }
}
