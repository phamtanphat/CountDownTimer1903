package khoapham.ptp.phamtanphat.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    int[] manghinh = {R.drawable.banhmy , R.drawable.cha,R.drawable.chagio , R.drawable.mycay,R.drawable.oc};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer countDownTimer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long time) {

            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }
}
