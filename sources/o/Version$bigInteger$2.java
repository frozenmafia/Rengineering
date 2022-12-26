package o;

import java.util.List;
import kotlinx.serialization.modules.SerializersModuleCollector$contextual$1;
import o.Styleable;
/* loaded from: classes5.dex */
public interface Version$bigInteger$2 {
    <Base> void ag$a(copyViewImage<Base> copyviewimage, Styleable.ChangeBounds<? super String, ? extends scheduleGracePeriodEnd<? extends Base>> changeBounds);

    <Base, Sub extends Base> void toString(copyViewImage<Base> copyviewimage, copyViewImage<Sub> copyviewimage2, containsItem<Sub> containsitem);

    <T> void valueOf(copyViewImage<T> copyviewimage, Styleable.ChangeBounds<? super List<? extends containsItem<?>>, ? extends containsItem<?>> changeBounds);

    <T> void values(copyViewImage<T> copyviewimage, containsItem<T> containsitem);

    /* loaded from: classes5.dex */
    public static final class valueOf {
        public static <T> void values(Version$bigInteger$2 version$bigInteger$2, copyViewImage<T> copyviewimage, containsItem<T> containsitem) {
            runAnimators.ag$a(version$bigInteger$2, "this");
            runAnimators.ag$a(copyviewimage, "kClass");
            runAnimators.ag$a(containsitem, "serializer");
            version$bigInteger$2.valueOf(copyviewimage, new SerializersModuleCollector$contextual$1(containsitem));
        }
    }
}
