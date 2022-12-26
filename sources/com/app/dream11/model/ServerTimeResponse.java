package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ServerTimeResponse implements Serializable {
    private static final long serialVersionUID = 121;
    private Long timestamp;

    public Long getServerTime() {
        return this.timestamp;
    }
}
