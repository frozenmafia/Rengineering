package com.app.dream11.model;

import o.isFullSpan;
/* loaded from: classes3.dex */
public final class ConfigData {
    @isFullSpan(valueOf = "dh_wrapper")
    private DhWrapper eventsData;
    private UnSupportedIntegrations unSupportedIntegrations;

    public final UnSupportedIntegrations getUnSupportedIntegrations() {
        return this.unSupportedIntegrations;
    }

    public final void setUnSupportedIntegrations(UnSupportedIntegrations unSupportedIntegrations) {
        this.unSupportedIntegrations = unSupportedIntegrations;
    }

    public final DhWrapper getEventsData() {
        return this.eventsData;
    }

    public final void setEventsData(DhWrapper dhWrapper) {
        this.eventsData = dhWrapper;
    }
}
