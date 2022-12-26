package o;

import o.applyPendingUpdatesToPosition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class applyPendingUpdatesToPosition$ah$b extends applyPendingUpdatesToPosition.valueOf {
    static final applyPendingUpdatesToPosition$ah$b valueOf = new applyPendingUpdatesToPosition$ah$b();

    @Override // o.applyPendingUpdatesToPosition
    public boolean ag$a(char c) {
        return false;
    }

    private applyPendingUpdatesToPosition$ah$b() {
        super("CharMatcher.none()");
    }

    @Override // o.applyPendingUpdatesToPosition
    public int toString(CharSequence charSequence, int i) {
        markViewHoldersUpdated.toString(i, charSequence.length(), "index");
        return -1;
    }

    @Override // o.applyPendingUpdatesToPosition
    public boolean valueOf(CharSequence charSequence) {
        return charSequence.length() == 0;
    }
}
