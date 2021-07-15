package com.baz.composeweathercard.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baz.composeweathercard.R
import com.baz.composeweathercard.model.WeatherItem
import com.baz.composeweathercard.util.forecastStates


@Preview(showBackground = true)
@Composable
fun PreviewWeatherCard() {
    WeatherCard()
}

@Composable
fun WeatherCard(selectedValue: Int = 0) {
    val list: List<WeatherItem> = forecastStates

//    val item by remember(selectedValue, list) {
//        derivedStateOf { list[selectedValue] }
//    }

    Card(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            /**
             * place
             */
            Text(
                text = "Hong Kong",
                modifier = Modifier.padding(12.dp),
                style = MaterialTheme.typography.h5
            )
            Spacer(modifier = Modifier.height(8.dp))

            /**
             * time and date
             */
            Text(
                text = list[selectedValue].date,
                modifier = Modifier.padding(12.dp),
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.height(8.dp))

            /**
             *weather main info
             */
            Row(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row(horizontalArrangement = Arrangement.Center) {
                    Text(text = list[selectedValue].temperature.toString(), style = MaterialTheme.typography.h1)
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = "°C",
                        style = MaterialTheme.typography.h3
                    )
                }

                Image(
                    modifier = Modifier.size(100.dp),
                    painter = painterResource(id = list[selectedValue].icon),
                    contentDescription = "Weather icon"
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            /**
             * weather details
             */
            Row(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Image", modifier = Modifier.padding(0.dp))
                Text(text = "precep", modifier = Modifier.padding(0.dp))
                Text(text = "wind icon", modifier = Modifier.padding(0.dp))
                Text(text = "wind speed", modifier = Modifier.padding(0.dp))
            }
            Spacer(modifier = Modifier.height(8.dp))

            /**
             * slider
             */

            Text(text = "Slider", modifier = Modifier.padding(12.dp))
        }
    }
}