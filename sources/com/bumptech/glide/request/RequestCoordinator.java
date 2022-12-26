package com.bumptech.glide.request;

import o.ime;
/* loaded from: classes3.dex */
public interface RequestCoordinator {
    RequestCoordinator ag$a();

    boolean ag$a(ime imeVar);

    boolean ah$a();

    void invoke(ime imeVar);

    boolean toString(ime imeVar);

    void valueOf(ime imeVar);

    boolean values(ime imeVar);

    /* loaded from: classes3.dex */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }
}
