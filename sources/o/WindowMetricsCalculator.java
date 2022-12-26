package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface WindowMetricsCalculator {

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.WindowMetricsCalculator$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public @interface CC {
        String ag$a() default "";
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Companion {
        String valueOf() default "";
    }

    String ah$a() default "";
}
