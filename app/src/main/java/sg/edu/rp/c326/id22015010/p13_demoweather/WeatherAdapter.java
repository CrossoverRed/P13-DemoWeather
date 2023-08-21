package sg.edu.rp.c326.id22015010.p13_demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    public WeatherAdapter(Context context, ArrayList<Weather> weatherList) {
        super(context, 0, weatherList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Weather weather = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_weather_adapter, parent, false);
        }

        TextView tvArea = convertView.findViewById(R.id.tvArea);
        TextView tvForecast = convertView.findViewById(R.id.tvForecast);

        tvArea.setText(weather.getArea());
        tvForecast.setText(weather.getForecast());

        return convertView;
    }
}
