package o;
/* loaded from: classes5.dex */
public final class getSeekBarIncrement implements getNextId {
    private final getNextId ah$a;
    private final getNextId valueOf;

    public getSeekBarIncrement(getNextId getnextid, getNextId getnextid2) {
        this.ah$a = getnextid;
        this.valueOf = getnextid2;
    }

    @Override // o.getNextId
    public final /* synthetic */ Object valueOf() {
        return new getShowSeekBarValue(((resetState) this.ah$a).ag$a(), (isAdjustable) this.valueOf.valueOf());
    }
}
