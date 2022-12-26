package o;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import o.AutoCloser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class lambda$delete$5<T, B> {
    abstract T HaptikSDK$c(B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int ag$a(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B ag$a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(B b2, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(T t, Writer writer) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(Object obj, B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean ag$a(AutoCloser.AnonymousClass2 anonymousClass2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ah$a(Object obj);

    abstract void ah$a(B b2, int i, int i2);

    abstract void ah$a(B b2, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ah$a(B b2, int i, ByteString byteString);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B toString(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void toString(T t, Writer writer) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void toString(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int valueOf(T t);

    abstract void valueOf(B b2, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T values(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T values(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag$a(B b2, AutoCloser.AnonymousClass2 anonymousClass2) throws IOException {
        int ag$a = anonymousClass2.ag$a();
        int ag$a2 = WireFormat.ag$a(ag$a);
        int values = WireFormat.values(ag$a);
        if (values == 0) {
            ag$a(b2, ag$a2, anonymousClass2.getSignupData());
            return true;
        } else if (values == 1) {
            ah$a((lambda$delete$5<T, B>) b2, ag$a2, anonymousClass2.invoke());
            return true;
        } else if (values == 2) {
            ah$a((lambda$delete$5<T, B>) b2, ag$a2, anonymousClass2.valueOf());
            return true;
        } else if (values != 3) {
            if (values != 4) {
                if (values == 5) {
                    ah$a((lambda$delete$5<T, B>) b2, ag$a2, anonymousClass2.ah$b());
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            return false;
        } else {
            B ag$a3 = ag$a();
            int valueOf = WireFormat.valueOf(ag$a2, 4);
            ah$a(ag$a3, anonymousClass2);
            if (valueOf != anonymousClass2.ag$a()) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            valueOf(b2, ag$a2, HaptikSDK$c(ag$a3));
            return true;
        }
    }

    final void ah$a(B b2, AutoCloser.AnonymousClass2 anonymousClass2) throws IOException {
        while (anonymousClass2.values() != Integer.MAX_VALUE && ag$a((lambda$delete$5<T, B>) b2, anonymousClass2)) {
        }
    }
}
