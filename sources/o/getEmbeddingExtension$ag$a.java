package o;

import com.sendbird.android.constant.StringSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class getEmbeddingExtension$ag$a {
    private getEmbeddingExtension$ag$a() {
    }

    public /* synthetic */ getEmbeddingExtension$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    /* loaded from: classes5.dex */
    static final class valueOf implements getEmbeddingExtension {
        public String toString() {
            return "FileSystem.SYSTEM";
        }

        @Override // o.getEmbeddingExtension
        public EmptyDecorator HaptikSDK$b(File file) throws FileNotFoundException {
            runAnimators.ag$a(file, StringSet.file);
            return parseSplitXml.toString(file);
        }

        @Override // o.getEmbeddingExtension
        public safeInsetBottom ag$a(File file) throws FileNotFoundException {
            runAnimators.ag$a(file, StringSet.file);
            try {
                return parseSplitXml.values(file, false, 1, null);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return parseSplitXml.values(file, false, 1, null);
            }
        }

        @Override // o.getEmbeddingExtension
        public safeInsetBottom values(File file) throws FileNotFoundException {
            runAnimators.ag$a(file, StringSet.file);
            try {
                return parseSplitXml.ag$a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return parseSplitXml.ag$a(file);
            }
        }

        @Override // o.getEmbeddingExtension
        public void ah$a(File file) throws IOException {
            runAnimators.ag$a(file, StringSet.file);
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // o.getEmbeddingExtension
        public boolean valueOf(File file) {
            runAnimators.ag$a(file, StringSet.file);
            return file.exists();
        }

        @Override // o.getEmbeddingExtension
        public long HaptikSDK$a(File file) {
            runAnimators.ag$a(file, StringSet.file);
            return file.length();
        }

        @Override // o.getEmbeddingExtension
        public void ag$a(File file, File file2) throws IOException {
            runAnimators.ag$a(file, "from");
            runAnimators.ag$a(file2, "to");
            ah$a(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // o.getEmbeddingExtension
        public void toString(File file) throws IOException {
            runAnimators.ag$a(file, "directory");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                runAnimators.ah$a(file2, StringSet.file);
                if (file2.isDirectory()) {
                    toString(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }
    }
}
