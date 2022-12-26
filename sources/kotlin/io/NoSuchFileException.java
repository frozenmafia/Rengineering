package kotlin.io;

import com.sendbird.android.constant.StringSet;
import java.io.File;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class NoSuchFileException extends FileSystemException {
    public /* synthetic */ NoSuchFileException(File file, File file2, String str, int i, getTargetTypes gettargettypes) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSuchFileException(File file, File file2, String str) {
        super(file, file2, str);
        runAnimators.ag$a(file, StringSet.file);
    }
}
