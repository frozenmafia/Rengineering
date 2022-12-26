package kotlin.io;

import com.sendbird.android.constant.StringSet;
import java.io.File;
import o.runAnimators;
/* loaded from: classes7.dex */
final class TerminateException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminateException(File file) {
        super(file, null, null, 6, null);
        runAnimators.ag$a(file, StringSet.file);
    }
}
