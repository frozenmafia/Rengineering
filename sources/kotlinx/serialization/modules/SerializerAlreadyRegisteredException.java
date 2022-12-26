package kotlinx.serialization.modules;

import androidx.core.app.NotificationCompat;
import o.copyViewImage;
import o.runAnimators;
/* loaded from: classes8.dex */
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String str) {
        super(str);
        runAnimators.ag$a(str, NotificationCompat.CATEGORY_MESSAGE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(copyViewImage<?> copyviewimage, copyViewImage<?> copyviewimage2) {
        this("Serializer for " + copyviewimage2 + " already registered in the scope of " + copyviewimage);
        runAnimators.ag$a(copyviewimage, "baseClass");
        runAnimators.ag$a(copyviewimage2, "concreteClass");
    }
}
