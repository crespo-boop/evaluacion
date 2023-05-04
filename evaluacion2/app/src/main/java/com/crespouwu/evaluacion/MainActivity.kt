package com.crespouwu.evaluacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.crespouwu.evaluacion.ui.theme.EvaluacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(title = { Text(text = "Menú de comida") })
                        }
                    ) { padding ->
                        MediaList(
                            comidaList = Datasource().loadComidas(),
                            modifier = Modifier.padding(padding)
                        )
                    }
                }
            }
        }
    }
}

//@Preview
@Composable
fun MediaList(comidaList: List<Comida>,modifier: Modifier=Modifier){
    LazyColumn(
        modifier = modifier
    ){
        items(comidaList){ comida->
            MediaItem(comida)
        }
    }
}




//@Preview(showBackground = true)
@Composable
fun MediaItem(item: Comida){
    Card(modifier = Modifier.padding(7.dp), elevation = 6.dp) {
        Column() {
            Box(
                modifier= Modifier
                    .height(180.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(item.imageResourceId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.primary)
                    .padding(14.dp)
            ) {
                Row() {
                    Text(text = stringResource(id = item.stringResourceId),
                        style = MaterialTheme.typography.h6,
                        color = Color.White)
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text =" ${item.intId}",
                        style = MaterialTheme.typography.h6,
                        color = Color.White)
                }
            }
        }
    }
}
