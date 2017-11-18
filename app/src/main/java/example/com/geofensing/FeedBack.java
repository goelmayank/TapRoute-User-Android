package example.com.geofensing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedBack extends AppCompatActivity {
private String emailId;
private String name;
private String feedback;
Button send;
Button clear;
    EditText name_text ;
    EditText email_text ;
    EditText feedback_text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


       name_text= (EditText)findViewById(R.id.name);
       email_text= (EditText)findViewById(R.id.email);
       feedback_text= (EditText)findViewById(R.id.comment);

       send=(Button)findViewById(R.id.send);
       clear=(Button)findViewById(R.id.clear);

    }

    public void clear(View view) {
      name_text.setText("");
      email_text.setText("");
      feedback_text.setText("");
    }

    public void send(View view) {
        name= name_text.getText().toString();
        emailId=email_text.getText().toString();
        feedback=feedback_text.getText().toString();

//do whatever you want to do to get this data to your
        name_text.setText("");
        email_text.setText("");
        feedback_text.setText("");
    }

}
