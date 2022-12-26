package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface ChangeImageTransform {

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @createMatrixAnimator
    /* renamed from: o.ChangeImageTransform$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public @interface AnonymousClass1 {
    }

    /* renamed from: o.ChangeImageTransform$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public interface AnonymousClass3<R> {
    }

    /* renamed from: o.ChangeImageTransform$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass2 {
        public static final String ah$a(Throwable th) {
            runAnimators.ag$a(th, "<this>");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            runAnimators.ah$a(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        public static final void toString(Throwable th, Throwable th2) {
            runAnimators.ag$a(th, "<this>");
            runAnimators.ag$a(th2, "exception");
            if (th != th2) {
                SidePropagation.ah$a.ah$a(th, th2);
            }
        }
    }
}
