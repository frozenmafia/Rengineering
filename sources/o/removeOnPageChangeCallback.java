package o;

import kotlinx.serialization.SerializationException;
/* loaded from: classes5.dex */
public final class removeOnPageChangeCallback {
    public static final Void values(String str, copyViewImage<?> copyviewimage) {
        String str2;
        runAnimators.ag$a(copyviewimage, "baseClass");
        String str3 = "in the scope of '" + ((Object) copyviewimage.HaptikSDK$a()) + '\'';
        if (str == null) {
            str2 = runAnimators.values("Class discriminator was missing and no default polymorphic serializers were registered ", (Object) str3);
        } else {
            str2 = "Class '" + ((Object) str) + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(str2);
    }
}
