package com.app.dream11.chat.reaction;

import com.sendbird.android.constant.StringSet;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ReactionTabVM {
    private final int count;
    private final int drawable;
    private final String key;

    public static /* synthetic */ ReactionTabVM copy$default(ReactionTabVM reactionTabVM, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = reactionTabVM.key;
        }
        if ((i3 & 2) != 0) {
            i = reactionTabVM.drawable;
        }
        if ((i3 & 4) != 0) {
            i2 = reactionTabVM.count;
        }
        return reactionTabVM.copy(str, i, i2);
    }

    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.drawable;
    }

    public final int component3() {
        return this.count;
    }

    public final ReactionTabVM copy(String str, int i, int i2) {
        runAnimators.ag$a(str, StringSet.key);
        return new ReactionTabVM(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactionTabVM) {
            ReactionTabVM reactionTabVM = (ReactionTabVM) obj;
            return runAnimators.values((Object) this.key, (Object) reactionTabVM.key) && this.drawable == reactionTabVM.drawable && this.count == reactionTabVM.count;
        }
        return false;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.drawable) * 31) + this.count;
    }

    public String toString() {
        String str = this.key;
        int i = this.drawable;
        int i2 = this.count;
        return "ReactionTabVM(key=" + str + ", drawable=" + i + ", count=" + i2 + ")";
    }

    public ReactionTabVM(String str, int i, int i2) {
        runAnimators.ag$a(str, StringSet.key);
        this.key = str;
        this.drawable = i;
        this.count = i2;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDrawable() {
        return this.drawable;
    }

    public final String getKey() {
        return this.key;
    }
}
