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

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import javax.inject.Inject;


/**
 * Created by paytonq on 11/22/2016.
 */

public class PortfolioListView extends LinearLayout {
    public enum ViewState {
        LOADED, EMPTY, ERROR, LOADING
    }

    TextView tvEmpty;     // Contains the message for empty
    TextView tvError;     // Contains the message for an error
    TextView tvLoading;   // Contains a message for loading

    private RecyclerView rvItems;
    private MainAdapter mAdapter;


    public PortfolioListView(Context context, RecyclerView _rvItems, MainAdapter _mAdapter) {
        super(context);
        init(context, _rvItems, _mAdapter);
    }


    public PortfolioListView(Context context, AttributeSet attrs, RecyclerView _rvItems, MainAdapter _mAdapter) {
        super(context, attrs);
        init(context, _rvItems, _mAdapter);
    }

    public PortfolioListView(Context context, AttributeSet attrs, int defStyleAttr, RecyclerView _rvItems, MainAdapter _mAdapter) {
        super(context, attrs, defStyleAttr);
        init(context, _rvItems, _mAdapter);
    }

    private void init(Context context, RecyclerView _rvItems, MainAdapter _mAdapter) {

        rvItems = _rvItems;
        mAdapter = _mAdapter;
        // You'll need to define a view in layout/ that has the appropriate
        // children views.
        LayoutInflater.from(context).inflate(R.layout.activity_main, this, true);
        ButterKnife.bind(this);
        // All the findViewById calls, setting up the items, adapter, etc
    }

    public void updateViewState(ViewState state) {
        switch (state) {
            // Show and hide the views.

        }
    }

    // More methods as you need them. Take a look in my project if you want to
    // see how I did it, but try on your own first.

}
