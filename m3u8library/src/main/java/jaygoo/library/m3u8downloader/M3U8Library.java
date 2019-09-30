package jaygoo.library.m3u8downloader;

import android.content.Context;
import android.os.Environment;

import java.io.File;

import jaygoo.library.m3u8downloader.server.M3U8HttpServer;

/**
 * @author huangyong
 * createTime 2019-09-27
 */
public class M3U8Library {

    public static final String EVENT_REFRESH = "acton_refresh";
    public static String dirPath = Environment.getExternalStorageDirectory().getPath() + File.separator + "M3u8Downloader";

    public static Context getContext() {
        return context;
    }

    public static Context context;

    public static void init(Context contexts) {

        context = contexts;

        M3U8DownloaderConfig
                .build(contexts)
                .setSaveDir(dirPath)
                .setDebugMode(true);
    }
}
