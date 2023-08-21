package sg.edu.rp.c326.id22015010.p13_demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    // Custom ArrayAdapter class that deals with displaying Weather objects in a ListView

    public WeatherAdapter(Context context, ArrayList<Weather> weatherList) {
        // Constructor that initializes the ArrayAdapter
        super(context, 0, weatherList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // This method is called to retrieve the view for each item in the ListView

        Weather weather = getItem(position); // Get the Weather object at the specified position

        if (convertView == null) {
            // If the convertView is null, inflate the layout for the ListView item
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_weather_adapter, parent, false);
        }

        // Find the TextViews within the inflated layout
        TextView tvArea = convertView.findViewById(R.id.tvArea);
        TextView tvForecast = convertView.findViewById(R.id.tvForecast);

        // Set the text of the TextViews with data from the Weather object
        tvArea.setText(weather.getArea());
        tvForecast.setText(weather.getForecast());

        return convertView; // Return the fully populated view for the ListView item
    }
}
