package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface WindowInfoTrackerImpl {

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Companion {
        String ag$a() default "";
    }
}
