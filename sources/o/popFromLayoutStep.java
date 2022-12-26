package o;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import o.ViewInfoStore;
/* loaded from: classes5.dex */
public class popFromLayoutStep {
    private static final containsPosition values = containsPosition.valueOf();
    private volatile ByteString ag$a;
    private ByteString ah$a;
    protected volatile ViewInfoStore.InfoRecord toString;
    private containsPosition valueOf;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof popFromLayoutStep) {
            popFromLayoutStep popfromlayoutstep = (popFromLayoutStep) obj;
            ViewInfoStore.InfoRecord infoRecord = this.toString;
            ViewInfoStore.InfoRecord infoRecord2 = popfromlayoutstep.toString;
            if (infoRecord == null && infoRecord2 == null) {
                return ah$a().equals(popfromlayoutstep.ah$a());
            }
            if (infoRecord == null || infoRecord2 == null) {
                if (infoRecord != null) {
                    return infoRecord.equals(popfromlayoutstep.values(infoRecord.getDefaultImpl()));
                }
                return values(infoRecord2.getDefaultImpl()).equals(infoRecord2);
            }
            return infoRecord.equals(infoRecord2);
        }
        return false;
    }

    public ViewInfoStore.InfoRecord values(ViewInfoStore.InfoRecord infoRecord) {
        toString(infoRecord);
        return this.toString;
    }

    public ViewInfoStore.InfoRecord ag$a(ViewInfoStore.InfoRecord infoRecord) {
        ViewInfoStore.InfoRecord infoRecord2 = this.toString;
        this.ah$a = null;
        this.ag$a = null;
        this.toString = infoRecord;
        return infoRecord2;
    }

    public int ag$a() {
        if (this.ag$a != null) {
            return this.ag$a.size();
        }
        ByteString byteString = this.ah$a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.toString != null) {
            return this.toString.ICustomTabsCallback$Stub();
        }
        return 0;
    }

    public ByteString ah$a() {
        if (this.ag$a != null) {
            return this.ag$a;
        }
        ByteString byteString = this.ah$a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.ag$a != null) {
                return this.ag$a;
            }
            if (this.toString == null) {
                this.ag$a = ByteString.EMPTY;
            } else {
                this.ag$a = this.toString.extraCallback();
            }
            return this.ag$a;
        }
    }

    protected void toString(ViewInfoStore.InfoRecord infoRecord) {
        if (this.toString != null) {
            return;
        }
        synchronized (this) {
            if (this.toString != null) {
                return;
            }
            try {
                if (this.ah$a != null) {
                    this.toString = infoRecord.asBinder().toString(this.ah$a, this.valueOf);
                    this.ag$a = this.ah$a;
                } else {
                    this.toString = infoRecord;
                    this.ag$a = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.toString = infoRecord;
                this.ag$a = ByteString.EMPTY;
            }
        }
    }
}
