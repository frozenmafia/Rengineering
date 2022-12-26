package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class findSwapTargets implements startDrag {
    private static final findSwapTargets ah$a = new findSwapTargets();

    private findSwapTargets() {
    }

    public static findSwapTargets values() {
        return ah$a;
    }

    @Override // o.startDrag
    public boolean values(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // o.startDrag
    public onChildViewDetachedFromWindow valueOf(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (onChildViewDetachedFromWindow) GeneratedMessageLite.valueOf((Class<GeneratedMessageLite>) cls.asSubclass(GeneratedMessageLite.class)).isLogoutPending();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
