package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@ChangeImageTransform
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface centerCropMatrix {
    String values() default "";
}
