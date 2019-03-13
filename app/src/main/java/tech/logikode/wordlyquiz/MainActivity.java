package tech.logikode.wordlyquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQuestionOneAnswered(View v) {
        View qOneIndicator = findViewById(R.id.qOneAnsweredIndicator);

        CheckBox optOne = findViewById(R.id.qOneOptOne);
        CheckBox optTwo = findViewById(R.id.qOneOptTwo);
        CheckBox optThree = findViewById(R.id.qOneOptThree);
        CheckBox optFour = findViewById(R.id.qOneOptFour);
        CheckBox optFive = findViewById(R.id.qOneOptFive);
        CheckBox optSix = findViewById(R.id.qOneOptSix);

        if (optOne.isChecked() || optTwo.isChecked() || optThree.isChecked() || optFour.isChecked() || optFive.isChecked() || optSix.isChecked()) {
            qOneIndicator.setBackgroundResource(R.drawable.answered_indicator);
        } else {
            qOneIndicator.setBackgroundResource(R.drawable.not_answered_indicator);
        }
    }

    public void checkQuestionTwoAnswered(View v) {
        RadioGroup radioGroup = findViewById(R.id.qTwoRadioGroup);
        View answerIndicator = findViewById(R.id.qTwoAnsweredIndicator);

        if (radioGroup.getCheckedRadioButtonId() == -1) {
            answerIndicator.setBackgroundResource(R.drawable.not_answered_indicator);
        } else {
            answerIndicator.setBackgroundResource(R.drawable.answered_indicator);
        }
    }
}
