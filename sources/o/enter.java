package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface enter {
    int HaptikSDK$a() default 1;

    int[] ag$a() default {};

    String ah$a() default "";

    String valueOf() default "";

    String values() default "";
}
