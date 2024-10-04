package com.example.musicui.ui.theme


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicui.R

@Composable
fun AccountView()
{

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(Purple80))

    {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
            )
        {
            Row(){
                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier.padding(end = 8.dp)
                        .size(48.dp)
                    )
                Column {
                    Text(
                        text = "Rubina Hakim",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Text(text = "@Rubinahakim95@gmil.com",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)
                        )
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                    )
                
            }
        }
        
        Row(modifier = Modifier.padding(top = 16.dp)){
            Icon(painter = painterResource(id = R.drawable.ic_music),
                contentDescription = "My Music",
                modifier = Modifier.padding(end = 8.dp).size(24.dp)
                )
            Text(text = "My Music",
                style = MaterialTheme.typography.bodySmall)
        }

        Divider()
        
    }
    
}
@Preview(showBackground = true)
@Composable
fun PreviewAccountView(){
    AccountView()
}