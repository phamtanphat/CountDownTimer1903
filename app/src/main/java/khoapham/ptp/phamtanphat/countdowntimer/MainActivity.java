package khoapham.ptp.phamtanphat.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    int[] manghinh = {R.drawable.banhmy , R.drawable.cha,R.drawable.chagio , R.drawable.mycay,R.drawable.oc};
    int index = 0;
    ImageView img;
    CountDownTimer countDownTimer1,countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageview);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer = new CountDownTimer(5000,1000) {
                    @Override
                    public void onTick(long time) {
                        img.setImageResource(manghinh[index++]);
                    }

                    @Override
                    public void onFinish() {
                        index = 0;
                        countDownTimer1.start();
                    }
                };
                countDownTimer1 = countDownTimer;
                countDownTimer.start();
                img.setEnabled(false);
            }
        });

    }
}
