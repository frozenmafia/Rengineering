package o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class setListenerInternal implements getDescendants {
    private static final WindowInsetsControllerCompat.Impl23<Class<?>, byte[]> ag$a = new WindowInsetsControllerCompat.Impl23<>(50);
    private final ViewGroupKt$iterator$1<?> HaptikSDK$a;
    private final setMargins HaptikSDK$b;
    private final int HaptikSDK$c;
    private final Class<?> ah$a;
    private final getDescendants ah$b;
    private final getDescendants invoke;
    private final rotationXBy toString;
    private final int values;

    public setListenerInternal(rotationXBy rotationxby, getDescendants getdescendants, getDescendants getdescendants2, int i, int i2, ViewGroupKt$iterator$1<?> viewGroupKt$iterator$1, Class<?> cls, setMargins setmargins) {
        this.toString = rotationxby;
        this.ah$b = getdescendants;
        this.invoke = getdescendants2;
        this.HaptikSDK$c = i;
        this.values = i2;
        this.HaptikSDK$a = viewGroupKt$iterator$1;
        this.ah$a = cls;
        this.HaptikSDK$b = setmargins;
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        if (obj instanceof setListenerInternal) {
            setListenerInternal setlistenerinternal = (setListenerInternal) obj;
            if (this.values == setlistenerinternal.values && this.HaptikSDK$c == setlistenerinternal.HaptikSDK$c && WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(this.HaptikSDK$a, setlistenerinternal.HaptikSDK$a) && this.ah$a.equals(setlistenerinternal.ah$a) && this.ah$b.equals(setlistenerinternal.ah$b) && this.invoke.equals(setlistenerinternal.invoke) && this.HaptikSDK$b.equals(setlistenerinternal.HaptikSDK$b)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.getDescendants
    public int hashCode() {
        int hashCode = this.ah$b.hashCode();
        int hashCode2 = (((((hashCode * 31) + this.invoke.hashCode()) * 31) + this.HaptikSDK$c) * 31) + this.values;
        ViewGroupKt$iterator$1<?> viewGroupKt$iterator$1 = this.HaptikSDK$a;
        if (viewGroupKt$iterator$1 != null) {
            hashCode2 = (hashCode2 * 31) + viewGroupKt$iterator$1.hashCode();
        }
        return (((hashCode2 * 31) + this.ah$a.hashCode()) * 31) + this.HaptikSDK$b.hashCode();
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.toString.toString(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.HaptikSDK$c).putInt(this.values).array();
        this.invoke.ag$a(messageDigest);
        this.ah$b.ag$a(messageDigest);
        messageDigest.update(bArr);
        ViewGroupKt$iterator$1<?> viewGroupKt$iterator$1 = this.HaptikSDK$a;
        if (viewGroupKt$iterator$1 != null) {
            viewGroupKt$iterator$1.ag$a(messageDigest);
        }
        this.HaptikSDK$b.ag$a(messageDigest);
        messageDigest.update(ah$a());
        this.toString.ag$a(bArr);
    }

    private byte[] ah$a() {
        WindowInsetsControllerCompat.Impl23<Class<?>, byte[]> impl23 = ag$a;
        byte[] valueOf = impl23.valueOf((WindowInsetsControllerCompat.Impl23<Class<?>, byte[]>) this.ah$a);
        if (valueOf == null) {
            byte[] bytes = this.ah$a.getName().getBytes(valueOf);
            impl23.ag$a(this.ah$a, bytes);
            return bytes;
        }
        return valueOf;
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.ah$b + ", signature=" + this.invoke + ", width=" + this.HaptikSDK$c + ", height=" + this.values + ", decodedResourceClass=" + this.ah$a + ", transformation='" + this.HaptikSDK$a + "', options=" + this.HaptikSDK$b + '}';
    }
}
