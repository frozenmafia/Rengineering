package kotlin.text;

import com.sendbird.android.constant.StringSet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.getVisibilityChangeInfo;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements Styleable.ChangeBounds<getVisibilityChangeInfo, getVisibilityChangeInfo> {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    Regex$findAll$2() {
        super(1, getVisibilityChangeInfo.class, StringSet.next, "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final getVisibilityChangeInfo invoke(getVisibilityChangeInfo getvisibilitychangeinfo) {
        runAnimators.ag$a(getvisibilitychangeinfo, "p0");
        return getvisibilitychangeinfo.values();
    }
}
