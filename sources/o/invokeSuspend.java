package o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* loaded from: classes3.dex */
public interface invokeSuspend<T> {

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.invokeSuspend$lambda-0  reason: invalid class name */
    /* loaded from: classes.dex */
    public @interface lambda0 {
        String ah$a();

        boolean valueOf() default false;
    }

    /* loaded from: classes3.dex */
    public interface toString<T> {
        void values(Exception exc);

        void values(T t);
    }

    Class<T> ag$a();

    DataSource ah$a();

    void valueOf();

    void valueOf(Priority priority, toString<? super T> tostring);

    void values();
}
