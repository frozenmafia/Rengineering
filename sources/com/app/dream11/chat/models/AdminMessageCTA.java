package com.app.dream11.chat.models;

import o.runAnimators;
/* loaded from: classes.dex */
public final class AdminMessageCTA {
    private final String path;
    private final String text;

    public static /* synthetic */ AdminMessageCTA copy$default(AdminMessageCTA adminMessageCTA, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adminMessageCTA.text;
        }
        if ((i & 2) != 0) {
            str2 = adminMessageCTA.path;
        }
        return adminMessageCTA.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.path;
    }

    public final AdminMessageCTA copy(String str, String str2) {
        runAnimators.ag$a(str, "text");
        return new AdminMessageCTA(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdminMessageCTA) {
            AdminMessageCTA adminMessageCTA = (AdminMessageCTA) obj;
            return runAnimators.values((Object) this.text, (Object) adminMessageCTA.text) && runAnimators.values((Object) this.path, (Object) adminMessageCTA.path);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode();
        String str = this.path;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.text;
        String str2 = this.path;
        return "AdminMessageCTA(text=" + str + ", path=" + str2 + ")";
    }

    public AdminMessageCTA(String str, String str2) {
        runAnimators.ag$a(str, "text");
        this.text = str;
        this.path = str2;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getText() {
        return this.text;
    }
}
