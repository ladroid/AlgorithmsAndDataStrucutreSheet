package com.example.lado.algorithmsanddatastructurechaetsheet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;

public class InternetSelectionSort extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internetselectionsort);

        CodeView codeView = (CodeView) findViewById(R.id.code_view);

        //your string code
        String code =
                        "class SelectionSort\n" +
                        "{\n" +
                        "    void sort(int arr[])\n" +
                        "    {\n" +
                        "        int n = arr.length;\n" +
                        " \n" +
                        "        // One by one move boundary of unsorted subarray\n" +
                        "        for (int i = 0; i < n-1; i++)\n" +
                        "        {\n" +
                        "            // Find the minimum element in unsorted array\n" +
                        "            int min_idx = i;\n" +
                        "            for (int j = i+1; j < n; j++)\n" +
                        "                if (arr[j] < arr[min_idx])\n" +
                        "                    min_idx = j;\n" +
                        " \n" +
                        "            // Swap the found minimum element with the first\n" +
                        "            // element\n" +
                        "            int temp = arr[min_idx];\n" +
                        "            arr[min_idx] = arr[i];\n" +
                        "            arr[i] = temp;\n" +
                        "        }\n" +
                        "    }\n" +
                        " \n" +
                        "    // Prints the array\n" +
                        "    void printArray(int arr[])\n" +
                        "    {\n" +
                        "        int n = arr.length;\n" +
                        "        for (int i=0; i<n; ++i)\n" +
                        "            System.out.print(arr[i]+\" \");\n" +
                        "        System.out.println();\n" +
                        "    }\n" +
                        " \n" +
                        "    // Driver code to test above\n" +
                        "    public static void main(String args[])\n" +
                        "    {\n" +
                        "        SelectionSort ob = new SelectionSort();\n" +
                        "        int arr[] = {64,25,12,22,11};\n" +
                        "        ob.sort(arr);\n" +
                        "        System.out.println(\"Sorted array\");\n" +
                        "        ob.printArray(arr);\n" +
                        "    }\n" +
                        "}";

        codeView.setOptions(Options.Default.get(this)
                .withLanguage("java")
                .withCode(code)
                .withTheme(ColorTheme.SOLARIZED_LIGHT));
    }
}
