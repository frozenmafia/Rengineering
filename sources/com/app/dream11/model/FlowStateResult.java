package com.app.dream11.model;

import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public class FlowStateResult implements Serializable {
    private final Map<String, Serializable> mExtraMap = new HashMap();
    private String message;
    private final boolean success;

    public FlowStateResult(boolean z) {
        this.success = z;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final FlowStateResult putExtra(String str, Serializable serializable) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(serializable, "value");
        this.mExtraMap.put(str, serializable);
        return this;
    }

    public final Serializable getExtra(String str) {
        runAnimators.ag$a(str, StringSet.key);
        return this.mExtraMap.get(str);
    }
}
