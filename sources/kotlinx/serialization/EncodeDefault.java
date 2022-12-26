package kotlinx.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface EncodeDefault {

    /* loaded from: classes7.dex */
    public enum Mode {
        ALWAYS,
        NEVER
    }
}
