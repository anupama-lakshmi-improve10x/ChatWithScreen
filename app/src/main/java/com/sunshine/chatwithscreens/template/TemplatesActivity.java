package com.sunshine.chatwithscreens.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class TemplatesActivity extends AppCompatActivity {

    public ArrayList<Template> templates;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");
        setupData();
        setupTemplateRecyclerView();

    }

    private void setupTemplateRecyclerView() {
        templateRv = findViewById(R.id.template_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templates);
        templateRv.setAdapter(templateAdapter);
    }

    private void setupData() {
        templates = new ArrayList<>();
        Template message = new Template();
        message.templateId = 1;
        message.messageText = "Hi,\nWelcome to Improve 10x";
        templates.add(message);

        Template messageTxt = new Template();
        message.templateId = 2;
        messageTxt.messageText = "Hi, I'm busy.I'll call you later";
        templates.add(messageTxt);

        Template callMessage = new Template();
        message.templateId = 3;
        callMessage.messageText = "Hi,\ncall me when you see the message";
        templates.add(callMessage);

        Template contactDetailsMessage = new Template();
        message.templateId = 4;
        contactDetailsMessage.messageText = "-Hi, Please find my contact details\nName: Viswanath Kumar Sandu\ncompany: Improve 10X\nMobile : +919000540052";
        templates.add(contactDetailsMessage);

        Template accountNumberMessage = new Template();
        message.templateId = 5;
        accountNumberMessage.messageText = "-Hi, Please find my account details\nAccountNumber :625101515776\nBank :ICICI Bank\nIFSC: ICIC0006251";
        templates.add(accountNumberMessage);
    }
}