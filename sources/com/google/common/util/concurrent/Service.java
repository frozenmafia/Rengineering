package com.google.common.util.concurrent;
/* loaded from: classes7.dex */
public interface Service {

    /* loaded from: classes7.dex */
    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }
}
