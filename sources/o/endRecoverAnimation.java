package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public class endRecoverAnimation {
    private static final ItemTouchHelper ah$a = ItemTouchHelper.ah$a();
    private ByteString ag$a;
    protected volatile ItemTouchHelper.AnonymousClass3 toString;
    private volatile ByteString valueOf;
    private ItemTouchHelper values;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof endRecoverAnimation) {
            endRecoverAnimation endrecoveranimation = (endRecoverAnimation) obj;
            ItemTouchHelper.AnonymousClass3 anonymousClass3 = this.toString;
            ItemTouchHelper.AnonymousClass3 anonymousClass32 = endrecoveranimation.toString;
            if (anonymousClass3 == null && anonymousClass32 == null) {
                return values().equals(endrecoveranimation.values());
            }
            if (anonymousClass3 == null || anonymousClass32 == null) {
                if (anonymousClass3 != null) {
                    return anonymousClass3.equals(endrecoveranimation.ag$a(anonymousClass3.a()));
                }
                return ag$a(anonymousClass32.a()).equals(anonymousClass32);
            }
            return anonymousClass3.equals(anonymousClass32);
        }
        return false;
    }

    public ItemTouchHelper.AnonymousClass3 ag$a(ItemTouchHelper.AnonymousClass3 anonymousClass3) {
        valueOf(anonymousClass3);
        return this.toString;
    }

    public ItemTouchHelper.AnonymousClass3 toString(ItemTouchHelper.AnonymousClass3 anonymousClass3) {
        ItemTouchHelper.AnonymousClass3 anonymousClass32 = this.toString;
        this.ag$a = null;
        this.valueOf = null;
        this.toString = anonymousClass3;
        return anonymousClass32;
    }

    public int ag$a() {
        if (this.valueOf != null) {
            return this.valueOf.size();
        }
        ByteString byteString = this.ag$a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.toString != null) {
            return this.toString.extraCallbackWithResult();
        }
        return 0;
    }

    public ByteString values() {
        if (this.valueOf != null) {
            return this.valueOf;
        }
        ByteString byteString = this.ag$a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.valueOf != null) {
                return this.valueOf;
            }
            if (this.toString == null) {
                this.valueOf = ByteString.EMPTY;
            } else {
                this.valueOf = this.toString.getInitSettings();
            }
            return this.valueOf;
        }
    }

    protected void valueOf(ItemTouchHelper.AnonymousClass3 anonymousClass3) {
        if (this.toString != null) {
            return;
        }
        synchronized (this) {
            if (this.toString != null) {
                return;
            }
            try {
                if (this.ag$a != null) {
                    this.toString = anonymousClass3.aj$a().ah$a(this.ag$a, this.values);
                    this.valueOf = this.ag$a;
                } else {
                    this.toString = anonymousClass3;
                    this.valueOf = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.toString = anonymousClass3;
                this.valueOf = ByteString.EMPTY;
            }
        }
    }
}
