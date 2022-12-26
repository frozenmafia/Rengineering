package com.app.dream11.model;

import com.app.dream11.core.ErrorActionEnum;
import java.util.List;
/* loaded from: classes.dex */
public class StateErrorMessage {
    private List<ErrorActionEnum> actionEnums;
    private ErrorMessage message;

    public List<ErrorActionEnum> getActionEnums() {
        return this.actionEnums;
    }

    public ErrorMessage getMessage() {
        return this.message;
    }
}
