package com.app.dream11.model;

import com.app.dream11.core.ApiErrorPolicy;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class DefaultErrorMessage implements Serializable {
    private static final long serialVersionUID = 1;
    private ApiErrorPolicy.HttpCodeRange codeRange;
    private List<StateErrorMessage> messages;

    public ApiErrorPolicy.HttpCodeRange getCodeRange() {
        return this.codeRange;
    }

    public List<StateErrorMessage> getMessages() {
        return this.messages;
    }
}
