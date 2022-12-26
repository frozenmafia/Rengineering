package com.app.dream11.model;

import com.app.dream11.utils.FlowTypes;
import java.io.Serializable;
/* loaded from: classes6.dex */
public class DeleteFlowCommand implements Serializable {
    private static final long serialVersionUID = 121;
    private FlowTypes deleteflowType;

    public DeleteFlowCommand(FlowTypes flowTypes) {
        this.deleteflowType = flowTypes;
    }

    public FlowTypes getDeleteflowType() {
        return this.deleteflowType;
    }
}
