package com.app.dream11.utils;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public enum FlowTypes {
    LAUNCH(FlowStates.SPLASH),
    LOGIN_REGISTER(FlowStates.LOGIN_SELECTION, FlowStates.LOGIN, FlowStates.REGISTRATION, FlowStates.REFERRAL_REGISTRATION),
    ADD_CASH_FLOW(new FlowStates[0]),
    MANAGE_WALLET(FlowStates.MANAGE_PAYMENT_OPTIONS, FlowStates.MANAGE_WALLET),
    JOIN_LEAGUE(new FlowStates[0]);
    
    private List<FlowStates> flowStates;

    public List<FlowStates> getFlowStates() {
        return this.flowStates;
    }

    FlowTypes(FlowStates... flowStatesArr) {
        this.flowStates = Arrays.asList(flowStatesArr);
    }
}
