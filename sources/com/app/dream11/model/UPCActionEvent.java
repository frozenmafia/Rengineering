package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes.dex */
public final class UPCActionEvent {
    private final String name;

    public static /* synthetic */ UPCActionEvent copy$default(UPCActionEvent uPCActionEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uPCActionEvent.name;
        }
        return uPCActionEvent.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final UPCActionEvent copy(String str) {
        runAnimators.ag$a(str, "name");
        return new UPCActionEvent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UPCActionEvent) && runAnimators.values((Object) this.name, (Object) ((UPCActionEvent) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        String str = this.name;
        return "UPCActionEvent(name=" + str + ")";
    }

    public UPCActionEvent(String str) {
        runAnimators.ag$a(str, "name");
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }
}
