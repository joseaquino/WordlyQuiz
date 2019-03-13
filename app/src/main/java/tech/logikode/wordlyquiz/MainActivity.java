package tech.logikode.wordlyquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int correctAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listenQuestionThreeAnswered();
        listenQuestionFiveAnswered();
        listenQuestionEightAnswered();
        listenToCheckAnswer();
    }

    /**
     * Checks question one options to see if out of all the options at least one has been selected
     * and set the answered indicator at the top accordingly to provide feedback to user that an
     * option has been selected.
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
     * Checks question four RadioGroup to see if an option has been selected and set the
     * answered indicator at the top accordingly, providing feedback to user if the question has
     * already been provided an answer.
     */
    public void checkQuestionFourAnswered(View v) {
        RadioGroup radioGroup = findViewById(R.id.qFourRadioGroup);
        View answerIndicator = findViewById(R.id.qFourAnsweredIndicator);

        if (radioGroup.getCheckedRadioButtonId() == -1) {
            answerIndicator.setBackgroundResource(R.drawable.not_answered_indicator);
        } else {
            answerIndicator.setBackgroundResource(R.drawable.answered_indicator);
        }
    }

    /**
     * Checks question six to see if an option has been selected and set the
     * answered indicator at the top accodingly, providing feedback to the user if the question has
     * already been provided an answer.
     */
    public void checkQuestionSixAnswered(View v) {
        CheckBox optOne = findViewById(R.id.qSixOptOne);
        CheckBox optTwo = findViewById(R.id.qSixOptTwo);
        CheckBox optThree = findViewById(R.id.qSixOptThree);
        CheckBox optFour = findViewById(R.id.qSixOptFour);
        View answerIndicator = findViewById(R.id.qSixAnsweredIndicator);

        if (optOne.isChecked() || optTwo.isChecked() || optThree.isChecked() || optFour.isChecked()) {
            answerIndicator.setBackgroundResource(R.drawable.answered_indicator);
        } else {
            answerIndicator.setBackgroundResource(R.drawable.not_answered_indicator);
        }
    }

    /**
     * Checks question seven RadioGroup to see if an option has been selected and set the
     * answered indicator at the top accordingly, providing feedback to user if the question has
     * already been provided an answer.
     */
    public void checkQuestionSevenAnswered(View v) {
        RadioGroup radioGroup = findViewById(R.id.qSevenRadioGroup);
        View answerIndicator = findViewById(R.id.qSevenAnsweredIndicator);

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

    /**
     * Listens to the question five EditText for changes and sets the answered indicator at the
     * top accordingly depending if there is a value, this provides feedback to the user to
     * know when this question has received a response.
     */
    private void listenQuestionFiveAnswered() {
        EditText textField = findViewById(R.id.qFiveTextField);
        final View answerIndicator = findViewById(R.id.qFiveAnsweredIndicator);

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

    /**
     * Listens to the question eight EditText for changes and sets the answered indicator at the
     * top accordingly depending if there is a value, this provides feedback to the user to
     * know when this question has received a response.
     */
    private void listenQuestionEightAnswered() {
        EditText textField = findViewById(R.id.qEightTextField);
        final View answerIndicator = findViewById(R.id.qEightAnsweredIndicator);

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

    /**
     * Listener for the answer checker button
     */
    private void listenToCheckAnswer() {
        Button checkAnswerBtn = findViewById(R.id.checkAnswerButton);

        checkAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers();
                showScore();
            }
        });
    }

    /**
     * Checks all the selected answers and adds the points to the global score
     */
    private void checkAnswers() {
        correctAnswers = 0;

        // Question one answer checking logic
        CheckBox qOneOptOne = findViewById(R.id.qOneOptOne);
        CheckBox qOneOptTwo = findViewById(R.id.qOneOptTwo);
        CheckBox qOneOptThree = findViewById(R.id.qOneOptThree);
        CheckBox qOneOptFour = findViewById(R.id.qOneOptFour);
        CheckBox qOneOptFive = findViewById(R.id.qOneOptFive);
        CheckBox qOneOptSix= findViewById(R.id.qOneOptSix);

        if (!qOneOptOne.isChecked() && !qOneOptTwo.isChecked() && qOneOptThree.isChecked() && !qOneOptFour.isChecked() && !qOneOptFive.isChecked() && qOneOptSix.isChecked()) {
            correctAnswers += 1;
        }

        // Question two answer checking logic
        RadioGroup qTwoRadioGroup = findViewById(R.id.qTwoRadioGroup);

        if (qTwoRadioGroup.getCheckedRadioButtonId() != -1) {
            RadioButton qTwoSelectRadio = findViewById(qTwoRadioGroup.getCheckedRadioButtonId());

            if (qTwoSelectRadio.getText().toString().matches("Zambia")) {
                correctAnswers += 1;
            }
        }

        // Questions three answer checking logic
        EditText qThreeTextField = findViewById(R.id.qThreeTextEdit);
        String qThreeAnswer = qThreeTextField.getText().toString().trim();

        if (qThreeAnswer.matches("1928")) {
            correctAnswers += 1;
        }

        // Question four answer checking logic
        RadioGroup qFourRadioGroup = findViewById(R.id.qFourRadioGroup);

        if (qFourRadioGroup.getCheckedRadioButtonId() != -1) {
            RadioButton qFourSelectedRadio = findViewById(qFourRadioGroup.getCheckedRadioButtonId());

            if (qFourSelectedRadio.getText().toString().matches("Russia")) {
                correctAnswers += 1;
            }
        }

        // Question five answer checking logic
        EditText qFiveTextField = findViewById(R.id.qFiveTextField);
        String qFiveAnswer = qFiveTextField.getText().toString().trim().toLowerCase();

        if (qFiveAnswer.matches("the great pacific garbage patch")) {
            correctAnswers += 1;
        }

        // Question six answer checking logic
        CheckBox qSixOptOne = findViewById(R.id.qSixOptOne);
        CheckBox qSixOptTwo = findViewById(R.id.qSixOptTwo);
        CheckBox qSixOptThree = findViewById(R.id.qSixOptThree);
        CheckBox qSixOptFour = findViewById(R.id.qSixOptFour);

        if (!qSixOptOne.isChecked() && qSixOptTwo.isChecked() && qSixOptThree.isChecked() && !qSixOptFour.isChecked()) {
            correctAnswers += 1;
        }

        // Question seven answer checking logic
        RadioGroup qSevenRadioGroup = findViewById(R.id.qSevenRadioGroup);

        if (qSevenRadioGroup.getCheckedRadioButtonId() != -1) {
            RadioButton qSevenSelectedRadio = findViewById(qSevenRadioGroup.getCheckedRadioButtonId());

            if (qSevenSelectedRadio.getText().toString().matches("400 KM")) {
                correctAnswers += 1;
            }
        }

        // Question eight answer checking logic
        EditText qEightTextField = findViewById(R.id.qEightTextField);
        String qEightAnswer = qEightTextField.getText().toString().trim().toLowerCase();

        if (qEightAnswer.matches("joe kittinger")) {
            correctAnswers += 1;
        }
    }

    /**
     * Displayes a Toast with the score message
     */
    private void showScore() {
        int totalQuestions = 8;
        String message = "Your score is " + correctAnswers + "/" + totalQuestions;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
