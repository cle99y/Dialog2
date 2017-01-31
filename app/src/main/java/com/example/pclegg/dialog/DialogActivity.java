package com.example.pclegg.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class DialogActivity extends AppCompatActivity {
// basic template for creating a custom dialog
// uses a static template here but will be adapted for use in 
// an app that sets content    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        final Context c = this;

        View bang = (Button) findViewById((R.id.bang));

        bang.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(c);
                dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
                dialog.setTitle("Review Email...");
                dialog.setContentView(R.layout.email);
                dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,R.drawable.icon);

                TextView e = (TextView) dialog.findViewById(R.id.address);
                e.setText("oc70@aircadets.org, adj70@aircadets.org, someone@email.com");
                TextView s = (TextView) dialog.findViewById((R.id.subject_line));
                s.setText("New Leave Request");
                TextView b = (TextView) dialog.findViewById(R.id.body);
                b.setText(
                        "The following leave request has been submitted by \n\n" +
                        "cadet Donald Trump \n\n" +
                        "Between the dates: \n" +
                        "20 Jan 2017 and 3 Feb 2017 \n\n" +
                        "The reason given is as follows: \n\n" +
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc de hominis summo bono quaeritur; Tamen a proposito, inquam, aberramus. Nunc de hominis summo bono quaeritur; Ergo id est convenienter naturae vivere, a natura discedere.\n" +
                                "\n" +
                                "Miserum hominem! Si dolor summum malum est, dici aliter non potest. Quem ad modum quis ambulet, sedeat, qui ductus oris, qui vultus in quoque sit? Duo Reges: constructio interrete. Qui convenit? Vitae autem degendae ratio maxime quidem illis placuit quieta. Sed haec nihil sane ad rem; Atque ab his initiis profecti omnium virtutum et originem et progressionem persecuti sunt.\n" +
                                "\n" +
                                "Quis enim redargueret? Miserum hominem! Si dolor summum malum est, dici aliter non potest. Apud imperitos tum illa dicta sunt, aliquid etiam coronae datum; Non autem hoc: igitur ne illud quidem. Quae fere omnia appellantur uno ingenii nomine, easque virtutes qui habent, ingeniosi vocantur. Non enim quaero quid verum, sed quid cuique dicendum sit."
                );
                Button dismiss = (Button) dialog.findViewById(R.id.dismiss);
                // if button is clicked, close the custom dialog
                dismiss.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                Button send = (Button) dialog.findViewById(R.id.send);
                // if button is clicked, close the custom dialog
                send.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //do stuff
                        dialog.dismiss();
                    }
                });

                dialog.show();


            }
        });

    }
}
