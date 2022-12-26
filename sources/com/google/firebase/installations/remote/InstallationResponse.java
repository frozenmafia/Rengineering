package com.google.firebase.installations.remote;

import o.RecyclerView;
/* loaded from: classes7.dex */
public abstract class InstallationResponse {

    /* loaded from: classes7.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    public abstract String HaptikSDK$a();

    public abstract String ag$a();

    public abstract TokenResult ah$a();

    public abstract String valueOf();

    public abstract ResponseCode values();

    public static InstallationResponse$ah$a invoke() {
        return new RecyclerView.SimpleOnItemTouchListener.values();
    }
}
