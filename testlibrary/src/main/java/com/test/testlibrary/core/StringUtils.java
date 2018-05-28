package com.test.testlibrary.core;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by SewonKim on 2018. 5. 28..
 */

public class StringUtils {

    public static void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
