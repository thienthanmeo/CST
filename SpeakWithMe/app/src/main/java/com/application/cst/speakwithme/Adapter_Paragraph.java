package com.application.cst.speakwithme;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Angel-PC on 01/08/2015.
 */
public class Adapter_Paragraph {
    Context context;
    int resource;
    List<Item_Paragraph> listParagraph;
    public Adapter_Paragraph(Context context, int resource, List<Item_Paragraph> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.listParagraph=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(context,resource,null);
        TextView tvName=(TextView)view.findViewById(R.id.textViewNameParagraph);
        Item_Paragraph paragraph=listParagraph.get(position);
        tvName.setText(paragraph.getName().toString());
        TextView tvDetail=(TextView)view.findViewById(R.id.textViewDetailParagraph);
        tvDetail.setText(paragraph.getDetail().toString());
        return view;
    }
}
