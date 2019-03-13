package tech.logikode.wordlyquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listenQuestionThreeAnswered();
    }

    /**
     * Checks question one options to see if out of all the options at least one has been selected
     * and set the answered indicator at the top accordingly to provide feedback to user that an
     * option has been selected.
     *
     * @param v
     */
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

    /**
     * Checks question two RadioGroup if an option has been selected and set accordingly
     * the answered indicator at the top to provide feedback to user that the questions has received
     * an answer.
     *
     * @param v
     */
    public void checkQuestionTwoAnswered(View v) {
        RadioGroup radioGroup = findViewById(R.id.qTwoRadioGroup);
        View answerIndicator = findViewById(R.id.qTwoAnsweredIndicator);

        if (radioGroup.getCheckedRadioButtonId() == -1) {
            answerIndicator.setBackgroundResource(R.drawable.not_answered_indicator);
        } else {
            answerIndicator.setBackgroundResource(R.drawable.answered_indicator);
        }
    }

    /**
     * Listens to the question three EditText for changes and if it is not empty it will
     * set the answered indicator at the top in green to provide feedback to the user that
     * the third question has received an answer
     */
    private void listenQuestionThreeAnswered() {
        EditText textField = findViewById(R.id.qThreeTextEdit);
        final View answerIndicator = findViewById(R.id.qThreeAnsweredIndicator);

        textField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    answerIndicator.setBackgroundResource(R.drawable.answered_indicator);
                } else {
                    answerIndicator.setBackgroundResource(R.drawable.not_answered_indicator);
                }
            }
        });
    }
}
