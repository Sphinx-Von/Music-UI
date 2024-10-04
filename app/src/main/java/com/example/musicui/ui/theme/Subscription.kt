package com.example.musicui.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Subscription(){
    Column(
        modifier = Modifier.height(200.dp).background(Purple80),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        Text(text = "Manage Subscription")
        Card(modifier = Modifier.padding(8.dp), elevation = 8.dp)
        {
            Column(modifier = Modifier.padding(8.dp)) {
                Column(){
                    Text(text = "Musical")
                    Row(Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                        ){
                        Text(text = "Free Trial")
                        TextButton(onClick = { /*TODO*/ }) {
                            Row(){
                                Text(text = "See All Plans")
                                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = "See all plans")
                            }
                        }

                    }
                }
                Divider(thickness = 1.dp, modifier = Modifier.padding(horizontal = 8.dp))
                Row(Modifier.padding(vertical = 16.dp)) {
                    Icon(imageVector = Icons.Default.AccountBox,
                        contentDescription = "Get a Plan")
                    Text(text = "Get a Plan")
                }
            }

        }

    }
}
@Preview(showBackground = true)
@Composable
fun PreviewSubscription(){
    Subscription()
}