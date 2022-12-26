package o;

import o.processAppeared;
/* loaded from: classes7.dex */
final /* synthetic */ class saveOldPositions implements Runnable {
    private final processAppeared.toString ah$a;

    private saveOldPositions(processAppeared.toString tostring) {
        this.ah$a = tostring;
    }

    public static Runnable valueOf(processAppeared.toString tostring) {
        return new saveOldPositions(tostring);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ah$a.valueOf(null);
    }
}
