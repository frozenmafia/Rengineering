package com.app.dream11.model;
/* loaded from: classes3.dex */
public class FeatureResponse<T> {
    private FlowState flowState;
    private T response;
    private boolean success;

    public FeatureResponse(FlowState flowState, T t) {
        this(flowState, null, true);
    }

    public FeatureResponse(FlowState flowState, T t, boolean z) {
        this.flowState = flowState;
        this.response = t;
        this.success = z;
    }

    public FeatureResponse(FlowState flowState) {
        this(flowState, null);
    }

    public FeatureResponse() {
    }

    public FlowState getFlowState() {
        return this.flowState;
    }

    public void setFlowState(FlowState flowState) {
        this.flowState = flowState;
    }

    public T getResponse() {
        return this.response;
    }

    public void setResponse(T t) {
        this.response = t;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
