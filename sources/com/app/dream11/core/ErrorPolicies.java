package com.app.dream11.core;

import com.app.dream11.model.DefaultErrorMessage;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class ErrorPolicies implements Serializable {
    private static final long serialVersionUID = 1;
    private List<ApiErrorPolicy> apiErrorPolicies;
    private List<DefaultErrorMessage> defaultMessages;

    public List<ApiErrorPolicy> getApiErrorPolicies() {
        return this.apiErrorPolicies;
    }

    public List<DefaultErrorMessage> getDefaultMessages() {
        return this.defaultMessages;
    }
}
