package com.example.lado.algorithmsanddatastructurechaetsheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unnamed.b.atv.model.TreeNode;
import com.unnamed.b.atv.view.AndroidTreeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup containerView = (ViewGroup) findViewById(R.id.container);

        TreeNode root = TreeNode.root();
        TreeNode parent1 = new TreeNode("Book1");
            TreeNode child0 = new TreeNode("    Fundamentals");
                TreeNode childOf00 = new TreeNode("         BinarySearch");
                TreeNode childOf01 = new TreeNode("         Example");

        TreeNode child1 = new TreeNode("ChildNode1");

        TreeNode parent2 = new TreeNode("Internet");
            TreeNode childb0 = new TreeNode("    Fundamentals");
                TreeNode childOfb00 = new TreeNode("         Selection Sort");
                TreeNode childOfb01 = new TreeNode("         Example");
        TreeNode childb1 = new TreeNode("ChildNode1");

        child0.addChildren(childOf00, childOf01);
        parent1.addChildren(child0, child1);


        childb0.addChildren(childOfb00, childOfb01);
        parent2.addChildren(childb0, childb1);

        root.addChildren(parent1, parent2);

        AndroidTreeView tView = new AndroidTreeView(MainActivity.this, root);
        containerView.addView(tView.getView());

        childOf00.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {
                startActivity(new Intent(MainActivity.this, Example.class));
            }
        });

        childOfb00.setClickListener(new TreeNode.TreeNodeClickListener() {
            @Override
            public void onClick(TreeNode node, Object value) {
                startActivity(new Intent(MainActivity.this, InternetSelectionSort.class));
            }
        });
    }
}
