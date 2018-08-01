package com.example.lado.algorithmsanddatastructurechaetsheet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

import java.util.Set;

public class Example extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);

        WebView webview = (WebView) findViewById(R.id.webView);

        //your string code
        String code =
                "public class BinarySearch { \n" +

            "       public static int indexOf(int[] a, int key) {\n" +
            "           int lo = 0;\n" +
            "           int hi = a.length - 1;\n" +
            "           while (lo <= hi) {\n" +
            "           // Key is in a[lo..hi] or not present.\n" +
            "           int mid = lo + (hi - lo) / 2;\n" +
            "           if      (key < a[mid]) hi = mid - 1;\n" +
            "           else if (key > a[mid]) lo = mid + 1;\n" +
            "               else return mid;\n" +
            "           }\n" +
            "           return -1;\n" +
            "       }\n" +
                "\n" +
        "       @Deprecated\n" +
        "       public static int rank(int key, int[] a) {\n" +
        "           return indexOf(a, key);\n" +
        "       }\n"+
        "\n" +
        "       public static void main(String[] args) {\n" +
        "\n" +
        "           // read the integers from a file\n" +
        "           In in = new In(args[0]);\n" +
        "           int[] whitelist = in.readAllInts();\n"+
        "\n" +
        "           // sort the array\n" +
        "           Arrays.sort(whitelist);\n" +
        "\n" +
        "           // read integer key from standard input; print if not in whitelist\n"+
        "           while (!StdIn.isEmpty()) {\n" +
        "               int key = StdIn.readInt();\n" +
        "               if (BinarySearch.indexOf(whitelist, key) == -1)\n" +
        "                   StdOut.println(key);\n" +
        "           }\n" +
        "       }\n" +
        "}\n";

        Codeview.with(getApplicationContext())
                .setHtmlHeadContent("<style> table,tr,td {" +
                        " border: 1px solid black;" +
                        " }" +
                        "" +
                        "</style>")
                .withHtml("<h1>BinarySearch</h1>")
                .withCode(code)
                .setStyle(Settings.WithStyle.IDEA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
    }
}
