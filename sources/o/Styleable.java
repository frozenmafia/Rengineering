package o;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import o.ChangeImageTransform;
import o.Slide;
/* loaded from: classes7.dex */
public final class Styleable {

    /* loaded from: classes.dex */
    public interface ArcMotion<R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke();
    }

    /* loaded from: classes.dex */
    public interface ChangeBounds<P1, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1);
    }

    /* loaded from: classes5.dex */
    public interface Fade<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11);
    }

    /* loaded from: classes5.dex */
    public interface PatternPathMotion<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10);
    }

    /* loaded from: classes5.dex */
    public interface Slide<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12);
    }

    /* loaded from: classes5.dex */
    public interface Transition<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13);
    }

    /* loaded from: classes5.dex */
    public interface TransitionManager<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16);
    }

    /* loaded from: classes5.dex */
    public interface TransitionSet<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15);
    }

    /* loaded from: classes5.dex */
    public interface TransitionTarget<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14);
    }

    /* loaded from: classes5.dex */
    public interface VisibilityTransition<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> extends ChangeImageTransform.AnonymousClass3<R> {
        R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16, P17 p17, P18 p18);
    }

    /* loaded from: classes5.dex */
    public final class ChangeTransform {
        public static final <T> Class<T> ah$a(copyViewImage<T> copyviewimage) {
            runAnimators.ag$a(copyviewimage, "<this>");
            Class<T> cls = (Class<T>) ((getMatchedTransitionValues) copyviewimage).valueOf();
            runAnimators.values((Object) cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            return cls;
        }

        public static final <T> Class<T> valueOf(copyViewImage<T> copyviewimage) {
            runAnimators.ag$a(copyviewimage, "<this>");
            Class<T> cls = (Class<T>) ((getMatchedTransitionValues) copyviewimage).valueOf();
            if (!cls.isPrimitive()) {
                runAnimators.values((Object) cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
                return cls;
            }
            String name = cls.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            cls = (Class<T>) Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            cls = (Class<T>) Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            cls = (Class<T>) Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            cls = (Class<T>) Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            cls = (Class<T>) Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            cls = (Class<T>) Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            cls = (Class<T>) Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            cls = (Class<T>) Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            cls = (Class<T>) Short.class;
                            break;
                        }
                        break;
                }
            }
            runAnimators.values((Object) cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
    }

    public static final Object toString(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            runAnimators.ah$a(readAttributes, "readAttributes(this, A::class.java, *options)");
            return readAttributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean ag$a(Slide.CalculateSlideHorizontal calculateSlideHorizontal) {
        for (Slide.CalculateSlideHorizontal valueOf = calculateSlideHorizontal.valueOf(); valueOf != null; valueOf = valueOf.valueOf()) {
            if (valueOf.ag$a() != null && calculateSlideHorizontal.ag$a() != null) {
                if (runAnimators.values(valueOf.ag$a(), calculateSlideHorizontal.ag$a())) {
                    return true;
                }
            } else {
                try {
                    if (Files.isSameFile(valueOf.ah$a(), calculateSlideHorizontal.ah$a())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
