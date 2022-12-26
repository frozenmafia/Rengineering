package com.appsamurai.storyly.analytics;

import java.util.List;
import o.reserveEndViewTransition;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum b uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a O;
    public static final /* synthetic */ a[] P;

    /* renamed from: b  reason: collision with root package name */
    public static final a f85b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f86o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public final List<StorylyEvent> a;

    static {
        StorylyEvent storylyEvent = StorylyEvent.StoryGroupOpened;
        a aVar = new a("Selected", 0, reserveEndViewTransition.valueOf(storylyEvent, StorylyEvent.StoryGroupUserOpened));
        f85b = aVar;
        a aVar2 = new a("DeepLinkOpened", 1, reserveEndViewTransition.valueOf(storylyEvent, StorylyEvent.StoryGroupDeepLinkOpened));
        c = aVar2;
        a aVar3 = new a("ProgrammaticallySelected", 2, reserveEndViewTransition.valueOf(storylyEvent, StorylyEvent.StoryGroupProgrammaticallyOpened));
        d = aVar3;
        a aVar4 = new a("GroupComplete", 3, reserveEndViewTransition.ag$a(StorylyEvent.StoryGroupCompleted));
        e = aVar4;
        a aVar5 = new a("LastGroupCompleted", 4, null);
        f = aVar5;
        a aVar6 = new a("PreviousSwiped", 5, reserveEndViewTransition.ag$a(StorylyEvent.StoryGroupPreviousSwiped));
        g = aVar6;
        a aVar7 = new a("NextSwiped", 6, reserveEndViewTransition.ag$a(StorylyEvent.StoryGroupNextSwiped));
        h = aVar7;
        StorylyEvent storylyEvent2 = StorylyEvent.StoryGroupClosed;
        a aVar8 = new a("Dismissed", 7, reserveEndViewTransition.ag$a(storylyEvent2));
        i = aVar8;
        a aVar9 = new a("Closed", 8, reserveEndViewTransition.ag$a(storylyEvent2));
        j = aVar9;
        a aVar10 = new a("Impression", 9, reserveEndViewTransition.ag$a(StorylyEvent.StoryImpression));
        k = aVar10;
        a aVar11 = new a("Viewed", 10, reserveEndViewTransition.ag$a(StorylyEvent.StoryViewed));
        l = aVar11;
        a aVar12 = new a("Complete", 11, reserveEndViewTransition.ag$a(StorylyEvent.StoryCompleted));
        m = aVar12;
        a aVar13 = new a("PreviousClicked", 12, reserveEndViewTransition.ag$a(StorylyEvent.StoryPreviousClicked));
        n = aVar13;
        a aVar14 = new a("NextClicked", 13, reserveEndViewTransition.ag$a(StorylyEvent.StoryNextClicked));
        f86o = aVar14;
        a aVar15 = new a("Paused", 14, reserveEndViewTransition.ag$a(StorylyEvent.StoryPaused));
        p = aVar15;
        a aVar16 = new a("Resumed", 15, reserveEndViewTransition.ag$a(StorylyEvent.StoryResumed));
        q = aVar16;
        a aVar17 = new a("LoadFailed", 16, null);
        r = aVar17;
        a aVar18 = new a("LinkShared", 17, reserveEndViewTransition.ag$a(StorylyEvent.StoryShared));
        s = aVar18;
        a aVar19 = new a("ActionClicked", 18, reserveEndViewTransition.ag$a(StorylyEvent.StoryCTAClicked));
        t = aVar19;
        a aVar20 = new a("ReactionClicked", 19, reserveEndViewTransition.ag$a(StorylyEvent.StoryEmojiClicked));
        u = aVar20;
        a aVar21 = new a("PollSelected", 20, reserveEndViewTransition.ag$a(StorylyEvent.StoryPollAnswered));
        v = aVar21;
        a aVar22 = new a("QuizAnswered", 21, reserveEndViewTransition.ag$a(StorylyEvent.StoryQuizAnswered));
        w = aVar22;
        a aVar23 = new a("CountdownReminderAdded", 22, reserveEndViewTransition.ag$a(StorylyEvent.StoryCountdownReminderAdded));
        x = aVar23;
        a aVar24 = new a("CountdownReminderRemoved", 23, reserveEndViewTransition.ag$a(StorylyEvent.StoryCountdownReminderRemoved));
        y = aVar24;
        a aVar25 = new a("Rated", 24, reserveEndViewTransition.ag$a(StorylyEvent.StoryRated));
        z = aVar25;
        a aVar26 = new a("InteractiveImpression", 25, reserveEndViewTransition.ag$a(StorylyEvent.StoryInteractiveImpression));
        A = aVar26;
        a aVar27 = new a("ProductTagExpanded", 26, reserveEndViewTransition.ag$a(StorylyEvent.StoryProductTagExpanded));
        B = aVar27;
        a aVar28 = new a("ProductTagClicked", 27, reserveEndViewTransition.ag$a(StorylyEvent.StoryProductTagClicked));
        C = aVar28;
        a aVar29 = new a("PromoCodeCopied", 28, reserveEndViewTransition.ag$a(StorylyEvent.StoryPromoCodeCopied));
        D = aVar29;
        a aVar30 = new a("CommentSent", 29, reserveEndViewTransition.ag$a(StorylyEvent.StoryCommentSent));
        E = aVar30;
        a aVar31 = new a("CommentInputFocus", 30, reserveEndViewTransition.ag$a(StorylyEvent.StoryCommentInputOpened));
        F = aVar31;
        a aVar32 = new a("CommentInputFocusClear", 31, reserveEndViewTransition.ag$a(StorylyEvent.StoryCommentInputClosed));
        G = aVar32;
        a aVar33 = new a("IVodSeeked", 32, reserveEndViewTransition.ag$a(StorylyEvent.StoryIVodSeeked));
        H = aVar33;
        a aVar34 = new a("IVodReplayButtonClicked", 33, reserveEndViewTransition.ag$a(StorylyEvent.StoryIVodReplayed));
        I = aVar34;
        a aVar35 = new a("OnScreen", 34, null);
        J = aVar35;
        a aVar36 = new a("ApiLoadFailed", 35, null);
        K = aVar36;
        a aVar37 = new a("ParseFailed", 36, null);
        L = aVar37;
        a aVar38 = new a("ExternalDataSet", 37, null);
        M = aVar38;
        a aVar39 = new a("Liked", 38, reserveEndViewTransition.ag$a(StorylyEvent.StoryLiked));
        N = aVar39;
        a aVar40 = new a("Unliked", 39, reserveEndViewTransition.ag$a(StorylyEvent.StoryUnliked));
        O = aVar40;
        P = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40};
    }

    public a(String str, int i2, List list) {
        this.a = list;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) P.clone();
    }
}
