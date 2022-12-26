package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class setTransactionExecutor {
    public static void ah$a(Context context) {
        if (ag$a(context)) {
            return;
        }
        ArrayList<File> settransactionexecutor = toString(context);
        File values = values(settransactionexecutor);
        if (values == null) {
            Log.v("AsyncStorageExpoMigration", "No scoped database found");
            return;
        }
        try {
            addMigration.valueOf(context).ah$b();
            ah$a(new FileInputStream(values), new FileOutputStream(context.getDatabasePath("RKStorage")));
            Log.v("AsyncStorageExpoMigration", "Migrated most recently modified database " + values.getName() + " to RKStorage");
            try {
                Iterator<File> it = settransactionexecutor.iterator();
                while (it.hasNext()) {
                    File next = it.next();
                    if (next.delete()) {
                        Log.v("AsyncStorageExpoMigration", "Deleted scoped database " + next.getName());
                    } else {
                        Log.v("AsyncStorageExpoMigration", "Failed to delete scoped database " + next.getName());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.v("AsyncStorageExpoMigration", "Completed the scoped AsyncStorage migration");
        } catch (Exception e2) {
            Log.v("AsyncStorageExpoMigration", "Failed to migrate scoped database " + values.getName());
            e2.printStackTrace();
        }
    }

    private static boolean ag$a(Context context) {
        return context.getDatabasePath("RKStorage").exists();
    }

    private static ArrayList<File> toString(Context context) {
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File[] listFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private static File values(ArrayList<File> arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        long j = -1;
        Iterator<File> it = arrayList.iterator();
        while (it.hasNext()) {
            File next = it.next();
            long ag$a = ag$a(next);
            if (ag$a > j) {
                file = next;
                j = ag$a;
            }
        }
        return file != null ? file : arrayList.get(0);
    }

    private static long ag$a(File file) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return ah$a(file);
            }
            return file.lastModified();
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    private static long ah$a(File file) {
        try {
            return Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static void ah$a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                fileChannel2 = fileOutputStream.getChannel();
                channel.transferTo(0L, channel.size(), fileChannel2);
                if (channel != null) {
                    try {
                        channel.close();
                    } finally {
                        if (fileChannel2 != null) {
                            fileChannel2.close();
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                if (fileChannel2 != null) {
                    try {
                        fileChannel2.close();
                    } finally {
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }
}
