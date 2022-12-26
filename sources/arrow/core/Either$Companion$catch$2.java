package arrow.core;

import kotlin.jvm.internal.FunctionReference;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.runAnimators;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class Either$Companion$catch$2 extends FunctionReference implements Styleable.ChangeBounds<Throwable, Throwable> {
    public static final Either$Companion$catch$2 INSTANCE = new Either$Companion$catch$2();

    Either$Companion$catch$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return HTTP.IDENTITY_CODING;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return setPropagation.values(IPostMessageService.class, "arrow-core-data");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
    }

    @Override // o.Styleable.ChangeBounds
    public final Throwable invoke(Throwable th) {
        runAnimators.valueOf(th, "p1");
        return (Throwable) IPostMessageService.toString(th);
    }
}
