package com.app.dream11.chat.models;
/* loaded from: classes.dex */
public final class MessageLongClickOptions {
    private final boolean shouldShowCopy;
    private final boolean shouldShowReply;
    private final boolean shouldShowReport;
    private final boolean shouldShowUseTeam;

    public static /* synthetic */ MessageLongClickOptions copy$default(MessageLongClickOptions messageLongClickOptions, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messageLongClickOptions.shouldShowReply;
        }
        if ((i & 2) != 0) {
            z2 = messageLongClickOptions.shouldShowCopy;
        }
        if ((i & 4) != 0) {
            z3 = messageLongClickOptions.shouldShowReport;
        }
        if ((i & 8) != 0) {
            z4 = messageLongClickOptions.shouldShowUseTeam;
        }
        return messageLongClickOptions.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.shouldShowReply;
    }

    public final boolean component2() {
        return this.shouldShowCopy;
    }

    public final boolean component3() {
        return this.shouldShowReport;
    }

    public final boolean component4() {
        return this.shouldShowUseTeam;
    }

    public final MessageLongClickOptions copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new MessageLongClickOptions(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageLongClickOptions) {
            MessageLongClickOptions messageLongClickOptions = (MessageLongClickOptions) obj;
            return this.shouldShowReply == messageLongClickOptions.shouldShowReply && this.shouldShowCopy == messageLongClickOptions.shouldShowCopy && this.shouldShowReport == messageLongClickOptions.shouldShowReport && this.shouldShowUseTeam == messageLongClickOptions.shouldShowUseTeam;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.shouldShowReply;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.shouldShowCopy;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        ?? r3 = this.shouldShowReport;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        boolean z2 = this.shouldShowUseTeam;
        return (((((r0 * 31) + i) * 31) + i2) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.shouldShowReply;
        boolean z2 = this.shouldShowCopy;
        boolean z3 = this.shouldShowReport;
        boolean z4 = this.shouldShowUseTeam;
        return "MessageLongClickOptions(shouldShowReply=" + z + ", shouldShowCopy=" + z2 + ", shouldShowReport=" + z3 + ", shouldShowUseTeam=" + z4 + ")";
    }

    public MessageLongClickOptions(boolean z, boolean z2, boolean z3, boolean z4) {
        this.shouldShowReply = z;
        this.shouldShowCopy = z2;
        this.shouldShowReport = z3;
        this.shouldShowUseTeam = z4;
    }

    public final boolean getShouldShowReply() {
        return this.shouldShowReply;
    }

    public final boolean getShouldShowCopy() {
        return this.shouldShowCopy;
    }

    public final boolean getShouldShowReport() {
        return this.shouldShowReport;
    }

    public final boolean getShouldShowUseTeam() {
        return this.shouldShowUseTeam;
    }
}
