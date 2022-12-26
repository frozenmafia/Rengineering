package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes6.dex */
public final class NetbankingVM implements Serializable {
    private long id;
    private boolean isAvailable;
    private String name = "";
    private String type = "";
    private String src = "";
    private String errorMessage = "";

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String getSrc() {
        return this.src;
    }

    public final void setSrc(String str) {
        this.src = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final void setAvailable(boolean z) {
        this.isAvailable = z;
    }
}
