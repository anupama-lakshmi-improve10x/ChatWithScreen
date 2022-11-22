package com.sunshine.chatwithscreens.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {

    public ArrayList<Message> messages;
    public RecyclerView messageRv;
    public MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        getSupportActionBar().setTitle("Messages");
        setupData();
        setupMessageRecyclerView();

    }

    private void setupMessageRecyclerView() {
        messageRv = findViewById(R.id.messages_rv);
        messageRv.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter();
        messageAdapter.setData(messages);
        messageRv.setAdapter(messageAdapter);
    }

    private void setupData() {
        messages = new ArrayList<>();
        Message arvaind = new Message();
        arvaind.messageId = 1;
        arvaind.name = "Aravind";
        arvaind.phoneNumber = "+91 9000540052";
        arvaind.messageText = "Hi, Welcome to Improve 10X";
        messages.add(arvaind);

        Message ramesh = new Message();
        ramesh.messageId = 2;
        ramesh.name = "Ramesh";
        ramesh.phoneNumber = "+91 9999999999";
        ramesh.messageText = "Hi, Welcome to Improve 10X";
        messages.add(ramesh);

        Message number = new Message();
        number.messageId = 3;
        number.name = "";
        number.phoneNumber = "+91 9999999991";
        number.messageText = " Hi, call me when you see the message";
        messages.add(number);

        Message kailash = new Message();
        kailash.messageId = 4;
        kailash.name = "Kailash";
        kailash.phoneNumber = "+91 9999999992";
        kailash.messageText = " -";
        messages.add(kailash);

        Message swiggy = new Message();
        swiggy.messageId = 5;
        swiggy.name = "Swiggy Delivery";
        swiggy.phoneNumber = "+91 9999999993";
        swiggy.messageText = "full address";
        messages.add(swiggy);

        Message swiggyDelivery = new Message();
        swiggyDelivery.messageId = 6;
        swiggyDelivery.name = "Swiggy Delivery";
        swiggyDelivery.phoneNumber = "+91 9999999994";
        swiggyDelivery.messageText = "Are you available for this Sunday??\n\n\nWe can have a call and discuss the movie";
        messages.add(swiggyDelivery);
    }
}