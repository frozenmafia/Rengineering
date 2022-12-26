package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class getSwipeEscapeVelocity<T, B> {
    abstract T HaptikSDK$b(B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B ag$a(Object obj);

    abstract void ag$a(B b2, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(B b2, int i, ByteString byteString);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(Object obj, B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T ah$a(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T ah$a(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean ah$a(chooseDropTarget choosedroptarget);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int toString(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void toString(T t, Writer writer) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int valueOf(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B valueOf();

    abstract void valueOf(B b2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void valueOf(B b2, int i, long j);

    abstract void valueOf(B b2, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void valueOf(T t, Writer writer) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void valueOf(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void values(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag$a(B b2, chooseDropTarget choosedroptarget) throws IOException {
        int valueOf = choosedroptarget.valueOf();
        int wireFormat = WireFormat.toString(valueOf);
        int valueOf2 = WireFormat.valueOf(valueOf);
        if (valueOf2 == 0) {
            valueOf((getSwipeEscapeVelocity<T, B>) b2, wireFormat, choosedroptarget.getSignupData());
            return true;
        } else if (valueOf2 == 1) {
            ag$a((getSwipeEscapeVelocity<T, B>) b2, wireFormat, choosedroptarget.invoke());
            return true;
        } else if (valueOf2 == 2) {
            ag$a((getSwipeEscapeVelocity<T, B>) b2, wireFormat, choosedroptarget.ah$a());
            return true;
        } else if (valueOf2 != 3) {
            if (valueOf2 != 4) {
                if (valueOf2 == 5) {
                    valueOf((getSwipeEscapeVelocity<T, B>) b2, wireFormat, choosedroptarget.HaptikSDK$c());
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            return false;
        } else {
            B valueOf3 = valueOf();
            int valueOf4 = WireFormat.valueOf(wireFormat, 4);
            toString((getSwipeEscapeVelocity<T, B>) valueOf3, choosedroptarget);
            if (valueOf4 != choosedroptarget.valueOf()) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            valueOf((getSwipeEscapeVelocity<T, B>) b2, wireFormat, (int) HaptikSDK$b(valueOf3));
            return true;
        }
    }

    final void toString(B b2, chooseDropTarget choosedroptarget) throws IOException {
        while (choosedroptarget.ag$a() != Integer.MAX_VALUE && ag$a((getSwipeEscapeVelocity<T, B>) b2, choosedroptarget)) {
        }
    }
}
