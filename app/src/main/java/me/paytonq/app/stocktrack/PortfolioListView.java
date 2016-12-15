package me.paytonq.app.stocktrack;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;



/**
 * Created by paytonq on 11/22/2016.
 */

public class PortfolioListView extends LinearLayout {
    public enum ViewState {
        LOADED, EMPTY, ERROR, LOADING
    }


    @BindView(R.id.my_recycler_view) RecyclerView rvItems;; // Your RecyclerView, which will display the items
    TextView tvEmpty;     // Contains the message for empty
    TextView tvError;     // Contains the message for an error
    TextView tvLoading;   // Contains a message for loading

    private RecyclerView.Adapter mAdapter;

    private List<String> myDataset;
    private RecyclerView.LayoutManager layoutManager;


    public PortfolioListView(Context context) {
        super(context);
        init(context);
    }

    public PortfolioListView(Context context, RecyclerView.LayoutManager lM) {
        super(context);
        init(context, lM);
    }


    public PortfolioListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PortfolioListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        // You'll need to define a view in layout/ that has the appropriate
        // children views.

        LayoutInflater.from(context).inflate(R.layout.activity_main, this, true);

        // All the findViewById calls, setting up the items, adapter, etc

        rvItems = (RecyclerView) findViewById(R.id.my_recycler_view);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDataset.add("Hello!");
                mAdapter.notifyItemInserted(mAdapter.getItemCount());
            }
        });


        myDataset = new ArrayList<String>();
        // specify an adapter (see also next example)
        mAdapter = new MainAdapter(myDataset);
        layoutManager = new LinearLayoutManager(context);

        rvItems.setLayoutManager(layoutManager);
        rvItems.setAdapter(mAdapter);

    }

    private void init(Context context, RecyclerView.LayoutManager lM) {
        // You'll need to define a view in layout/ that has the appropriate
        // children views.

        LayoutInflater.from(context).inflate(R.layout.activity_main, this, true);

        // All the findViewById calls, setting up the items, adapter, etc

        rvItems = (RecyclerView) findViewById(R.id.my_recycler_view);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDataset.add("Hello!");
                mAdapter.notifyItemInserted(mAdapter.getItemCount());
            }
        });


        myDataset = new ArrayList<String>();
        // specify an adapter (see also next example)
        mAdapter = new MainAdapter(myDataset);

        rvItems.setLayoutManager(lM);
        rvItems.setAdapter(mAdapter);

    }

    public void updateViewState(ViewState state) {
        switch (state) {
            // Show and hide the views.

        }
    }

    // More methods as you need them. Take a look in my project if you want to
    // see how I did it, but try on your own first.

}
